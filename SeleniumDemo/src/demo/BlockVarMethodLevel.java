package demo;

public class BlockVarMethodLevel {

	public static void main(String[] args) {
         int a=20;
 		System.out.println(a);
     // System.out.println("in method level");
      {
    	  int b=40;
    	  System.out.println(b);
    	 // System.out.println("in block1");
      }

	}

}
