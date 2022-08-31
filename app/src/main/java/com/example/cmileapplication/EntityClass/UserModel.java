package com.example.cmileapplication.EntityClass;


import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user")
public class UserModel{
    //primary key
    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int key;

    @ColumnInfo( name= "id" )
    private String id;

    @ColumnInfo( name= "name" )
    private String name;

    @ColumnInfo( name= "department" )
    private String department;

    @ColumnInfo( name= "designation" )
    private String designation;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
