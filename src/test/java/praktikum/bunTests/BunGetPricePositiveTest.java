package praktikum.bunTests;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetPricePositiveTest {

    private final float actualPrice;
    private final float expectedPrice;

    public BunGetPricePositiveTest(float actualPrice,
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
    public void getBunPricePositiveTest() {

        Bun bun = new Bun(RandomStringUtils.randomAlphabetic(10), this.actualPrice);

        assertEquals(expectedPrice, bun.getPrice(), 0);

    }

}
