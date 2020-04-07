package febfive;

//Java Program to illustrate calling a 
//no-argument constructor 


class Construct 
{ 
	protected int num; 
	protected String name; 

	// this would be invoked while an object 
	// of that class is created. 
	Construct(){
		System.out.println("Parent no-arg");
	}
	Construct(int num, String name) 
	{ 
		//this();
		System.out.println("Parent Constructor called");
		
		this.num = num;
		this.name = name;
	} 
	public static void main (String[] args) 
	{ 
		// this would invoke default constructor. 
		Construct geek = new Construct();
		Construct geek1 = new Construct(1,"Pri"); 

		System.out.println(geek1.name); 
		System.out.println(geek1.num); 
	} 

} 

//class Construct extends Geek
//{ 
//	Construct(int num, String name){
//		super();
//		System.out.println("child");
//		this.num = num;
//		this.name = name;
//	}
//	public static void main (String[] args) 
//	{ 
//		// this would invoke default constructor. 
//		Geek geek1 = new Construct(1,"Pri"); 
//
//		// Default constructor provides the default 
//		// values to the object like 0, null 
//		System.out.println(geek1.name); 
//		System.out.println(geek1.num); 
//	} 
//} 
