package interfaces;

import java.lang.*;
import entity.*;

public interface IStudentOperations
{
  public void insertStudent(Student s);
  public void removeStudent(Student s);
  public Student getStudent(String studentId);
  public void showAllStudents( );

}
