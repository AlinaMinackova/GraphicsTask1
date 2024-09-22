import java.awt.*;
import java.awt.geom.Line2D;

public class Mouse {

    private int x;
    private int y;
    private int width;
    private int height;
    private double speedy;
    private Boolean condition;

    public Mouse(final int x, final int y, final int width, final int height, double speedy) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
        if (this.getCoordinate()[0] <= 0){
            this.setCondition(Boolean.TRUE);
        }
        if (this.getCoordinate()[0] >= 950){
            this.setCondition(Boolean.FALSE);
        }
        if (getCondition()){
            this.x += getSpeedy();
        } else { this.x -= getSpeedy();}
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
    //отрисовка состояния
    public void checkDrawCondition(Graphics2D g, int[] coordinates){
        g.setColor(new Color(54,54,54));
        g.fillOval(this.x + coordinates[0], this.y - (int) (this.height * 0.35),
                (int) (this.width * 0.6), (int) (this.height * 0.6));

        g.setColor(new Color(255, 255, 255));
        g.fillOval(this.x + coordinates[1], this.y + (int) (this.height * 0.02),
                (int) (this.width * 0.25), (int) (this.height * 0.3));

        g.setColor(new Color(0, 0, 0));
        g.fillOval(this.x + coordinates[2], this.y + (int) (this.height * 0.05),
                (int) (this.width * 0.15), (int) (this.height * 0.2));

        g.setColor(new Color(233, 150, 195));
        g.fillOval(this.x + coordinates[3], this.y + (int) (this.height * 0.25),
                (int) (this.width * 0.2), (int) (this.height * 0.3));

        g.setColor(new Color(233, 150, 195));
        g.setStroke(new BasicStroke((int) (this.width * 0.1)));
        g.draw(new Line2D.Float(this.x + coordinates[4],
                this.y + (int) (this.height * 0.5),
                this.x + coordinates[5],
                this.y + (int) (this.height * 0.5)));
    }

    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        g.setColor(new Color(54,54,54));
        g.fillOval(this.x, this.y, this.width, this.height);

        int[] coordinates;

        if (!getCondition()) {

            coordinates = new int[]{(int) (this.width * 0.2), (int) (this.width * 0.1), (int) (this.width * 0.15),
                    - (int) (this.width * 0.1), (int) (this.width * 0.52) * 2, (int) (this.width * 0.5) * 3};

        }
        else {
            coordinates = new int[]{(int) (this.width * 0.3), (int) (this.width * 0.7), (int) (this.width * 0.75),
                    (int) (this.width * 0.9), 0, - (int) (this.width * 0.5)};

        }
        checkDrawCondition(g, coordinates);

    }
}
