package praktikum.burgerTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class BurgerMoveIngredientTest {

    Random random = new Random();
    float randomFloat = random.nextFloat();

    Ingredient ingredient1 = new Ingredient(IngredientType.FILLING,
            RandomStringUtils.randomAlphabetic(10), randomFloat);

    Ingredient ingredient2 = new Ingredient(IngredientType.SAUCE,
            RandomStringUtils.randomAlphabetic(10), randomFloat);

    Ingredient ingredient3 = new Ingredient(IngredientType.SAUCE,
            RandomStringUtils.randomAlphabetic(10), randomFloat);

    Ingredient ingredient4 = new Ingredient(IngredientType.SAUCE,
            RandomStringUtils.randomAlphabetic(10), randomFloat);

    @Test
    public void moveIngredientTest() {

        Burger burger = new Burger();
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.addIngredient(ingredient3);
        burger.addIngredient(ingredient4);

        int index = random.nextInt(burger.ingredients.size() - 1);
        int newIndex = random.nextInt(burger.ingredients.size() - 1);

        Ingredient testedIngredient = burger.ingredients.get(index);
        burger.moveIngredient(index, newIndex);
        assertEquals(newIndex, burger.ingredients.indexOf(testedIngredient));

    }

}
