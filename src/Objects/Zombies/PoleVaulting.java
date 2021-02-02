package Objects.Zombies;

import Miscs.Icons;
import Miscs.Sounds;

import javax.swing.*;
import java.awt.*;

public class PoleVaulting extends Zombie {
    public ImageIcon noPole = new ImageIcon("gfx/noPole.pvz");
    public ImageIcon jump1 = new ImageIcon("gfx/jump1.pvz");
    public ImageIcon jump2 = new ImageIcon("gfx/jump2.pvz");
    public boolean jumped = false;
    public boolean isJumping = false;
    public PoleVaulting(Container c, int row) {
        super(c, 340, 6, 10, row);
        walk = Icons.poleVaultIcon;
        die = new ImageIcon("gfx/diePole.pvz");
        sizeX = 348;
        sizeY = 212;
        setIcon(walk);
    }

    @Override
    public void lossHealth(int Amount, boolean isFrozen) {
        health -= Amount;
        if (health > 0) {
            Sounds.play(hitSound);
        }
        else {
            kill(false);
        }
        if (isFrozen && !frozen) {
            speed /= 2;
            frozen = true;
            Sounds.play(Sounds.FREEZE);
        }
    }
}
