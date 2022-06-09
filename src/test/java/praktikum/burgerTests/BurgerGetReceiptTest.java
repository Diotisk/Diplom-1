package praktikum.burgerTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Locale;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetReceiptTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient;

    @Test
    public void getReceiptTest() {

        Mockito.when(bun.getName()).thenReturn("Bulka");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING).toString().toLowerCase(Locale.ROOT);
        Mockito.when(ingredient.getName()).thenReturn("Ingredient");

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);

        StringBuilder expectedReceipt = new StringBuilder("(==== Bulka ====)" + "\n" +
                "= filling Ingredient =" + "\n" + "(==== Bulka ====)" + "\n" +
                "\n" + "Price: 0,000000" + "\n");

        assertEquals(expectedReceipt.toString(), burger.getReceipt());

    }

}
