package Miscs;

import java.awt.Rectangle;
import java.awt.Point;

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
        return sluts[X][Y];
    }
    public static int[] getZombieLocation(int Y) {
        return sluts[9][Y];
    }

    public static int[] getSlut(int posX, int posY) {
        for (int i = 0; i < X; i++)
            for (int j = 0; j < Y; j++) {
                if (posX >= sluts[i][j][0] && posX < sluts[i][j][0] + 80 && posY >= sluts[i][j][1] && posY < sluts[i][j][1] + 100) {
                    return new int[]{i, j};
                }
            }
        return null;
    }
    public static int[] getSlut(Point p) {
        return getSlut(p.x, p.y);
    }
    public static int getYSlut(Rectangle R) {
        for (int i = 0; i < X; i++)
            for (int j = 0; j < Y; j++) {
                if (R.y >= sluts[i][j][1] && R.y < sluts[i][j][1] + 100) {
                    return j;
                }
            }
        return -1;
    }

    public static int getMowerLocation(int YSlut) {
        return sluts[0][YSlut][1];
    }
}