import java.util.Scanner;
    public class JenisBilangan {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
                
            try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int e = sc.nextInt();

            int positif = 0;
            int negatif = 0;
            int genap = 0;
            int ganjil = 0;

            if (a % 2 == 0){
                if (a>0){
                    genap++;
                    positif++;
                }else if (a<0){
                    genap++;
                    negatif++;
                }else if (a==0){
                    genap++;
                }
            }else{
                if (a>0){
                    ganjil++;
                    positif++;
                }else if (a<0){
                    ganjil++;
                    negatif++;
                }
            }
            if (b % 2 == 0){
                if (b>0){
                    genap++;
                    positif++;
                }else if (b<0){
                    genap++;
                    negatif++;
                }else if (b==0){
                    genap++;
                }
            }else{
                if (b>0){
                    ganjil++;
                    positif++;
                }else if (b<0){
                    ganjil++;
                    negatif++;
                }
            }
            if (c % 2 == 0){
                if (c>0){
                    genap++;
                    positif++;
                }else if (c<0){
                    genap++;
                    negatif++;
                }else if (c==0){
                    genap++;
                }
            }else{
                if (c>0){
                    ganjil++;
                    positif++;
                }else if (c<0){
                    ganjil++;
                    negatif++;
                }
            }
            if(d % 2 == 0){
                if (d>0){
                    genap++;
                    positif++;
                }else if (d<0){
                    genap++;
                    negatif++;
                }else if (d==0){
                    genap++;
                }
            }else{
                if (d>0){
                    ganjil++;
                    positif++;
                }else if (d<0){
                    ganjil++;
                    negatif++;
                }
            }
            if (e % 2 == 0){
                if (e>0){
                    genap++;
                    positif++;
                }else if (e<0){
                    genap++;
                    negatif++;
                }else if (e==0){
                    genap++;
                }
            }else{
                if (e>0){
                    ganjil++;
                    positif++;
                }else if (e<0){
                    ganjil++;
                    negatif++;
                }
            }
            System.out.println(genap + " Angka genap");
            System.out.println(ganjil + " Angka ganjil");
            System.out.println(positif + " Angka positif");
            System.out.println(negatif + " Angka negatif");
        } catch (Exception ase) {
            System.out.println("Inputan tidak valid");
        } finally {
            sc.close();
        }
    }
        
}