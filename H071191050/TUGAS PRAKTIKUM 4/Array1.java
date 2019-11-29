import java.util.Scanner;
class Array1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah = 0, jumlah2 =0; 

        System.out.print("banyaknya angka m = ");
        int m = sc.nextInt();
        System.out.print("masukkan angka m sesuai banyaknya = ");
        int[]arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
            jumlah+=arr[i];
        }

        System.out.print("\nbanyaknya angka n = ");
        int n = sc.nextInt();
        System.out.print("masukkan angka n sesuai banyaknya = ");
        int[]arr2=new int[n];
        for (int j = 0; j < n; j++) {
            arr2[j] = sc.nextInt();
            
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i]==arr2[j]) {
                    jumlah2+=arr[i];
                }
            }
        }
        System.out.println("\njumlah = "+(jumlah =+jumlah2));
    }
   
}