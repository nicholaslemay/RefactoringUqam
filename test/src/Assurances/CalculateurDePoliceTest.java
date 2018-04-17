package Assurances;

import Assurances.CalculateurDePolice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateurDePoliceTest {

    @Test
    public void TestCalculatePrime(){


        assertEquals(25.0, (double) CalculateurDePolice.Calculate("homme", false, false));
        assertEquals(24.0, (double) CalculateurDePolice.Calculate("femme", false, false));

        assertEquals(35.0, (double) CalculateurDePolice.Calculate("homme",true, false));
        assertEquals(25.0 - 5.0, (double) CalculateurDePolice.Calculate("homme",false, true));
    }
}
