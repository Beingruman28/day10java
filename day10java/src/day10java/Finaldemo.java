package day10java;

 class A {
	 int a = 19;
	 final void m1() {
		 a = 20;
		 System.out.println("print the value a"  + a);		
	 }
	 void m2() {
		 System.out.println("In method m2");
	 }
	 void m2(String s) {
	 }
 }

public class Finaldemo extends A{ 
       
	void m2() {
		System.out.println("In method m2 of final demo");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a = new A();
         a.m1();
         a.m2();
         Finaldemo fd =new Finaldemo ();
         fd.m2();
	}

}
