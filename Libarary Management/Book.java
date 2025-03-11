public class Book {
     String title;
     String issn;
     Date publicationDate;
     Person author;
    
    public Book(String title, String issn, Date publicationDate, Person author) {
        this.title = title;
        this.issn = issn;
        this.publicationDate = new Date(publicationDate);
        this.author = new Person(author);
    }
    
    public Book(Book other) {
        this.title = other.title;
        this.issn = other.issn;
        this.publicationDate = new Date(other.publicationDate);
        this.author = new Person(other.author);
    }
    
    public void showBookDetails() {
        System.out.println("Title: " + title + ", ISSN: " + issn);
        System.out.print("Publication Date: ");
        publicationDate.showDate();
        author.showPersonDetails();
    }

	@Override
 	public boolean equals(Object obj){
		if(this == obj)
			return true;
		if(obj == null || getClass() != obj.getClass())
			return false;

		Book other = (Book) obj;
		return this.title.equals(other.title) && this.issn.equals(other.issn) && this.publicationDate.equals		(other.publicationDate) && this.author.equals(other.author);
	}


   public void setTitle(String title){
	this.title=title;
	}

   public String getTitle(){
	return title;
	}
   public void setIssn(String issn){
	this.issn=issn;
	}
   public void getIssn(){
	return issn;
	}
}