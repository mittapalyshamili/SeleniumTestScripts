package demo;

class A1 
{
	byte e;
	short f;
	int g;
	long h;
	float i;
	double j;
	boolean k;
	char l;
	String m;
}

public class Variables {
	
	int a=30;
	int b=20;
	int c=10;
	int d=1;
	
	
	public static void main(String[] args) {
		
		//by using obj ref
		Variables obj=new Variables();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		 // without ref ----direct obj
		System.out.println(new Variables().a);
		System.out.println(new Variables().b);
		System.out.println(new Variables().c);
		System.out.println(new Variables().d);
		
		// Accessing default values using obj reference.
	
		A1 obj1=new A1();
	    System.out.println(obj1.e);//0
	    System.out.println(obj1.f);//0
	    System.out.println(obj1.g);//0
	    System.out.println(obj1.h);//0
	    System.out.println(obj1.i);//0.00
	    System.out.println(obj1.j);//0.00
	    System.out.println(obj1.k);//false
	    System.out.println(obj1.l);//space
	    System.out.println(obj1.m);// null
/// Accessing default values directly without obj ref
	    
	    System.out.println(new A1().e);//0
	    System.out.println(new A1().f);//0
	    System.out.println(new A1().g);//0
	    System.out.println(new A1().h);//0
	    System.out.println(new A1().i);//0.000
	    System.out.println(new A1().j);//0.00
	    System.out.println(new A1().k);//false
	    System.out.println(new A1().l);// space
	    System.out.println(new A1().m);// null
	 		
	}
}
