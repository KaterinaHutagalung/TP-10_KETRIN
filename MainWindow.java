import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    public MainWindow(List<Character> characters) {
        setTitle("Character Manager - TP8");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("DAFTAR KARAKTER", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 18));
        add(title, BorderLayout.NORTH);

        // Membuat daftar teks untuk menampilkan karakter
        StringBuilder sb = new StringBuilder("<html><body style='text-align: center;'>");
        double total = 0;
        for (Character c : characters) {
            sb.append("<b>").append(c.getName()).append("</b> - ")
              .append(c.getType()).append(" (Level: ").append(c.getLevel()).append(")<br>");
            total += c.getLevel();
        }
        sb.append("</body></html>");

        JLabel contentLabel = new JLabel(sb.toString(), SwingConstants.CENTER);
        add(contentLabel, BorderLayout.CENTER);

        // Menghitung rata-rata level
        double average = characters.isEmpty() ? 0 : total / characters.size();

        JLabel averageLabel = new JLabel(
            String.format("Rata-rata Level: %.2f", average),
            SwingConstants.CENTER
        );
        averageLabel.setBorder(BorderFactory.createEmptyBorder(10, 5, 10, 5));
        add(averageLabel, BorderLayout.SOUTH);
    }
}