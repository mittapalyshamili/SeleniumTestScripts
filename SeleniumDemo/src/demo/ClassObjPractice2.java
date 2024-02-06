package demo;

public class ClassObjPractice2 {
	// by using obj 
     String studentName="Bhavishya";
     String schoolName="JPS";
     int rollNo=11;
     String standard ="LKG";
     String subject1="English"; 
     int marks = 91;
     String Subject2="Maths";
     int marks2= 87;
     String subject3="EVS";
     int marks3=85;
     int total=263;
     float percentage=87.52f;
	
	public static void main(String[] args) {
		
		//with obj reference
		ClassObjPractice2 obj=new ClassObjPractice2();
		System.out.println( obj.studentName);
		System.out.println( obj.schoolName);
		System.out.println( obj.rollNo);
		System.out.println( obj.standard);
		System.out.println( obj.subject1);
		System.out.println( obj.marks);
		System.out.println( obj.Subject2);
		System.out.println( obj.marks2);
		System.out.println(obj.subject3);
		System.out.println(obj.marks3);
		System.out.println(obj.total);
		System.out.println(obj.percentage);
		
		//without obj reference
		System.out.println(new ClassObjPractice2().studentName);
		System.out.println(new ClassObjPractice2().schoolName);
		System.out.println(new ClassObjPractice2().rollNo);
		System.out.println(new ClassObjPractice2().standard);
		System.out.println(new ClassObjPractice2().subject1);
		System.out.println(new ClassObjPractice2().marks);
		System.out.println(new ClassObjPractice2().Subject2);
		System.out.println(new ClassObjPractice2().marks2);
		System.out.println(new ClassObjPractice2().subject3);
		System.out.println(new ClassObjPractice2().marks3);
		System.out.println(new ClassObjPractice2().total);
		System.out.println(new ClassObjPractice2().percentage);
	
	}
	}

