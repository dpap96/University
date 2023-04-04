//Ìåôáğôõ÷éáêïß öïéôçôİò-ÕĞÏÊËÁÓÇ
public class GraduateStudent  extends Student{
	private String supervisor;
	
	
//Constructor base to SuperClass
	public GraduateStudent(String name, String dept,String s) {
		super(name, dept);
		supervisor=s;
	}
//ÅĞÉÊÁËÕØÇ ÌÅÈÏÄÏÕ ÕĞÅÑÊËÁÓÇÓ	
	public void printInfo() {
		super.printInfo();
		System.out.println("Supervisor:"+supervisor);
	}
	public void printType() {
		System.out.println("Hi am i a Graduate Student! :)");
	}
	
	
	
	
	
	
}
