package Assurances;

import java.util.List;
import java.util.stream.Collectors;

public class PresentateurDeLivres {
    private Bibliotheque librairie;

    public PresentateurDeLivres(Bibliotheque librairie){
        this.librairie = librairie;
    }


    public List<String> NomsDesLivresDisponibles(){
        return librairie.TitresPresentementDisponibles()
                .stream().map(n -> n.substring(0, 1).toUpperCase() + n.substring(1))
                .collect(Collectors.toList());
    }
}
