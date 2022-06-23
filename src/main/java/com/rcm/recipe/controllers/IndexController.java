package com.rcm.recipe.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rcm.recipe.services.RecipeService;

@Controller
public class IndexController {

/* OPCION A
	private CategoryRepository categoryRepositories;
	private UnitOfMeasureRepository unitOfMeasureRepositories;
	
		
	public IndexController(CategoryRepository categoryRepositories,UnitOfMeasureRepository unitOfMeasureRepositories) {
		this.categoryRepositories = categoryRepositories;
		this.unitOfMeasureRepositories = unitOfMeasureRepositories;
	}


	@RequestMapping({"","/","/index"})
	public String getIndexPage() {
		
		Optional<Category> categoryOptional = categoryRepositories.findByDescription("American");
		Optional<UnitOfMeasure> uomOptional = unitOfMeasureRepositories.findByDescription("Cup");
		
		System.out.println("Cat Id is : " + categoryOptional.get().getId());
		System.out.println("UoM Id is : " + uomOptional.get().getId());
		
		return "index";
	}
	
*/
	/* OPCION B */
	
	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	
	@RequestMapping({"","/","/index"})
	public String getIndexPage(Model model) {
		model.addAttribute("recipes", recipeService.getRecipes());
		
		return "index";
	}
	
	
}
