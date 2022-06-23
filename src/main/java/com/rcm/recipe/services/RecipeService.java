package com.rcm.recipe.services;

import java.util.Set;

import com.rcm.recipe.domain.Recipe;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
