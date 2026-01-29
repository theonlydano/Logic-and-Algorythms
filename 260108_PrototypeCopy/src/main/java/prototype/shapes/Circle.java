package prototype.shapes;

import prototype.core.Shape;

public class Circle extends Shape {
    private int radius;

    public Circle(){
        super();
        this.radius = 0;
    }

    public Circle(Circle source){
        super(source);
        this.radius = source.radius;
    }

    @Override
    public Shape clone(){
        Circle clone = new Circle(this);

        return clone;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]" + "[X=" + x + "]" + "[Y=" + y + "]" + "[Color=" + color + "]";
    }
}
