import java.util.ArrayList;
import java.util.Scanner;


public class Etudiant {
    Scanner scan = new Scanner(System.in);
	 double Moyen = 0;
	 String Nom ;

    	public void calculMoyen() {
			ArrayList<Double> Note = new ArrayList<Double>();
        	System.out.println("Donne le 4 note");
        	for(int i =0; i < 4; i++) {
        		Note.add(scan.nextDouble());
        	}
        	
        	for(int i =0; i < 4; i++) {
        		
        		Moyen += Note.get(i);
        		
        	}
				System.out.println("La Moyen est : "+ Moyen/4);					
    	}

		public void Affiche(){
			System.out.println("Donne votre nom complet");
			Nom = scan.nextLine();
			calculMoyen();
		if(Moyen >= 10){
				System.out.println("Resultat = "+ Nom + " est Admi");

			}
		if(Moyen < 10){
				System.out.println("Resultat = "+ Nom + " est no pas Admi");

			}
		}

   
   
    public static void main(String[] args) {
    	
    		Etudiant Here = new Etudiant();
			Here.Affiche();

	
        
    }
    
}
