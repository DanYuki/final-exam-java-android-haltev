public class Eight {

    // Diberikan sebuah class bernama Siswa yang memiliki dua props private
    // Buatlah getter dan setter untuk kedua props tersebut!
    public static class Siswa {
        private String nama;
        private int umur;

        // Tulis kodemu di sini
    }

    public static void main(String[] args) {
        // Jangan ubah bagian ini
        Siswa siswa;

        siswa.setNama("Yuki");
        siswa.setUmur("17");

        System.err.println("Nama siswa: " + siswa.getNama());
        System.err.println("Umur siswa: " + siswa.getUmur());

        // Expected output:
        // Nama siswa: Yuki
        // Umur siswa: 17
    }
}
