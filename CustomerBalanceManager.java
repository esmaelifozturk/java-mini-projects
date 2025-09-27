
public class CustomerBalanceManager {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] customer = createCustomerArray();
		displayArray(customer);
		double[] balance = customerBalance();
		displayCustomerBalance(balance);
		double[] updatedBalance = updateBalance(balance);
		displayUpdatedBalance(updatedBalance);

	}
	
	public static String[][] createCustomerArray() {
		 String[][] customerArrray = {
		            {"W*** ***s", "Student"},
		            {"M*** ***e", "Student"},
		            {"S*** ***k", "Retired"},
		            {"A*** ***s", "Employed"},
		            {"J*** ***i", "Unemployed"},
		            {"R*** ***f", "Retired"},
		            {"A*** ***d", "Employed"}
		        };
		        return customerArrray;
	}
	
	public static void displayArray(String[][] customer) {
		for(int i=0; i<customer.length; i++) {
			for(int j=0; j<customer[i].length; j++) {
			System.out.print(customer[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public static double[] customerBalance() {
		double[] customerBalance = new double[7];
		for(int i=0; i<7; i++) {
		customerBalance[i] = (Math.random()*(100000-10000+1))+1000;
		}
		return customerBalance;
	}
	
	public static void displayCustomerBalance(double[] balance) {
		for(int i=0; i<balance.length; i++) {
			System.out.println("customer" + (i+1) + ":"  + " " + balance[i] + "$");
		}
	}
	
	public static double[] updateBalance(double[] balance) {
		double sum=0;
		double average = 0;
		for(int i=0; i<balance.length; i++) {
			sum+= balance[i];
		}
		average = sum/balance.length;
		for(int i=0; i<balance.length; i++) {
			if(balance[i] > average) {
				balance[i]*=1.02;
			}
		}
		return balance;
      
	}
	
	public static void displayUpdatedBalance(double[] updatedBalance) {
		System.out.println("updated account balances:");
        for (int i = 0; i < updatedBalance.length; i++) {
            System.out.println("customer " + (i + 1) + ": " + updatedBalance[i] + "$"); 
        }
	}
	

}
