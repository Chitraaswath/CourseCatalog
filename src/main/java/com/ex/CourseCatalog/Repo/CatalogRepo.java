package com.ex.CourseCatalog.Repo;
import org.springframework.data.repository.CrudRepository;
import com.ex.CourseCatalog.Beans.Catalog;

public interface CatalogRepo extends CrudRepository <Catalog,Integer>{

}

