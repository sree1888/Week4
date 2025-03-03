class book{
	// declaring variables
	String title_of_book,author_name;
	int year_of_publication;
	// constructor
	book(String title_of_book,String author_name,int year_of_publication){
	this.title_of_book=title_of_book;
	this.author_name=author_name;
	this.year_of_publication=year_of_publication;
	System.out.println("Name of the book is"+title_of_book+"Author name"+author_name+"published on"+year_of_publication);
	}
	//method
	public void display(){
	System.out.println();
	}
	//creating object
	public static void main(String[] args){
	book book1=new book("Art of letting go","Ram",2006);
	book1.display();
	book book2=new book("To good to be true","Prajaktha",2020);
	book2.display();
	System.out.println("Sree durga rollno.20");
}
}
