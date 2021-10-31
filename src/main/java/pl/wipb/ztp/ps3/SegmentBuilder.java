package pl.wipb.ztp.ps3;

import java.util.ArrayList;
import java.util.List;

public class SegmentBuilder implements Builder{
    private char segmentType;
    protected final int TILESIZE = 32;
    protected int x = 4;
    protected int y = 4;
    protected List<Segment> plansza = new ArrayList<>();


    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int getTILESIZE() {
        return TILESIZE;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


    public void createX(int tilesAmount) {
        x += tilesAmount * TILESIZE;
    }

    public void createA() {
        Segment s1 = new SegmentBlock(x, y, "block1.png");
        plansza.add(s1);
        x += TILESIZE;
    }


    public void createB() {
        Segment s2 = new SegmentBlockV(x, y, "block2.png");
        plansza.add(s2);
        x += TILESIZE;
    }


    public void createC() {
        Segment s3 = new Segment(x, y, "block3.png");
        plansza.add(s3);
        x += TILESIZE;
    }

    public void createG() {
        Segment s4 = new SegmentAnim(x, y, "bonus.png", new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 0, 0});
        plansza.add(s4);
        x += TILESIZE;
    }

    public List<Segment> getPlansza() {
        return plansza;
    }
}
