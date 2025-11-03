package Projects.Exception;
import java.util.*;
public class Main
{
    public static void main(String []args)
    {
        /*Scenario: A file cannot be more than 25 MB. If it exceeds the limit, throw a FileTooLargeException.
Requirements:
• Create FileTooLargeException extending Learning.oops.Exception.
• In FileUploader class, create uploadFile(String fileName, double fileSizeMB) method.
• Throw exception if file size > 25.
• In Learning.oops.Main class, upload files and handle exceptions.
Expected Output:
• Uploading report.pdf (12 MB)... → File uploaded successfully.
• Uploading movie.mp4 (30 MB)... → Error: File size exceeds the 25 MB limit.
Learning Outcome:
• Implement size-based validations with exceptions.

• Throw exceptions from a business logic layer.
• Understand checked exceptions for predictable validation errors.*/

        Scanner sc=new Scanner(System.in);

        FileUploader file1=new FileUploader();
        FileUploader file2=new FileUploader();
        try
        {
            file1.uploadFile("Report1.pdf",25);
            file2.uploadFile("Report2.pdf",30);
        }
        catch(FileTooLargeException e)
        {
                        System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Program Ends");
        }
    }

}
