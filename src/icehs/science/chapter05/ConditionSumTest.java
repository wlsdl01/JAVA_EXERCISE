package icehs.science.chapter05;

public class ConditionSumTest {

	public static void main(String[] args) {
		int hap = 0;
		for(int i = 0 ; i <= 30 ; i++) {
			if(!(i % 2 == 0) && !(i % 3 == 0)) {
				hap += i;
			}
		}
		System.out.println(hap);
	}

}
