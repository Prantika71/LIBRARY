package entity;
import java.lang.*;

public class Student extends Patron
{
      String guardianName;
      String guardianContactNo;
  public    void setGuardianName(String guardianName)
      {
        this.guardianName=guardianName;
      }
    public  void setGuardianContactNo(String guardianContactNo)
      {
        this.guardianContactNo=guardianContactNo;
      }
  public    String getGuardianName()
      {
        return  guardianName;
      }
    public  String getGuardianContactNo()

      {
        return guardianContactNo;
      }

     void showInfo()
     {
       
     };

}
