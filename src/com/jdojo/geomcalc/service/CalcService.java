package com.jdojo.geomcalc.service;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.Map.Entry;

import com.jdojo.geomcalc.model.IShapeInfo;
import com.jdojo.geomcalc.model.Shape;

public class CalcService {
	private InputValidator iv=new InputValidator();
	public int getMainMenu() {
		Map<Integer, IShapeInfo> shapeMap = ShapeInfoProvider.INSTANCE.getShapeInfoMap();

		for (Entry<Integer, IShapeInfo> entry : shapeMap.entrySet()) {
			System.out.println(entry.getKey() + "." + entry.getValue().getShapeName());
		}
		System.out.print("Enter number (1-4) to choose the type of shape or 0 to exit\n");
		int key=iv.getKey();
		return key;
		}

	public Shape createNewShape(int key) {
		return ShapeInfoProvider.INSTANCE.createShape(getNameFromMap(key), getParamFromMap(key));
	}
	public String getNameFromMap(int key) {
		Map<Integer, IShapeInfo> shapeMap = ShapeInfoProvider.INSTANCE.getShapeInfoMap();
		IShapeInfo sh=shapeMap.get(key);
			return sh.getShapeName();
	}
	
	public double[] getParamFromMap(int key) {
		Map<Integer, IShapeInfo> shapeMap = ShapeInfoProvider.INSTANCE.getShapeInfoMap();
		IShapeInfo shi=shapeMap.get(key);
		double[] param= new double[shi.getParamsName().length];
		for (int i=0;i<shi.getParamsName().length;i++) {
			
			System.out.println("Please enter the " +(String) Array.get(shi.getParamsName(), i) + ":");
		param[i]=iv.getParam();
		}
		return param;
	}
	public  void printScreen(String shapeName,double perimeter,double area){
		System.out.println("Calculation result for "+shapeName+":");
		System.out.printf("Perimeter is: %.4f%n", perimeter);
		System.out.printf("Area is: %.4f%n", area);

	}


}
