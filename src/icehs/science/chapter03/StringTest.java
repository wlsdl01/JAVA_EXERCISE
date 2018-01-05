package icehs.science.chapter03;

public class StringTest {

	public static void main(String[] args) {
		
		String name = "¼¼Á¾´ë¿Õ";
		String won =  "10000";
		int thisYear = 2018;
		int intWon = Integer.parseInt(won);
		
		System.out.println( name + ":" + won );
		System.out.println( thisYear + "³â" );
		System.out.println( won + thisYear );
		System.out.println( thisYear + intWon );
		

	}

}
