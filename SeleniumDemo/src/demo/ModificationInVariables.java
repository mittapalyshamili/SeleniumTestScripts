package demo;

public class ModificationInVariables {
	int i=30;	
	static int j=40;
	public static void main(String[] args) 
	{		
		ModificationInVariables obj=new ModificationInVariables();
		System.out.println(obj.i);//30
		System.out.println(obj.j);//40
		obj.i= 15;
		obj.j=20;
		System.out.println(obj.i);//15
		System.out.println(obj.j);//20
		ModificationInVariables obj1=new ModificationInVariables();
		System.out.println(obj1.i);//30
		System.out.println(obj1.j); //20
		obj1.i= 100;
		obj1.j=200;
		System.out.println(obj1.i);//100
		System.out.println(obj1.j);//200
		ModificationInVariables obj2=new ModificationInVariables();
		System.out.println(obj2.i);//30
		System.out.println(obj2.j);//200
		obj2.i= 50;
		obj2.j= 60;
		System.out.println(obj2.i);//50
		System.out.println(obj2.j);//60
		obj1.j=55;
		System.out.println(obj2.j);
		obj1.i=80;
		System.out.println(obj1.i);
		obj2.i=33;
		System.out.println(obj2.i);
		obj2.j=45;
		System.out.println(obj2.j);
		
	}

}
