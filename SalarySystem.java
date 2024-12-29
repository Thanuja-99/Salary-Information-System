import java.util.*;

class SalarySystem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("|                                     SALARY INFORMATION SYSTEM                                      |");
        System.out.println("-----------------------------------------------------------------------------------------------------");

        System.out.println(" ");
        System.out.println(" ");

        System.out.println("             [1] Calculate Income Tax ");
        System.out.println("             [2] Calculate Annual Bonus ");
        System.out.println("             [3] Calculate Loan Amont");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter an Option to Continue  > ");
        int num = scanner.nextInt();
        scanner.nextLine();

        double tax = 0;
        double bonus =0;
        
        int month=0;
        double loanAmount=0;
        double MonthlyInstallment=0;
        double annual_interest_rate;
        

        if (num == 1) {
            System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("|                                        Calculate Income Tax                                       |");
            System.out.println("-----------------------------------------------------------------------------------------------------");

            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Input Employee name     - ");
            String name = scanner.nextLine();

            System.out.print("Input Employee salary   -");
            double salary = scanner.nextDouble();

            if (salary < 100001) {
                System.out.println("NO Tax Is Charged to : " + salary);
            } else if (salary < 141667) {
                tax = salary * 0.06;
            } else if (salary < 183333) {
                tax = (salary - 141667) * 0.12 + 41667 * 0.06;
            } else if (salary < 225000) {
                tax = (salary - 183333) * 0.18 + 41667 * 0.06 + 41667 * 0.12;
            } else if (salary < 266667) {
                tax = (salary - 225000) * 0.24 + 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18;
            } else if (salary <= 308333) {
                tax = (salary - 266667) * 0.30 + 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24;
            } else {
                tax = (salary - 308333) * 0.36 + 41667 * 0.06 + 41667 * 0.12 + 41667 * 0.18 + 41667 * 0.24 + 41667 * 0.36;
            }

          
            
             System.out.println(" ");
             System.out.println(" ");
             System.out.println("You have to pay Income Tax per month: " + (int) tax);
        } 
        
        if (num == 2 ){
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("|                                        Calculate Annual Bonus                                      |");
            System.out.println("-----------------------------------------------------------------------------------------------------");

            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Input Employee name     - ");
            String name = scanner.nextLine();

            System.out.print("Input Employee salary   -");
            double salary = scanner.nextDouble();
            
            if(salary < 100000 ){
				
				bonus = 5000;
			}else if(salary < 200000 ){
				bonus=salary*0.1;
			}else if(salary < 300000 ){
				bonus = salary * 0.15;
			}else if (salary < 400000 ){
				bonus = salary * 0.20;
			}else {
				bonus = salary * 0.35;
			}
			
			 System.out.println(" ");
             System.out.println(" ");
             System.out.println("Annual Bonus  - " +  bonus);
        } 
        if(num == 3){
			
			System.out.println("-----------------------------------------------------------------------------------------------------");
            System.out.println("|                                        Calculate Loan Amount                                      |");
            System.out.println("-----------------------------------------------------------------------------------------------------");

            System.out.println(" ");
            System.out.println(" ");

            System.out.print("Input Employee name     - ");
            String name = scanner.nextLine();

            System.out.print("Input Employee salary   -");
            double salary = scanner.nextDouble();
			
			     
			if( salary < 50000 ){
				 System.out.println("You Can not get a loan because your salary lessthan Rs.50 000.00 ");
				 return;
				 
			 }else if( salary >= 50000 ){
				 
				 System.out.print("Enter Number of years  : " );
				 int year = scanner.nextInt();
			      
			      if(year>5){
					  System.out.println("You can't get a loan because your time is more than 5 years ");
					  return;
				  }else if(year <= 5){
					  
					  month = year *12;
					  MonthlyInstallment = salary *0.6;
					  annual_interest_rate=0.15/12;
					  
					  loanAmount = MonthlyInstallment * (1 - (1 / Math.pow(1 +  annual_interest_rate, month))) / ( annual_interest_rate);
				  }
			  }
			  loanAmount = Math.round(loanAmount / 1000.0) * 1000;
			  
			  System.out.println("You can get Loan Amount : "+loanAmount);
			  
			  
		  }
	  }
  }
					
	
