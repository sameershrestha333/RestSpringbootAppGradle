package com.rest.dao;

import java.util.*;
import com.rest.model.*;


public interface ECUDAO {
	public List<ECU> findAll();
	
	public ECU find(int id);

}
