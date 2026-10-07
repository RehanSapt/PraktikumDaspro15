import java.util.Scanner;

public class StudiKasus2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, jenisKegiatan;
        int jumDokumen, juara, statusPendanaaan;

        System.out.print("Masukkan nama anda: ");
        nama = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan (BELMAWA, BAKORMA, Mandiri, PKM, atau Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.print("Masukkan Juara anda: ");
            juara = sc.nextInt();

            if (juara >=1 && juara <=3) {
                System.out.print("Masukkan jumlah dokumen yang anda upload: ");
                jumDokumen = sc.nextInt();

                int dokKurang = 4 - jumDokumen;

                if (jumDokumen == 4) {
                    System.out.println("\nSelamat " + nama + ", anda berhak mendapatkan Dana penghargaan.");
                } else {
                    System.out.println("\nMaaf " + nama + ", anda tidak berhak mendapatkan Dana penghargaan karena jumlah dokumen yang diupload kurang sebanyak " + dokKurang + " dokumen.");
                }

            } else {
                System.out.println("\nMaaf " + nama + ", anda tidak berhak mendapatkan Dana penghargaan karena juara anda tidak memenuhi syarat.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.print("Masukkan status pendanaan anda (1 untuk didanai, 0 untuk tidak didanai): ");
            statusPendanaaan = sc.nextInt();

            if (statusPendanaaan == 1) {
                System.out.print("Masukkan jumlah dokumen yang anda upload: ");
                jumDokumen = sc.nextInt();

                int dokKurang = 4 - jumDokumen;

                if (jumDokumen == 4) {
                    System.out.println("\nSelamat " + nama + ", anda berhak mendapatkan Dana penghargaan.");
                } else {
                    System.out.println("\nMaaf " + nama + ", anda tidak berhak mendapatkan Dana penghargaan karena jumlah dokumen yang diupload kurang sebanyak " + dokKurang + " dokumen.");
                }

            } else {
                System.out.println("\nMaaf " + nama + ", anda tidak berhak mendapatkan Dana penghargaan karena status pendanaan anda tidak memenuhi syarat.");
            }
        } else {
            System.out.println("\nMaaf " + nama + ", anda tidak berhak mendapatkan Dana penghargaan.");
        }
    }
}
