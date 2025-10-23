package com.esprit.amelmediouni4sim3.Services;

import com.esprit.amelmediouni4sim3.Repositories.ReservationRepository;
import com.esprit.amelmediouni4sim3.entities.Reservation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class IReservationServicesImp implements IReservationServices {

    private final ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Reservation reservation) {
        reservationRepository.delete(reservation);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation getReservation(int id) {
        return reservationRepository.findById(id).get();
    }
}
