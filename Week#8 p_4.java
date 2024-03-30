package Week8;
import java.util.Scanner;
interface OrderDelivery
{
	public void deliverOrder();
}
class swiggy implements OrderDelivery
{
	String cust_name;
	byte orderNo;
	swiggy(){
		Scanner sc= new Scanner(System.in);
		System.out.print("enter the customer name....");
		cust_name=sc.next();
		System.out.println("enter the order ID...");
		orderNo=sc.nextByte();
	}
	public void deliverOrder() {
		System.out.println("delivering food order of Mr."+cust_name +" with order number "+orderNo+ ".");	
	}
}
class swiggyInstamart implements OrderDelivery{
	String cust_name;
	byte orderId;
	int product_qty;
	swiggyInstamart(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the customer name...");
		cust_name=sc.next();
		System.out.println("enter the order id...");
		orderId=sc.nextByte();
		System.out.println("enter the product quantity...");
		product_qty=sc.nextInt();	
	}
	public void deliverOrder() {
		System.out.println("Delivering grocery order  of Mr."+cust_name+ " with order number "+ orderId+".\nThe total no of products delivered are" +product_qty);			
	}
}
class delivery
{
	public void deliverToCustomer(OrderDelivery od) {
		od.deliverOrder();
	}
}
public class demoOcp {
	public static void main(String[] args) {
		delivery order =new delivery();
		swiggy sw =new swiggy();
		order.deliverToCustomer(sw);
		swiggyInstamart insta= new swiggyInstamart();
		order.deliverToCustomer(insta);
	}
}
