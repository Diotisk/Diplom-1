package praktikum.ingredientTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.apache.commons.lang3.RandomStringUtils;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IngredientGetPricePositiveTest {

    private final float actualPrice;
    private final float expectedPrice;

    public IngredientGetPricePositiveTest(float actualPrice,
                                          float expectedPrice) {

        this.actualPrice = actualPrice;
        this.expectedPrice = expectedPrice;

    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[] getTestPriceData() {
        return new Object[][]{
                {0.0f, 0.0f},
                {0, 0.0f},
                {-0.001f, -0.001f},
                {450, 450.0f},
        };
    }

    @Test
    public void getPricePositiveTest() {

        Ingredient ingredient = new Ingredient(IngredientType.FILLING,
            RandomStringUtils.randomAlphabetic(9), this.actualPrice);

        assertEquals(expectedPrice, ingredient.getPrice(), 0);
    }

}