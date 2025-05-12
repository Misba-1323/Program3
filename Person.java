//package Program3;

import java.time.LocalDate; 
import java.time.Period; 
import java.time.format.DateTimeFormatter; 

public class Person {

String name; 
LocalDate dob; 
public Person(String name, String dobStr) { 
this.name = name; 
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
this.dob = LocalDate.parse(dobStr, formatter); 
} 
public void displayPerson() { 
System.out.println("Person Name: " + name); 
Period age = Period.between(dob, LocalDate.now()); 
System.out.println("Person Age: " + age.getYears()); 
} 
}

