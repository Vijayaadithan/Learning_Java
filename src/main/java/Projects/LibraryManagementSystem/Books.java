package Projects.LibraryManagementSystem;

public class Books
{

    private String bookId;
    private String bookName;
    private String authorName;
    private boolean available=true;

    public Books(String bookId,String bookName,String authorName)
    {
        this.bookId=bookId;
        this.bookName=bookName;
        this.authorName=authorName;
    }

    public boolean isAvailable()
    {
        return this.available;
    }
    public String getBookName()
    {
        return this.bookName;
    }
    public String getAuthorName()
    {
        return this.authorName;
    }
    public String getBookId()
    {
        return this.bookId;
    }

    public void borrowBook()
    {
        available=false;
    }
    public void returnBook()
    {
        available=true;
    }
    @Override
    public String toString()
    {
        return "id : "+this.bookId+" Book Name : "+this.bookName;
    }




}
