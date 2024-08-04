package com.example.demo.service;

import com.example.demo.model.Basket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collection;
import java.util.List;

@SessionScope
@Service
public class StoreServiceImpl implements StoreService {

    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> add(List<Integer> items) {
        for (Integer id : items)
            basket.addStore(id);
        return items;
    }

    @Override
    public Collection<Integer> get() {
        return basket.get();

    }
}
