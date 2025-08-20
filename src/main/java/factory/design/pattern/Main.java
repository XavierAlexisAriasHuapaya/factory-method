package factory.design.pattern;

import factory.design.pattern.enums.ShapeEnum;
import factory.design.pattern.factory.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        factory.getShape(ShapeEnum.CIRCLE);
    }
}