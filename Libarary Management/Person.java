public class Person{
	
	String name;
	String role
	Address address;


	public Person(string name,string role,Address address){
		this.name=name;
		this.role=role;
		this.address=address;
	}
	
	public Person(Address other){
		this.name=other.name;
		this.role=other.role;
		this.address=other.address;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Person other = (Person) obj;
		return this.name.equals(other.name) && this.address.equals(other.address);
	
	}
    public void showPersonDetails() {
        System.out.println("Name: " + name + ", Role: " + role);
        address.showAddress();
    }
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setrole(String role){
		this.role = role;
	}
	public String getrole(){
		return role;
	}


}