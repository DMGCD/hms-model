package com.hotel.model_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "room")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private int roomID;
    @Enumerated(value = EnumType.STRING)
    @Column(name = "roomType", nullable = false)
    private String roomType;
    @Enumerated(value = EnumType.STRING)
    private String roomCategory;
    @Column(name = "available", columnDefinition = "TINYINT() default 0")
    private boolean available;
    @Column(name = "roomPrice", nullable = false)
    private Long roomPrice;
    @OneToOne(mappedBy = "roomId", cascade = CascadeType.ALL)
    private Booking booking;

}
