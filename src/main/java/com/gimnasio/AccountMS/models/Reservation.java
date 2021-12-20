package com.gimnasio.AccountMS.models;

import org.springframework.data.annotation.Id;
import java.util.Date;

public class Reservation {
    @Id
    private String Id;
    private String username;
    private Date reservationDate;
    private String club;

    public Reservation(String id, String username, Date reservationDate, String club) {
        Id = id;
        this.username = username;
        this.reservationDate = reservationDate;
        this.club = club;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}
