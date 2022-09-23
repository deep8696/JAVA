package workShop5;
import java.io.*;
import java.util.ArrayList;
public class Student2 
{
	@SuppressWarnings("unchecked")	
	public static void main(String[] args) 
	{	
		int noOfStudents = 1;
		ArrayList<Student> listOfStudents;
		try 
		{
			FileInputStream fInput = new FileInputStream("studentOutput.out");
			ObjectInputStream oInput = new ObjectInputStream(fInput);
			System.out.println("------------- Students Data -------------");
			listOfStudents = (ArrayList<Student>)oInput.readObject();
			if(listOfStudents != null) 
			{		
				for(Student ob:listOfStudents) 
				{					
					System.out.printf("Student %s%n",noOfStudents++);
					System.out.printf("%s%n",ob.toString());
				}
			}
			oInput.close();
			fInput.close();
		} 
		catch (Throwable err)
		{
			System.err.println(err);
		}
	}
}
