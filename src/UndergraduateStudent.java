//пяоптувиайои жоитгтес-упойкасг
public class UndergraduateStudent extends Student {
	protected int year;

	public UndergraduateStudent(String name, String dept,int y) {
		super(name, dept);
		year=y;

	}
@Override
	public void printInfo() {
		super.printInfo();
		System.out.println("Year: "+year);
		
	}
	public  void printType() {
		System.out.println("Hi am i an Under graduate Student! :)");
	}
	

}
