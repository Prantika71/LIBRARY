package files;
import java.io.* ;
import java.lang.* ;


public class Inputer
{
	File folder ;  // to create a folder or a
	File file ;    // to create a text file
	private FileWriter writer ; // to write in a file
	private FileReader reader ; // to read from file
	private BufferedReader buffer ; // to read content from file

	public void createDirectory()
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/

		try{
			folder = new File("C:/temp") ; // path defining for creating the folder
			folder.mkdir() ;  // create the folder

		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}
	}


	public void studentinput(String ID,String name,String departmentName,String email,String contactNo,String address,Double amount,String guardianName,String guardianContactNo)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("Students.txt") ; // Sample.txt name is given for constructing the file .

			file.createNewFile() ; //If the file does not exists, creates and opens the file. else, just opens the file

			writer = new FileWriter(file, true) ; /*Constructs a FileWriter object given a file name with a boolean
							indicating whether or not to append the data written. as true has been passed so the file is appendable */

			writer.write(ID+"   "+name+"   "+departmentName+"   "+email+"   "+contactNo+"   "+address+"   "+amount+"   "+guardianName+"   "+guardianContactNo+"\r\n") ; //writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush() ;         //After writing, we need to flush to indicate that we have completed writing.
			writer.close() ;

		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}

	public void teacherinput(String ID,String name,String departmentName,String email,String contactNo,String address,Double amount,int officeRoomNo)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("Teachers.txt") ; // Sample.txt name is given for constructing the file .

			file.createNewFile() ; //If the file does not exists, creates and opens the file. else, just opens the file

			writer = new FileWriter(file, true) ; /*Constructs a FileWriter object given a file name with a boolean
							indicating whether or not to append the data written. as true has been passed so the file is appendable */

			writer.write(ID+"   "+name+"   "+departmentName+"   "+email+"   "+contactNo+"   "+address+"   "+amount+"   "+officeRoomNo+"\r\n") ; //writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush() ;         //After writing, we need to flush to indicate that we have completed writing.
			writer.close() ;

		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}



	public void bookinput(int id,String title,String subtitle,String authorName,String publisherName,Double price,int noOfCopy)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("Booklist.txt") ; // Sample.txt name is given for constructing the file .

			file.createNewFile() ; //If the file does not exists, creates and opens the file. else, just opens the file

			writer = new FileWriter(file, true) ; /*Constructs a FileWriter object given a file name with a boolean
							indicating whether or not to append the data written. as true has been passed so the file is appendable */

			writer.write(id+"   "+title+"   "+subtitle+"   "+authorName+"   "+publisherName+"   "+price+"   "+noOfCopy+"\r\n") ; //writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush() ;         //After writing, we need to flush to indicate that we have completed writing.
			writer.close() ;

		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;

		}
	}


	public String allfile(String filename)
	{
				/*
			reading from a file genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/

		String content = null;
    File file = new File(filename); // For example, foo.txt
    FileReader reader = null;

    try {
        reader = new FileReader(file);
        char[] chars = new char[(int) file.length()];
        reader.read(chars);
        content = new String(chars);
        reader.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    return content;

	}

}
