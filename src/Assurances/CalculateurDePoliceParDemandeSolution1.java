package Assurances;

public class CalculateurDePoliceParDemandeSolution1 {

    private static final double PRIX_BASE_HOMME = 25.0;
    private static final double PRIX_BASE_FEMME = 24.0;

    public static Double obtenirPrix(DemandeDePolice demande) {
        return prixDeBaseSelon(demande.sexe)
            + surprimes(demande)
            + dentalPlanAdjustment(demande)
            - rabaisCollectif(demande);
    }

    private static double prixDeBaseSelon(String sexe) {
        return sexe == "homme" ? PRIX_BASE_HOMME : PRIX_BASE_FEMME;
    }

    private static double surprimes(DemandeDePolice demande) {
        double surprime = 0;

        if (demande.fumeur)
            surprime += 10;

        if(demande.estPourPersonneAgee())
            surprime += 5;

        return surprime + surprimeMaladiesGraves(demande);
    }

    private static double surprimeMaladiesGraves(DemandeDePolice demande) {
        double surprime = 0;
        if (demande.maladiesGrave.contains("diabete"))
            surprime++;
        if (demande.maladiesGrave.contains("acne"))
            surprime += 2;
        return surprime;
    }

    private static double dentalPlanAdjustment(DemandeDePolice demande) {
        switch (demande.dentalPlan){
            case "perso":
                return 2;
            case "couple":
                return 3;
            case "familial":
                return 4;
            default:
                return 0;
        }
    }

    private static double rabaisCollectif(DemandeDePolice demande) {
        return demande.collective ? 5 : 0;
    }
}
