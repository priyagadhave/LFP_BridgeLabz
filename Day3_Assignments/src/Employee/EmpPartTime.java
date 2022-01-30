package Employee;

public class EmpPartTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fullTime= 1;
		int partTime=2;
		int workPartTime=4;
		int workFullTime=8;
		int workParHrRate=20;
		System.out.println("Employee is Present or Absent");
		
		double checkEmp = Math.floor(Math.random() * 10) % 2;	
		if (partTime == checkEmp) {   
			int wages = workPartTime * workParHrRate;
			
			System.out.println("Employee is Present and Wages is " + wages);	
			
		}else if (fullTime == checkEmp)
		{
			int wages= workFullTime * workParHrRate;
			
			System.out.println("Employee is Present and Wages is " + wages);	
		}else {
			System.out.println("Employee is Absent");
		}

	}

}
