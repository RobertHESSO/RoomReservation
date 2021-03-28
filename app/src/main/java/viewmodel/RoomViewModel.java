package viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import entity.RoomEntity;
import repository.RoomRepository;

public class RoomViewModel extends AndroidViewModel {

    private RoomRepository repository;

    private Context applicationContext;

    private final MediatorLiveData<RoomEntity> observableRoom;

    public RoomViewModel(@NonNull Application application, final int roomNumber, RoomRepository roomRepository) {
        super(application);

        repository = roomRepository;

        applicationContext = application.getApplicationContext();

        observableRoom = new MediatorLiveData<>();

        observableRoom.setValue(null);

        LiveData<RoomEntity> room = repository.getRoom(roomNumber,applicationContext);

        observableRoom.addSource(room, observableRoom::setValue);
    }

    public static class Factory extends ViewModelProvider.NewInstanceFactory {

        @NonNull
        private final Application application;

        private final int roomNumber;

        private final RoomRepository repository;

        public Factory(@NonNull Application application, int roomNumber) {
            this.application = application;
            this.roomNumber = roomNumber;
            repository = RoomRepository.getInstance();
        }

        public <T extends ViewModel> T create(Class<T> modelClass) {
            return (T) new RoomViewModel(application,roomNumber,repository);
        }
    }

    public LiveData<RoomEntity> getRoom() { return observableRoom;    }

    public void createRoom(RoomEntity room, OnAsyncEventListener callback) {
        repository.update(room,callback,applicationContext);
    }

    public void deleteRoom(RoomEntity room, OnAsyncEventListener callback) {
        repository.delete(room,callback,applicationContext);
    }
}
