package febfive;

//Java program to illustrate creation of Object 
//using newInstance() method of Constructor class 
import java.lang.reflect.*; 

public class ReflectionEample 
{ 
	private String name; 
	ReflectionEample() 
	{ 
	} 
	public void setName(String name) 
	{ 
		this.name = name; 
	} 
	public static void main(String[] args) 
	{ 
		try
		{ 
			Constructor<ReflectionEample> constructor 
				= ReflectionEample.class.getDeclaredConstructor(); 
			ReflectionEample r = constructor.newInstance(); 
			r.setName("GeeksForGeeks"); 
			System.out.println(r.name); 
		} 
		catch (Exception e) 
		{ 
			e.printStackTrace(); 
		} 
	} 
} 
