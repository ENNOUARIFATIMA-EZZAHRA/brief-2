
import java.util.Scanner;
import java.util.ArrayList;

public class Application {
    //liste pour stocker les apprenants
    private ArrayList<Aprenante>apprenants=new ArrayList<>();

    public static void main(String[] args) {

        int id;
        String nom, prenom, email;
        int choix;
        Scanner sc = new Scanner(System.in);

        // Affichage du menu principale
        while (true) {



            System.out.println("\n==== Menu principale ====\n");
            System.out.println(" 1. Gestion des Apprenants\n");
            System.out.println(" 2. Gestion des Formateurs\n");
            System.out.println(" 3.  Gestion des Classes\n");
            System.out.println(" 0. Quitter\n");
            System.out.println("Votre choix : ");
            choix = sc.nextInt();

            if (choix == 0) {
                System.out.println("Au revoir!");
                break;
            }
            Aprenante app = new Aprenante();
            switch (choix) {
                case 1:
                    System.out.println("Gestion des Apprenants");
                    app.gestionApprenants();
                    break;
                    case 2:
                        System.out.println("Gestion des formateurs (non implementee)");
                    break;
                case 3:
                    System.out.println("Gestion des Classes (non implementee)");
                    break;
//
                default:
                    System.out.println("choix invalid !");

            }

        }
        sc.close();
    }


}
