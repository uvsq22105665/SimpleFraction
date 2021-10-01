import java.util.ArrayList;

/**
 * Write a description of class Client here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Client
{
    // instance variables - replace the example below with your own
    private String nom;
    public ArrayList<String> envoyer = new ArrayList<>();
    public ArrayList<String> recu = new ArrayList<>();
    
    /**
     * Constructor for objects of class Client
     */
    public Client(String nom)
    {
        // initialise instance variables
       this.nom = nom;
    }

    /**
     * seConnecter
     *
     * @param  serveur  le serveur où le client veut se connecter
     * @return    true si la connexion s'est effectué et non sinon
     */
    public boolean seConnecter(Serveur serveur)
    {
        // put your code here
        if (serveur.connecter(this)){
            System.out.println("Connexion réussie");
            return true;
        }else{
            System.out.println("Deja connecté");
            return false;
        }
    }
    
    public void envoyer(String message){
        this.envoyer.add(message);
    }
    
    public void recevoir(String message){
        this.recu.add(message);
    }
    
}
