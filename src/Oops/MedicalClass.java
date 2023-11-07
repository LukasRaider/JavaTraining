package Oops;

public class MedicalClass implements Student{

	
	public void displayName() {
		// TODO Auto-generated method stub
		System.out.println("Hi we are from Medical Department");
	}

	
	public void getStudentNumber() {
		// TODO Auto-generated method stub
		System.out.println("We are 140 Students");
	}

	
	public void getStandard() {
		// TODO Auto-generated method stub
		System.out.println("We are from MEDS");
	}

	public void getUniversity() {
		System.out.println("University name is London university");
	}
	
	public static void main(String[] args) {
		
		EngineeringClass eng = new EngineeringClass();
		MedicalClass med = new MedicalClass();
		
		eng.displayName();
		eng.getStandard();
		eng.getStudentNumber();
		eng.getUniversity();
		
		System.out.println("xxxxxxxxxxxxx");
		
		med.displayName();
		med.getStandard();
		med.getStudentNumber();
		med.getUniversity();
	}


	@Override
	public void getInterfaceName() {
		// TODO Auto-generated method stub
		
	}
}
