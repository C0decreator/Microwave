package com.example.smartmicrowave.repository;

import com.example.smartmicrowave.model.MicrowaveProgram;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MicrowaveProgramRepository extends JpaRepository<MicrowaveProgram, Long> {
}
