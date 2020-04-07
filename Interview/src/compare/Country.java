package compare;
import java.lang.Comparable;

public class Country implements Comparable<Country>{
    int countryId;
    String countryName;
   
   
    public Country(int countryId, String countryName) {
       // super();
        this.countryId = countryId;
        this.countryName = countryName;
    }
 
    public int getCountryId() {
        return countryId;
    }
 
   
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }
 
 
    public String getCountryName() {
        return countryName;
    }
 
 
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Override
	public int compareTo(Country country) {
		// TODO Auto-generated method stub
		return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
	}
   
}