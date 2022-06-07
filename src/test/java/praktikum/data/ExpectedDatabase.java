package praktikum.data;

import praktikum.Bun;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.ArrayList;
import java.util.List;

public class ExpectedDatabase {

    private final List<Bun> expectedBuns = new ArrayList<>();
    private final List<Ingredient> expectedIngredients = new ArrayList<>();

    public ExpectedDatabase() {

        expectedBuns.add(new Bun("black bun", 100));
        expectedBuns.add(new Bun("white bun", 200));
        expectedBuns.add(new Bun("red bun", 300));

        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "hot sauce", 100));
        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "sour cream", 200));
        expectedIngredients.add(new Ingredient(IngredientType.SAUCE, "chili sauce", 300));

        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "cutlet", 100));
        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "dinosaur", 200));
        expectedIngredients.add(new Ingredient(IngredientType.FILLING, "sausage", 300));

    }

    public List<Bun> getExpectedBuns() {
        return expectedBuns;
    }

    public List<Ingredient> getExpectedIngredients() {
        return expectedIngredients;
    }

}
