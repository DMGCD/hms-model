package com.hotel.model_service.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    int bookingId;
    @Column(name = "roomNumber", nullable = false)
    int roomNumber;
    @Column(name = "customerId")
    int customerId;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
}