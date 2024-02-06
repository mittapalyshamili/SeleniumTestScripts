package demo;

public class ClassWithOperators {
	int x=45;
    int y=35;
	int z=20;
	
	public static void main(String[] args) {
		ClassWithOperators obj=new ClassWithOperators();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		// unary operators//
		
		ClassWithOperators obj1=new ClassWithOperators();
		System.out.println(-obj1. x);
		System.out.println(--obj1. x);
        System.out.println(++obj1 .x);
		System.out.println(obj1 .x++);
		System.out.println(-obj1 .y);
        System.out.println(--obj1 .y);
        System.out.println(++obj1.y);
        System.out.println(obj1 .y++);
        //Arithmetic operator ///
       
        int a=10;
        int b=20;
        System.out.println(a+b); //30
        System.out.println(a-b);//10
        System.out.println(a*b);//200
        System.out.println(a/b);//0
        System.out.println(a%b);//10
        
        // Comparison operator //
         
        System.out.println(a<b);//true
        System.out.println(a<=b);//true
        System.out.println(a>b);// false
        System.out.println(a>=b);//false
        System.out.println(a==b);// false
        System.out.println(a!=b);//true
        System.out.println(!true);// false
        System.out.println(!false);//true
        
        // logical operator //
        int c=30;
        System.out.println(a<b && b<c); //true
        System.out.println(a<b && b>c);// false
        System.out.println(a>b && b<c);//false
        System.out.println(a>b && b>c);// false
        
        System.out.println(a<b || b<c);// true
        System.out.println(a<b || b>c);// true
        System.out.println(a>b || b<c);//true
        System.out.println(a>b || b>c);// false
        
        // tenary operator
        
        int i=(a<b)?a:b;
         int j=(b>c)?b:c;
         System.out.println( i);
        System.out.println(j);
	}

}
