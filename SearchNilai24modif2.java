import java.util.Scanner;

public class SearchNilai24modif2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan banyak nilai yang akan diinput: "); 
        int nilai = sc.nextInt();
        int[] arrNilai = new int[nilai];

        for (int i = 0; i < arrNilai.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1)+ " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        int hasil = 0;
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                break;
            }
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");;
        }
        System.out.println();
    }
}