package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class ClassRoom {

	static  ArrayList<Student> students  = new ArrayList(TechConnect.getStudents());
	
	static  ArrayList<Instructor> instructors  = new ArrayList(ZipCodeWilmington.getInstructors());
	
	public HashMap<String, Person> getRoster() {
		
		HashMap<String, Person> roster = new HashMap<String, Person>();
		
		for (int i= 0; i < students.size(); i++) {
			
		roster.put(students.get(i).getName(), students.get(i));
		
		}
		for (int i = 0; i < instructors.size(); i++) {
			
			roster.put(instructors.get(i).getName(), instructors.get(i));
			
		}
		return roster;
		
	}
}
