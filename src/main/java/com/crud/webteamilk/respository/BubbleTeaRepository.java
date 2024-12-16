package com.crud.webteamilk.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.webteamilk.entity.BubbleTea;

public interface BubbleTeaRepository extends JpaRepository<BubbleTea, Long> {}