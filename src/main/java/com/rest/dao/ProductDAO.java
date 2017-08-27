package com.rest.dao;

import java.util.*;
import com.rest.model.*;

public interface ProductDAO {
	public List<Product> findAll();
	public Product find(int id);

}
