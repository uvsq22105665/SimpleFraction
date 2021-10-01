
/**
 * Write a description of class ChaineCryptee here.
 *
 * @author Fanoa
 * @version 1.0
 */
public class ChaineCryptee
{
    // instance variables - replace the example below with your own
    private int decalage;
    private String stored;

    public static ChaineCryptee deCryptee(String s, int decalage){
        String crypted = "";
        for (int i = 0; i < s.length(); i++){
            crypted= crypted + decaleCaractere(s.charAt(i), decalage);
        }
        return new ChaineCryptee(crypted,decalage);
    }
    
    public static ChaineCryptee deEnClair(String s, int decalage){
        return new ChaineCryptee(s,decalage);
    }
    
    /**
     * Constructor for objects of class ChaineCryptee
     */
    private ChaineCryptee(String s,int decalage)
    {
        // initialise instance variables
        this.decalage = decalage;
        this.stored = s;

    }

    /**
     * Retourne la chaine en clair
     *
     * @return    la chaine en clair
     */
    public String decrypte()
    {
        // put your code here
        String tmp = "";
        // put your code here
        System.out.println(this.stored.length());
        for (int i = 0; i < this.stored.length(); i++){
            tmp= tmp + decaleCaractere(this.stored.charAt(i), -this.decalage);
        }
        return tmp;
    }
    
    /**
 * Décale un caractère majuscule.
 * Les lettres en majuscule ('A' - 'Z') sont décalées de <code>decalage</code>
 * caractères de façon circulaire. Les autres caractères ne sont pas modifiés.
 *
 * @param c le caractère à décaler
 * @param decalage le décalage à appliquer
 * @return le caractère décalé
 */
private static char decaleCaractere(char c, int decalage) {
    return (c < 'A' || c > 'Z')? c : (char)(((c - 'A' + decalage) % 26) + 'A');
}

    /**
     * Retourne la chaine cryptée
     *
     * @return    la chaine crypté ou "chaine vide" si la chaine est vide
     */
    public String crypte()
    {
        // put your code here
        String tmp = "";
        // put your code here
        for (int i = 0; i < this.stored.length(); i++){
            tmp= tmp + decaleCaractere(this.stored.charAt(i), this.decalage);
        }
        return tmp;
    }
    
    public static void main(String[] args) {
        ChaineCryptee cc = ChaineCryptee.deCryptee("AB", 2);
        String out = cc.decrypte();
        System.out.println(out);
    }
}
