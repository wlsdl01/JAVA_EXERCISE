package icehs.science.chapter05;

public class GradeTest {

	public static void main(String[] args) {
		int score = 75;
		
		boolean result1 = (score <= 100) && (score >= 90);
		System.out.println("A���� : " + result1);
		
		boolean result2 = (score < 90) && (score >= 80);
		System.out.println("B���� : " + result2);
		
		boolean result3 = (score < 80) && (score >= 70);
		System.out.println("C���� : " + result3);
		
		boolean result4 = (score <= 70) && (score >= 60);
		System.out.println("D���� : " + result4);
		

	}

}
