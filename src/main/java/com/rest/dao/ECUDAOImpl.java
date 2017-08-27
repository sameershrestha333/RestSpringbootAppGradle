package com.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rest.model.ECU;
import com.rest.model.Product;

@Repository
public class ECUDAOImpl implements ECUDAO {
		
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<ECU> findAll() {
		return jdbcTemplate.query("select * from ECU", 
				new BeanPropertyRowMapper<ECU>(ECU.class));
	}

	@Override
	public ECU find(int id) {
		return this.jdbcTemplate.queryForObject("select * from ECU where id = ?", 
				new BeanPropertyRowMapper<ECU>(ECU.class),id);
	}

}
