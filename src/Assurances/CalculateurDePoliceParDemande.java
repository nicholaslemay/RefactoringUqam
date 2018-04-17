package Assurances;

import java.util.ArrayList;
import java.util.List;

public class CalculateurDePoliceParDemande {

    public static Double obtenirPrix(DemandeDePolice demande) {
        double prix;

        if(demande.sexe == "homme"){
            prix = 25.0;
        }else{
            prix = 24.0;
        }


        if (demande.fumeur == true){
            prix = prix + 10;
        }

        if(demande.age > 65){
            prix = prix + 5;
        }

        if (demande.collective == true){
            prix = prix - 5;
        }

        //Ajustement selon le type de plan
        switch (demande.dentalPlan){
            case "aucun":
                prix = prix + 0;
                break;
            case "perso":
                prix = prix + 2;
                break;
            case "couple":
                prix = prix + 3;
                break;
            case "familial":
                prix = prix +4;
                break;
        }

        for (int i = 0; i < demande.maladiesGrave.size(); i++) {
            String maladieGrave = demande.maladiesGrave.get(i);
            if (maladieGrave == "diabete") {
                prix = prix + 1;
            } else if (maladieGrave == "acne") {
                prix = prix + 2;
            } else {
                // do nothing
            }
        }


        return prix;

    }
}
