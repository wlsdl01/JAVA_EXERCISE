package icehs.science.chapter05;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		int stuNo = 0;
		int sumScore = 0;
		double avgScore = 0.0;
		
		
		System.out.print("반의 학생 수는?");
	 stuNo = getUserInput();
		for(int i = 0 ; i <= stuNo ; i++ ) {
			for(int j = 0 ; j <= i ; j++ ) {
				sumScore += i;
				avgScore = sumScore/;
			}
			
			
		}
		
		System.out.println( stuNo + "명의 총점: " + sumScore );
		System.out.println( stuNo + "명의 평균: " + avgScore );
	}
	public static int getUserInput() {
	        
	        Scanner sc = new Scanner(System.in);
	        int input = sc.nextInt();
	        return input;
	    }

	}


