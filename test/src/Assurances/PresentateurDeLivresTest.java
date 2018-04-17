package Assurances;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PresentateurDeLivresTest {

    public class MaBibliotheque implements Bibliotheque {

        @Override
        public List<String> TitresPresentementDisponibles() {
            return List.of("tdd", "refactoring", "scrum");
        }
    }

    @Test
    public void AfficheTousLesNomsDeLivreAvecUneMajuscule(){

        //Given
        PresentateurDeLivres presentateurDeLivres = new PresentateurDeLivres(new MaBibliotheque());

        //When
        List<String> noms = presentateurDeLivres.NomsDesLivresDisponibles();

        //Then
        assertEquals(noms.get(0), "Tdd");
        assertEquals(noms.get(1), "Refactoring");
        assertEquals(noms.get(2), "Scrum");
    }
}
