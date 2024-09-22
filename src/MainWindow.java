import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final DrawPanel panel;

    public MainWindow() throws HeadlessException {
        panel = new DrawPanel(this.getWidth(), this.getHeight(), 100);
        panel.setBackground(new Color(38,38,38));
        this.add(panel);
    }
}
