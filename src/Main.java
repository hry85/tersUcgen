import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);

        System.out.print("Basamak sayisinin giriniz : ");
        n=sc.nextInt();

        for (int i = 1 ; i<= n ; i++){
            for (int j = 1 ; j< i ; j++){
                System.out.print(" ");
            }
            for (int k = 0 ; k<= ((2*n)-(2*i)) ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
