import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students= new ArrayList<Student>(); //Arraylist ��� ����� ���� �������� 
//���������� �������� ���������� ��� ����������		
		Student s1= new UndergraduateStudent("John","Economics",2016); //��������
		Student gs1= new GraduateStudent("Nick","Applied Informatics","Lenon"); //��������
		Student gs2= new GraduateStudent("Mary","Informatics","Mike"); //��������
		 
//�������� ���� ���� ���������	
		students.add(s1);
		students.add(gs2);
		students.add(gs1);
//�������� ��� ���� ArrayList		
		for(Student s:students)
			s.printInfo(); //�� ������ � printInfo() �������� �� ��� ����������� ���������� � ���������.
		

		for(Student s:students)
			s.printType();
		
		
		
		
		
		
		
	}

}
