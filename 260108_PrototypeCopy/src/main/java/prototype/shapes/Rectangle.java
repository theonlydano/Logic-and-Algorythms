package prototype.shapes;

import prototype.core.Shape;

public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(){
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(Rectangle source){
        this.width = source.width;
        this.height = source.height;
    }

    public void setSize(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return this;
    }

    @Override
    public String toString() {
        return "Rectangle [ width=" + width + ", height=" + height + "]" + "[X=" + x + "]" + "[Y=" + y + "]" + "[Color=" + color + "]";
    }
}
