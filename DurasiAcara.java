import java.util.Scanner;    
    public class DurasiAcara {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Waktu mulainya acara ");
            int j1 = sc.nextInt();
            int m1 = sc.nextInt();
            System.out.print("Waktu berakhirnya acara ");
            int j2 = sc.nextInt();
            int m2 = sc.nextInt();
            int jam = 0;
            int menit = 0;

            if (j1 > j2) {
                if (m1 > m2){
                    jam = 23-(j1-j2);
                    menit = 60-(m1-m2);
                }
                else if (m1 == m2){
                    jam = 24 - (j1-j2);
                    menit = 0;
                }
                else if (m1 < m2){
                    jam = 24 - (j1-j2);
                    menit = m2-m1;

                }
            }
            if (j1 == j2) {
                if (m1 > m2){
                    jam = 23;
                    menit = 60-(m1-m2);
                }
                else if (m1 == m2){
                    jam = 24;
                    menit = 0;
                    System.out.println("satu hari");
                }
                else if (m1 < m2){
                    jam = 24;
                    menit = m2-m1;
                    System.out.println("lebih dari satu hari");
                }
            }
            if (j1 < j2) {
                if (m1 > m2){
                    jam = (j2-j1)-1;
                    menit = 60-(m1-m2);
                }
                else if (m1 == m2) {
                    jam = j2-j1;
                    menit = 0;
                }
                else if (m1 < m2) {
                    jam = j2-j1;
                    menit = m2-m1;
                }
            }
           
            System.out.println(jam +" : "+ menit);
           

    }
}