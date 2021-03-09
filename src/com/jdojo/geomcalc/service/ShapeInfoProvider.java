package com.jdojo.geomcalc.service;

import java.util.HashMap;
import java.util.Map;

import com.jdojo.geomcalc.model.Circle;
import com.jdojo.geomcalc.model.IShapeInfo;
import com.jdojo.geomcalc.model.Rectangle;
import com.jdojo.geomcalc.model.Shape;
import com.jdojo.geomcalc.model.ShapeInfo;
import com.jdojo.geomcalc.model.Square;
import com.jdojo.geomcalc.model.Triangle;

public enum ShapeInfoProvider {
	INSTANCE;
	private Map<Integer, IShapeInfo> map;

	public Map<Integer, IShapeInfo> getShapeInfoMap() {
		if (map == null) {
			 map = new HashMap<Integer, IShapeInfo>();

			for (ShapeInfo shi : ShapeInfo.values()) {
				map.put(shi.ordinal() + 1, shi);
			}
		}
		return map;
	}

	public Shape createShape(String key, double... param) {
		switch (key) {
		case Circle.NAME:
			return new Circle(param[0]);
		case Square.NAME:
			return new Square(param[0]);
		case Rectangle.NAME:
			return new Rectangle(param[0], param[1]);
		case Triangle.NAME:
			return new Triangle(param[0],param[1],param[2]);

		}
		return null;
	}

}
