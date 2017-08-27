package com.rest.service;

import java.util.List;

import com.rest.model.ECU;

public interface ECUService {
public List<ECU> findAll();
	
	public ECU find(int id);
}
