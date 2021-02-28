import java.util.Scanner; 
public class PlusMinus {


   
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("choose the size");
        int size= scan.nextInt();
        int[] arr = new int[size];
        System.out.println("give us the numbers");
        for(int i =0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
            double positive = 0;
            double negative = 0;
            double zero = 0;
        for(int i =0; i < arr.length; i++){
            if(arr[i] > 0){
                positive += 1;
            }
            if(arr[i] < 0){
                negative += 1;
            }
            if(arr[i] == 0){
                zero +=1;
            }
        }
        System.out.println("-------------------------------------");

        System.out.println(positive/size);
        System.out.println(negative/size);
        System.out.println(zero/size);

    }

    
    
}
