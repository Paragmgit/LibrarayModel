package com.example.LibraryModel.model;

public class LibraryModel {
	
private String libraryName;
private String address;
private int libraryNo;
private String facilities;

public LibraryModel(String libraryName, String address, int libraryNo, String facilities) {
	super();
	this.libraryName = libraryName;
	this.address = address;
	this.libraryNo = libraryNo;
	this.facilities = facilities;
}

public String getLibraryName() {
	return libraryName;
}

public void setLibraryName(String libraryName) {
	this.libraryName = libraryName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getLibraryNo() {
	return libraryNo;
}

public void setLibraryNo(int libraryNo) {
	this.libraryNo = libraryNo;
}

public String getFacilities() {
	return facilities;
}

public void setFacilities(String facilities) {
	this.facilities = facilities;
}

@Override
public String toString() {
	return "LibraryModel [libraryName=" + libraryName + ", address=" + address + ", libraryNo=" + libraryNo
			+ ", facilities=" + facilities + "]";
}


}
