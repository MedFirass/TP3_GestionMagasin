package ex2;
import Ex1.produit;
public class magasin {
    public int identifiant;
    public String adresse;
    public int capacite=50;
    public int numMagasin;
    public static int cpt=1;
    public produit[] produits=new produit[capacite];
    public int nombreDeProduit=0;

    public magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        numMagasin=cpt;
        cpt++;

    }

    public magasin() {
        numMagasin=cpt;
        cpt++;
    }

    public void ajoutProduit(produit produit){
        if(nombreDeProduit<=capacite){
            produits[nombreDeProduit]=produit;
            nombreDeProduit++;
        }else {
            System.out.println("le contene maximale de la magasin est 50");
        }
    }
    public void afficher(){
        System.out.println("identifiant de magasin est :"+identifiant
                +"\n Adresse :"+adresse
                +"\ncapacite :"+capacite
                +"\nLes produits de magasin sont:"
        );
        for (int i = 0; i < nombreDeProduit; i++) {
            System.out.println(
                    "le nom de la produit n°"+(i+1)+"est :"+produits[i].getLibelle()
                            +"\nle prix de la produit n°"+(i+1)+"est :"+produits[i].getPrix()
                            +"\n______________________________________________________"
            );
        }
    }



}

