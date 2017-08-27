package com.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.ECU;
import com.rest.service.ECUService;

@RestController
@RequestMapping("ecu")
public class ECUController {

	@Autowired
	private ECUService ecuService;
	
	@GetMapping
	public List<ECU> getAllECU(){		
		return ecuService.findAll();
	}
	@GetMapping("{id}")
	public ECU getECU(@PathVariable("id") int id){		
		return ecuService.find(id);
	}
	
	
}
