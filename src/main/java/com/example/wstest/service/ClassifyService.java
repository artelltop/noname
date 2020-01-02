package com.example.wstest.service;

import com.example.wstest.model.Classify;

import java.util.List;

public interface ClassifyService {

    public void add(Classify classify);

    public void delete(int id);

    public Classify update(Classify classify);

    public List<Classify> list();
}
