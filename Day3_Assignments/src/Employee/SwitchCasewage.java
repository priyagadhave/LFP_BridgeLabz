package Employee;

public class SwitchCasewage {


	public static final int isfullTime= 1;
	public static final int ispartTime=2;
	public static final int workParHrRate=20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			int wages;
			int workPartTime=4;
			int workFullTime=8;


			System.out.println("Employee is presnt or Absent");
		    double empcheck = Math.floor(Math.random() * 10) % 3;

			switch((int)empcheck){    
		    //case statements within the switch block  
		    case 1:
		    	  wages= workFullTime*workParHrRate; 
		    	  System.out.println("Employee is Present and Wages is " + wages);
		    break;    
		    case 2:
		    	 wages= workPartTime*workParHrRate;
		    	 System.out.println("Employee is Present and wages is " + wages);

		    break;    
		    default:System.out.println("Employee is Absent");    
		    }    
		    //Printing month of the given number  


	}

}
