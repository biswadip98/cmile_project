package com.example.cmileapplication.DoaClass;




import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.cmileapplication.EntityClass.UserModel;

import java.util.List;

@Dao
public interface Daoclass {

    @Insert
    void insertAllData(UserModel model);

    @Query("select * from user")
    List<UserModel> getAllData();






}
