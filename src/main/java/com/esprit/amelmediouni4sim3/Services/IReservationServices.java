package com.esprit.amelmediouni4sim3.Services;


import com.esprit.amelmediouni4sim3.entities.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation addReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(Reservation reservation);
    List<Reservation> getAllReservations();
    Reservation getReservation(int id);
}
