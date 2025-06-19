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

	public void runApp() {
		while (true) {
			showMenu();
			int select = scanner.nextInt();
			scanner.nextLine();

			switch (select) {
			case 1:
				Recipe recipe = registRecipe();
				recipeManager.resistRecipe(recipe);
				break;
			case 2:
				showRecipe();
				break;
			case 3:
				showPfc();
				break;
			case 4:
				System.out.println("アプリを終了します");
				return;
			default:
				System.out.println("エラーが発生しました。アプリを終了します。");
				return;
			}
		}
	}

	public void showMenu() {
		System.out.println("■レシピ管理アプリ■");
		System.out.println("操作を選択してください");
		System.out.println();
		System.out.println("1: レシピの登録");
		System.out.println("2: 登録済みレシピの表示");
		System.out.println("3: 登録済みレシピのPFC表示");
		System.out.println("4: アプリの終了");
	}

	public Recipe registRecipe() {
		scanner.nextLine();

		Recipe recipe = new Recipe();
		List<Ingredient> list = new ArrayList<>();

		System.out.println("レシピ名を入力してください：");
		String name = scanner.nextLine();
		recipe.setName(name);

		System.out.println("カテゴリを入力してください：");
		String category = scanner.nextLine();
		recipe.setCategory(category);

		while (true) {
			Ingredient ing = new Ingredient();
			System.out.println("材料名：");
			ing.setName(scanner.nextLine());

			System.out.println("タンパク質：");
			ing.setProtein(scanner.nextDouble());
			System.out.println("脂質：");
			ing.setFat(scanner.nextDouble());
			System.out.println("炭水化物：");
			ing.setCarbs(scanner.nextDouble());
			scanner.nextLine();
			scanner.nextLine();

			list.add(ing);

			System.out.println("続けて材料を入力しますか？（1: はい / 2: いいえ）");
			int choice = scanner.nextInt();
			scanner.nextLine();
			scanner.nextLine();

			if (choice != 1)
				break;
		}

		recipe.setIngredients(list);
		System.out.println("登録完了しました！");
		return recipe;
	}

	public void showRecipe() {

	}

	public void showPfc() {

	}
}
