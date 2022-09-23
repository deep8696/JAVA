package workShop5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentSerialize {
	
	private static Scanner scannerOb;
	private static Student studentOb;

	public static void main(String[] args) {
		
		scannerOb  = new Scanner(System.in);

		boolean temp = addData();
		if(!temp) {
			System.out.println("Serialize Failed.");
		}
	}
	 
	public static boolean writeStudentInfo(ArrayList<Student> listOfStudents){
		boolean temp = true;

		try (FileOutputStream fOutput = new FileOutputStream("studentOutput.out");
				ObjectOutputStream oOut = new ObjectOutputStream(fOutput);) {
			
			oOut.writeObject(listOfStudents);

			oOut.close();
			fOutput.close();
			
		} catch (FileNotFoundException msg) {
			System.err.println(msg);
			temp = false;
			
		} catch (IOException msg) {
			msg.printStackTrace();
		}
		return temp;
	}
	
	public static boolean addData() {
		
		boolean temp = true;
		char check;
		ArrayList<Student> listOfStudents = new ArrayList<Student>();

		try {
			do {
				studentOb =  new Student();
				setStudentId();
				setName();
				setCourse();

				do {
					System.out.printf("Willing to add another student? Choose (Y or N) (Case Sensitive) : ");
					check = scannerOb.nextLine().trim().charAt(0);
					
					if(check != 'Y' && check != 'N') {
						System.out.println("Invalid Character please enter again.");
					}
					
				}while(check != 'Y' && check != 'N');
				listOfStudents.add(studentOb);
				
			}while(check == 'Y');

		} catch (Throwable msg) {
			System.err.println(msg);
			temp = false;
		}

		if(temp) {
			temp = writeStudentInfo(listOfStudents);
		}
		return temp;
	}

		public static void setStudentId() {
			
		int studentNo = -1;
		String stdID;

		System.out.println("Please enter student information.");

		do {
			System.out.print("Enter student number: ");
		
			try {
			
				stdID = scannerOb.nextLine().trim();
				studentOb.setStdID(stdID);
				studentNo = Integer.parseInt(stdID);
				
			}catch(Exception msg) {	
				System.out.println(msg.getMessage());
			}
			
		}while(studentNo == -1);
	}

	public static void setName() {
		String firstName = "", lastName = "";

		do {
			System.out.print("Please Enter firstName: ");
			firstName = scannerOb.nextLine();
			
			try {
				studentOb.setFirstName(firstName);
			
			}catch(Exception msg) {
				System.out.println(msg.getMessage());
			}
			
		}while(firstName.trim().isEmpty() || firstName.isEmpty());

		do {
			
			System.out.printf("Please Enter lastName: ");
			lastName = scannerOb.nextLine();
			
			try {
				studentOb.setLastName(lastName);
				
			}catch(Exception msg) {
				System.out.println(msg.getMessage());
			}		
		}while(lastName.trim().isEmpty() || lastName.isEmpty());
	}

	public static void setCourse() {
		String courseName;
		
		do {
			System.out.printf("Please enter course information OR 'q' For Quit (Case Sensitive) : ");
			courseName = scannerOb.nextLine();
			
			if(!courseName.equals("q")) {
				try{
					studentOb.setCourse(courseName);
				}catch(Exception msg) {
					System.out.println(msg.getMessage());
				}
			}
		} while(!courseName.equals("q"));

	}
}