package com.example.wstest.service;

import com.example.wstest.model.Org;

import java.util.List;

public interface OrgService {

    public void add(Org org);

    public void delete(int id);

    public Org update(Org org);

    public Org findByOrginformation(String orginformation);

    public List<Org> list();
}
