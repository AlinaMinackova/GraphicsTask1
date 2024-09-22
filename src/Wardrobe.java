import java.awt.*;

public class Wardrobe {

    private int x;
    private int y;
    private int width;
    private int height;

    public Wardrobe(final int x, final int y, final int width, final int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    void draw(final Graphics gr) {
        Graphics2D g = (Graphics2D) gr;

        //дверь
        g.setColor(new Color(31,18,5));
        g.fillRoundRect(this.x - (int) (this.width * 0.3), this.y + (int) (this.height * 0.2),
                (int) (this.width * 0.3), (int) (this.height),
                (int) (this.width * 0.3), (int) (this.height * 0.3));

        g.setColor(new Color(92,59,10));
        g.fillOval(this.x - (int) (this.width * 0.25), this.y + (int) (this.height * 0.55),
                (int) (this.width * 0.05), (int) (this.height * 0.05));

        //замки
        g.setColor(new Color(231,169,4));
        g.fillOval(this.x + (int) (this.width * 0.95), this.y + (int) (this.height * 0.2),
                (int) (this.width * 0.1), (int) (this.height * 0.1));

        g.setColor(new Color(231,169,4));
        g.fillOval(this.x + (int) (this.width * 0.95), this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.1), (int) (this.height * 0.1));


        // сам шкаф
        g.setColor(new Color(99,58,52));
        g.fillRect(this.x, this.y, this.width, this.height);

        //112,72,46 тень сзади
        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y + (int) (this.height * 0.035),
                (int) (this.width * 0.15), (int) (this.height * 0.245));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.035),
                (int) (this.width * 0.15), (int) (this.height * 0.245));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y + (int) (this.height * 0.3),
                (int) (this.width * 0.15), (int) (this.height * 0.245));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.3),
                (int) (this.width * 0.15), (int) (this.height * 0.245));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.15), (int) (this.height * 0.255));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.15), (int) (this.height * 0.255));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y + (int) (this.height * 0.88),
                (int) (this.width * 0.15), (int) (this.height * 0.15));

        g.setColor(new Color(49,28,17));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.88),
                (int) (this.width * 0.15), (int) (this.height * 0.15));

        // отсеки
        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.25), this.y, (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.25),
                this.y, (int) (this.width * 0.025), this.height);

        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.607),
                this.y, (int) (this.width * 0.025), this.height);

        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.25),
                this.y + (int) (this.height * 0.285),  (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.25),
                this.y + (int) (this.height * 0.571),
                (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(166,94,46));
        g.fillRect(this.x + (int) (this.width * 0.25),
                this.y + (int) (this.height * 0.857),
                (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.632),
                this.y, (int) (this.width  * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.63),
                this.y, (int) (this.width * 0.025), this.height);

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.985),
                this.y, (int) (this.width * 0.025), this.height);

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.632),
                this.y + (int) (this.height * 0.285),  (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.632),
                this.y + (int) (this.height * 0.571),
                (int) (this.width * 0.357), (int) (this.height * 0.033));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 0.632),
                this.y + (int) (this.height * 0.857),
                (int) (this.width * 0.357), (int) (this.height * 0.033));

        // дверца

        g.setColor(new Color(99,58,52));
        g.fillRect(this.x + (int) (this.width  * 1.022),
                this.y, (int) (this.width * 0.285),
                (int) (this.height * 0.885));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width * 1.307),
                this.y, (int) (this.width * 0.025),
                (int) (this.height * 0.885));

        // синяя коробка

        g.setColor(new Color(62,95,138));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y - (int) (this.height * 0.105),
                (int) (this.width * 0.125), (int) (this.height * 0.105));

        g.setColor(new Color(66,133,180));
        g.fillRect(this.x + (int) (this.width * 0.398),
                this.y - (int) (this.height * 0.105),
                (int) (this.width * 0.166), (int) (this.height * 0.105));

        g.setColor(new Color(  27,85,131));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y - (int) ((this.height * 0.113)),
                (int) (this.width * 0.291), (int) (this.height * 0.008));

        g.setColor(new Color(62,95,138));
        g.fillRect(this.x + (int) (this.width * 0.266),
                this.y - (int) ((this.height * 0.154)),
                (int) (this.width * 0.147),
                (int) (this.height * 0.04));

        g.setColor(new Color(66,133,180));
        g.fillRect(this.x + (int) (this.width * 0.403),
                this.y - (int) (this.height * 0.154),
                (int) (this.width * 0.17),
                (int) (this.height * 0.04));

        g.setColor(new Color(41,49,51));
        g.fillRoundRect(this.x + (int) (this.width * 0.45),
                this.y - (int) (this.height * 0.088), (int) (this.width * 0.066),
                (int) (this.height * 0.033), (int) (this.width * 0.01), (int) (this.height * 0.1));

        // одежда
        //     168,228,160    68,148,74
        g.setColor(new Color( 40,114,51));
        g.fillRect(this.x + (int) (this.width * 0.8),
                this.y + (int) (this.height * 0.185), (int) (this.width * 0.15),
                (int) (this.height * 0.1));

        g.setColor(new Color(117, 173, 81));
        g.fillRoundRect(this.x + (int) (this.width * 0.855),
                this.y + (int) (this.height * 0.185), (int) (this.width * 0.13),
                (int) (this.height * 0.1), (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color( 40,114,51));
        g.fillRect(this.x + (int) (this.width * 0.9),
                this.y + (int) (this.height * 0.235), (int) (this.width * 0.085),
                (int) (this.height * 0.01));

        g.setColor(new Color(179,68,108));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.186), (int) (this.width * 0.15),
                (int) (this.height * 0.1));

        g.setColor(new Color(231,84,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.68),
                this.y + (int) (this.height * 0.186), (int) (this.width * 0.15),
                (int) (this.height * 0.1), (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color(179,68,108));
        g.fillRect(this.x + (int) (this.width * 0.68),
                this.y + (int) (this.height * 0.236), (int) (this.width * 0.12),
                (int) (this.height * 0.01));
//255,207,72   214,174,1
        g.setColor(new Color(214,174,1));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y +  (int) (this.height * 0.085), (int) (this.width * 0.15),
                (int) (this.height * 0.1));

        g.setColor(new Color(255,207,72));
        g.fillRoundRect(this.x + (int) (this.width * 0.68),
                this.y + (int) (this.height * 0.085), (int) (this.width * 0.15),
                (int) (this.height * 0.1), (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color(214,174,1));
        g.fillRect(this.x + (int) (this.width * 0.72),
                this.y + (int) (this.height * 0.13), (int) (this.width * 0.11),
                (int) (this.height * 0.01));

        //вещи на полках дверцы  154,205,50
        g.setColor(new Color( 154,205,50));
        g.fillRoundRect(this.x + (int) (this.width  * 1.115),
                this.y +  (int) (this.height * 0.065), (int) (this.width * 0.03),
                (int) (this.height * 0.1), (int) (this.width * 0.045), (int) (this.height * 0.05));

        g.setColor(new Color( 0,128,0));
        g.fillRoundRect(this.x + (int) (this.width  * 1.1),
                this.y +  (int) (this.height * 0.08), (int) (this.width * 0.06),
                (int) (this.height * 0.1), (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color( 154,205,50));
        g.fillRoundRect(this.x + (int) (this.width  * 1.11),
                this.y +  (int) (this.height * 0.085), (int) (this.width * 0.05),
                (int) (this.height * 0.1), (int) (this.width * 0.045), (int) (this.height * 0.05));

        g.setColor(new Color(  227,38,54));
        g.fillRoundRect(this.x + (int) (this.width  * 1.175),
                this.y +  (int) (this.height * 0.08), (int) (this.width * 0.05),
                (int) (this.height * 0.04), (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(  66,133,180));
        g.fillRoundRect(this.x + (int) (this.width  * 1.15),
                this.y +  (int) (this.height * 0.1), (int) (this.width * 0.1),
                (int) (this.height * 0.0885), (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color(15,18,82));
        g.fillRoundRect(this.x + (int) (this.width  * 1.17),
                this.y +  (int) (this.height * 0.12), (int) (this.width * 0.06),
                (int) (this.height * 0.02), (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(3, 89, 3));
        g.fillRoundRect(this.x + (int) (this.width  * 1.1),
                this.y +  (int) (this.height * 0.32), (int) (this.width * 0.04),
                (int) (this.height * 0.1), (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(4, 134, 4));
        g.fillRoundRect(this.x + (int) (this.width  * 1.115),
                this.y +  (int) (this.height * 0.32), (int) (this.width * 0.04),
                (int) (this.height * 0.1), (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(100, 4, 22));
        g.fillRoundRect(this.x + (int) (this.width  * 1.13),
                this.y +  (int) (this.height * 0.35), (int) (this.width * 0.04),
                (int) (this.height * 0.1), (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(168, 8, 8));
        g.fillRoundRect(this.x + (int) (this.width  * 1.142),
                this.y +  (int) (this.height * 0.35), (int) (this.width * 0.04),
                (int) (this.height * 0.1), (int) (this.width * 0.01), (int) (this.height * 0.01));


        //полки на дверце  65,40,37
        g.setColor(new Color( 65,40,37));
        g.fillRoundRect(this.x + (int) (this.width  * 1.065),
                this.y +  (int) (this.height * 0.17), (int) (this.width * 0.18),
                (int) (this.height * 0.0885), (int)(this.width * 0.02),
                (int)(this.height * 0.02));

        g.setColor(new Color( 166,94,46));
        g.fillRect(this.x + (int) (this.width  * 1.08),
                this.y +  (int) (this.height * 0.15), (int) (this.width * 0.15),
                (int) (this.height * 0.0885));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width  * 1.2),
                this.y + (int) (this.height * 0.15), (int) (this.width * 0.05),
                (int) (this.height * 0.0885));

        g.setColor(new Color( 65,40,37));
        g.fillRoundRect(this.x + (int) (this.width  * 1.065),
                this.y +  (int) (this.height * 0.42), (int) (this.width * 0.18),
                (int) (this.height * 0.0885), (int)(this.width * 0.02),
                (int)(this.height * 0.02));

        g.setColor(new Color( 166,94,46));
        g.fillRect(this.x + (int) (this.width  * 1.08),
                this.y +  (int) (this.height * 0.4), (int) (this.width * 0.15),
                (int) (this.height * 0.0885));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width  * 1.2),
                this.y + (int) (this.height * 0.4), (int) (this.width * 0.05),
                (int) (this.height * 0.0885));

        g.setColor(new Color( 65,40,37));
        g.fillRoundRect(this.x + (int) (this.width  * 1.065),
                this.y +  (int) (this.height * 0.67), (int) (this.width * 0.18),
                (int) (this.height * 0.1), (int)(this.width * 0.02),
                (int)(this.height * 0.02));

        g.setColor(new Color( 166,94,46));
        g.fillRect(this.x + (int) (this.width  * 1.08),
                this.y +  (int) (this.height * 0.65), (int) (this.width * 0.15),
                (int) (this.height * 0.1));

        g.setColor(new Color(184,115,51));
        g.fillRect(this.x + (int) (this.width  * 1.2),
                this.y + (int) (this.height * 0.65), (int) (this.width * 0.05),
                (int) (this.height * 0.1));
        //банки
        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.328),
                this.y + (int) (this.height * 0.63),
                (int) (this.width * 0.05), (int) (this.height * 0.05),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(128,128,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.3),
                this.y + (int) (this.height * 0.655),
                (int) (this.width * 0.1), (int) (this.height * 0.2),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(162,42,109));
        g.fillRoundRect(this.x + (int) (this.width * 0.31),
                this.y + (int) (this.height * 0.66),
                (int) (this.width * 0.08), (int) (this.height * 0.19),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.37),
                this.y + (int) (this.height * 0.69),
                (int) (this.width * 0.009), (int) (this.height * 0.14),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.436),
                this.y + (int) (this.height * 0.75),
                (int) (this.width * 0.05), (int) (this.height * 0.05),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(128,128,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.41),
                this.y + (int) (this.height * 0.775),
                (int) (this.width * 0.1), (int) (this.height * 0.08),
                (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color(242,211,38));
        g.fillRoundRect(this.x + (int) (this.width * 0.42),
                this.y + (int) (this.height * 0.78),
                (int) (this.width * 0.085), (int) (this.height * 0.074),
                (int) (this.width * 0.05), (int) (this.height * 0.05));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.485),
                this.y + (int) (this.height * 0.795),
                (int) (this.width * 0.009), (int) (this.height * 0.045),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.688),
                this.y + (int) (this.height * 0.63),
                (int) (this.width * 0.05), (int) (this.height * 0.05),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(128,128,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.66),
                this.y + (int) (this.height * 0.655),
                (int) (this.width * 0.1), (int) (this.height * 0.2),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(237,147,33));
        g.fillRoundRect(this.x + (int) (this.width * 0.67),
                this.y + (int) (this.height * 0.66),
                (int) (this.width * 0.08), (int) (this.height * 0.19),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.73),
                this.y + (int) (this.height * 0.69),
                (int) (this.width * 0.009), (int) (this.height * 0.14),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.788),
                this.y + (int) (this.height * 0.63),
                (int) (this.width * 0.05), (int) (this.height * 0.05),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(128,128,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.76),
                this.y + (int) (this.height * 0.655),
                (int) (this.width * 0.1), (int) (this.height * 0.2),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(94,25,118));
        g.fillRoundRect(this.x + (int) (this.width * 0.77),
                this.y + (int) (this.height * 0.66),
                (int) (this.width * 0.08), (int) (this.height * 0.19),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.83),
                this.y + (int) (this.height * 0.69),
                (int) (this.width * 0.009), (int) (this.height * 0.14),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.888),
                this.y + (int) (this.height * 0.63),
                (int) (this.width * 0.05), (int) (this.height * 0.05),
                (int) (this.width * 0.01), (int) (this.height * 0.01));

        g.setColor(new Color(128,128,128));
        g.fillRoundRect(this.x + (int) (this.width * 0.86),
                this.y + (int) (this.height * 0.655),
                (int) (this.width * 0.1), (int) (this.height * 0.2),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(99,58,52));
        g.fillRoundRect(this.x + (int) (this.width * 0.87),
                this.y + (int) (this.height * 0.66),
                (int) (this.width * 0.08), (int) (this.height * 0.19),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        g.setColor(new Color(208,208,208));
        g.fillRoundRect(this.x + (int) (this.width * 0.93),
                this.y + (int) (this.height * 0.69),
                (int) (this.width * 0.009), (int) (this.height * 0.14),
                (int) (this.width * 0.07), (int) (this.height * 0.07));

        // коричневые коробки
        g.setColor(new Color(138,102,66));
        g.fillRect(this.x - (int) (this.width * 0.1),
                this.y + (int) (this.height * 0.75),
                (int) (this.width * 0.2), (int) (this.height * 0.25));

        g.setColor(new Color(178, 139, 73));
        g.fillRect(this.x + (int) (this.width * 0.01),
                this.y + (int) (this.height * 0.75),
                (int) (this.width * 0.2), (int) (this.height * 0.25));

        g.setColor(new Color(208,208,208));
        g.fillRect(this.x + (int) (this.width * 0.065),
                this.y + (int) (this.height * 0.81),
                (int) (this.width * 0.12), (int) (this.height * 0.03));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.086),
                this.y + (int) (this.height * 0.82),
                (int) (this.width * 0.08), (int) (this.height * 0.013));

        g.setColor(new Color(168, 121, 70));
        g.fillRect(this.x - (int) (this.width * 0.08),
                this.y + (int) (this.height * 0.55),
                (int) (this.width * 0.2), (int) (this.height * 0.2));

        g.setColor(new Color(213, 168, 118));
        g.fillRect(this.x - (int) (this.width * 0.005),
                this.y + (int) (this.height * 0.55),
                (int) (this.width * 0.15), (int) (this.height * 0.2));

        g.setColor(new Color(208,208,208));
        g.fillRect(this.x + (int) (this.width * 0.05),
                this.y + (int) (this.height * 0.6),
                (int) (this.width * 0.06), (int) (this.height * 0.03));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.06),
                this.y + (int) (this.height * 0.61),
                (int) (this.width * 0.04), (int) (this.height * 0.013));

        //тень
        g.setColor(new Color(82,82,82));
        g.fillRect(0, this.y + (int) (this.height),
                (int) (this.width * 2), (int) (this.height * 0.2));

        g.setColor(new Color(59,59,59));
        g.fillRect(0, this.y + (int) (this.height),
                (int) (this.width * 2), (int) (this.height * 0.02));

        //коробки для хранения
        g.setColor(new Color(107,129,86));
        g.fillRect(this.x + (int) (this.width * 0.275),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.145), (int) (this.height * 0.135));

        g.setColor(new Color(145,193,92));
        g.fillRect(this.x + (int) (this.width * 0.3),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.13), (int) (this.height * 0.135));

        g.setColor(new Color(245,246,244));
        g.fillRect(this.x + (int) (this.width * 0.35),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.05), (int) (this.height * 0.02));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.36),
                this.y + (int) (this.height * 0.505),
                (int) (this.width * 0.03), (int) (this.height * 0.01));

        g.setColor(new Color(24,55,6));
        g.fillRoundRect(this.x + (int) (this.width * 0.345),
                this.y + (int) (this.height * 0.472),
                (int) (this.width * 0.059), (int) (this.height * 0.02), (int)(this.width * 0.008),
                (int)(this.height * 0.008));

        g.setColor(new Color(107,129,86));
        g.fillRect(this.x + (int) (this.width * 0.43),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.145), (int) (this.height * 0.135));

        g.setColor(new Color(145,193,92));
        g.fillRect(this.x + (int) (this.width * 0.455),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.13), (int) (this.height * 0.135));

        g.setColor(new Color(245,246,244));
        g.fillRect(this.x + (int) (this.width * 0.505),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.05), (int) (this.height * 0.02));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.515),
                this.y + (int) (this.height * 0.505),
                (int) (this.width * 0.03), (int) (this.height * 0.01));

        g.setColor(new Color(24,55,6));
        g.fillRoundRect(this.x + (int) (this.width * 0.498),
                this.y + (int) (this.height * 0.472),
                (int) (this.width * 0.059), (int) (this.height * 0.02), (int)(this.width * 0.008),
                (int)(this.height * 0.008));

        g.setColor(new Color(158,102,46));
        g.fillRect(this.x + (int) (this.width * 0.655),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.145), (int) (this.height * 0.135));

        g.setColor(new Color(210,166,75));
        g.fillRect(this.x + (int) (this.width * 0.68),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.13), (int) (this.height * 0.135));

        g.setColor(new Color(245,246,244));
        g.fillRect(this.x + (int) (this.width * 0.73),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.05), (int) (this.height * 0.02));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.74),
                this.y + (int) (this.height * 0.505),
                (int) (this.width * 0.03), (int) (this.height * 0.01));

        g.setColor(new Color(75,45,17));
        g.fillRoundRect(this.x + (int) (this.width * 0.725),
                this.y + (int) (this.height * 0.472),
                (int) (this.width * 0.059), (int) (this.height * 0.02), (int)(this.width * 0.008),
                (int)(this.height * 0.008));

        g.setColor(new Color(158,102,46));
        g.fillRect(this.x + (int) (this.width * 0.81),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.145), (int) (this.height * 0.135));

        g.setColor(new Color(210,166,75));
        g.fillRect(this.x + (int) (this.width * 0.835),
                this.y + (int) (this.height * 0.435),
                (int) (this.width * 0.13), (int) (this.height * 0.135));

        g.setColor(new Color(245,246,244));
        g.fillRect(this.x + (int) (this.width * 0.885),
                this.y + (int) (this.height * 0.5),
                (int) (this.width * 0.05), (int) (this.height * 0.02));

        g.setColor(new Color(41,49,51));
        g.fillRect(this.x + (int) (this.width * 0.895),
                this.y + (int) (this.height * 0.505),
                (int) (this.width * 0.03), (int) (this.height * 0.01));

        g.setColor(new Color(75,45,17));
        g.fillRoundRect(this.x + (int) (this.width * 0.88),
                this.y + (int) (this.height * 0.472),
                (int) (this.width * 0.059), (int) (this.height * 0.02), (int)(this.width * 0.008),
                (int)(this.height * 0.008));
    }
}
