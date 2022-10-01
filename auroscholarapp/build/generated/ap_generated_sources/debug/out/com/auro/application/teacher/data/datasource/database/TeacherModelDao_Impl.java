package com.auro.application.teacher.data.datasource.database;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.auro.application.teacher.data.model.common.DistrictDataModel;
import com.auro.application.teacher.data.model.common.StateDataModel;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class TeacherModelDao_Impl implements TeacherModelDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfStateDataModel;

  private final EntityInsertionAdapter __insertionAdapterOfDistrictDataModel;

  public TeacherModelDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfStateDataModel = new EntityInsertionAdapter<StateDataModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `state_table`(`primaryId`,`state_name`,`state_code`,`short_name`,`active_status`,`flag`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StateDataModel value) {
        if (value.getPrimaryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getPrimaryId());
        }
        if (value.getState_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getState_name());
        }
        if (value.getState_code() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getState_code());
        }
        if (value.getShort_name() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getShort_name());
        }
        if (value.getActive_status() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getActive_status());
        }
        if (value.getFlag() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFlag());
        }
      }
    };
    this.__insertionAdapterOfDistrictDataModel = new EntityInsertionAdapter<DistrictDataModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `district_table`(`primaryId`,`district_name`,`district_code`,`state_code`,`active_status`,`flag`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DistrictDataModel value) {
        if (value.getPrimaryId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getPrimaryId());
        }
        if (value.getDistrict_name() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDistrict_name());
        }
        if (value.getDistrict_code() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDistrict_code());
        }
        if (value.getState_code() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getState_code());
        }
        if (value.getActive_status() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getActive_status());
        }
        if (value.getFlag() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getFlag());
        }
      }
    };
  }

  @Override
  public Long[] insertStateListData(List<StateDataModel> list) {
    __db.beginTransaction();
    try {
      Long[] _result = __insertionAdapterOfStateDataModel.insertAndReturnIdsArrayBox(list);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Long[] insertDistrictListData(List<DistrictDataModel> list) {
    __db.beginTransaction();
    try {
      Long[] _result = __insertionAdapterOfDistrictDataModel.insertAndReturnIdsArrayBox(list);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<StateDataModel> getAllStateData() {
    final String _sql = "SELECT * FROM state_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPrimaryId = _cursor.getColumnIndexOrThrow("primaryId");
      final int _cursorIndexOfStateName = _cursor.getColumnIndexOrThrow("state_name");
      final int _cursorIndexOfStateCode = _cursor.getColumnIndexOrThrow("state_code");
      final int _cursorIndexOfShortName = _cursor.getColumnIndexOrThrow("short_name");
      final int _cursorIndexOfActiveStatus = _cursor.getColumnIndexOrThrow("active_status");
      final int _cursorIndexOfFlag = _cursor.getColumnIndexOrThrow("flag");
      final List<StateDataModel> _result = new ArrayList<StateDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final StateDataModel _item;
        _item = new StateDataModel();
        final Long _tmpPrimaryId;
        if (_cursor.isNull(_cursorIndexOfPrimaryId)) {
          _tmpPrimaryId = null;
        } else {
          _tmpPrimaryId = _cursor.getLong(_cursorIndexOfPrimaryId);
        }
        _item.setPrimaryId(_tmpPrimaryId);
        final String _tmpState_name;
        _tmpState_name = _cursor.getString(_cursorIndexOfStateName);
        _item.setState_name(_tmpState_name);
        final String _tmpState_code;
        _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
        _item.setState_code(_tmpState_code);
        final String _tmpShort_name;
        _tmpShort_name = _cursor.getString(_cursorIndexOfShortName);
        _item.setShort_name(_tmpShort_name);
        final String _tmpActive_status;
        _tmpActive_status = _cursor.getString(_cursorIndexOfActiveStatus);
        _item.setActive_status(_tmpActive_status);
        final String _tmpFlag;
        _tmpFlag = _cursor.getString(_cursorIndexOfFlag);
        _item.setFlag(_tmpFlag);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DistrictDataModel> getAllDistrictData() {
    final String _sql = "SELECT * FROM district_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPrimaryId = _cursor.getColumnIndexOrThrow("primaryId");
      final int _cursorIndexOfDistrictName = _cursor.getColumnIndexOrThrow("district_name");
      final int _cursorIndexOfDistrictCode = _cursor.getColumnIndexOrThrow("district_code");
      final int _cursorIndexOfStateCode = _cursor.getColumnIndexOrThrow("state_code");
      final int _cursorIndexOfActiveStatus = _cursor.getColumnIndexOrThrow("active_status");
      final int _cursorIndexOfFlag = _cursor.getColumnIndexOrThrow("flag");
      final List<DistrictDataModel> _result = new ArrayList<DistrictDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DistrictDataModel _item;
        _item = new DistrictDataModel();
        final Long _tmpPrimaryId;
        if (_cursor.isNull(_cursorIndexOfPrimaryId)) {
          _tmpPrimaryId = null;
        } else {
          _tmpPrimaryId = _cursor.getLong(_cursorIndexOfPrimaryId);
        }
        _item.setPrimaryId(_tmpPrimaryId);
        final String _tmpDistrict_name;
        _tmpDistrict_name = _cursor.getString(_cursorIndexOfDistrictName);
        _item.setDistrict_name(_tmpDistrict_name);
        final String _tmpDistrict_code;
        _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
        _item.setDistrict_code(_tmpDistrict_code);
        final String _tmpState_code;
        _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
        _item.setState_code(_tmpState_code);
        final String _tmpActive_status;
        _tmpActive_status = _cursor.getString(_cursorIndexOfActiveStatus);
        _item.setActive_status(_tmpActive_status);
        final String _tmpFlag;
        _tmpFlag = _cursor.getString(_cursorIndexOfFlag);
        _item.setFlag(_tmpFlag);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<DistrictDataModel> getStateDistrictData(String stateCode) {
    final String _sql = "SELECT * FROM district_table WHERE state_code=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (stateCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, stateCode);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfPrimaryId = _cursor.getColumnIndexOrThrow("primaryId");
      final int _cursorIndexOfDistrictName = _cursor.getColumnIndexOrThrow("district_name");
      final int _cursorIndexOfDistrictCode = _cursor.getColumnIndexOrThrow("district_code");
      final int _cursorIndexOfStateCode = _cursor.getColumnIndexOrThrow("state_code");
      final int _cursorIndexOfActiveStatus = _cursor.getColumnIndexOrThrow("active_status");
      final int _cursorIndexOfFlag = _cursor.getColumnIndexOrThrow("flag");
      final List<DistrictDataModel> _result = new ArrayList<DistrictDataModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final DistrictDataModel _item;
        _item = new DistrictDataModel();
        final Long _tmpPrimaryId;
        if (_cursor.isNull(_cursorIndexOfPrimaryId)) {
          _tmpPrimaryId = null;
        } else {
          _tmpPrimaryId = _cursor.getLong(_cursorIndexOfPrimaryId);
        }
        _item.setPrimaryId(_tmpPrimaryId);
        final String _tmpDistrict_name;
        _tmpDistrict_name = _cursor.getString(_cursorIndexOfDistrictName);
        _item.setDistrict_name(_tmpDistrict_name);
        final String _tmpDistrict_code;
        _tmpDistrict_code = _cursor.getString(_cursorIndexOfDistrictCode);
        _item.setDistrict_code(_tmpDistrict_code);
        final String _tmpState_code;
        _tmpState_code = _cursor.getString(_cursorIndexOfStateCode);
        _item.setState_code(_tmpState_code);
        final String _tmpActive_status;
        _tmpActive_status = _cursor.getString(_cursorIndexOfActiveStatus);
        _item.setActive_status(_tmpActive_status);
        final String _tmpFlag;
        _tmpFlag = _cursor.getString(_cursorIndexOfFlag);
        _item.setFlag(_tmpFlag);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
