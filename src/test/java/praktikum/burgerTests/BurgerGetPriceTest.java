package praktikum.burgerTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetPriceTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Test
    public void getPriceTest() {

        Burger burger = new Burger();

        Random random = new Random();
        float randomFloat = random.nextFloat();

        Mockito.when(bun.getPrice()).thenReturn(randomFloat);
        Mockito.when(ingredient.getPrice()).thenReturn(randomFloat);

        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        assertEquals(bun.getPrice() * 2 + ingredient.getPrice(), burger.getPrice(), 0);

    }

}
