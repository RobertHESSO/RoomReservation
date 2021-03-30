package com.example.roomreservation;

import android.os.AsyncTask;
import android.util.Log;

import entity.RoomEntity;

public class DatabaseInitializer {

    public static final String TAG = "DatabaseInitializer";

    public static void populateDatabase(final AppDatabase db) {
        Log.i(TAG, "Inserting data.");
        PopulateDbAsync task = new PopulateDbAsync(db);
        task.execute();
    }

    private static void addRoom(final AppDatabase db, final int roomNumber, final String type, final float amount, final boolean wifi,
                                final boolean tv, final boolean booked) {

        RoomEntity room = new RoomEntity(roomNumber,type,amount,wifi,tv,booked);
        db.roomDao().insert(room);

    }

    private static void populateWithTestData(AppDatabase db) {
        db.roomDao().deleteALL();

        addRoom(db, 1,"double",350, true,true,false);
        addRoom(db,2,"four",560,true,false,true);
        addRoom(db,3,"familiy",660,true,true,true);

    }

    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final AppDatabase database;

        public PopulateDbAsync(AppDatabase db) {
            database = db;
        }

        @Override
        protected Void doInBackground(final Void... voids) {
            populateWithTestData(database);
            return null;
        }



    }




}
