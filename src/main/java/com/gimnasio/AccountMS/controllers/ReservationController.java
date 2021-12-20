package com.gimnasio.AccountMS.controllers;
import com.gimnasio.AccountMS.models.Reservation;
import com.gimnasio.AccountMS.repositories.ReservationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
public class ReservationController {
    private final ReservationRepository reservation;

    public ReservationController(ReservationRepository reservation) {
        this.reservation = reservation;
    }

    @GetMapping("/reservation/{reservationDate}")
    public Optional<Reservation> getReservation(@PathVariable Date reservationDate){
        return this.reservation.findById(reservationDate);
    }
    @PostMapping("/reservation")
    public Reservation newReservation(@RequestBody Reservation reservation){
        return this.reservation.save(reservation);
    }
    @DeleteMapping("/reservation/{reservationDate}")
    public void deleteReservation(@PathVariable Date reservationDate){
        reservation.deleteById(reservationDate);
    }
    @PutMapping("/reservation/{reservationDate}")
    public Reservation updateReservation(@PathVariable Date reservationDate, @RequestBody Reservation new_reservation){
        Reservation old_reservation = reservation.findById(reservationDate).orElse(null);

        old_reservation.setReservationDate(new_reservation.getReservationDate());
        old_reservation.setClub(new_reservation.getClub());

        return reservation.save(old_reservation);
    }

}
