package com.auro.application.core.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.auro.application.teacher.data.datasource.database.TeacherModelDao;
import com.auro.application.teacher.data.datasource.database.TeacherModelDao_Impl;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings("unchecked")
public final class AppDatabase_Impl extends AppDatabase {
  private volatile TeacherModelDao _teacherModelDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `faq_ques` (`primaryId` INTEGER PRIMARY KEY AUTOINCREMENT, `questionTitle` TEXT, `answer` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `district_table` (`primaryId` INTEGER PRIMARY KEY AUTOINCREMENT, `district_name` TEXT, `district_code` TEXT, `state_code` TEXT, `active_status` TEXT, `flag` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `state_table` (`primaryId` INTEGER PRIMARY KEY AUTOINCREMENT, `state_name` TEXT, `state_code` TEXT, `short_name` TEXT, `active_status` TEXT, `flag` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"6bac395ccec1029448863088c63f5f5d\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `faq_ques`");
        _db.execSQL("DROP TABLE IF EXISTS `district_table`");
        _db.execSQL("DROP TABLE IF EXISTS `state_table`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsFaqQues = new HashMap<String, TableInfo.Column>(3);
        _columnsFaqQues.put("primaryId", new TableInfo.Column("primaryId", "INTEGER", false, 1));
        _columnsFaqQues.put("questionTitle", new TableInfo.Column("questionTitle", "TEXT", false, 0));
        _columnsFaqQues.put("answer", new TableInfo.Column("answer", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysFaqQues = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesFaqQues = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoFaqQues = new TableInfo("faq_ques", _columnsFaqQues, _foreignKeysFaqQues, _indicesFaqQues);
        final TableInfo _existingFaqQues = TableInfo.read(_db, "faq_ques");
        if (! _infoFaqQues.equals(_existingFaqQues)) {
          throw new IllegalStateException("Migration didn't properly handle faq_ques(com.auro.application.home.data.model.CategoryQuestion).\n"
                  + " Expected:\n" + _infoFaqQues + "\n"
                  + " Found:\n" + _existingFaqQues);
        }
        final HashMap<String, TableInfo.Column> _columnsDistrictTable = new HashMap<String, TableInfo.Column>(6);
        _columnsDistrictTable.put("primaryId", new TableInfo.Column("primaryId", "INTEGER", false, 1));
        _columnsDistrictTable.put("district_name", new TableInfo.Column("district_name", "TEXT", false, 0));
        _columnsDistrictTable.put("district_code", new TableInfo.Column("district_code", "TEXT", false, 0));
        _columnsDistrictTable.put("state_code", new TableInfo.Column("state_code", "TEXT", false, 0));
        _columnsDistrictTable.put("active_status", new TableInfo.Column("active_status", "TEXT", false, 0));
        _columnsDistrictTable.put("flag", new TableInfo.Column("flag", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDistrictTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDistrictTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDistrictTable = new TableInfo("district_table", _columnsDistrictTable, _foreignKeysDistrictTable, _indicesDistrictTable);
        final TableInfo _existingDistrictTable = TableInfo.read(_db, "district_table");
        if (! _infoDistrictTable.equals(_existingDistrictTable)) {
          throw new IllegalStateException("Migration didn't properly handle district_table(com.auro.application.teacher.data.model.common.DistrictDataModel).\n"
                  + " Expected:\n" + _infoDistrictTable + "\n"
                  + " Found:\n" + _existingDistrictTable);
        }
        final HashMap<String, TableInfo.Column> _columnsStateTable = new HashMap<String, TableInfo.Column>(6);
        _columnsStateTable.put("primaryId", new TableInfo.Column("primaryId", "INTEGER", false, 1));
        _columnsStateTable.put("state_name", new TableInfo.Column("state_name", "TEXT", false, 0));
        _columnsStateTable.put("state_code", new TableInfo.Column("state_code", "TEXT", false, 0));
        _columnsStateTable.put("short_name", new TableInfo.Column("short_name", "TEXT", false, 0));
        _columnsStateTable.put("active_status", new TableInfo.Column("active_status", "TEXT", false, 0));
        _columnsStateTable.put("flag", new TableInfo.Column("flag", "TEXT", false, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStateTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStateTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStateTable = new TableInfo("state_table", _columnsStateTable, _foreignKeysStateTable, _indicesStateTable);
        final TableInfo _existingStateTable = TableInfo.read(_db, "state_table");
        if (! _infoStateTable.equals(_existingStateTable)) {
          throw new IllegalStateException("Migration didn't properly handle state_table(com.auro.application.teacher.data.model.common.StateDataModel).\n"
                  + " Expected:\n" + _infoStateTable + "\n"
                  + " Found:\n" + _existingStateTable);
        }
      }
    }, "6bac395ccec1029448863088c63f5f5d", "752eae43053cf78fb6cf42f68a969931");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "faq_ques","district_table","state_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `faq_ques`");
      _db.execSQL("DELETE FROM `district_table`");
      _db.execSQL("DELETE FROM `state_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public TeacherModelDao teacherModelDao() {
    if (_teacherModelDao != null) {
      return _teacherModelDao;
    } else {
      synchronized(this) {
        if(_teacherModelDao == null) {
          _teacherModelDao = new TeacherModelDao_Impl(this);
        }
        return _teacherModelDao;
      }
    }
  }
}
