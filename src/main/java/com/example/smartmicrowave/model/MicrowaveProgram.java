package com.example.smartmicrowave.model;

import jakarta.persistence.*;

@Entity
public class MicrowaveProgram {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int power; // мощность (Вт)
    private int duration; // длительность (в секундах)

    // Геттеры и сеттеры
}
