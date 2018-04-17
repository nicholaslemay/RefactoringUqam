package Assurances;

import org.junit.jupiter.api.Test;

import static Assurances.NouvelleDemandeDePolice.UneNouvelleDemande;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculateurDePoliceParDemandeTest {

    @Test
    public void TestCalculatePrime(){
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").completee()));
    }

    private double PrixPour(DemandeDePolice demande){
        return CalculateurDePoliceParDemande.ObtenirPrix(demande);
    }
}
