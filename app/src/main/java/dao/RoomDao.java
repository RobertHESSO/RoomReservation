package dao;


import android.database.sqlite.SQLiteConstraintException;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import entity.RoomEntity;

@Dao
public interface RoomDao {

    @Query("SELECT * FROM rooms")
    LiveData<List<RoomEntity>> getAll();

    @Query("SELECT * FROM rooms WHERE booked = :yesorno")
    LiveData<List<RoomEntity>> getRemainingRooms(boolean YesOrNo);

   /* @Query("SELECT * FROM rooms WHERE booked = :true")
    LiveData<List<RoomEntity>> getBookedRooms();*/

    @Query("SELECT * FROM rooms WHERE wifi = :YesOrNo")
    LiveData<List<RoomEntity>> getRoomsWithWifi(boolean YesOrNo);

    /*@Query("SELECT * FROM rooms WHERE wifi = :false")
    LiveData<List<RoomEntity>> getRoomsWithoutWifi();*/

    @Query("SELECT * FROM rooms WHERE tv = :YesOrNo")
    LiveData<List<RoomEntity>> getRoomsWithTv(boolean YesOrNo);

    /*@Query("SELECT * FROM rooms WHERE tv = :false")
    LiveData<List<RoomEntity>> getRoomsWithoutTv();*/

    @Query("SELECT * FROM rooms WHERE Room_number = :number")
    LiveData<RoomEntity> getRoomByNUmber(int number);

    @Query("DELETE FROM rooms")
    void deleteALL();

    @Insert
    void insert(RoomEntity room) throws SQLiteConstraintException;

    @Update
    void update(RoomEntity room);

    @Delete
    void delete(RoomEntity room);


}
