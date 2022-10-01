package com.auro.application.core.database;

import android.content.Context;
import android.content.SharedPreferences;

import com.auro.application.core.application.AuroApp;
import com.auro.application.core.common.AppConstant;
import com.auro.application.util.AppLogger;
import com.google.gson.Gson;

import static com.auro.application.core.common.AppConstant.PREF_OBJECT;


public enum AuroAppPref {
    INSTANCE;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor sharedPreferenceEditor;
    private final String PreferenceName = AuroApp.getAppContext().getPackageName();
    private PrefModel prefModel;

    /**
     * GET PREF MODEL OBJECT
     * SET DATA IN MODEL
     */
    public PrefModel getModelInstance() {

      //  AppLogger.e("getModelInstance-","step 1");
        if (sharedPreferences == null) {
        //    AppLogger.e("getModelInstance-","step 2");
            sharedPreferences = AuroApp.getAppContext().getSharedPreferences(PreferenceName, Context.MODE_PRIVATE);
        }
      //  AppLogger.e("getModelInstance-","step 3");
        if (getPref() != null) {
          //  AppLogger.e("getModelInstance-","step 6");
            return getPref();
        }
      //  AppLogger.e("getModelInstance-","step 7");
        if (prefModel == null) {
         //   AppLogger.e("getModelInstance-","step 8");
            prefModel = new PrefModel();
        }
        //AppLogger.e("getModelInstance-","step 9");
        return prefModel;
    }


    /**
     * SAVE MODEL OBJECT IN SHARED PREF
     */
    public void setPref(PrefModel prefModel) {
        AppLogger.e("chhonker--", "setPref--"+AuroAppPref.INSTANCE.getModelInstance().isDashboardaApiNeedToCall());

        sharedPreferenceEditor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(prefModel);
       // AppLogger.e("setStringPref-","step 0---" +json);
        sharedPreferenceEditor.putString(PREF_OBJECT, json);
        sharedPreferenceEditor.apply();
        sharedPreferenceEditor.commit();
    }


    private PrefModel getPref() {
        Gson gson = new Gson();
        String json = sharedPreferences.getString(PREF_OBJECT, "");
      //  AppLogger.e("getModelInstance-","step 4---" +json);
        if (json.isEmpty()) {
            return null;
        }
       // AppLogger.e("getModelInstance-","step 5---" +json);
        return gson.fromJson(json, PrefModel.class);
    }


    public void clearPref() {

        if (sharedPreferences != null) {
            PrefModel clearPrefModel = AuroAppPref.INSTANCE.getModelInstance();
            clearPrefModel.setLogin(false);
            clearPrefModel.setUserMobile("");
           // clearPrefModel.setStudentClass(0);
            clearPrefModel.setEmailId("");
            clearPrefModel.setPreLoginDisclaimer(false);
            clearPrefModel.setUserType(AppConstant.UserType.NOTHING);
            clearPrefModel.setUserLanguageId("");
            AuroAppPref.INSTANCE.setPref(clearPrefModel);

        }
        clearAuroAppPref();
    }


    public void clearAuroAppPref()
    {
        SharedPreferences preferences = AuroApp.getAppContext().getSharedPreferences(PreferenceName,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.commit();
    }

    public void setStringPref(String key, String value) {


        sharedPreferenceEditor = AuroApp.getAppContext().getSharedPreferences(PreferenceName, Context.MODE_PRIVATE).edit();
        sharedPreferenceEditor.putString(key, value).apply();
    }

    public void setBooleanTutorial(String key,boolean tutorial){
        sharedPreferenceEditor = AuroApp.getAppContext().getSharedPreferences(PreferenceName, Context.MODE_PRIVATE).edit();
        sharedPreferenceEditor.putBoolean(key, tutorial).apply();
    }
    public boolean getBooleanTutorial(String key){
        sharedPreferences = AuroApp.getAppContext().getSharedPreferences(PreferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(key, true);
    }

    public String getPrefStringValueNotNull(String key) {

        return getStringValue(key, "");
    }

    private String getStringValue(String key, String defaultValue) {
        sharedPreferences = AuroApp.getAppContext().getSharedPreferences(PreferenceName, Context.MODE_PRIVATE);
        return sharedPreferences.getString(key, defaultValue);
    }


}
