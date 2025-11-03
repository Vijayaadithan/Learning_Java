package Projects.LibraryManagementSystem;

import Learning.oops.Inheritance.Parent;

public class Student extends Member
{
    private int booksBorrowed=0;
    private static final int MAX_BOOKS=3;

    Student(int id,String name)
    {
        super(id,name);
        //this.name=name;
        //this.id=id;
    }


    @Override
    public void borrowBook(Books book)
    {
        if(this.booksBorrowed<MAX_BOOKS)
        {
            if(book.isAvailable()) {
                book.borrowBook();
                this.booksBorrowed++;
                System.out.println(name + " Borrowed " + book);
            }
            else {
                System.out.println("Book is not available right now!!!");
            }
        }
        else {
            System.out.println("Maximum borrowed books limit reached");
        }
    }
    @Override
    public void returnBook(Books book)
    {
        book.returnBook();
        this.booksBorrowed--;
        System.out.println(name+" Returned "+ book);
    }
}
