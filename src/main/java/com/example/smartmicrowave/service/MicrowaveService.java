package com.example.smartmicrowave.service;

import com.example.smartmicrowave.model.MicrowaveProgram;
import com.example.smartmicrowave.repository.MicrowaveProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MicrowaveService {

    @Autowired
    private MicrowaveProgramRepository repository;

    public MicrowaveProgram createProgram(MicrowaveProgram program) {
        return repository.save(program);
    }

    public List<MicrowaveProgram> getAllPrograms() {
        return repository.findAll();
    }

    public void deleteProgram(Long id) {
        repository.deleteById(id);
    }
}
