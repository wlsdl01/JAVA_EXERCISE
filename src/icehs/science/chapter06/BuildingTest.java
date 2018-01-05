package icehs.science.chapter06;

public class BuildingTest {
	public static void main(String[] args) {
		Building build1 = new Building();
		build1.name = "국제선타워";
		build1.adress = "운서동";
		build1.totalfloor = 5;
		
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.adress);
		System.out.println("층 수 : " + build1.totalfloor);
		build1.moveElevator();
		build1.changeAddress("김포동");
		System.out.println("건물명 : " + build1.name);
		System.out.println("주소 : " + build1.adress);
		System.out.println("층 수 : " + build1.totalfloor);
		
	}
}
