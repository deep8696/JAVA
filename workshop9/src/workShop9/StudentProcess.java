package workShop9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentProcess {

	// task 1 Complete Student list
	public static void task1(List<Student> studentList) {
		
		System.out.println("Task 1\n");
		System.out.println("Complete Student list:");		
		studentList.forEach(System.out::println);
	}
	
	// task 2 Students who got 50.0-100.0 sorted by grade
	public static void task2(List<Student> studentList) {		
		System.out.println("\nTask 2\n");
		System.out.println("Students who got 50.0-100.0 sorted by grade:");			
		studentList.stream().filter(student -> student.getGrade() >= 50) 
        .sorted(Comparator.comparing(Student::getGrade)) 
        .forEach(System.out::println);
	}

	// task 3 First Student who got 50.0-100.0
	public static void task3(List<Student> studentList) {	
		System.out.println("\nTask 3\n");
		System.out.println("First Student who got 50.0-100.0:");		
		System.out.println(StudentProcess.GradeR(studentList, 50, 100).get(0));
	}
	
	// task 4 Students in ascending and descending order by last name then first
	public static void task4(List<Student> studentList) {
		
		System.out.println("\nTask 4\n");
		
		//ascending
		System.out.println("Students in ascending order by last name then first:");
		studentList.stream()
    	.sorted(Comparator.comparing(Student::getFirstName))
    	.sorted(Comparator.comparing(Student::getLastName)) 
    	.forEach(System.out::println);
		
		//descending
		System.out.println("\nStudents in descending order by last name then first:");
		studentList.stream()
    	.sorted(Comparator.comparing(Student::getFirstName).reversed()) 
    	.sorted(Comparator.comparing(Student::getLastName).reversed()) 
    	.forEach(System.out::println);
	}
	
	// task 5 Unique Student last names
	public static void task5(List<Student> studentList) {
		
		System.out.println("\nTask 5\n");
		System.out.println("Unique Student last names:");				
		studentList.stream().map(Student::getName).distinct().sorted();
		StudentProcess.uniqueLastName(studentList).forEach(System.out::println);
	}


	

	// task 6 Student names in order by last name then first name
	public static void task6(List<Student> studentList) {
		
		System.out.println("\n\nTask 6\n");
		System.out.println("Student names in order by last name then first name:");

		Stream<Student> studentStream = studentList.stream()
		.sorted(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));
		studentStream.map(student -> student.getFirstName() + " " + student.getLastName()).forEach(System.out::println);
	}
	
	// task 7 Students by department
	public static void task7(List<Student> studentList) {
		
		System.out.println("\n\nTask 7\n");
		System.out.println("Students by department:");

		studentList
        .stream()
        .collect(Collectors.groupingBy(Student::getDepartment))
        .forEach((student, list) -> {System.out.println(student);
        list.forEach(department -> System.out.println("\t" + department));
        });
	}
	
	
	// task 8 Count of Students by department
	public static void task8(List<Student> studentList) {
	
		System.out.println("\n\nTask 8\n");
		System.out.println("Count of Students by department:");
		
		 studentList
     	.stream()
     	.collect(Collectors.groupingBy(Student::getDepartment))
     	.forEach((department, list) -> {System.out.println(String.format("%s has %d Student(s)", department, list.size()));
     	});
	}
	
	// task 9 Sum of Students' grades
	
	public static void task9(List<Student> studentList) {
		System.out.println("\n\nTask 9\n");	
		Stream<Student> studentStream = studentList.stream();	
		System.out.println("Sum of Students' grades: " + studentStream.mapToDouble(Student::getGrade).sum());
			
	}

	// task 10 Average of Students' grades
	public static void task10(List<Student> s) {
		System.out.println("\n\nTask 10");
		Stream<Student> stStream = s.stream();
		System.out.printf("Average of Students' grades: %.2f",
		stStream.mapToDouble(Student::getGrade).average().getAsDouble());
		
	}


	public static List<String> uniqueLastName(List<Student> sList) {
		return sList.stream().map(stu -> stu.getName().split(" ")).map(stdName -> stdName[1]).distinct()
				.collect(Collectors.toList());
	}
	
	public static List<Student> GradeR(List<Student> stdList, double lowGrade, double highGrade) {
		return stdList.stream().filter(s -> s.getGrade() >= lowGrade && s.getGrade() <= highGrade)
				.collect(Collectors.toList());
	}

}