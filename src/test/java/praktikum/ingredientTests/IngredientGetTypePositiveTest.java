package praktikum.ingredientTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

@RunWith(Parameterized.class)
public class IngredientGetTypePositiveTest {

    private final IngredientType actualType;
    private final IngredientType expectedType;

    public IngredientGetTypePositiveTest(IngredientType actualType, IngredientType expectedType) {
        this.actualType = actualType;
        this.expectedType = expectedType;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[] getTestTypeData() {
        return new Object[][]{
                {SAUCE, SAUCE},
                {FILLING, FILLING},
        };
    }

    @Test
    public void getIngredientTypePositiveTest() {

        Random random = new Random();
        float randomFloat = random.nextFloat();

        Ingredient ingredient = new Ingredient(this.actualType,
                RandomStringUtils.randomAlphabetic(9), randomFloat);

        assertEquals(ingredient.getType(), expectedType);
    }

}
