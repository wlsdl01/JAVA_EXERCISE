package icehs.science.chapter03;

public class StringVaroableEx {
	public static void main(String[] args) {
		
		String name ="ȫ�浿";
		String mathScore = "96";
		int englishScore = 82;
		
		int parseMathScore = Integer.parseInt(mathScore);
		
		System.out.println( "�̸� : " + name );
		System.out.println( "�������� : " + mathScore );
		System.out.println( "�������� : " + englishScore );
		System.out.println( "-----------" );
		System.out.println( "�հ����� : " + (mathScore+englishScore) );
		System.out.println( parseMathScore + englishScore );
	}

}
