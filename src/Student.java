//цЕМИЙА ОИ ЖОИТГТЕР-упеяйкасг---дем хекы олыс ма дглиоуяцгсы амтийеилема аутгс.аяа ха тгм ояисы ыс ажгяглемг-ABSTRACT
//диоти дем пяойеитаи ма дглиоуяцгсы амтийеилемо аутгс тгс йкасгс
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
	public abstract void printType(); //SOS- ABSTRACT леходос !ояифы тгм упоцяажг тгс еды
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
