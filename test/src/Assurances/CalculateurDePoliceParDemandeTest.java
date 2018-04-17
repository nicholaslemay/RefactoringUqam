package Assurances;

import org.junit.jupiter.api.Test;

import static Assurances.NouvelleDemandeDePolice.UneNouvelleDemande;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculateurDePoliceParDemandeTest {

    @Test
    public void CalculePrimeDeBase(){
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").completee()));
        assertEquals(24.0, PrixPour(UneNouvelleDemande().AvecSexe("femme").completee()));
    }

    @Test
    public void CalculePrimePourHommeFumeur(){
        assertEquals(35.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").Fumeur().completee()));
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").NonFumeur().completee()));
    }

    @Test
    public void CalculePrimePourHommeAgé(){
        assertEquals(30.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").AvecAge(70).completee()));
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").AvecAge(60).completee()));
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").AvecAge(65).completee()));
    }

    @Test
    public void CalculePrimePourHommeEnEntreprise(){
        assertEquals(20.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").Collective().completee()));
    }

    @Test
    public void CalculePrimePourHommeAvecPlanDentaire(){
        assertEquals(25.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecPlanDentaire("aucun").completee()));
        assertEquals(27.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecPlanDentaire("perso").completee()));
        assertEquals(28.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecPlanDentaire("couple").completee()));
        assertEquals(29.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecPlanDentaire("familial").completee()));
    }

    @Test
    public void CalculePrimePourHommeAvecMaladieGrave(){
        assertEquals(26.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecMaladieGrave("diabete").completee()));
        assertEquals(27.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecMaladieGrave("acne").completee()));
        assertEquals(28.0, PrixPour(UneNouvelleDemande().AvecSexe("homme").avecMaladieGrave("diabete", "acne").completee()));
    }

    private double PrixPour(DemandeDePolice demande){
        return CalculateurDePoliceParDemande.ObtenirPrix(demande);
    }
}
