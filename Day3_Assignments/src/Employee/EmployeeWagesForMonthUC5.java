package Employee;

public class EmployeeWagesForMonthUC5 {

	public static final int isfullTime= 1;
	public static final int ispartTime=2;
	public static final int workParHrRate=20;
	public static final int numOfDays=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int wages;
		int PartTime=4;
		int FullTime=8;
		System.out.println("Given Employee Is Present Or Absent");

	for( int day=0; day<=numOfDays; day++) 
	{
		double empcheck = Math.floor(Math.random() * 10) % 3;
		switch((int)empcheck)
			{    
		    //case statements within the switch block  
			    case 1:
			    	  wages= FullTime * workParHrRate; 
			    	  System.out.println("Employee is Present and Wages is " + wages);
			    break;    
			    case 2:
			    	 wages= PartTime * workParHrRate;
			    	 System.out.println("Employee is Present and Wages is " + wages);

			    break;    
			    default:System.out.println("employee is apsent");    
		    }    
	}

	}

}
