import java.util.Scanner;
public class Bangun{

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("===MENU===");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Datar");
        System.out.println("\nInput Angka Sesuai dengan Menu Yang Diinginkan :");

        String menu = sc.nextLine();

        switch(menu){
            case "1" :
                System.out.println("===PILIH BANGUN DATAR===");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Segitiga");
                System.out.println("4. Lingkaran");
                System.out.println("5. Jajar Genjang");
                System.out.println("6. Trapesium");
                System.out.println("7. Belah Ketupat");
                System.out.println("8. Layang-Layang"); 
                System.out.println("\nInput angka sesuai dengan nomor bangun datar yang di inginkan");

                String bangunDatar = sc.nextLine();
                switch (bangunDatar){
                    case "1":
                    System.out.println("MENGHITUNG LUAS PERSEGI");
                    System.out.println("masukkan panjang");
                    int p1 = sc.nextInt();
                    System.out.println("masukkan lebar");
                    int l1= sc.nextInt();
                    int luasPersegi = p1*l1;
                    System.out.println(" luas persegi = " + luasPersegi);
                    break;
                    
                    case "2":
                    System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
                    System.out.println("masukkan panjang");
                    int p2 = sc.nextInt();
                    System.out.println("masukkan lebar");
                    int l2 = sc.nextInt();
                    int luasPersegiPanjang = p2*l2;
                    System.out.println("luas persegi panjang = " + luasPersegiPanjang);
                    break;

                    case "3":
                    System.out.println("MENGHITUNG LUAS SEGITIGA");
                    System.out.println("masukkan tinggi");
                    int t1 = sc.nextInt();
                    System.out.println("masukkan alas");
                    int a1 = sc.nextInt();
                    double luasSegitiga = (a1*t1)/2;
                    System.out.println("luas segitiga = " + luasSegitiga);
                    break;

                    case "4":
                    System.out.println("MENGHITUNG LUAS LINGKARAN");
                    System.out.println("masukkan jari-jari");
                    int r1 = sc.nextInt();
                    double luasLingkaran = 3.14*r1*r1;
                    System.out.println("luas lingkarannya = " + luasLingkaran);
                    break;

                    case "5":
                    System.out.println("MENGHITUNG LUAS JAJAR GENJANG");
                    System.out.println("masukkan alas");
                    int a2 = sc.nextInt();
                    System.out.println("masukkan tinggi ");
                    int t2 = sc.nextInt();
                    double luasJajarGenjang = a2*t2;
                    System.out.println("luas Jajar Genjang = " + luasJajarGenjang); 
                    break;

                    case "6":
                    System.out.println("MENGHITUNG LUAS TRAPESIUM");
                    System.out.println("masukkan sisi atas");
                    int s1 = sc.nextInt();
                    System.out.println("masukkan sisi bawah");
                    int s2 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t3 = sc.nextInt();
                    double luasTrapesium = (s1+s2)/2*t3;
                    System.out.println("luas Trapesium = " + luasTrapesium);
                    break;

                    case "7":
                    System.out.println("MENGHITUNG LUAS BELAH KETUPAT");
                    System.out.println("masukkan diagonal 1");
                    int d1 = sc.nextInt();
                    System.out.println("masukkan diagonal 2");
                    int d2 = sc.nextInt();
                    double luasBelahKetupat = (d1*d2)/2;
                    System.out.println("luas belah ketupat = " + luasBelahKetupat);

                    case "8":
                    System.out.println("MENGHITUNG LUAS LAYANG-LAYANG");
                    System.out.println("masukkan diagonal 1");
                    int d3 = sc.nextInt();
                    System.out.println("masukkan diagonal 2");
                    int d4 = sc.nextInt();
                    double luasLayangLayang = (d3*d4)/2;
                    System.out.println("luas layang-layang = " + luasLayangLayang);

                }break;
                
        
            case "2" :
                System.out.println("===PILIH BANGUN RUANG===");
                System.out.println("1. kubus");
                System.out.println("2. balok");
                System.out.println("3. prisma segitiga");
                System.out.println("4. tabung");
                System.out.println("5. limas segitiga");
                System.out.println("6. limas segiempat");
                System.out.println("7. bola");
                System.out.println("8. kerucut"); 
                System.out.println("\nInput angka sesuai dengan nomor bangun ruang yang di inginkan");

                String bangunRuang = sc.nextLine();
                switch (bangunRuang){
                    case "1":
                    System.out.println("MENGHITUNG VOLUME KUBUS");
                    System.out.println("masukkan sisi");
                    int s3 = sc.nextInt();
                    double volumeKubus = s3*s3*s3;
                    System.out.println("volume kubus = " + volumeKubus);
                    break;

                    case "2":
                    System.out.println("MENGHITUNG VOLUME BALOK");
                    System.out.println("masukkan panjang");
                    int p3 = sc.nextInt();
                    System.out.println("masukkan lebar");
                    int l3 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t4 = sc.nextInt();
                    double volumeBalok = p3*l3*t4;
                    System.out.println("volume Balok = " + volumeBalok);
                    break;

                    case "3":
                    System.out.println("MENGHITUNG VOLUME PRISMA SEGITIGA ");
                    System.out.println("masukkan sisi1");
                    int s4 = sc.nextInt();
                    System.out.println("masukkan sisi2");
                    int s5 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t5 = sc.nextInt();
                    double volumePrismaSegitiga = (s4*s5*t5)/2;
                    System.out.println("volume Prisma Segitiga = " + volumePrismaSegitiga);
                    break;

                    case "4":
                    System.out.println("MENGHITUNG VOLUME TABUNG");
                    System.out.println("masukkan jari-jari");
                    int r2 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t6 = sc.nextInt();
                    double volumeTabung = 3.14*r2*t6;
                    System.out.println("volume tabung = " + volumeTabung);
                    break;

                    case "5":
                    System.out.println("MENGHITUNG LIMAS SEGITIGA");
                    System.out.println("masukkan luas alas");
                    int l4 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t7 = sc.nextInt();
                    double volumeLimasSegitiga = l4*t7;
                    System.out.println("volume limas segitiga = " + volumeLimasSegitiga);
                    break;

                    case "6" :
                    System.out.println("MENGHITUNG VOLUME LIMAS SEGIEMPAT");
                    System.out.println("masukkan luas alas");
                    int l5 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t8 = sc.nextInt();
                    double volumeLimasSegiEmpat = (l5*t8)/3;
                    System.out.println("volume limas segi empat = " + volumeLimasSegiEmpat);
                    break;

                    case "7" :
                    System.out.println("MENGHITUNG VOLUME BOLA");
                    System.out.println("masukkan jari-jari");
                    int r3 = sc.nextInt();
                    double volumeBola = (4/3*3.14*r3*r3*r3);
                    System.out.println("volume bola = " + volumeBola);
                    break;

                    case "8":
                    System.out.println("MENGHITUNG VOLUME KERUCUT");
                    System.out.println("masukkan jari-jari");
                    int r4 = sc.nextInt();
                    System.out.println("masukkan tinggi");
                    int t9 = sc.nextInt();
                    double volumeKerucut = 1/3*3.14*r4*r4*t9;
                    System.out.println("volume kerucut = " + volumeKerucut);
                    break;

                }break;
        }
        sc.close();
    } 
}
