package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.dao.ECUDAO;
import com.rest.model.ECU;

@Service
public class ECUServiceImpl implements ECUService {
	
	@Autowired
	private ECUDAO ecuDAO;

	@Override
	public List<ECU> findAll() {
		// TODO Auto-generated method stub
		return ecuDAO.findAll();
	}

	@Override
	public ECU find(int id) {
		// TODO Auto-generated method stub
		return ecuDAO.find(id);
	}

}
