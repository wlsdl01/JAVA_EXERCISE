package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int number1 = 20;
		int number2= 7;
		int addResult = number1 + number2;
		int subResult = number1 - number2;
		int mulResult = number1 * number2;
		int divResult = number1 / number2;
		int remResult = number1 % number2;
		
		System.out.println("���� ��� : " + (number1 + number2));
		System.out.println("���� ��� : " + addResult);
		System.out.println("���� ��� : " + subResult);
		System.out.println("���� ��� : " + mulResult);
		System.out.println("������ ��� : " + divResult);
		System.out.println("������ ���� ��� : " + remResult);

	}

}
