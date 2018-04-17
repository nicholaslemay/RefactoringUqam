package Assurances;

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

    public NouvelleDemandeDePolice Nonfumeur(){
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
}
