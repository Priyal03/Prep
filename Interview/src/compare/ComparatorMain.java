package compare;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;
	import java.util.List;
	 
	public class ComparatorMain {
	 	
		public static void main(String[] args) {
			Country indiaCountry=new Country(1, "India");
			Country russiaCountry=new Country(4, "Russia");
			Country englandCountry=new Country(3, "England");
			Country germanyCountry=new Country(2, "Germany");
	 
	 
			List<Country> listOfCountries = new ArrayList<Country>();
			listOfCountries.add(indiaCountry);
			listOfCountries.add(russiaCountry);
			listOfCountries.add(englandCountry);
			listOfCountries.add(germanyCountry);
	 
			System.out.println("Before Sort by id : ");
			for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
			}
			Collections.sort(listOfCountries,new CountrySortByID());
	 
			System.out.println("After Sort by id: ");
			for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}
	 
			//Sort by countryName
			Collections.sort(listOfCountries,new Comparator<Country>() {
	 
				@Override
				public int compare(Country o1, Country o2) {
					return o1.getCountryName().compareTo(o2.getCountryName());
				}
			});
	 
			System.out.println("After Sort by name: ");
			for (int i = 0; i < listOfCountries.size(); i++) {
				Country country=(Country) listOfCountries.get(i);
				System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			}
		}
	 
	}
