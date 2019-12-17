package com.zackstore.zackapi;

public class Product {
	
	public enum SECTION { MEAT, DRINK };
	public enum PROVENANCE { CANADA, USA, MEXICO };
	
	private int id;
	private String name;
	private SECTION section;
	private PROVENANCE provenance;
	
	
	public Product(int id, String name, SECTION section, PROVENANCE provenance) {
		
		this.id = id;
		this.name = name;
		this.section = section;
		this.provenance = provenance;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public SECTION getSection() {
		return section;
	}


	public void setSection(SECTION section) {
		this.section = section;
	}


	public PROVENANCE getProvenance() {
		return provenance;
	}


	public void setProvenance(PROVENANCE provenance) {
		this.provenance = provenance;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", section=" + section + ", provenance=" + provenance + "]";
	}

}
