package Ex1;
import java.util.Date;

public class produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private Double prix;
    private Date date;

    public produit(){
    }

    public produit(int identifiant, String libelle, String marque, Double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public produit(int identifiant, String libelle, String marque) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
    }

    public produit(int identifiant, String libelle, String marque, Double prix, Date date) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
        this.date = date;
    }

    public void affiche(){
        System.out.println("identifiant du produit: "+identifiant+
                " \n son libelle est: " +libelle+
                " \nson marque: "+marque+
                " \n son prix: "+prix);
    }


    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date= date;
    }
    public void affdate(){
        System.out.println(date);
    }
}
