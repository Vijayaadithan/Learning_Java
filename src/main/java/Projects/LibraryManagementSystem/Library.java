package Projects.LibraryManagementSystem;
import java.util.*;

public class Library
{

    private List<Books> books=new ArrayList<>();
    private List<Member> members=new ArrayList<>();

        public void addBook(Books book)
        {
            books.add(book);
        }
        public void addMember(Member member)
        {
            members.add(member);
        }

        public void listAllBooks()
        {
            for (Books b : books) {
                System.out.println(b);
            }
        }

}
