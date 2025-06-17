package jp.example.recipepfc.model;

public class Ingredient {
	
	private String name;
	
	private double protein;
	
	private double fat;
	
	private double carbs;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	public double getCarbs() {
		return carbs;
	}

	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}
	
}
