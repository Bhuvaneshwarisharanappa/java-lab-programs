package week8;
class vehicle 
{
	protected String vehicletype;
	private int maxSpeed;
	vehicle(int mSpeed)
	{
		maxSpeed=mSpeed;
	}
	public void speed()
	{
		System.out.println("it can cruise up to maxSpeed of"+maxSpeed+"km/hour");
	}
}
class Toyota extends vehicle
{
	protected String brand;
	Toyota(int mSpeed)
	{
		super(mSpeed);
	}
}
class Fortuner extends Toyota 
{
	private String model;
	Fortuner(String vtype,int ms,String br,String mod)
	{
		super(ms);
		vehicletype=vtype;
		model=mod;
		brand=br;
	}
		public void display()
		{
			System.out.println("the name of the vehicle is"+model);
			System.out.println("the brand is"+brand);
			System.out.println("the type of vehicle is"+vehicletype);
			this.speed();
		}
}
class demomultilevel 
{
	public static void main(String[] args) {
		Fortuner sigma=new Fortuner("Four wheeler",280,"toyota","Fortuner");
		sigma.display();
	}
}
