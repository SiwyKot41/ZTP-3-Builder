package pl.wipb.ztp.ps3;

import java.util.List;

public interface Builder {

    void createX(int tilesAmount);
    void createA();
    void createB();
    void createC();
    void createG();
    void setX(int x);
    void setY(int y);
    int getY();
    int getTILESIZE();
    List<Segment> getPlansza();
}
