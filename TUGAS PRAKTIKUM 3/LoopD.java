import java.util.Scanner;
public class LoopD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Harga Barang = ");
        int harga = sc.nextInt();
        System.out.println("Jumlah Uang = ");
        int uang = sc.nextInt();
        int kembalian = uang - harga;
        int rp100 = 0;
        int rp50 = 0;
        int rp20 = 0;
        int rp10 = 0;
        int rp5 = 0;
        int rp2 = 0;
        int rp1 = 0;

            while (kembalian > 0){
                if (kembalian >=100000){
                    kembalian -= 100000;
                    rp100++;
                }
                else if (kembalian >=50000){
                    kembalian -= 50000;
                    rp50++;
                }
                else if (kembalian >=20000){
                    kembalian -= 20000;
                    rp20++;
                }
                else if (kembalian >=10000){
                    kembalian -= 10000;
                    rp10++;
                }
                else if (kembalian >=5000){
                    kembalian -= 5000;
                    rp5++;
                }
                else if (kembalian >=2000){
                    kembalian -= 2000;
                    rp2++;
                }
                else if (kembalian >=1000){
                    kembalian -= 1000;
                    rp1++;
                }
            }
            System.out.println(rp100 + " uang Rp. 100.000");
            System.out.println(rp50 + " uang Rp. 50.000");
            System.out.println(rp20 + " uang Rp. 20.000");
            System.out.println(rp10 + " uang Rp. 10.000");
            System.out.println(rp5 + " uang Rp. 5.000");
            System.out.println(rp2 + " uang Rp. 2.000");
            System.out.println(rp1 + " uang Rp. 1.000");
    }
}