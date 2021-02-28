import java.io.IOException;
import java.util.Scanner;

public class Diagonal {

     static int[][] matrix = new int[3][3];
        static int firstdiagonal = 0;
       static int seconddiagonal = 0;
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int y =0; y < 3; y++){
                matrix[i][y] = scan.nextInt();
            }
        }

        System.out.println(Calculs());
        scan.close(); 
    }

    public static int Calculs(){
        for(int i = 0; i < 3; i++){
            firstdiagonal += matrix[i][i];
        }
       
        for(int i =0; i < 3; i++){
            seconddiagonal += matrix[i][3 - (i + 1)];
        }

        return (Math.abs(firstdiagonal - seconddiagonal));
    } 
}
