package com.crud.webteamilk.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.webteamilk.entity.BubbleTea;
import com.crud.webteamilk.service.BubbleTeaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/bubble-teas")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:8081")

public class BubbleTeaController {
    private final BubbleTeaService bubbleTeaService;
    
    @GetMapping
    public ResponseEntity<List<BubbleTea>> getBubbleTeas() 
    {
        List<BubbleTea> bubbleTeas = bubbleTeaService.getBubbleTeas();
        return new ResponseEntity<>(bubbleTeas, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BubbleTea> getBubbleTeaById(@PathVariable Long id) 
    {
        BubbleTea bubbleTea = bubbleTeaService.getBubbleTeaById(id);
        return new ResponseEntity<>(bubbleTea, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BubbleTea> addBubbleTea(@RequestBody BubbleTea bubbleTea) 
    {
        BubbleTea newBubbleTea = bubbleTeaService.addBubbleTea(bubbleTea);
        return new ResponseEntity<>(newBubbleTea, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<BubbleTea> updateBubbleTea(@RequestBody BubbleTea bubbleTea) 
    {
        BubbleTea updatedBubbleTea = bubbleTeaService.updateBubbleTea(bubbleTea);
        return new ResponseEntity<>(updatedBubbleTea, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteBubbleTea(@PathVariable Long id) 
    {
        bubbleTeaService.deleteBubbleTea(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}