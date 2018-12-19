package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SilkwormController {
    @GetMapping("/api/silkworms")
    public ResponseEntity<List<Silkworm>> getSilkworms() {
        List<Silkworm> silkworms = new ArrayList<>();
        silkworms.add(new Silkworm(1, "Zenon", "Opiekun1"));
        silkworms.add(new Silkworm(2, "Jan", "Opiekun2"));
        silkworms.add(new Silkworm(3, "Janek", "Opiekun3"));
		silkworms.add(new Silkworm(4, "Wojtek", "Opiekun4"));
        return new ResponseEntity<>(silkworms, HttpStatus.OK);
    }
}
