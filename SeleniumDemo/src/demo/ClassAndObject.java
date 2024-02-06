package demo;
class A
{ 
	int empId=10012;
	String gender ="Female";
}
class B
{
	int experience=3;
	String city="Warangal";
}
class C
{
	int postalCode=506001;
	String country="India";
}

public class ClassAndObject {

	String empName="shamili";
	int empSal=100;
	
	public static void main(String args[])
	{
		//by using object reference 
		ClassAndObject obj=new ClassAndObject();
	   System.out.println(obj.empName);
	   System.out.println(obj.empSal);
	
	A obj1=new A();
	System.out.println(obj1.empId);
    System.out.println(obj1.gender);	
    
    B obj2=new B();
    System.out.println(obj2.experience);
    System.out.println(obj2.city);
    
    C obj3=new C();
    System.out.println(obj3.postalCode);
    System.out.println(obj3.country);
    
	}
}
