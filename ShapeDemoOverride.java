package com.pack.oops;
class Shape{
	public double CircleArea(double r)
	{
		r=2;
		return 3.14*r*r;
	}
	
}
class Triangle extends Shape{
	//method overrriding
	public double trianleArea(double b,double h)
	{
		
		return (0.5*b*h);
	}
	public double CircleArea(Triangle t1)
	{
		 t1=new Triangle();
		
		
		return t1.trianleArea(1.1, 1.5) ;
	}
	
}

class equilateralTraingle extends Triangle{
	
	public double CircleArea(equilateralTraingle e)
	{
		
		return super.CircleArea(e)+1.2;
	}
}

public class ShapeDemoOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
equilateralTraingle eq=new equilateralTraingle();
System.out.println(eq.CircleArea(eq))	;	
		
	}

}
