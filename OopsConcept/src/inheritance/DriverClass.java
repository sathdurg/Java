package inheritance;

public class DriverClass {

	public static void main(String args[]) {

//Bicycle,MountainBike
//		MountainBike mb = new MountainBike(3, 100, 25);
//		System.out.println(mb.toString());

//-------------------------------------------------------------//

//		Single Inheritance
//Super and Sub
/*
 * SubClass obj = new SubClass(); System.out.println(obj.sample() + "\t" +
 * obj.pro() + "\t" + "for Java");
 */
//		SuperClass obj1 = new SubClass();
//		SuperClass obj2 = new SuperClass();

//-------------------------------------------------------------//
//		Multilevel Inheritance
//		SubClass obj3 = new SubClass();
		SubClass2 obj3 = new SubClass2();
		/*
		 * System.out.println(obj3 instanceof SuperClass); System.out.println(obj3
		 * instanceof SubClass); System.out.println(obj3 instanceof SubClass2);
		 */
		System.out.println(obj3.sample() + "\t" + obj3.pro() + "\t" + obj3.java());
		
//-------------------------------------------------------------//
//		Cyclic inheritance is permitted in Java
//		Multi1 obj = new Multi1();
//		obj.show();
		
		
		
		
	}
}