package Week8;
import java.util.Scanner;
interface shape
{
	public short calculateArea();	
}
class Rectangle implements shape
{
	short length;
	short width;
	Rectangle(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of rectangle...");
		length=sc.nextShort();
		System.out.println("enter width of rectangle...");
		width=sc.nextShort();	
	}
	public short calculateArea() {
		return (short) (length *width);	
	}
}
class Circle implements shape{
	public short radius;
	Circle(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the radius of a circle....");
		radius=sc.nextShort();	
	}
	public short calculateArea() {
		return (short)(3.14*radius);
	}
}
class Square implements shape{
	short side;
	Square(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the side of Sqaure...");
		side=sc.nextShort();
		sc.close();	
	}
	public short calculateArea() {
		return (short) (side*side);
	}
}
class invokeshape{
	public short calculateshapeArea(shape inshape) {
		return inshape.calculateArea();
	}
}
public class Demoopencloseprinciple{

	public static void main(String[] args) {
		invokeshape is =new invokeshape();
		Rectangle rect= new Rectangle();
		Circle cir= new Circle();
		Square sqr= new Square();
		short rarea=is.calculateshapeArea(rect);
		short carea=is.calculateshapeArea(cir);
		short sarea=is.calculateshapeArea(sqr);
		System.out.println("************************************");
		System.out.println("area of a rectangle..."+rarea);
		System.out.println("area of a circle..."+carea);
		System.out.println("area of a square..."+sarea);
	}
}
