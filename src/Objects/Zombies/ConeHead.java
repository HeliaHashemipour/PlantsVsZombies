package Objects.Zombies;

import Miscs.Icons;
import Miscs.Sounds;

import javax.swing.ImageIcon;
import java.awt.Container;

public class ConeHead extends Zombie {
    ImageIcon normWalk = new ImageIcon("gfx/normal.pvz");

    public ConeHead(Container c, int row) {
        super(c, 560, 2, 10, row);
        walk = Icons.coneHeadIcon;
        die = new ImageIcon("gfx/normDead.pvz");
        setIcon(walk);
        sizeX = 166;
        sizeY = 144;
        hitSound = Sounds.PLASTIC;
    }

    @Override
    public void lossHealth(int Amount, boolean isFrozen) {
        health -= Amount;
        if (health > 200) {
            Sounds.play(hitSound);
        }
        else {
            if (health <= 0) {
                kill(false);
            } else {
                this.setIcon(normWalk);
                this.sizeX = 81;
                this.sizeY = 131;
                Sounds.play(Sounds.NONE);
            }
        }
        if (isFrozen && !frozen) {
            Sounds.play(Sounds.FREEZE);
            speed /= 2;
            frozen = true;
        }
    }
}
