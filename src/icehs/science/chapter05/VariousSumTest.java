package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int totalSum = 0; 
		int oddSum = 0;
		int evenSum = 0;
		
		for(int i = 0 ; i <= 1000 ; i++) {
			if(i % 2 == 0) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		
		totalSum = oddSum + evenSum;
		System.out.println("1���� 100������ ��: " + totalSum);
		System.out.println("1���� 1000������ Ȧ���� ��: " + oddSum);
		System.out.println("1���� 1000������ ¦���� ��: " + evenSum);

	}

}
