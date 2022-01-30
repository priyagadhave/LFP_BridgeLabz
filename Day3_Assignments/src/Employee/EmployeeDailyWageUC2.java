package Employee;

public class EmployeeDailyWageUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int isfulltime = 1;
		    int wageperhr = 20;
		    int fulldayhr = 8;
		    double empcheck = Math.floor(Math.random() * 10) % 2;
		    if (empcheck == isfulltime)
		    {
		       int totalsalary = (wageperhr * fulldayhr);
		       System.out.println("Total Salary is" + totalsalary);
		    }
		    else
		    {
		       System.out.println("Salary is 0");
		    }

	}

}
