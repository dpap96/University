//������ �� ��������-���������---��� ���� ���� �� ����������� ����������� �����.��� �� ��� ����� �� ���������-ABSTRACT
//����� ��� ��������� �� ����������� ����������� ����� ��� ������
public abstract class Student {

	protected String name;
	protected String dept;
	
//Constructor
	public Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
//Printing
	public void printInfo() {
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
		
	}
	public abstract void printType(); //SOS- ABSTRACT ������� !����� ��� �������� ��� ���
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
