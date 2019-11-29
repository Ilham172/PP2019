import java.util.Scanner;
class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int banyakNilai = input.nextInt();
        boolean sama = false;
        
        int arr[] = new int[banyakNilai];

        for (int i = 0; i < banyakNilai; i++) {
            arr[i] = input.nextInt();
        }
        
        boolean nilaiSama = false;
        int j;
        int batas = banyakNilai-1;
        for (int i = 0; i < banyakNilai; i++) {
            j=1;
            j+=i;
            for (int b = 0; b < batas; b++) {
                if (arr[i]==arr[j] || arr[j]==arr[i]) {
                    nilaiSama = true;
                    sama = true;
                    System.out.println("Terdapat Angka Yang Sama Yaitu " + arr[i] + " yang Terletak di Indeks " + i + "," + j);
                    break;
                } else if (arr[i] != arr[j]) {
                    sama = false;
                } j++;
            } batas--;     
        }

        if (!nilaiSama) {
            System.out.println("Tidak ada yang sama");
        }
    }
}