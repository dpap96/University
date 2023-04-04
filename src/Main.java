import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students= new ArrayList<Student>(); //Arraylist για ολους τους φοιτητες 
//ΔΗΜΙΟΥΡΓΙΑ ΦΟΙΤΗΤΩΝ ΥΠΕΡΚΛΑΣΗΣ ΚΑΙ ΥΠΟΚΛΑΣΕΩΝ		
		Student s1= new UndergraduateStudent("John","Economics",2016); //ΥΠΟΚΛΑΣΗ
		Student gs1= new GraduateStudent("Nick","Applied Informatics","Lenon"); //ΥΠΟΚΛΑΣΗ
		Student gs2= new GraduateStudent("Mary","Informatics","Mike"); //ΥΠΟΚΛΑΣΗ
		 
//ΠΡΟΣΘΗΚΗ ΣΤΗΝ ΔΟΜΗ ΔΕΔΟΜΕΝΩΝ	
		students.add(s1);
		students.add(gs2);
		students.add(gs1);
//ΔΙΑΤΡΕΧΩ ΤΗΝ ΔΟΜΗ ArrayList		
		for(Student s:students)
			s.printInfo(); //θα κληθεί η printInfo() αναλόγως αν εχω αντικειμενο υπερκλάσης ή υποκλάσης.
		

		for(Student s:students)
			s.printType();
		
		
		
		
		
		
		
	}

}
