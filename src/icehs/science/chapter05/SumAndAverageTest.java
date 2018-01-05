package icehs.science.chapter05;

public class SumAndAverageTest {
	
	
	public static void main(String[] args) {
		int hap = 0;
		for(int i = 0 ; i <= 500 ; i++ ) {
			hap += i;
			double avg = (hap / 500);
		   
		}
		System.out.print(hap);
		System.out.println(avg);
	}

}
