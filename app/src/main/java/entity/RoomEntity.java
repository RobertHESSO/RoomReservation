package entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "rooms")
public class RoomEntity {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "Room_number")
    private int roomNumber;

    @ColumnInfo(name = "Type")
    private String type;

    @ColumnInfo(name = "Amount")
    private float amount;

    @ColumnInfo(name = "Wifi")
    private boolean wifi;

    @ColumnInfo(name = "Tv")
    private boolean tv;

    @ColumnInfo(name= "Booked")
    private boolean booked;

    @ColumnInfo(name = "ReservationID")
    private int reservationID;

    public RoomEntity() {

    }

    public RoomEntity(int roomNumber, String type, float amount, boolean wifi, boolean tv, boolean booked) {
        this.roomNumber = roomNumber;
        this.amount = amount;
        this.wifi = wifi;
        this.tv = tv;
        this.booked = booked;
    }

    public Long getId(){return id; }

    public void setId(Long id) { this.id = id; }

    public String getType() {return type; }

    public void setType(String type) { this.type = type; }

    public float getAmount() {return amount; }

    public void setAmount(float amount) { this.amount = amount; }

    public boolean isWifi() { return wifi; }

    public void setWifi(boolean wifi) {this.wifi = wifi; }

    public boolean isTv() {return tv; }

    public void setTv(boolean tv) {this.tv = tv; }

    public boolean isBooked() { return booked;}

    public void setBooked(boolean booked) {this.booked = booked; }

    public int getReservationID() {return reservationID; }


    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof RoomEntity)) return false;
        RoomEntity o = (RoomEntity) obj;
        return o.getId().equals(this.getId());
    }

    public String toString() {return type + " Betrag: " + amount + " Wifi: " + wifi + " Tv: " + tv + " Booked: " + booked; }
}
