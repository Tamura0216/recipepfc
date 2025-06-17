package jp.example.recipepfc.service;

import java.util.ArrayList;
import java.util.List;

import jp.example.recipepfc.model.Recipe;

public class RecipeManager {
	List<Recipe> recipeList = new ArrayList<>();

	public void resistRecipe(Recipe recipe) {
		recipeList.add(recipe);
	}
	
	
}
