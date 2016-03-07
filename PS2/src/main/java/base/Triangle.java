package base;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	/**
	 * Creates default triangle
	 */
	public Triangle(){}
	
	/**
	 * Sets the triangle lengths to specified lengths
	 * @param s1
	 * @param s2
	 * @param s3
	 */
	public Triangle(double s1, double s2, double s3){
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side3;
	}
	
	/**
	 * Gets the area of the triangle
	 * Uses formula of only sides to determine area
	 * @return
	 */
	@Override
	public double getArea(){
		double a = this.side1;
		double b = this.side2;
		double c = this.side3;
		return Math.sqrt((a+b+c)*(b+c-a)*(c+a-b)*(a+b-c))/4;
	}
	
	/**
	 * Gets the perimeter of the triangle
	 * @return
	 */
	@Override
	public double getPerimeter(){
		return this.side1+this.side2+this.side3;
	}
	
	/**
	 * returns a description of the triangle:
	 * all 3 side lengths, fill color, whether is filled or not
	 * @return
	 */
	@Override
	public String toString(){
		return this.ToString();
	}
}
