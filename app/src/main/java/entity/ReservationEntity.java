package entity;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "reservations")
public class ReservationEntity {

    @PrimaryKey(autoGenerate = true)
    private Long id;

    @ColumnInfo(name = "FirstName")
    private String firstName;

    @ColumnInfo(name = "LastName")
    private String lastName;

    @ColumnInfo(name = "NumberOfGuests")
    private int numberOfGuests;

    @ColumnInfo(name = "CheckIn")
    private Date checkIn;

    @ColumnInfo(name = "CheckOut")
    private Date checkOut;


    public ReservationEntity() {

    }

    public ReservationEntity(String firstName, String lastName, int numberOfGuests, Date checkIn, Date checkOut) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfGuests = numberOfGuests;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Long getId() { return id; }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {this.firstName = firstName; }

    public String getLastName() {return lastName; }

    public void setLastName(String lastName) {this.lastName = lastName; }

    public int getNumberOfGuests() {return numberOfGuests; }

    public void setNumberOfGuests(int numberOfGuests) { this.numberOfGuests = numberOfGuests; }

    public Date getCheckIn() {return checkIn; }

    public void setCheckIn(Date checkIn) {this.checkIn = checkIn; }

    public Date getCheckOut() {return checkOut; }

    public void setCheckOut(Date checkOut) { this.checkOut = checkOut; }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (!(obj instanceof ReservationEntity)) return false;
        ReservationEntity o = (ReservationEntity) obj;
        return o.getId().equals(this.getId());

    }

    public String toString() {return "First name: " + firstName + " last name: " + lastName + " Number of guests: " + numberOfGuests + " Checkin: " + checkIn + " Checkout: " + checkOut; }

}
