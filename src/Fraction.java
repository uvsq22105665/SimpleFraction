public class Fraction {

    int nom;
    int deno;
    public Fraction(int a, int b){
        this.nom = a;
        this.deno = b;
    }

    @Override
    public String toString(){
        return this.nom + "/" + this.deno;
    }

    public static void main(String[] args) {
        //System.out.println("test");
        Fraction f = new Fraction(1,2);
        String fraction = f.toString();
        System.out.println(fraction);
    }
}
