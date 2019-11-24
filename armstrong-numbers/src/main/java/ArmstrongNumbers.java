class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		char[] array = String.valueOf(numberToCheck).toCharArray();
		int length = array.length;
		int sum = 0;
		for (char item : array){
			sum = sum + (int) Math.pow(Integer.valueOf(String.valueOf(item)),length);
		}
		return (sum == numberToCheck)? true:false;
		
	}

}
