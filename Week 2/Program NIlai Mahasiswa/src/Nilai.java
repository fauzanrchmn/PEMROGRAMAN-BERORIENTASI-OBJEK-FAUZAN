import java.util.Scanner;

public class Nilai {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Nilai Matakuliah Pemrogaman Berorientasi Objek !!!");
        System.out.print("Nama : ");
        String nama = scanner.nextLine();
        System.out.print("NIM  : ");
        String nim = scanner.nextLine();
        System.out.print("Nilai Tubes : ");
        Integer nilaiTubes = scanner.nextInt();
        System.out.print("Nilai Quiz  : ");
        Integer nilaiQuiz = scanner.nextInt();
        System.out.print("Nilai Tugas : ");
        Integer nilaiTugas = scanner.nextInt();
        System.out.print("Nilai UTS   : ");
        Integer nilaiUts = scanner.nextInt();
        System.out.print("Nilai UAS   : ");
        Integer nilaiUas = scanner.nextInt();

        double Nilai = (0.30 * nilaiTubes)+(0.10 * nilaiQuiz)+(0.10 * nilaiTugas)+(0.25 * nilaiUts)+(0.25 * nilaiUas);

        System.out.println();
        System.out.println("Nama : "+ nama);
        System.out.println("NIM  : "+ nim);
        System.out.printf("Nilai Matakuliah Pemrogaman Berorientasi Objek : "+ Nilai);
        scanner.close();
        }
}
