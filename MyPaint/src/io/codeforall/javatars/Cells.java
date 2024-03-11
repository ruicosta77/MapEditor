package io.codeforall.javatars;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cells {

    private Rectangle rectangle;
    private boolean painted;

    public Cells(int x,int y, int height, int width) {
        this.rectangle = new Rectangle(x,y,height,width);
    }

    public Rectangle getRectangle() {
        return rectangle;
    }
    public boolean isPainted() {
        return painted;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }
}
