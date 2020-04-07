package compare;
import java.util.Comparator;

public class CountrySortByID  implements Comparator<Country>{
		 
	    @Override
	    public int compare(Country country1, Country country2) {
	        
	        return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
	    }
	 
	}
