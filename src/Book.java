

public class Book
{
  private int bookId;
  private int publicationId;
  
  public Book()
  {
	  
  }
  public Book(int bookId,int publicationId)
  {
	  this.bookId=bookId;
	  this.publicationId=publicationId;
  }
  protected void showBookDetails()
  {
	  System.out.println("The book id is:"+bookId);
	  System.out.println("The publication id is: "+publicationId);
  }
  void readBook(String bookName)
  {
	  System.out.println("i am reading book yayati");
  }
 }
 class TextBook extends Book
 {
	private String subject;
	private int numberOfPages;
	
	public TextBook()
	{
		
	}
	public TextBook(String subject,int pages)
	{
		super(100,500);
		this.subject=subject;
		numberOfPages=pages;
	}
	public void showTextBookdetails()
	{
		System.out.println("The subject of the book is:"+subject);
		System.out.println("The number of pages are:"+numberOfPages);
	}
	void readBook(String bookName)
	{
		super.readBook("yayati");
		System.out.println("i am reading book "+bookName);
	}
 }
 class English extends TextBook
 {
	 private String autherName;
	 private int cost;
	 
	 public English()
	 {
		 
	 }
	 public English(String autherName,int cost)
	 {
		 
		this.autherName=autherName;
		this.cost=cost;
	 }
	 public void showEnglishDetails()
	 {
		 System.out.println("Auther name is:"+autherName);
		 System.out.println("The cost is:"+cost);
		 
	 }
	 void readBook(String bookName)
	 {
		 super.readBook("Indira");
		 System.out.println("i am reading book "+bookName);
	 }
	 
	 
 }