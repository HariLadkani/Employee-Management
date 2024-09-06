package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			//read student
			//queryForStudentsByLastName(studentDAO);
			//createMultipleStudent(studentDAO);

			updateStudent(studentDAO);
		};
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("kumari");
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		//get a list of students
		List<Student> theStudents = studentDAO.findAll();
		for (Student tempStudent: theStudents) {
			System.out.println(tempStudent);
		}

		//display list of students

	}

	private void readStudent(StudentDAO studentDAO) {
		System.out.println("Creating a student object....");
		Student tempStudent = new Student("newHari", "kumari", "hariladkani0@gmail.com");

		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		int theid = tempStudent.getId();
		System.out.println("Savedthe student with id " + theid);


		System.out.println("Retrieving the student with id");
		Student myStudent = studentDAO.findById(theid);
		System.out.println("Founf the student " +  myStudent );
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		System.out.println("Creating 3 student objects....");
		Student tempStudent1 = new Student("savanti", "kumari", "hariladkani0@gmail.com");
		Student tempStudent2 = new Student("raja", "kumar", "hariladkani0@gmail.com");
		Student tempStudent3 = new Student("Devi", "kumari", "hariladkani0@gmail.com");

		System.out.println("saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Creating a student object....");
		Student tempStudent = new Student("Hari", "Lal", "hariladkani0@gmail.com");

		//save object
		System.out.println("saving the student object");
		studentDAO.save(tempStudent);


		System.out.println("Saved student with id: " + tempStudent.getId());
		//display id of saved object

	}

	public void updateStudent(StudentDAO studentDAO) {
		//retrive on id
		int studentId = 1;
		Student theStudent = studentDAO.findById(studentId);
		theStudent.setFirstName("Scooby");
		studentDAO.update(theStudent);

	}



}
