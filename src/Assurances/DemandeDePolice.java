package Assurances;

import java.util.ArrayList;
import java.util.List;

public class DemandeDePolice {

    public String sexe;
    public int age;
    public boolean fumeur;
    public boolean collective;
    public String dentalPlan = "";
    public List<String> maladiesGrave = new ArrayList<>();

    public boolean estPourPersonneAgee() {
        return age > 65;
    }
}

