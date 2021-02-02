package Objects.Plants;

import Menus.Game;
import Miscs.Sounds;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Container;

public class wallNut extends Plant {

    public wallNut(Container c, int[] slut) {
        super(c, 150, 0, slut[0], slut[1], 50);
        ready = new ImageIcon("gfx/nut_1.pvz");
        die = new ImageIcon("gfx/nut_3.pvz");
        setIcon(ready);
    }
    @Override
    public void lossHealth(int Amount) {
        health -= Amount;
        Sounds.play(Sounds.EAT_PLANTS);
        if (health <= 70 && health > 0)
        {
            ready = new ImageIcon("gfx/nut_2.pvz");
            c.repaint();
        }
        if(health <= 0) {
            this.setIcon(die);
            Game.removePlant(this);
            Timer t = new Timer(1000, e -> {
                this.setIcon(null);
                c.remove(this);
            });
            c.remove(this);
            t.setRepeats(false);
            t.start();
        }
    }
}

