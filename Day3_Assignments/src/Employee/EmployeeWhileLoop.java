package Employee;

public class EmployeeWhileLoop {
	
	public static final int isfullTime= 1;
	public static final int ispartTime=2;
	public static final int workParHrRate=20;
	public static final int numOfDays=20;
	public static final int maxHrsInMonths=100;

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		int empHours=0, totalEmpHrs=0, totalWorkingDays=0;
		while( totalEmpHrs <= maxHrsInMonths &&  totalWorkingDays < numOfDays ) {
			totalWorkingDays++;
			int empcheck =(int) Math.floor(Math.random() * 10) % 3;

			switch(empcheck)
			{    
		    //case statements within the switch block  
			    case 1:
			    	empHours=8; 
			    break;    
			    case 2:
			    	empHours=4;   	 
			    break;    
			    default:empHours=0;     
		    } 
			totalEmpHrs += empHours;
			System.out.println("Day : " +totalWorkingDays  + " Emp Hours: " +empHours);
		}

		int totalEmpWages= totalEmpHrs*workParHrRate;
		System.out.println("Total Emp Wages: " + totalEmpWages);
	

	}

}
