public class AccountNumberValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String password = generatePassword();
		
		String lastDigits = password.substring(4);

		int resultSum = sumDigits(lastDigits);

		int sumNumbers = sumOtherDigits(lastDigits);

		int totalSum = totalSum(resultSum, sumNumbers);

		String finalResult = checkingPassword(totalSum);
		System.out.println("the account number " + password + " is " + finalResult);
		
	}
	
	public static String generatePassword() {
		char letter1 = (char) ((int)'A' + Math.random()*26);
		char letter2 = (char) ((int)'A' + Math.random()*26);
		if(letter1>letter2) {
			char temp = letter1;
			letter1 = letter2;
			letter2 = temp;
		}
		
		String digits = "";
		for(int i=0; i<12; i++) {
			int digit = (int) (Math.random()*10);
			digits += digit;
		}
		String primeDigits = generateTwoPrimeNumbers();
		
		return "" + letter1 + letter2 + primeDigits + digits; 
		
	}
	
	public static String generateTwoPrimeNumbers() {
		int primes[] = {2,3,5,7};
		int prime1 = (int) (Math.random()*primes.length);
		int prime2 = (int) (Math.random()*primes.length);
		int firstPrime = primes[prime1];
		int secondPrime = primes[prime2];
		return Integer.toString(firstPrime) + Integer.toString(secondPrime);
		
	} 
	
	public static int sumDigits(String digits) {
		int sum = 0;
		for(int i = digits.length()-2; i>=0; i-=2) {
		int digit = Character.getNumericValue(digits.charAt(i));
		int product = digit*2;
		if(product>=10) {
			product = (product/10) + (product%10);
		}
		sum += product;
		} 
		return sum;
		
	}
	
	public static int sumOtherDigits(String digits) {
		int sum = 0;
		for(int i = digits.length()-1; i>=0; i-=2) {
		int digit = Character.getNumericValue(digits.charAt(i));
		sum += digit;
		}
		return sum;
	}
	
	public static int totalSum(int sum1, int sum2) {
      return sum1+sum2;
	}
	
	public static String checkingPassword(int totalSum) {
		if(totalSum%10==0) {
			return "valid.";
		}else {
			return "invalid."; 
		}
	}
}
