
public class CustomerInfoManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] customerInfos = new String[5][3];
		String[] jobStatus = new String[5];
		long[] accountBalances = new long[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<customerInfos.length; i++) {
			System.out.println("enter the name of the customer " + (i+1) + ":");
			String name = scan.nextLine();
			customerInfos[i][0] = getFirstName(name);
			System.out.println("enter the surname of the customer " + (i+1) + ":");
			customerInfos[i][1] = scan.nextLine();
			System.out.println("enter the gender (F/M) of the customer " + (i+1) + ":");
			String gender = scan.nextLine();
			while(!isValidGender(gender)) {
				System.out.println("invalid gender. please enter again: ");
				gender = scan.nextLine();
				
			}
			customerInfos[i][2] = gender.toUpperCase();
			
			jobStatus[i] = createCustomerJobState(scan, i);
			
			accountBalances[i] = customerBalance();
					
		}
		printCustomerInfo(customerInfos);
		
		displayJobStatus(jobStatus);
		displayCustomerBalance(accountBalances);
		
		updateBalances(accountBalances, jobStatus);
	    printUpdatedBalances(accountBalances);
	    
	    countGender(customerInfos);
	} 
		
		public static String getFirstName(String name) {
			String[] names = name.split(" ");
			return names[0]; 	
		}
		
		public static boolean isValidGender(String gender) {
			return gender.equalsIgnoreCase("F") || gender.equalsIgnoreCase("M");
		}
		
		public static void printCustomerInfo(String[][] customerInfos) {
			System.out.println("customers's informations: ");
			for(int i=0; i<customerInfos.length; i++) {
				 System.out.println("customer " + (i + 1) + ": " + customerInfos[i][0] + " " + customerInfos[i][1] + ", gender: " + customerInfos[i][2]);
			}
			}
			
			public static String createCustomerJobState(Scanner scan, int customerIndex) {
				int jobOption;
		        do {
		            System.out.println("Enter job status for customer " + (customerIndex + 1) + ": ");
		            System.out.println("1- student\n2- retired\n3- employed\n4- unemployed");
		            jobOption = scan.nextInt();
		            scan.nextLine(); 
		        } while (jobOption < 1 || jobOption > 4);

		        switch (jobOption) {
		            case 1:
		                return "student";
		            case 2:
		                return "retired";
		            case 3:
		                return "employed";
		            case 4:
		                return "unemployed";
		            default:
		                return ""; 
		        }
			
		}
			
			public static void displayJobStatus(String[] jobStatus) {
				System.out.println("job status information:");
		        for (int i = 0; i < jobStatus.length; i++) {
		            System.out.println("customer " + (i + 1) + ": " + jobStatus[i]);
		        }
		    
			}
			
			public static long customerBalance() {
				return (long) (Math.random()*(100000-10000+1)) + 10000;
			}
			
			public static void displayCustomerBalance(long[] accountBalances) {
				for(int i=0; i<accountBalances.length; i++) {
					System.out.println("customer " + (i + 1) + ": $" + accountBalances[i]);
				}
			}
			
		public static void updateBalances(long[] accountBalances, String[] jobStatus) {
			double totalBalance = 0;
			for(int i=0; i<accountBalances.length; i++) {
				totalBalance += accountBalances[i];
			}
			double averageBalance = totalBalance / accountBalances.length;
			
			for (int i = 0; i < accountBalances.length; i++) {
	            if (accountBalances[i] > averageBalance) {
	                accountBalances[i] *= 1.02; 
	            }
	            if (!jobStatus[i].equals("student") && !jobStatus[i].equals("retired")) {
	                accountBalances[i] *= 0.99; 
	            }
	        }
		}
		
		public static void printUpdatedBalances(long[] accountBalances) {
	        System.out.println("updated account balances:");
	        for (int i = 0; i < accountBalances.length; i++) {
	            System.out.println("customer " + (i + 1) + ": $" + accountBalances[i]);
	        }
	    }
		
		public static void countGender(String[][] customerInfos) {
			int maleCounter = 0;
			int femaleCounter = 0;
			for(int i=0; i<customerInfos.length; i++) {
				if(customerInfos[i][2].equals("M") ) {
					maleCounter++;
				}else if(customerInfos[i][2].equals("F")) {
					femaleCounter++;
				}
			}
			System.out.println("number of male customers: " + maleCounter);
			System.out.println("number of female customers: " + femaleCounter);
		}
}

}

