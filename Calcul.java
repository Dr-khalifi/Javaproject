import java.util.Scanner;
public class Calcul {

    public static void main(String[] args) {
        System.out.println("choise one for this operetor + - * / %");

        Scanner scanner = new Scanner(System.in);
        String Exit ;
        double sum = 0;

        do{
            System.out.println("you want to exit : ");
            Exit = scanner.nextLine();
            Exit = scanner.nextLine();
          if( Exit.equals("no"))  {
            System.out.println("choose a operator : ");
            String operator = scanner.next();
        
            System.out.println("Choose tow number : ");
        double num1 = scanner.nextInt();
        double num2 = scanner.nextInt();


        switch(operator){

            case "+":
                sum = num1 + num2;
                break;
                
            case "-":
                sum = num1 - num2;
                break;
            case "*":
                sum = num1 * num2;
                break;
            case "/":
                sum = num1 / num2;
                break;
            case "%":
                sum = num1 % num2;
                break;         
                
        }

        System.out.println(sum);
        
    }else{
        break;
    }
    }while(Exit.equals("no"));
        
        
    scanner.close();
    }

  
    }
    

