package prototype.core;

import java.awt.*;

public abstract class Shape {
    protected int x;
    protected int y;
    protected Color color;

    public Shape(){
        this.x = 0;
        this.y = 0;
        this.color = new Color(0,0,0);
    }

    public Shape(Shape source){
        this.x = source.x;
        this.y = source.y;
        this.color = new Color(source.color.getRed(), source.color.getGreen(), source.color.getBlue());
    }

    public abstract Shape clone();

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract String toString();
}
