package Club;

public class Persona {

    private String DNI;
    private String nom;
    private String cognoms;
    private int telefon;
    private String email;

    public Persona(String DNI, String nom, String cognoms, int telefon, String email) {
        this.DNI = DNI;
        this.nom = nom;
        this.cognoms = cognoms;
        this.telefon = telefon;
        this.email = email;
    }

    public Persona() {

    }

    public String getDNI() {
        return DNI;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public int getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }

}