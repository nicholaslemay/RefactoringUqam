package Assurances;

import static Assurances.RefactoringCatalog.QuartDeTravail.Jour;
import static Assurances.RefactoringCatalog.QuartDeTravail.Nuit;

public class RefactoringCatalog {


    private int joursDeMaladie;
    private int joursDeMaladieRestants;
    private int joursDeCongesAccumules;
    private double tauxJournalier;
    private double coteDeRendement;

    private Integer valeur = null;



    public double CalculerMontantPaie() {
        double montantPaie = 0;

        montantPaie += montantsProvenantsDeJourneesDeMaladiesAdmissibles();


        return montantPaie;

    }

    private double montantsProvenantsDeJourneesDeMaladiesAdmissibles() {
        if (joursDeMaladie == 0) {
            return 0;

        int journeesAdmissibles = Math.min(joursDeMaladie, joursDeMaladieRestants);
        return journeesAdmissibles * tauxJournalier;
    }


    //Simplify conditional
    public double CaclulerSoldeDeVacance() {

        if (joursDeCongesAccumules > 0) {
            return joursDeCongesAccumules * tauxJournalier;
        }else{
            return 0;
        }

    }

    public double CalculerPrimeAuRendement() {

        if (coteDeRendement > 5) {
            return tauxJournalier * 0.5;
        }else if(coteDeRendement > 10){
            return tauxJournalier * 0.75;
        }else if(coteDeRendement > 15){
            return tauxJournalier * 1;
        }else{
            return 0;
        }
    }

    public void DoTheDew(){
        CalculerPrimeAuRendement();
        CaculerMontantElligible(true);
        CaculerMontantElligibleApresRetraite();
        CaculerMontantElligibleAvantRetraite();
    }
    //boolean parameter

    public double CaculerMontantElligible(boolean estRetraite) {
        if(estRetraite){
            //cas apres retraite
        }else{
            //cas avant retraite
        }

        return 0;
    }


    public double CaculerMontantElligibleApresRetraite()

    public double CaculerMontantElligibleAvantRetraite()


    public int GetQuelquechoseDeLongACharger(){
        if(valeur != null){
            return valeur;
        }
        return valeur = recupererValeur();

    }


    public static final String SOIR = "soir";
    public static final String NUIT = "nuit";

    public double CalculerPrimeEnFonctionDuQuartDeTravail(String quart){
        if(quart == SOIR)
            return tauxJournalier * 0.05;
        if(quart == NUIT)
            return tauxJournalier * 0.10;
        return 0;

    }

    public enum QuartDeTravail{
        Jour, Nuit
    }

    public double CalculerPrimeEnFonctionDuQuartDeTravail(QuartDeTravail quart){

        if(quart == Jour)
            return tauxJournalier * 0.05;
        if(quart == Nuit)
            return tauxJournalier * 0.10;
        return 0;

    }

    private int recupererValeur() {
        return 0;
    }



    public void BoomBoom(){
        CalculerPrimeEnFonctionDuQuartDeTravail("cuisse");
        CalculerPrimeEnFonctionDuQuartDeTravail(QuartDeTravail.Jour);
        CalculerMontantPaie();
    }
}







