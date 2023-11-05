package com.ex.CourseCatalog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ex.CourseCatalog.Beans.Catalog;
import com.ex.CourseCatalog.Service.CatalogService;

@RestController
@RequestMapping("/catalog")
public class CatalogController {
	@Autowired
	CatalogService service;
	@Autowired
	CatalogService repo;
	
	@GetMapping("/{courseId}")
	public Catalog getCourseById(@PathVariable("courseId") Integer courseId)
	{
		return service.getCourseById(courseId);
	}
	
	
//	@GetMapping("/all")
//	public List<Catalog> getCourseById()
//	{
//		return (List<Catalog>) repo.findAll();
//	}
}



