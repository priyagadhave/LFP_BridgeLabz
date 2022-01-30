package Employee;

public class EmployeePresentAbsentUC1 {

	public static void main(String[] args) {


		int isPresent=1;
		System.out.println("Employee is Present Or Absent");
		
		double checkEmp=(int)(Math.random()*10) % 2;
		
		if (isPresent == checkEmp) {
			System.out.println("Employee is Present");
			
		}else 
		{
			System.out.println("Employee is Absent");
	    }
	}
}
