import java.util.Scanner;

public class ArrayRataNilai24modif1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int[] nilaiMhs = new int[10];
        int jumlahLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70)
            jumlahLulus++;
        }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa yang lulus = " + jumlahLulus);
    }
}