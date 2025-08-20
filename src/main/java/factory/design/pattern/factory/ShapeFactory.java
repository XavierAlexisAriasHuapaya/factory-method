package factory.design.pattern.factory;

import factory.design.pattern.enums.ShapeEnum;
import factory.design.pattern.shape.Circle;
import factory.design.pattern.shape.Rectangle;

public class ShapeFactory {

    public void getShape(ShapeEnum shapeType) {
        switch (shapeType) {
            case CIRCLE -> new Circle().draw();
            case RECTANGLE -> new Rectangle().draw();
        }
    }

}
