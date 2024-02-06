package demo;

public class Operators {

	public static void main(String[] args) {
		//unary operators
		int a=10;
		System.out.println(a);//10
		System.out.println(-a);//-10
		System.out.println(--a);//9
        System.out.println(++a);//10
        System.out.println(a++);//10
        System.out.println(--a);//10
        
        //Binary operators//=======
        //Arthematic operators
         int i=30;
         int j=20;
         System.out.println(i+j);  // 50
         System.out.println(i-j);  //10
         System.out.println(i*j); //600
         System.out.println(i%j); //10
         System.out.println(i/j); //1
         
    // Relational operators // ===============
         int e=20;
         int f=40;
        System.out.println(e<f );//true
        System.out.println(e>f );//false
        System.out.println(e<=f );//true
        System.out.println(e>=f );//false
        System.out.println(e!=f );//true
        System.out.println(!true );//false
        System.out.println(!false);//true

     // logical operators//======
        //  &&  || !
        int l=10;
        int m=30;
        int n=50;
        System.out.println(l<m && m<n);//true
        System.out.println(l<m && m>n);// false
        System.out.println(l>m && m<n);//false
        System.out.println(l>m && m>n);//false
        
        System.out.println(l<m || m<n);// true
        System.out.println(l<m || m>n);// true
        System.out.println(l>m || m<n);// true
        System.out.println(l>m || m>n);// false

      // // ternery operator ////======
		int b=20;
		int c=30;
		int x= 100;
		int result=(b>c)?b:c;
		int y =(c>x)?c:x;
		System.out.println(result);
		System.out.println(y);
  }
	
}
