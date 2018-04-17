package Assurances;

import java.util.ArrayList;
import java.util.List;

public class CalculateurDePolice {

    public static Double Calculate(String sexe, boolean fumeur, boolean collective) {
        double prix;

        if(sexe == "homme"){
            prix = 25.0;
        }else{
            prix = 24.0;
        }


        if (fumeur == true){
            prix = prix + 10;
        }

        if (collective == true){
            prix = prix - 5;
        }

        //Ajustement selon le plan
        String detalPlan = "";
        switch (detalPlan){
            case "aucun":
                prix = prix + 0;
                break;
            case "familial":
                prix = prix + 2;
                break;
            case "perso":
                prix = prix + 3;
                break;
            case "couple":
                prix = prix +4;
                break;
        }

        List<String> maladiesGraves = new ArrayList<String>();


        for (int i = 0; i < maladiesGraves.size(); i++) {
            String maladiesGrave = maladiesGraves.get(i);
            if (maladiesGrave == "diabete") {
                prix = prix + 1;
            } else if (maladiesGrave == "acne") {
                prix = prix + 2;
            } else {
                // do nothing
            }
        }

        int age;




        return prix;

    }
}
