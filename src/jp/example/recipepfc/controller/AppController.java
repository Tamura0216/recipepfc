package jp.example.recipepfc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.example.recipepfc.model.Ingredient;
import jp.example.recipepfc.model.Recipe;
import jp.example.recipepfc.service.RecipeManager;

public class AppController {

	private RecipeManager recipeManager = new RecipeManager();
	private Scanner scanner = new Scanner(System.in);

	/*while(true) {
		showMenu();
		int select = scanner.nextInt();
		
		switch(select) {
		case 1:
			Recipe recipe = registRecipe();
			recipeManager.resistRecipe(recipe);
			break;
		case 2:
			
		case 3:
			
		case 4:
			
		default :
			
		}
	}*/

	public void showMenu() {
		System.out.println("■レシピ管理アプリ■");
		System.out.println("操作を選択してください");
		System.out.println();
		System.out.println("1; レシピの登録");
		System.out.println("2: 登録済みレシピの表示");
		System.out.println("3; 登録済みレシピのPFC表示");
		System.out.println("4: アプリの終了");
	}

	public Recipe registRecipe() {
		Recipe recipe = new Recipe();
		List<Ingredient> list = new ArrayList<>();

		System.out.println("レシピの登録を行います");
		System.out.println("①レシピ名を入力してください");
		String recipeName = scanner.nextLine();

		System.out.println("②カテゴリを選択してください（朝食/昼食/夕食）");
		String recipeCategory = scanner.nextLine();

		while (true) {
			Ingredient ingredient = new Ingredient();
			
			System.out.println("③材料およびPFCを登録します　材料→PFCの順で入力を行います");
			System.out.println("まず材料名を入力してください");
			ingredient.setName(scanner.nextLine());

			System.out.println("PFCの入力を行います");
			System.out.println("タンパク質を入力してください");
			ingredient.setProtein(scanner.nextDouble());

			System.out.println("脂質を入力してください");
			ingredient.setFat(scanner.nextDouble());

			System.out.println("炭水化物を入力してください");
			ingredient.setCarbs(scanner.nextDouble());

			list.add(ingredient);

			System.out.println("続けて材料の入力を行いますか？");
			System.out.println("1: はい");
			System.out.println("2: いいえ");
			int input = scanner.nextInt();
			
			switch(input) {
			case 1:
				break;
			case 2:
				recipe.setName(recipeName);
				recipe.setCategory(recipeCategory);
				recipe.setIngredients(list);
				System.out.println();
				System.out.println("登録完了しました");
				System.out.println("メニューに戻ります");
				return recipe;
			}
		}

	}
}
