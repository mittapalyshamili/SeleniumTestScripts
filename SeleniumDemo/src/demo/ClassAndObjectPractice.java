package demo;

public class ClassAndObjectPractice {
	int customerId=1234;
	String customerName="xyz";
	int contactNo=4455;
	String gender="Female";
	int orderId=001;
	String address="Warangal";
	int amount=2000;
	public static void main(String args[])
	{
	//by using object reference
		ClassAndObjectPractice obj=new ClassAndObjectPractice();
		System.out.println(obj.customerId);
		System.out.println(obj.customerName);
		System.out.println(obj.contactNo);
		System.out.println(obj.gender);
		System.out.println(obj.orderId);
		System.out.println(obj.address);
		System.out.println(obj.amount);
		
	// without object reference 
		System.out.println(new ClassAndObjectPractice().customerId );
		System.out.println(new ClassAndObjectPractice().customerName);
		System.out.println(new ClassAndObjectPractice().contactNo);
		System.out.println(new ClassAndObjectPractice().gender );
		System.out.println(new ClassAndObjectPractice().orderId);
		System.out.println(new ClassAndObjectPractice().address);
		System.out.println(new ClassAndObjectPractice().amount);
		
		
	}

}
