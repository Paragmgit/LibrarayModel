package com.example.LibraryModel.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import com.example.LibraryModel.model.LibraryModel;
@Service
public class LibraryService {
 
	private static List<LibraryModel> list = new ArrayList<>();
	static {
		list.add(new LibraryModel("priyadarshini", "nagpur", 1, "all books"));
		list.add(new LibraryModel(" paloti", "mumbai", 2, "anciant books"));
		list.add(new LibraryModel("ycc", "amravti", 3, "old books"));
		list.add(new LibraryModel("pandav", "pune", 4, "new books"));
	}
	
	public List<LibraryModel> findAll() {
		
		return list;
	}
	
	public LibraryModel findByName(String libraryName) {
        Predicate<? super LibraryModel> predicate = library -> library.getLibraryName().equals(libraryName);
        LibraryModel library = list.stream().filter(predicate).findFirst().get();
        return library;
    }
	
	 public void addLibrary(LibraryModel libraray) {
	        list.add(libraray);
	    }
}
