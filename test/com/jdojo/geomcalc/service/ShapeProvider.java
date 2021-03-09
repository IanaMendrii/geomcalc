package com.jdojo.geomcalc.service;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;

import java.util.HashMap;
import java.util.Map;

import org.hamcrest.collection.IsMapContaining;
import org.junit.Test;

import com.jdojo.geomcalc.model.Circle;
import com.jdojo.geomcalc.model.IShapeInfo;
import com.jdojo.geomcalc.model.Rectangle;
import com.jdojo.geomcalc.model.ShapeInfo;
import com.jdojo.geomcalc.model.Square;
import com.jdojo.geomcalc.model.Triangle;

public class ShapeProvider {
	@Test
	public void collectionMapContainsElement () {
		ShapeInfoProvider.INSTANCE.getShapeInfoMap();
		Map<Integer, IShapeInfo> shapeMap = ShapeInfoProvider.INSTANCE.getShapeInfoMap();
		Map<Integer, IShapeInfo> expected = new HashMap<>();
		for (ShapeInfo shi : ShapeInfo.values()) {
			expected.put(shi.ordinal() + 1, shi);
		}
        //1. Test equal, ignore order
        assertThat(shapeMap, is(expected));
        //2. Test size
        assertThat(shapeMap.size(), is(4));
        //Contains
	    assertThat(shapeMap, IsMapContaining.hasEntry(1,ShapeInfo.CircleInfo));
	    assertThat(shapeMap, IsMapContaining.hasKey(1));
        assertThat(shapeMap, IsMapContaining.hasValue(ShapeInfo.CircleInfo));

	}
	@Test
	public void ReturnShapeOjectWhenInvokeCreateShape(){
	assertThat(ShapeInfoProvider.INSTANCE.createShape(Circle.NAME, 4), instanceOf(Circle.class));
	assertThat(ShapeInfoProvider.INSTANCE.createShape(Square.NAME, 4), instanceOf(Square.class));
	assertThat(ShapeInfoProvider.INSTANCE.createShape(Rectangle.NAME, 4,3), instanceOf(Rectangle.class));
	assertThat(ShapeInfoProvider.INSTANCE.createShape(Triangle.NAME, 4,3,3), instanceOf(Triangle.class));
	}
}
