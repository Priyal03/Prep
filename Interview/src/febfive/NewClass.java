package febfive;

public class NewClass { 
	public static class superclass { 
		static void print() 
		{ 
			System.out.println("print in superclass."); 
		} 
	} 
	public static class subclass extends superclass { 
		
		void print(int c) {
			System.out.println("print in ith XXX.");
		}
		static void print() 
		{ 
			System.out.println("print in subclass."); 
		} 
	} 

	public static void main(String[] args) 
	{ 
		superclass A = new superclass(); 
		subclass B = new subclass(); 
		A.print(); 
		B.print(5); 
	} 
} 

/* Java program to show that if static methods are redefined by 
a derived class, then it is not overriding but hidding. */

// Superclass 
class Base { 
	
	// Static method in base class which will be hidden in subclass 
	public static void display() { 
		System.out.println("Static or class method from Base"); 
	} 
	
	// Non-static method which will be overridden in derived class 
	public void print() { 
		System.out.println("Non-static or Instance method from Base"); 
	} 
} 

// Subclass 
class Derived extends Base { 
	
	// Static is removed here (Causes Compiler Error) 
	public static void display() { 
		System.out.println("Non-static method from Derived"); 
	} 
	
	// Static is added here (Causes Compiler Error) 
	public  void print() { 
		System.out.println("Static method from Derived"); 
} 
} 

