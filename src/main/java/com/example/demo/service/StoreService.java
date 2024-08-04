package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public interface StoreService {
    List<Integer> add(List<Integer> items);

    Collection<Integer> get();
}
