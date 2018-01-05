package icehs.science.chapter06;

public class Building {
	String name;
	String adress;
	int totalfloor;
	
	void moveElevator() {
		System.out.println("엘레베이터를 운행합니다.");
	}
	
	void changeAddress(String newAddress) {
		adress = newAddress;
	}
}
