package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		build1.name = "������Ÿ��";
		build1.adress = "���";
		build1.totalfloor = 5;
		
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.adress);
		System.out.println("�� �� : " + build1.totalfloor);
		build1.moveElevator();
		build1.changeAddress("������");
		System.out.println("�ǹ��� : " + build1.name);
		System.out.println("�ּ� : " + build1.adress);
		System.out.println("�� �� : " + build1.totalfloor);
		
	}
}
