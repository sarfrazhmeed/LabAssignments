public class Library{
	private String name;
	private Book book;
	private Incharge incharge;
	private Staff staff;

	public Library(String name, Book book, Incharge incharge, Staff staff){
		setName(name);
		setBook(book);
		setIncharge(incharge);
		setStaff(staff);
	}

	public Library(Library other){
		this.setName(other.name);
		this.setBook(other.book);
		this.setIncharge(other.incharge);
		this.setStaff(other.staff);
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Library other = (Library) obj;
		return this.name.equals(other.name) && this.book.equals(other.book) && this.incharge.equals(other.incharge) && this.staff.equals(staff);
	}

	public String toString() {
		String formatedString = String.format("\n\n%70s\n\n" + "Book Details: \n%s\n" + "Incharge Details: 						     \n%s\n" + "Staff Details: \n%s",name, book, incharge, staff);
		return formatedString;
	}


	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}

	public void setBook(Book book){
		this.book = book;
	}
	public Book getBook(){
		return book;
	}

	public void setIncharge(Incharge incharge){
		this.incharge = incharge;
	}
	public Incharge getIncharge(){
		return incharge;
	}

	public void setStaff(Staff staff){
		this.staff = staff;
	}
	public Staff getStaff(){
		return staff;
	}

}