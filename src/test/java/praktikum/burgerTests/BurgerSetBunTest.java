package praktikum.burgerTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerSetBunTest {

    @Mock
    Bun bun;

    @Test
    public void setBunPositiveResult() {

        Burger burger = new Burger();
        burger.setBuns(bun);

        Mockito.when(bun.getName()).thenReturn("Bulka");
        Mockito.when(bun.getPrice()).thenReturn(50.50f);

        assertEquals("Bulka", burger.bun.getName());
        assertEquals(50.50f, burger.bun.getPrice(), 0);

    }

}
