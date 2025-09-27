
public class EmployeeWorkAnalysis {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] workHours = generateMatrix();
		printMatrix(workHours);
		System.out.println();
		int[] totalHours = totalHours(workHours);
		mostWorkingEmployee(totalHours);
		System.out.println();
		wages(totalHours);

	}
	
	public static int[][] generateMatrix() {
		int[][] matrix = new int[7][7]; 
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				matrix[i][j] = (int)(Math.random()*10);
			}
		}
		return matrix;
	}
	
	public static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			System.out.print("employee" + (i) + ": ");
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print( matrix[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	public static int[] totalHours(int[][] workHours) {
		int[] totalHours = new int[workHours.length];
		int maxSum = 0;
		for(int i=0; i<workHours.length; i++) {
			int sum = 0;
			for(int j=0; j<workHours[i].length; j++) {
				sum += workHours[i][j];
			}
			totalHours[i] = sum;
			}
		return totalHours;
		
		}
	
	public static void mostWorkingEmployee(int[] totalHours) {
		int maxSum = totalHours[0];
		int index = 0;
		for(int i=0; i<totalHours.length; i++) {
			if(totalHours[i]>maxSum) {
				maxSum = totalHours[i];
				index = i;
			}
		}
		System.out.println("the most working employee is: " + "employee" + index);
	}
	
	public static void wages(int[] totalHours) {
		for(int i=0; i<totalHours.length; i++) {
			if(totalHours[i] <= 30) {
				System.out.println("wage of the employee" + i + " is: " +"1000$");
			}else if(totalHours[i] > 30) {
				System.out.println("wage of the employee" + i + " is: " + (((totalHours[i] - 30)*50)+1000) + "$");
			}
		}
	}

}
