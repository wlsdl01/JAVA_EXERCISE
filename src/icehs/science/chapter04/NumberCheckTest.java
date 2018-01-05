package icehs.science.chapter04;

public class NumberCheckTest {

	public static void main(String[] args) {
		int number1 = -2;
		int number2 = -3;
		int result = number1 *number2;
		
		if(result < 0) {
			System.out.println(number1 +" * "+ number2 +" : 음수는 확인하지 않습니다.");
		}else if(result < 10) {
			System.out.println(number1 +" * "+ number2 +" : 한 자리 수 입니다.");
		}else if(result <100) {
			System.out.println(number1 +" * "+ number2 +" : 두 자리 수 입니다.");
		}else {
			System.out.println(number1 +" * "+ number2 +" : 세 자리 수 입니다.");
		}
	}

}
