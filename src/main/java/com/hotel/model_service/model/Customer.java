package com.hotel.model_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    int id;
    @Column(name = "customerId")
    int customerId;
    @Column(name="customerName",nullable = false)
    String customerName;
    @Column(name="customerPhone",nullable = false)
    String customerPhone;
    @Column(name="customerIdNumber",nullable = false)
    String customerIdNumber;
    @OneToMany(mappedBy = "customer")
    private Set<Booking> bookingDetails;
}
