package guru.springframework.service;

import guru.springframework.commands.RecipeCommand;
import guru.springframework.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Recipe findById(Long l);

    Set<Recipe> getRecipes();

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
