package praktikum.bunTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import java.util.Random;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetNamePositiveTest {

    private final String actualName;
    private final String expectedName;

    public BunGetNamePositiveTest(String actualName, String expectedName) {
        this.actualName = actualName;
        this.expectedName = expectedName;
        }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[] getTestNameData() {
        return new Object[][]{
                {"Bulka", "Bulka"},
                {"", ""},
                {" ", " "},
                {null, null},
            };
        }

    @Test
    public void getBunNamePositiveTest() {

        Random random = new Random();
        float randomFloat = random.nextFloat();

        Bun bun = new Bun(this.actualName, randomFloat);

        assertEquals(bun.getName(), expectedName);
    }

}