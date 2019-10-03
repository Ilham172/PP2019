import java.util.Scanner;
public class LoopA{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nilai x");
        int x = sc.nextInt();
        System.out.println("Masukkan nilai y");
        int y = sc.nextInt();

        for (int i = x; i<=y; i++){
            if(i%2==0 && i<0){
                System.out.println(i + " Genap Negatif");
            }
            else if(i%2==-1 && i<0){
                System.out.println(i + " Ganjil Negatif");
            }
            if(i%2==0 && i>0){
                System.out.println(i + " Genap Positif");
            }
            else if(i%2==1 && i>0){
                System.out.println(i + " Ganjil Positif");
            }
            else if (i==0) {
                System.out.println(i + " Nol");
            }
        }
        for (int i = y; i<=x; i++){
            if(i%2==0 && i<0){
                System.out.println(i + " Genap Negatif");
            }
            else if(i%2==-1 && i<0){
                System.out.println(i + " Ganjil Negatif");
            }
            if(i%2==0 && i>0){
                System.out.println(i + " Genap Positif");
            }
            else if(i%2==1 && i>0){
                System.out.println(i + " Ganjil Positif");
            }
            else if (i==0){
                System.out.println(i + " Nol");
            }
        
        }
    }
}