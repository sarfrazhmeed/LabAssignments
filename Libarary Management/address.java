public class Address{
	String street;
	String city;

	public Address(String street,String city){
	this.street=street;
	this.city=city;
	
	}
	public Address(Address other){
	this.street=other.street;
	this.city=other.city;
	
	}


	public void showAddress(){}

	}

	@override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;	
		
		Address other = (Address) obj;
		return  this.street.equals(other.street) && this.city.equals(other.city);
	}

	public String toString(){
		return street + " , " + city ;
	}
	

	public void setStreet(String street){
	
		this.street=street;
	}
	
	
	public void setCity(string city){
		this.city=city;
	}

	public String getStreet(){
		return street;
	}

	public String getCity(){
		return city;
	}
	
}
