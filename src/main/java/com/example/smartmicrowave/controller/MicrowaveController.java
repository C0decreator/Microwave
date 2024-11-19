package com.example.smartmicrowave.controller;

import com.example.smartmicrowave.model.MicrowaveProgram;
import com.example.smartmicrowave.service.MicrowaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/microwave")
public class MicrowaveController {

    @Autowired
    private MicrowaveService microwaveService;

    @PostMapping("/programs")
    public MicrowaveProgram createProgram(@RequestBody MicrowaveProgram program) {
        return microwaveService.createProgram(program);
    }

    @GetMapping("/programs")
    public List<MicrowaveProgram> getAllPrograms() {
        return microwaveService.getAllPrograms();
    }

    @DeleteMapping("/programs/{id}")
    public void deleteProgram(@PathVariable Long id) {
        microwaveService.deleteProgram(id);
    }
}