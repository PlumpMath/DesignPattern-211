package com.aeon.pattern.factory;

public class FactoryPattern {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		Shape shapeCircle = new Circle();
		shapeCircle.draw();
		Shape shapeRectangle = new Rectangle();
		shapeRectangle.draw();
		Shape shapeSquare = new Square();
		shapeSquare.draw();
	}
}
