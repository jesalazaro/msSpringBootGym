package com.gimnasio.AccountMS.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.gimnasio.AccountMS.models.Reservation;

import java.util.Date;

public interface ReservationRepository extends MongoRepository<Reservation, Date> {
}
