public class Nine {

    // Buat sebuah function bernama area, yang memiliki parameter jari-jari lingkaran
    // Function ini perlu return sebuah double hasil perhitungan luas lingkaran berdasarkan jari-jarinya
    // Tulis kode-mu di sini

    public static void main(String[] args) {
        int r = 20;
        
        double luasLingkaran = area(r);

        System.err.println("Luas lingkaran dengan jari-jari " + r + " adalah: " + luasLingkaran);
        // Expected Output:
        // Luas lingkaran dengan jari-jari 20 adalah: 1256.0
    }
}
