package com.example.rest.api.entity;

public enum CatergoryType {
	WOODWORKING("Woodworking"),TOOLS("Tools"),GARDEN("Garden"),AUTOMOTIVE("Automotive"),BRICOLAGE("Bricolage"),BOOKS("Books");
	private String category;
	
	private CatergoryType(String category) {
		this.category = category;
		
	}
	
	public String getCategory() {
		return category;
	}
}
