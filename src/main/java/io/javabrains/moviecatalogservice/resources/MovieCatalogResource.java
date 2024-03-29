package io.javabrains.moviecatalogservice.resources;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.moviecatalogservice.models.CatalogItems;


@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

	@RequestMapping("/{userid}")
	public List<CatalogItems> getCatalog(@PathVariable("userid") String userId){
		
		return Collections.singletonList(
				new CatalogItems("Transformers", "Test2", 4)
				);
				
	}
}
