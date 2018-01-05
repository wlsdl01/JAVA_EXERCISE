package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		
		int num1 = 456;
		int hundNo = num1 / 100;
		int decNo = (num1 % 100)/10;
	    int loneNo =(num1 % 100) % 10;
		
		System.out.println( "백의 자리 수 :" + hundNo );
		System.out.println( "백의 자리 수 :" + decNo );
		System.out.println("일의 자리 수 : " + loneNo );  

	}

}
