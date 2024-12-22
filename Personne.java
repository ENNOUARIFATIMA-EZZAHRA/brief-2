abstract class Personne {
    private int id;
    private String nome;
    private String prenom;
    private String email;


    //Creer constructeur
    public Personne(int id, String nom, String prenom, String email) {
        this.id = id;
        this.nome = nom;
        this.prenom = prenom;
        this.email = email;


    }

    public Personne() {

    }
    // getters and setters

    public int getId() {   // permet de lire l'atribut
        return id;
    }

    public void setId(int id) {    // permet de modifier
        this.id = id;
    }

    public String getNom() {
        return nome;
    }

    public void setNom(String nom) {
        this.nome = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}


