package com.example.LibraryModel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.LibraryModel.model.LibraryModel;
import com.example.LibraryModel.service.LibraryService;

@RestController
public class LibraryController {
	@Autowired
    private LibraryService service;
	
	@PostMapping("/addLibrary")
	public void addLibrary(@RequestBody LibraryModel libraayModel) {
		service.addLibrary(libraayModel);
	}
	
	@GetMapping("find-all")
	public List<LibraryModel> findAllRestaurantModels(){
		return service.findAll();
	}
	
	@GetMapping("libraryName/{libraryName}")
	public LibraryModel findByName(@PathVariable String libraryName) {
		return service.findByName(libraryName);
	}
}
