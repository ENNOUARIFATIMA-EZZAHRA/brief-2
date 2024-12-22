import java.util.ArrayList;
import java.util.Scanner;
// gestion des apprenants hérite de personne
class Aprenante extends Personne {

    // Les attribues
    private Classe classe;
    private ArrayList<Double> notes;

    //liste de affichage des apprenant
    static ArrayList<Aprenante> LIST = new ArrayList<>();

    //constructor avec parametres
    public Aprenante(int id, String nom, String prenom, String email) {

        super(id, nom, prenom, email);
        this.notes=new ArrayList<>();
    }

    public Aprenante() {
        super();
        this.notes=new ArrayList<>();
    }

    // Getters et Setters
    public Classe getClasse() {

        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public ArrayList<Double> getNotes() {

        return notes;
    }

    public void setNotes(ArrayList<Double> notes) {

        this.notes = notes;
    }

//methode gestion des apprenants
    public void gestionApprenants() {
        int choix;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n====Gestion des Apprenants ====\n");
            System.out.println("1. Ajouter un apprenant");
            System.out.println("2. Associer un apprenant à une classe");
            System.out.println("3. Modifier les informations d'un apprenant");
            System.out.println("4. Supprimer un apprenant");
            System.out.println("5. Afficher les apprenants");
            System.out.println("0. Retour au menu principal");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();// Get the user's choice
            if (choix == 0) {
                System.out.println("Retour au menu principal...");
                break;
            }

            switch (choix) {
                case 1:
                    ajouterApprenant();
                    break;
                case 2:
                    modifierApprenant();
                    break;
//                case 3:
//
//                   associerClasse();
//                    break;
                case 4:
                    supprimerApprenant();
                    break;
                case 5:
                    afficherApprenant();
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
        sc.close();
    }

    //Ajouter les apprenants
    public void ajouterApprenant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer id des apprenants");
        int id = sc.nextInt();
        sc.nextLine();//pour la ligne
        System.out.println("entrer name des apprenants\n");
        String nom = sc.nextLine();
        System.out.println("entrer prenom des apprenants");
        String prenom = sc.nextLine();
        System.out.println("entrer email des apprenants");
        String email = sc.nextLine();
        LIST.add(new Aprenante(id, nom, prenom, email));
        System.out.println("L'apprenant ajouter avec succes !");
    }

    //Afficher les apprenants
    public void afficherApprenant() {
        //isEmpty to avoid error
        if (LIST.isEmpty()) {
            System.out.println("aucune apprenant a afficher !");
        } else {
            System.out.println("la liste des apprenants :");
            for (Aprenante apprenant : LIST) {
                System.out.println(apprenant.toString());
            }

        }
    }

    //Modifier les apprenants
    public void modifierApprenant() {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer nouveau id de l'apprenante a modifier :");
        int id = sc.nextInt();
        sc.nextLine();
        Aprenante apprenant = null;
        //modifier par id
        for (Aprenante ap : LIST) {
            if (ap.getId() == id) {
                apprenant = ap;
                break;
            }
        }
        if (apprenant != null) {
            System.out.println("entrer nouveau name");
            String nouveauNome = sc.nextLine();
            apprenant.setNome(nouveauNome);

            System.out.println("entrer nouveau prenom");
            String nouveauPrenom = sc.nextLine();
            apprenant.setPrenom(nouveauPrenom);

            System.out.println("entrer nouveau email");
            String nouveauEmail = sc.nextLine();
            apprenant.setEmail(nouveauEmail);
            System.out.println("les information est modifiée avec succes !");
        } else {
            System.out.println("Aucune apprenant trouve avec cette id!");
        }

    }
        //supprimer les apprenants
        public void supprimerApprenant(ArrayList<Aprenante> aprenantes) {
            Scanner sc = new Scanner(System.in);
            System.out.println("entrer l'id de l'apprenante a supprimer :");
            int id = sc.nextInt();
            sc.nextLine();
            Aprenante apprenant = null;
            //modifier par id
            for (Aprenante ap : LIST) {
                if (ap.getId() == id) {
                    apprenant = ap;
                    break;
                }
            }
            if (apprenant != null) {
               LIST.remove(apprenant);
                System.out.println("Apprenant supprimer avec succes !");
            } else {
                System.out.println("Aucune apprenant trouve avec cette id!");
            }
    }

}


