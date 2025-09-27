
public class EmployeeWorkHours {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] weeklyHours = createHours();
		displayWeeklyHours(weeklyHours);
		int[] totalHours = calculateTotalHours(weeklyHours);
		displayOver30Hours(totalHours);

	}
	
	public static int[][] createHours() {
		int[][] hours = new int[8][7];
		for(int i=0; i<hours.length; i++) {
			for(int j=0; j<hours[i].length; j++) {
				hours[i][j] = (int)(Math.random()*9)+1; 
			}
		}
		return hours;
	}
	
	public static void displayWeeklyHours(int[][] weeklyHours) {
		System.out.println("employees' weekly work hours: ");
		for(int i=0; i<weeklyHours.length; i++) {
			System.out.print("Employee " + (i+1) + ": ");
			for(int j=0; j<weeklyHours[i].length; j++) {
				System.out.print(weeklyHours[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[] calculateTotalHours(int[][] weeklyHours) {
		int[] totalHours = new int[weeklyHours.length];
		for(int i=0; i<weeklyHours.length; i++) {
			int sum = 0;
			for(int j=0; j<weeklyHours[j].length; j++) {
				sum += weeklyHours[i][j];
			}
			totalHours[i] = sum;
		}
		return totalHours;
	}
	
	public static void displayOver30Hours(int[] totalHours) {
		System.out.println("Employees who work more than 30 hours: ");
		for(int i=0; i<totalHours.length; i++) {
			if(totalHours[i]>30) {
				System.out.println("Employee " + (i+1) + ": " + totalHours[i] + " hours");
			}
		}
	}
	
}
