package com.example.binon_curso.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.binon_curso.domian.Category;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	@RequestMapping(method = RequestMethod.GET)

	public List<Category> listar() {
		
		Category cat1 = new Category(1,"Informatica");
		Category cat2 = new Category(1,"Escritorio");	
		List<Category> lista =  new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		return lista;
	}
}


