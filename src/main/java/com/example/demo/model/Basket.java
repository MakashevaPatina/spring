package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private final List<Integer> basketList = new ArrayList<>();

    public void addStore(Integer items) {
        basketList.add(items);
    }

    public Collection<Integer> get() {
        return new ArrayList<>(basketList);
    }
}