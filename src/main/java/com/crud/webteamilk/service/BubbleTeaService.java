package com.crud.webteamilk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.crud.webteamilk.entity.BubbleTea;
import com.crud.webteamilk.respository.BubbleTeaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BubbleTeaService {
    private final BubbleTeaRepository bubbleTeaRepository;

    public List<BubbleTea> getBubbleTeas()
    {
        return bubbleTeaRepository.findAll();
    }

    public BubbleTea getBubbleTeaById(Long id) 
    {
        return bubbleTeaRepository.findById(id).orElse(null);
    }

    public BubbleTea addBubbleTea(BubbleTea bubbleTea) 
    {
        return bubbleTeaRepository.save(bubbleTea);
    }

    public BubbleTea updateBubbleTea(BubbleTea bubbleTea) 
    {
        return bubbleTeaRepository.save(bubbleTea);
    } 

    public void deleteBubbleTea (Long id) 
    {
        bubbleTeaRepository.deleteById(id);
    }
}
