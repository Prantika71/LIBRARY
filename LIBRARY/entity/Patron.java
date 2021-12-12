package entity;
import java.lang.*;
import interfaces.*;
abstract class Patron implements IBasicOperations
{
    String ID;
    String name;
    String departmentName;
    String email;
    String contactNo;
    String address;
    double amount;
  public  void setId(String id)
    {
      this.ID=  id;
    }
  public  void setName(String name)
  {
    this.name=name;

  }
  public  void setDepartmentName(String departmentName)
  {
    this.departmentName=departmentName;
  }
  public  void setEmail(String email)
  {
    this.email=email;
  }
  public  void setContactNo(String contactNo)
  {
    this.contactNo=contactNo;
  }
  public  void setAddress(String address)
  {
    this.address=address;
  }
  public  String getId()
  {
    return ID;
  }
  public  void setAmount(double amount)
  {
      this.amount=amount;
  }
  public  String getName()
  {
    return name;
  }
  public  String getDepartmentName()
  {
    return departmentName;
  }
  public  String getEmail()
  {
    return email;
  }
  public  String getContactNo()
  {
    return contactNo;
  }
  public  String getAddress()
  {
    return address;
  }
  public  double getAmount()
  {
    return amount;
  }
  abstract void showInfo();



  public void borrow(Patron p, Book b)
  {

  };
  public  void returns(Patron p, Book b)
  {

  };
  public void fine(Patron p, double amount)
  {

  };




}
