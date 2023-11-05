package com.ex.CourseCatalog.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ex.CourseCatalog.Beans.Catalog;
import com.ex.CourseCatalog.Beans.Enrolled;
import com.ex.CourseCatalog.Beans.Rating;
import com.ex.CourseCatalog.Repo.CatalogRepo;

@Service
public class CatalogService implements CatalogServ {
	@Autowired
	CatalogRepo repo;

	@Autowired
	RestTemplate restTemplate;

	public Catalog getCourseById(Integer courseId) {
		Optional<Catalog> cat =repo.findById(courseId);
		
		if(cat.isPresent()) {
			Catalog c=cat.get();
			//Sends an HTTP GET request, returning an object mapped from a response body
			List<Rating> rating=restTemplate.getForObject("http://rating-ms/rating/"+courseId,List.class);
			List<Enrolled> enroll=restTemplate.getForObject("http://enrolled-ms/enroll/"+courseId,List.class);
			c.setRating(rating);
			c.setEnrolled(enroll);
			return c;
		}else {
			return null;
		}
	}
}
