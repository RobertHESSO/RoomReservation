package repository;

import android.content.Context;

import androidx.lifecycle.LiveData;

import java.util.List;

import entity.RoomEntity;

public class RoomRepository {

    private static RoomRepository instance;

    private RoomRepository() {}

    public static RoomRepository getInstance() {
        if (instance == null) {
            synchronized (RoomRepository.class) {
                if (instance == null) {
                    instance = new RoomRepository();
                }
            }
        }
        return instance;
    }

    public LiveData<RoomEntity> getRoom(final int roomNumber, Context context) {
        return AppDatabase.getInstance(context).roomDao().getRoomByNUmber(roomNumber);
    }

    public LiveData<List<RoomEntity>> getAllRooms(Context context) {
        return AppDatabase.getInstance(context).roomDao().getAll();
    }

   /* public void insert (final RoomEntity room, OnAsyncEventListener callback, Context context) {
        new CreateRoom(context, callback).execute(room);
    }

    public void update(final RoomEntity room, OnAsyncEventListener callback, Context context) {
        new UpdateRoom(context, callback).execute(room);
    }

    public void delete(final RoomEntity room, OnAsyncEventListener callback, Context context) {
        new DeleteRoom(context, callback).execute(room);
    } */

}
