package praktikum.databaseTests;

import org.junit.Test;
import praktikum.Database;
import praktikum.data.ExpectedDatabase;

public class CheckDataFromDatabaseTests {

    @Test
    public void getAvailableBunsTest() {

        Database database = new Database();
        ExpectedDatabase expectedDatabase = new ExpectedDatabase();

        database.availableBuns().equals(expectedDatabase.getExpectedBuns());

    }

    @Test
    public void getAvailableIngredients() {

        Database database = new Database();
        ExpectedDatabase expectedDatabase = new ExpectedDatabase();

        database.availableIngredients().equals(expectedDatabase.getExpectedIngredients());

    }

}
