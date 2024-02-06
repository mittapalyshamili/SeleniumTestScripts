package demo;

public class DiffBtwnStaticAndNonStatic {
   
/*By using static keyword for location 
 changing the location for every student those who belongs to same area,
 is always not possible so we use static keyword*/
	// by assiging static keyword to location automatically the location 
	// name changes for the students those who  belongs to same area .
	String Studentname;
	int Studentrollno;
	// String Studentlocation="Hyd";
	static String Studentlocation="Hyderabad" ;

	public static void main(String[] args) {
		
		
		DiffBtwnStaticAndNonStatic stu1=new DiffBtwnStaticAndNonStatic ();
		 stu1.Studentname="Bhavishya";
		 stu1.Studentrollno=11;
		 //Stu1.Studentlocation="Hyd";
		 	System.out.println(stu1.Studentname);
			System.out.println(stu1.Studentrollno);
			System.out.println(stu1.Studentlocation);
			
			DiffBtwnStaticAndNonStatic stu2=new DiffBtwnStaticAndNonStatic ();
			 stu2.Studentname="pandu";
			 stu2.Studentrollno=12;
			//stu2.Studentlocation="Hyd";
			 
			 	System.out.println(stu2.Studentname);
				System.out.println(stu2.Studentrollno);
				System.out.println(stu2.Studentlocation);
			
				
			
	}

}
