package com.example.Crud;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class DetailsController {
    private final DetailsRepository repository;

    @GetMapping
    public List<Details> getAllDetails(){
        return repository.findAll();
    }

    @PostMapping
    public Details saveDetails(@RequestBody Details details){
        return repository.save(details);
    }
}
