package Objects.Zombies;

import Menus.Game;
import Miscs.Icons;
import Miscs.Sounds;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.Container;


public class Normal extends Zombie {

    public Normal(Container c, int row) {
        super(c, 200, 2, 5, row);
        walk = Icons.normalZombie;
        die = new ImageIcon("gfx/normDead.pvz");
        setIcon(walk);
    }

    @Override
    public void lossHealth(int Amount, boolean isFrozen) {
        health -= Amount;
        if (isFrozen && !frozen) {
            speed /= 2;
            frozen = true;
            Sounds.play(Sounds.FREEZE);
        }
        if (health > 0) {
            Sounds.play(hitSound);
        }
        else {
            kill(false);
        }
    }
}
