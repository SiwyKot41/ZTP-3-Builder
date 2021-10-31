package pl.wipb.ztp.ps3;

import java.util.ArrayList;
import java.util.List;

public class SegmentBuilder implements Builder{
    private char segmentType;
    private int tilesAmount;
    private final int TILESIZE = 32;
    private int x = 4;
    private int y = 4;
    private List<Segment> plansza = new ArrayList<>();


    @Override
    public void addSegmentType(char segmentType) {
        this.segmentType = segmentType;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setPlansza(List<Segment> plansza) {
        this.plansza = plansza;
    }

    public List<Segment> getPlansza() {
        return plansza;
    }
    public void build() {
        switch (segmentType) {
            case 'X':
                x += tilesAmount * TILESIZE;
                break;
            case 'A':
                    Segment s1 = new SegmentBlock(x, y, "block1.png");
                    plansza.add(s1);
                break;
            case 'B':
                    Segment s2 = new SegmentBlockV(x, y, "block2.png");
                    plansza.add(s2);
                break;
            case 'C':
                    Segment s3 = new Segment(x, y, "block3.png");
                    plansza.add(s3);
                break;
            case 'G':
                    Segment s4 = new SegmentAnim(x, y, "bonus.png", new int[]{0, 0, 0, 1, 1, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 0, 0});
                    plansza.add(s4);
                break;
        }
    }
}
