import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

public class DrawPanel extends JPanel implements ActionListener, MouseListener {

    private final int PANEL_WIDTH;
    private final int PANEL_HEIGHT;
    private final int TIMER_DELAY;
    private Timer timer;

    private final Wardrobe wardrobe;
    private List<Spider> spidersList;

    private Mouse mouse;

    public DrawPanel(final int width, final int height, final int timerDelay) {
        this.PANEL_WIDTH = width;
        this.PANEL_HEIGHT = height;
        this.TIMER_DELAY = timerDelay;
        super.addMouseListener(this);
        timer = new Timer(timerDelay, this);
        timer.start();
        spidersList = new ArrayList<>();

        this.wardrobe = new Wardrobe(200, 100, 500, 400);

        spidersList.add(new Spider(50, 0, 20, 20, new Color(0, 0, 0), 2.5));
        spidersList.add(new Spider(300, 0, 30, 30, new Color(0, 0, 0), 2));
        spidersList.add(new Spider(500, 0, 15, 15, new Color(0, 0, 0), 2.6));
        spidersList.add(new Spider(800, 0, 30, 30, new Color(0, 0, 0), 2.8));
        spidersList.add(new Spider(600, 0, 20, 20, new Color(0, 0, 0), 1.5));

        this.mouse = new Mouse(900, 520, 25, 20, 20);
    }

    @Override
    public void paint(final Graphics gr) {
        super.paint(gr);
        wardrobe.draw(gr);
        mouse.move();
        mouse.draw(gr);
        for (Spider spider : spidersList) {
            spider.move();
            spider.draw(gr);
        }
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == timer) {
            repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (Spider spider : spidersList) {
            if (spider.getCoordinate()[0] <= e.getX() && e.getX() <= spider.getCoordinate()[2]
                    && spider.getCoordinate()[1] <= e.getY() && e.getY() <= spider.getCoordinate()[3]){
                spider.setCondition(Boolean.TRUE);
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }


}