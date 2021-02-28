import java.util.Scanner;

public class PrixTTC {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bonjour Qu'avez-vous acheté? alimentaire - autre - ou les Deux");
        String type  = scan.nextLine();
       

       if(type.equals("alimentaire")){
        System.out.println("Donne le prix");
        double prix  = scan.nextDouble();
           System.out.println("Donne les nombres des articls");
           int articl = scan.nextInt();
           double ttc = articl * prix;
           double tva = (ttc * 5)/100;
           double Prix = ttc + tva;
           System.out.println("le prix d un seul articl : " + prix + " DH");
           System.out.println("le prix de lot : " + ttc + " DH");
           System.out.println("le prix avec TVA : " + Prix + " DH");
          
       }

       if(type.equals("autre")){
        System.out.println("Donne le prix");
        double prix  = scan.nextDouble();
        System.out.println("Donne les nombres des articls");
        int articl = scan.nextInt();
        double ttc = articl * prix;
        double tva = (ttc * 20)/100;
        double Prix = ttc + tva;
        System.out.println("le prix d un seul articl : " + prix + " DH");
        System.out.println("le prix de lot : " + ttc + " DH");
        System.out.println("le prix avec TVA : " + Prix + " DH");
  
    }

        if(type.equals("deux")){
            System.out.println("Donne le prix de l alimentaire : ");
        double prix1  = scan.nextDouble();
            System.out.println("Donne le prix de l autre : ");
        double prix2  = scan.nextDouble();
            System.out.println("Donne les nombres des articls alimentaire : ");
        int articl1 = scan.nextInt();
            System.out.println("Donne les nombres des articls autre : ");
        int articl2 = scan.nextInt();
        double tcc1 = prix1 *articl1;
        double tcc2 = prix2 *articl2;
        double toutal = tcc1 + tcc2; //toutal
        double tva1 = (tcc1 * 5)/100;
        double tva2 = (tcc2 * 20)/100;
        double Prix = toutal + tva1 + tva2;
            System.out.println("le prix d un seul articl alimentaire " + prix1+ " DH" + "le prix d un seul articl alimentaire" + prix2+ " DH");
            System.out.println("le prix de lot : " + toutal + " DH");
            System.out.println("le prix avec TVA : " + Prix+ " DH");
  


        }

        
    }
    
}
