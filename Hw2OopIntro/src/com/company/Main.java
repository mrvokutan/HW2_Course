package com.company;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course (1,"C# Angular","Engin Hoca" );		
		
		Course course2 = new Course (2,"Java React", "Kerem Hoca" );
				
		Course course3 = new Course(3,"Programlamaya Giriş İçin Temel Kurs", "Selim Hoca");
		
		
		
		Course[] courses = {course1, course2, course3};
		
		for ( Course course : courses) {
			
			System.out.println(course.id);
			
			
		}
		
		
		CourseManager courseManager = new CourseManager ();
		courseManager.addingCourses(course1);
		courseManager.addingCourses(course2);
		courseManager.addingCourses(course2);
		
}
}
