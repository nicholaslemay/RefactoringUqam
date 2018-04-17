package Assurances;

import static java.util.Arrays.asList;

public class NouvelleDemandeDePolice{

    private DemandeDePolice demande = new DemandeDePolice();

    public static NouvelleDemandeDePolice UneNouvelleDemande(){
        return new NouvelleDemandeDePolice();
    }

    public NouvelleDemandeDePolice AvecSexe(String sexe){
        this.demande.sexe = sexe;
        return this;
    }

    public NouvelleDemandeDePolice AvecAge(int age){
        this.demande.age = age;
        return this;
    }

    public NouvelleDemandeDePolice Fumeur(){
        this.demande.fumeur = true;
        return this;
    }

    public NouvelleDemandeDePolice NonFumeur(){
        this.demande.fumeur = false;
        return this;
    }

    public NouvelleDemandeDePolice Collective(){
        this.demande.collective = true;
        return this;
    }

    public NouvelleDemandeDePolice NonCollective(){
        this.demande.collective = false;
        return this;
    }

    public DemandeDePolice completee() {
        return demande;
    }

    public NouvelleDemandeDePolice avecPlanDentaire(String type) {
        this.demande.dentalPlan = type;
        return this;
    }

    public NouvelleDemandeDePolice avecMaladieGrave(String... maladies) {
        this.demande.maladiesGrave = asList(maladies);
        return this;
    }
}
