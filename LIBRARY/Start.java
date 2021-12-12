import java.lang.*;
import entity.*;
import interfaces.*;
import java.util.Scanner;
import java.io.* ;
import files.*;
import java.util.* ;


public class Start
{
	public static void main(String[] args)
	{

        System.out.println("PLEASE ENTER AN OPTION:");
        System.out.println("1.	Student Management");
        System.out.println("2.	Teacher Management");
        System.out.println("3.	Book Management");
        System.out.println("4.	Borrow/ Lost management");
        System.out.println("5.	Exit");

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String option = myObj.nextLine();
        int opt=Integer.parseInt(option);

        switch(opt) {
  case 1:
    {
System.out.println("*********************************************************");
      System.out.println("1.Insert New Student");
      System.out.println("2.Remove Existing Student");
      System.out.println("3.Show All Student");
       option = myObj.nextLine();
       opt=Integer.parseInt(option);
      if (opt==1)
      {
				System.out.println("*********************************************************");
				System.out.println("PLEASE ENTER ALL INFO");
        System.out.println("*************************");
        System.out.println("Enter student ID:");
        String ID = myObj.nextLine();
        System.out.println("Enter student name:");
        String name = myObj.nextLine();
        System.out.println("Enter department name:");
        String departmentName = myObj.nextLine();
        System.out.println("Enter email:");
        String email = myObj.nextLine();
        System.out.println("Enter student contact no:");
        String contactNo = myObj.nextLine();
        System.out.println("Enter student address:");
        String address = myObj.nextLine();
        System.out.println("Enter amount:");
        String amt = myObj.nextLine();
        double amount=Double.parseDouble(amt);
        System.out.println("Enter student guardian name:");
        String guardianName = myObj.nextLine();
        System.out.println("Enter student guardian Contact No ");
        String guardianContactNo = myObj.nextLine();



  		if(!ID.isEmpty() && !name.isEmpty() && !departmentName.isEmpty() && !email.isEmpty() && !contactNo.isEmpty() && !address.isEmpty() && !amt.isEmpty() && !guardianName.isEmpty() && !guardianContactNo.isEmpty())
			{
				Student s= new Student();
				s.setId(ID);
				s.setName(name);
				s.setDepartmentName(departmentName);
				s.setEmail(email);
				s.setContactNo(contactNo);
				s.setAddress(address);
				s.setAmount(amount);
				s.setGuardianName(guardianName);
				s.setGuardianContactNo(guardianContactNo);
				Inputer fileObject = new Inputer() ;
				fileObject.createDirectory() ;
				fileObject.studentinput(s.getId(),s.getName(),s.getDepartmentName(),s.getEmail(),s.getContactNo(),s.getAddress(),s.getAmount(),s.getGuardianName(),s.getGuardianContactNo()) ;
			}
			else
			{
				System.out.println("*********************************************************");
					System.out.println("PLEASE INSERT ALL DATA PROPERLY AND  TRY AGAIN");
			}





      }


			else if(opt==3)
			{

				System.out.println("*********************************************************");
					Inputer fileObject = new Inputer() ;

					System.out.println(fileObject.allfile("Students.txt"));
			}


        break;
    }
  case 2:
      {

System.out.println("*********************************************************");

        System.out.println("1.Insert New Teacher");
        System.out.println("2.Remove Existing Teacher");
        System.out.println("3.Show All Teacher");
         option = myObj.nextLine();
         opt=Integer.parseInt(option);
        if (opt==1)

        {
					System.out.println("*********************************************************");
					System.out.println("PLEASE ENTER ALL INFO");
        System.out.println("*************************");
        System.out.println("Enter Teacher ID:");
        String ID = myObj.nextLine();
        System.out.println("Enter Teacher name:");
        String name = myObj.nextLine();
        System.out.println("Enter department name:");
        String departmentName = myObj.nextLine();
        System.out.println("Enter email:");
        String email = myObj.nextLine();
        System.out.println("Enter Teacher contact no:");
        String contactNo = myObj.nextLine();
        System.out.println("Enter Teacher address:");
        String address = myObj.nextLine();
        System.out.println("Enter amount:");
        String amt = myObj.nextLine();
        double amount=Double.parseDouble(amt);
        System.out.println("Enter Teacher office room no:");
        String ofc = myObj.nextLine();
        int officeRoomNo=0;

				while(officeRoomNo==0)
				{
					try
					{
						 officeRoomNo=Integer.parseInt(ofc);
					 }
				catch (NumberFormatException ex)
				{
					System.out.println("ERROR!IVALID  ROOM NO");
				 System.out.println("Please ENTER only Numerical value greater than 0:");
				 ofc = myObj.nextLine();
				 }

				}

        	if(!ID.isEmpty() && !name.isEmpty() && !departmentName.isEmpty() && !email.isEmpty() && !contactNo.isEmpty() && !address.isEmpty() && !amt.isEmpty() && !ofc.isEmpty())
					{

          Teacher  t = new  Teacher();
					Inputer fileObject = new Inputer() ;

        t.setId(ID);
        t.setName(name);
        t.setDepartmentName(departmentName);
        t.setEmail(email);
        t.setContactNo(contactNo);
        t.setAddress(address);
        t.setAmount(amount);
        t.setOfficeRoomNo(officeRoomNo);



        fileObject.createDirectory() ;
        fileObject.teacherinput(t.getId(),t.getName(),t.getDepartmentName(),t.getEmail(),t.getContactNo(),t.getAddress(),t.getAmount(),t.getOfficeRoomNo());
        }
				else

				{
					System.out.println("*********************************************************");
						System.out.println("PLEASE INSERT ALL DATA PROPERLY AND  TRY AGAIN");
				}
				}






				else if(opt==3)
				{

					System.out.println("*********************************************************");
					  Inputer fileObject = new Inputer() ;

						System.out.println(fileObject.allfile("Teachers.txt"));
				}


          break;
      }
  case 3:
      {
				 System.out.println("*********************************************************");
				System.out.println("1.Insert New Book");
	      System.out.println("2.Remove Existing Book");
	      System.out.println("3.Show All Book");
				option = myObj.nextLine();
				opt=Integer.parseInt(option);
			 if (opt==1)
			 {
				 System.out.println("*********************************************************");
				 System.out.println("PLEASE ENTER ALL INFO");
				 System.out.println("*************************");
				 System.out.println("Enter Book ID:");
				 String ID = myObj.nextLine();
				 int id=0;


					while(id==0)
					{
						try
						{
							id=Integer.parseInt(ID);
						 }
					catch (NumberFormatException ex)
					{
						System.out.println("ERROR!IVALID BOOK ID");
					 System.out.println("Please ENTER only Numerical value greater than 0:");
					 ID = myObj.nextLine();
					 }

					}



				 System.out.println("*************************");
				 System.out.println("Enter Book title:");
				 String title = myObj.nextLine();
				  System.out.println("*************************");
				 System.out.println("Enter subtitle:");
				 String subtitle = myObj.nextLine();
				  System.out.println("*************************");
				 System.out.println("Enter Author name:");
				 String authorName = myObj.nextLine();
				  System.out.println("*************************");
				 System.out.println("Enter publisher name:");
				 String publisherName = myObj.nextLine();
				  System.out.println("*************************");
				 System.out.println("Enter price:");
				 String amt = myObj.nextLine();
				 double price=Double.parseDouble(amt);
				  System.out.println("*************************");
				 System.out.println("Enter no of copy");
				 String ofc = myObj.nextLine();
				 int noOfCopy=Integer.parseInt(ofc);
				 System.out.println("*************************");



      	if	(!ID.isEmpty() && !title.isEmpty() && !subtitle.isEmpty() && !authorName.isEmpty() && !publisherName.isEmpty() && !amt.isEmpty() && !ofc.isEmpty())
      {
				 Book b = new Book();
				 b.setId(id);
				 b.setTitle(title);
				 b.setSubTitle(subtitle);
				 b.setAuthor(authorName);
				 b.setPublisher(publisherName);
				 b.setPrice(price);
				 b.setNoOfCopy(noOfCopy);
				 Inputer fileObject = new Inputer() ;
				 fileObject.createDirectory() ;
				 fileObject.bookinput(b.getID(),b.getTitle(),b.getsubTitle(),b.getAuthorName(),b.publisherName(),b.getPrice(),b.getNoOfCopy());

			 }


		 else

			{
				System.out.println("*********************************************************");
					System.out.println("PLEASE INSERT ALL DATA PROPERLY AND  TRY AGAIN");
			}
			}


			else if(opt==3)
			{

				System.out.println("*********************************************************");
				  Inputer fileObject = new Inputer() ;

					System.out.println(fileObject.allfile("Booklist.txt"));
			}


            break;
      }
  case 4:
      {
        System.out.println("working 4");
        break;
      }
  case 5:
        {
            System.out.println("working 5");
            break;
        }





}


	}
}
