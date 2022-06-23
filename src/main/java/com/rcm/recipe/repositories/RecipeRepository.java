package com.rcm.recipe.repositories;

import org.springframework.data.repository.CrudRepository;

import com.rcm.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
