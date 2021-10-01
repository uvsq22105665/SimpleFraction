import java.util.ArrayList;

/**
 * Write a description of class Serveur here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Serveur
{

    private ArrayList<Client> clients;
    /**
     * Constructor for objects of class Serveur
     */
    public Serveur()
    {
        // initialise instance variables
        this.clients = new ArrayList<>();
    }

    /**
     * connecter
     *
     * @param  client  un client qui veut se connecter
     * @return   true si le client n'est pas deja dans la liste des personnes connectées
     */
    public boolean connecter(Client client)
    {
        if(!this.clients.contains(client)){
            clients.add(client);
            return true;
        }
        else return false;
        // put your code here
        //return this.clients.contains(client);
    }
    
    public void diffuser(String message){
        for (Client c : clients){
            c.recevoir(message);
        }
        
    }
}
