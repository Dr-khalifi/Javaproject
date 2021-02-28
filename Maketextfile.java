import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;



public class Maketextfile{

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String filename;
            String text;
            String buff = "";
            boolean finish = false;

        System.out.print("give name for your file : ");
        filename = scanner.next();
        System.out.println("write the countent : ");
        while(scanner.hasNext()){
            text = scanner.next();
            if("EXIT".equals(text)){
                finish = true;
                break;
            }else{
                buff += text + " ";
                text = "";
            }

        }
        if(finish){
        try{
            FileWriter texte = new FileWriter(filename + ".txt");
            texte.write(buff);
            texte.close();
            int c;
            FileReader readr = new FileReader(filename + ".txt");
            while((c = readr.read() ) !=-1){
                System.out.print((char) c );
            }
            readr.close();
        }
        catch(Exception ex){}

    }


            scanner.close();
    }





}