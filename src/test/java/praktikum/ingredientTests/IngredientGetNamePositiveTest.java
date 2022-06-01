package praktikum.ingredientTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientGetNamePositiveTest {

    private final String actualName;
    private final String expectedName;

    public IngredientGetNamePositiveTest(String actualName, String expectedName) {
        this.actualName = actualName;
        this.expectedName = expectedName;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[] getTestNameData() {
        return new Object[][]{
                {"Burger", "Burger"},
                {"", ""},
                {" ", " "},
                {null, null},
        };
    }

    @Test
    public void getNamePositiveTest() {

        Random random = new Random();
        float randomFloat = random.nextFloat();

        Ingredient ingredient = new Ingredient(IngredientType.FILLING,
                this.actualName, randomFloat);

        assertEquals(ingredient.getName(), expectedName);
    }

}
