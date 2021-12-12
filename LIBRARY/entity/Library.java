package entity;
import java.lang.*;
import interfaces.*;

public class Library implements IStudentOperations,ITeacherOperations,IBookOperations
{
      String libraryName;
      String address;
      Student students[];
      Teacher teachers[];
      Book books[ ];
      int noOfBooks;
      Librarian librarian;

      public void insertStudent(Student s)
      {

      };
      public void removeStudent(Student s)
      {

      };
      public Student getStudent(String studentId)
      {

      return students[0];

      }

      public void showAllStudents( )
      {

      };



      public void insertTeacher(Teacher t)
      {

      };
      public   void removeTeacher(Teacher t)
      {

      };
      public   Teacher getTeacher(String teacherId)
      {
          return teachers[5];
      };
      public   void showAllTeachers( )
      {

      };



    public void insertBook(Book b)
    {


      };
    public  void removeBook(Book b)
    {


      };
    public  Book getBook(int bookId)
    {

        return books[0];

      };
    public  void showAllBooks( )
    {


      };
}
