package prototype.app;

import prototype.core.Shape;
import prototype.shapes.Circle;
import prototype.shapes.Rectangle;

public class PrototypeApp {
    public static void main(String[] args) {

        //--------------------------//
        //          Circle          //
        //        (deep copy)       //
        //--------------------------//

        Shape circle = new Circle();
        circle.setX(100);
        circle.setY(100);

        Shape circle2 = circle.clone();

        System.out.println("Circle 1: " + circle);
        System.out.println("Circle 2: " + circle2);

        circle2.setX(200);
        circle2.setY(200);

        System.out.println("Circle 1: " + circle);
        System.out.println("Circle 2: " + circle2);


        //-----------------------------//
        //          Rectangle          //
        //      (not le deep copy)     //
        //-----------------------------//


        Rectangle rectangle = new Rectangle();
        rectangle.setSize(100, 100);

        Rectangle rectangle2 = (Rectangle) rectangle.clone();

        System.out.println("Rectangle 1: " + rectangle);
        System.out.println("Rectangle 2: " + rectangle2);

        rectangle2.setSize(200, 200);

        System.out.println("Rectangle 1: " + rectangle);
        System.out.println("Rectangle 2: " + rectangle2);
    }
}
