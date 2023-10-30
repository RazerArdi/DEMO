import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Contoh penggunaan Java Swing untuk membuat grafik diagram lingkaran (pie chart).
 * @author bayuardiyansyah
 * @version 1.0
 */
public class PieChart {
    public static void main(String[] args) {
        // Jumlah total industri dan masing-masing jenis industri
        int industriPrimer = 300;
        int industriSekunder = 400;
        int industriTersier = 300;
        int totalIndustri = industriPrimer + industriSekunder + industriTersier;

        JFrame frame = new JFrame("Pie Chart (OI)");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);

        PieChartP pieChartP = new PieChartP(totalIndustri, industriPrimer, industriSekunder, industriTersier);
        frame.add(pieChartP);

        frame.setVisible(true);
    }

    /**
     * Kelas inner yang menggambar grafik diagram lingkaran (pie chart).
     */
    static class PieChartP extends JPanel {
        private int totalIndustri;
        private int industriPrimer;
        private int industriSekunder;
        private int industriTersier;

        /**
         * Konstruktor untuk kelas PieChartP.
         *
         * @param totalIndustri    Jumlah total industri
         * @param industriPrimer   Jumlah industri primer
         * @param industriSekunder Jumlah industri sekunder
         * @param industriTersier  Jumlah industri tersier
         */
        public PieChartP(int totalIndustri, int industriPrimer, int industriSekunder, int industriTersier) {
            this.totalIndustri = totalIndustri;
            this.industriPrimer = industriPrimer;
            this.industriSekunder = industriSekunder;
            this.industriTersier = industriTersier;
        }

        /**
         * Metode untuk menggambar diagram lingkaran.
         *
         * @param g Objek Graphics yang digunakan untuk menggambar.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Mengambil lebar dan tinggi panel
            int width = getWidth();
            int height = getHeight();
            int radius = Math.min(width, height) / 2;

            // Menghitung sudut masing-masing sektor
            double anglePrimer = 360.0 * industriPrimer / totalIndustri;
            double angleSekunder = 360.0 * industriSekunder / totalIndustri;
            double angleTersier = 360.0 * industriTersier / totalIndustri;

            // Menggambar sektor industri primer
            drawSector(g, Color.RED, 0, (int) anglePrimer);

            // Menggambar sektor industri sekunder
            drawSector(g, Color.GREEN, (int) anglePrimer, (int) angleSekunder);

            // Menggambar sektor industri tersier
            drawSector(g, Color.BLUE, (int) (anglePrimer + angleSekunder), (int) angleTersier);

            // Menambahkan persentase di atas masing-masing sektor
            drawPercentage(g);

            // Menambahkan judul
            drawTitle(g);

            // Menambahkan keterangan penulis
            drawAuthorInfo(g);
        }

        /**
         * Metode untuk menggambar sektor dengan warna tertentu.
         *
         * @param g          Objek Graphics yang digunakan untuk menggambar.
         * @param color      Warna sektor.
         * @param startAngle Sudut awal sektor.
         * @param angle      Besar sudut sektor.
         */
        private void drawSector(Graphics g, Color color, int startAngle, int angle) {
            g.setColor(color);
            g.fillArc(50, 50, 300, 300, startAngle, angle);
        }

        /**
         * Metode untuk menambahkan persentase di atas masing-masing sektor.
         *
         * @param g Objek Graphics yang digunakan untuk menggambar.
         */
        private void drawPercentage(Graphics g) {
            g.setFont(new Font("Arial", Font.BOLD, 12));
            drawText(g, Color.RED, "Industri Primer", industriPrimer, 200);
            drawText(g, Color.GREEN, "Industri Sekunder", industriSekunder, 230);
            drawText(g, Color.BLUE, "Industri Tersier", industriTersier, 260);
        }

        /**
         * Metode untuk menggambar teks dengan warna dan posisi tertentu.
         *
         * @param g     Objek Graphics yang digunakan untuk menggambar.
         * @param color Warna teks.
         * @param label Label teks.
         * @param value Nilai untuk teks.
         * @param y     Koordinat Y teks.
         */
        private void drawText(Graphics g, Color color, String label, int value, int y) {
            g.setColor(color);
            int percentage = (int) ((double) value / totalIndustri * 100);
            g.drawString(label + " (" + value + "): " + percentage + "%", 370, y);
        }

        /**
         * Metode untuk menambahkan judul diagram lingkaran.
         *
         * @param g Objek Graphics yang digunakan untuk menggambar.
         */
        private void drawTitle(Graphics g) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.drawString("Persentase Jumlah Industri", 90, 30);
        }

        /**
         * Metode untuk menambahkan informasi penulis.
         *
         * @param g Objek Graphics yang digunakan untuk menggambar.
         */
        private void drawAuthorInfo(Graphics g) {
            g.setFont(new Font("Arial", Font.ITALIC, 12));
            g.drawString("Catatan: Hitung Persentasi Industri memakai Pie Chart", 50, 400);
        }
    }
}
