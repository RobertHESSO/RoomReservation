package com.example.roomreservation;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import entity.ReservationEntity;
import entity.RoomEntity;

@Database(entities = {RoomEntity.class, ReservationEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static final String TAG = "AppDatabase";

    private static AppDatabase instance;

    private static final String DATABASE_NAME = "RoomReservation-Database";

    public abstract


}
