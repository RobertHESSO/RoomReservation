package dao;


import android.database.sqlite.SQLiteConstraintException;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.Date;
import java.util.List;

import entity.ReservationEntity;
import entity.RoomEntity;

@Dao
public interface ReservationDao {


    @Query("SELECT* FROM reservations")
    LiveData<List<ReservationEntity>> getAll();

    @Query("SELECT* FROM reservations WHERE id = :id")
    LiveData<List<ReservationEntity>> getReservationById(int id);

    @Query("SELECT* FROM reservations WHERE Lastname = :lastname")
    LiveData<List<ReservationEntity>> getReservationByLastname(String lastname);

    @Query("SELECT* FROM reservations WHERE Firstname = :firstname")
    LiveData<List<ReservationEntity>> getReservationByFirstname(String firstname);

    @Query("SELECT* FROM reservations WHERE CheckIn = :checkin")
    LiveData<List<RoomEntity>> getReservationByCheckIn(Date checkin);

    @Query("SELECT* FROM reservations WHERE CheckOut = :checkout")
    LiveData<List<ReservationEntity>> getReservationByCheckOut(Date checkout);

    @Insert
    void insert(ReservationEntity reservation) throws SQLiteConstraintException;

    @Update
    void update(ReservationEntity reservation);

    @Delete
    void delete(ReservationEntity reservation);

    @Query("DELETE FROM reservations")
    void deleteAll();




}
