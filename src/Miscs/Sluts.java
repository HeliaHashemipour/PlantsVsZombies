package Miscs;

import Objects.Plants.PeaBullet;
import Objects.Plants.Plant;
import Objects.Zombies.Zombie;

import java.awt.*;

public class Sluts {
    static final int FIRST_X = 260, FIRST_Y = 80, X = 10, Y = 5;
    static int[][][] sluts = new int[X][Y][2];

    public static void setSluts() {
        for (int i = 0; i < X; i++)
            for (int j = 0; j < Y; j++) {
                sluts[i][j][0] = FIRST_X + i * 80;
                sluts[i][j][1] = FIRST_Y + j * 100;
            }
    }

    public static int[] getPlantLocation(int X, int Y) {
        return sluts[X - 1][Y - 1];
    }

    public static int[] getZombieLocation(int Y) {

    }

    public static int[] getSlut(int posX, int posY) {

    }
    public static int[] getSlut(Point p) {

    }
    public static int[] getSlut(Plant p) {

    }

    public static int[] getSlut(PeaBullet p) {

    }
    //public static int[] getSlut(Mower p) {
    //   return getSlut(p.x, p.y);
    //}
}
