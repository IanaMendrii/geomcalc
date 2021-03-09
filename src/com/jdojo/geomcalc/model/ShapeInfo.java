package com.jdojo.geomcalc.model;

public enum ShapeInfo implements IShapeInfo{
	CircleInfo(Circle.NAME , new String[] {"radius"}),
	SquareInfo(Square.NAME, new String[] {"side"}),
	RectangleInfo(Rectangle.NAME, new String[] {"width","height"}),
	TriangleInfo(Triangle.NAME, new String[] {"the first side","the second side","the third side"});
	
	private String name;
	private String[] params;
	
	private ShapeInfo(String name, String[] params) {
		this.name = name;
		this.params = params;
	}

	@Override
	public String getShapeName() {
		return name;
	}

	@Override
	public String[] getParamsName() {
		return params;
	}
	
}
