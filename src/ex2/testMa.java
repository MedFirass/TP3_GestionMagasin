package ex2;
import Ex1.produit;
public class testMa {
    public static void main(String[] args) {
        produit produit1=new produit(1021,"Lait","vitalait",1.0);
        produit produit2=new produit(2569,"Yaourt","delice",2.0);
        produit produit3=new produit(389,"hrissa","sicam",5.6);
        magasin magasin=new magasin(1896,"SBZ");
        magasin.ajoutProduit(produit1);
        magasin.ajoutProduit(produit2);
        magasin.ajoutProduit(produit3);
        magasin.afficher();

        System.out.println("le nombre des produits de magasin N°"+magasin.numMagasin+" est "+magasin.nombreDeProduit);
    }
}
