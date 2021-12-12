package entity;
import java.lang.*;

public class Librarian
{
private  String name;
private  int LibrarianId;
private  double salary;
private  int age;
public  void setName(String name)
{
  this.name=name;
}
public  void setID(int nid)
{
  this.LibrarianId=nid;
}
public  void setSalary(double salary)
{
  this.salary=salary;

}
public  void setAge(int age)
{
  this.age=age;
}
public  String getName( )
{
  return name;
}
public  int getID( )
{
  return LibrarianId;
}
public  double getSalary( )
{
  return salary;
}
public  int getAge( )
{
  return age;
}
public  void generateFine(Patron P, double amount)
{

}


}
