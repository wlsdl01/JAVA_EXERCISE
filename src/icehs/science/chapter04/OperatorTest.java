package icehs.science.chapter04;

public class OperatorTest {

	public static void main(String[] args) {
		int number = 64;
		
		System.out.println("¦�� �Դϱ�? : " + (number % 2 == 0));
		System.out.println("3�� ��� �Դϱ�? : " + (number % 3 ==0));
		System.out.println("2�� ��� �̸鼭 7�� ��� �Դϱ�? : " + ((number % 2 ==0) && (number % 7 == 0)));
		System.out.println("2�� ��� �̰ų� 7�� ��� �Դϱ�? : " + ((number % 2 ==0) || (number % 7 == 0)));
		

	}

}
