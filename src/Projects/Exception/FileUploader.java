package Projects.Exception;
public class FileUploader
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

    public void uploadFile(String fileName,double fileSize) throws FileTooLargeException
    {
        System.out.print("Uploading "+fileName+" ("+fileSize+" MB)... -> ");
        if(fileSize>25)
        {
            throw new FileTooLargeException("File size exceeds the 25 MB limit.");
        }else {
            System.out.println("File uploaded successfully.");
        }
    }
}
