package com.axis.Factory;

import com.axis.Models.Circle;
import com.axis.Models.Rectangle;
import com.axis.Models.Shape;

public class ShapeFactory {

	public Shape getShape(String shapeType)
	{
		if(shapeType==null)
			return null;
		if(shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else 
			return new Rectangle();
		
					
	}
	
}
