package jp.example.recipepfc.model;

import java.util.List;

public class Recipe {
	
	private String name;
	
	private String category;
	
	List<Ingredient> ingredients;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}
	
	/*@Override
	public String toString() {
		
	}*/
}
