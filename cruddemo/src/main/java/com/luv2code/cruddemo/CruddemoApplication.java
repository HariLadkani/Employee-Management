package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
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

}
