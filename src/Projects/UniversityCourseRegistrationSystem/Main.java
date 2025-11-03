package Projects.UniversityCourseRegistrationSystem;
import java.util.*;
public class Main
{

    public static void main(String[]args)
    {

        /*Assignment 4: University Course Registration System

        Design a `Person` class with fields: `name`, `email`, `age`. Derive `Student` and `Professor`
        classes. `Student` should have `studentId`, `courseList`; `Professor` should have `subjectTaught`,
`employeeId`. Use encapsulation to manage all fields. Implement methods to register students to a
        course and list them. Simulate registration using a `Course` class.*/
        /*Scanner sc= new Scanner(System.in);

        //Creating a Professor
        Professor professor1=new Professor("Murugesan","murugesan@gmail.com",30,"Computer Science","P1");


        //creating a course
        Course course=new Course("Computer Science","CS1",professor1);

        //Creating Student
        Student s1=new Student("Vijay","vijay@gmail.com",22,"166");
        Student s2=new Student("RD","RD@gmail.com",22,"123");

        s1.registerCourse(course);
        s2.registerCourse(course);

        course.listStudents();*/
        Scanner sc=new Scanner(System.in);
        List<Student> students =new ArrayList<>();
        List<Professor>professors=new ArrayList<>();
        List<Course>courses=new ArrayList<>();
        System.out.println("\n------University Course Registration System------");
        while(true)
        {
            System.out.println("\n1. Add Student");
            System.out.println("2. Add Professor");
            System.out.println("3. Create Course");
            System.out.println("4. Register Student to Course");
            System.out.println("5. List Students in a Course");
            System.out.println("6. Exit");
            System.out.print("Enter you choice : ");
            int choice=sc.nextInt();
            sc.nextLine();

            switch (choice)
            {
                case 1://Add Student
                    System.out.print("Enter Student name: ");
                    String sname=sc.nextLine();

                    System.out.print("Enter email: ");
                    String semail=sc.nextLine();

                    System.out.print("Enter Age: ");
                    int sage=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    String sid=sc.nextLine();

                    Student stud=new Student(sname,semail,sage,sid);
                    students.add(stud);
                    System.out.println("Student Added Successfully");
                    break;

                case 2://Add Professor
                    System.out.print("Enter Professor name: ");
                    String pname=sc.nextLine();

                    System.out.print("Enter email: ");
                    String pemail=sc.nextLine();

                    System.out.print("Enter Age: ");
                    int page=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Subject Taught: ");
                    String subject=sc.nextLine();

                    System.out.print("Enter Employee ID: ");
                    String pid=sc.nextLine();

                    Professor professor=new Professor(pname,pemail,page,subject,pid);
                    professors.add(professor);
                    System.out.println("Professor Added Successfully");
                    break;

                case 3://Create Course
                    if(professors.size()==0)
                    {
                        System.out.println("No Professors available. Please add a professor first");break;
                    }
                    System.out.print("Enter Course Name: ");
                    String cname=sc.nextLine();

                    System.out.print("Enter Course Code: ");
                    String ccode=sc.nextLine();

                    System.out.println("Select Professor");
                    for(int i=0;i<professors.size();i++)
                    {
                        System.out.println((i+1)+". "+professors.get(i).getName());
                    }

                    int pchoice=sc.nextInt();
                    Professor choosenProf=professors.get(pchoice-1);

                    Course course=new Course(cname,ccode,choosenProf);
                    courses.add(course);
                    System.out.println("Course created Successfully");
                    break;

                case 4:

                    if(students.size()==0||courses.size()==0)
                    {
                        System.out.println("Add students and courses first!");
                        break;
                    }

                    System.out.print("Select Student: ");

                    for(int i=0;i<students.size();i++)
                    {
                        System.out.print((i+1)+". "+students.get(i).getName()+" ");
                    }
                    System.out.println();

                    System.out.print("Enter your choice:");
                    int schoice=sc.nextInt();

                    Student choosenStudent=students.get(schoice-1);

                    System.out.println("Select Course:");

                    for(int i=0;i<courses.size();i++)
                    {
                        System.out.print((i+1)+". "+courses.get(i).getCourseName() +" ");
                    }
                    System.out.println();
                    System.out.print("Enter your choice:");
                    int cchoice=sc.nextInt();

                    Course choosenCourse=courses.get(cchoice-1);

                    choosenStudent.registerCourse(choosenCourse);
                    System.out.println("Student registered to course successfully!");
                    break;

                case 5://List Students

                    if(courses.size()==0 || students.size()==0)
                    {
                        System.out.println("Add Courses and Students First!");
                        break;
                    }

                    System.out.println("Select Course: ");

                    for(int i=0;i<courses.size();i++)
                    {
                        System.out.print((i+1)+". "+courses.get(i).getCourseName()+" ");
                    }
                    System.out.println();
                    System.out.print("Enter your choice:");
                    int ccchoice=sc.nextInt();
                    courses.get(ccchoice-1).listStudents();
                    break;

                case 6:
                    System.out.println("Exiting system... Goodbye.!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice,Try again..!");
                    break;

            }


        }


    }

}
