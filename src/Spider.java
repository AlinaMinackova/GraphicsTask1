import java.awt.*;
import java.awt.geom.Line2D;

public class Spider {

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;
    private double speedy;
    private Boolean condition;

    public Spider(final int x, final int y, final int width, final int height, final Color color, double speedy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.condition = Boolean.FALSE;
        this.speedy = speedy;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {
        if (this.getCoordinate()[1] <= 0){
            this.setCondition(Boolean.FALSE);
        }
        if (getCondition()){
            this.y -= getSpeedy();
        } else { this.y += getSpeedy();}
    }

    public double getSpeedy() {
        return speedy;
    }

    public Boolean getCondition() {
        return condition;
    }

    public void setCondition(Boolean condition) {
        this.condition = condition;
    }

    public int[] getCoordinate() {
        return new int[]{this.x, this.y, this.x + this.width, this.y + this.height};
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        // паутина
        g.setColor(new Color(255, 255, 255));
        g.setStroke(new BasicStroke((int) (this.width * 0.05)));
        g.draw(new Line2D.Float(this.x + (int) (this.width * 0.5), 0,
                this.x + (int) (this.width * 0.5), this.y + (int) (this.height * 0.5)));

        //тело
        g.setColor(this.color);
        g.fillOval(this.x, this.y, this.width, this.height);

        //лапы
        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x - (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5),
                this.x + (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5)));

        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x - (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.1),
                this.x + (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5)));


        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x - (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.9),
                this.x + (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5)));

        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x + (int) (this.width),
                this.y + (int) (this.height * 0.5),
                this.x + (int) (this.width * 1.5),
                this.y + (int) (this.height * 0.5)));

        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x + (int) (this.width * 1.5),
                this.y + (int) (this.height * 0.1),
                this.x + (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5)));


        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x + (int) (this.width * 1.5),
                this.y + (int) (this.height * 0.9),
                this.x + (int) (this.width * 0.5),
                this.y + (int) (this.height * 0.5)));

        //глаза
        g.setColor(new Color(255, 255, 255));
        g.fillOval(this.x + (int) (this.width * 0.42),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.48),
                (int) (this.height * 0.48));

        g.fillOval(this.x + (int) (this.width * 0.17),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.48),
                (int) (this.height * 0.48));

        g.setColor(new Color(0, 0, 0));
        g.fillOval(this.x + (int) (this.width * 0.548),
                this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.2),
                (int) (this.height * 0.2));

        g.fillOval(this.x + (int) (this.width * 0.358),
                this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.2),
                (int) (this.height * 0.2));
    }
}
