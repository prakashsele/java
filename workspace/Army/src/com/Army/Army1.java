package com.Army;

public class Army1 {
	int a;
	String community;
	static String Armyjawans = "CRPF";
	double b;
	
	public void ArmyData(int a, String community, double b){
		this.a=a;
		this.b=b;
		
		System.out.println("No:"+a+"CommunityName:"+community+"No of jawans:"+b+ Armyjawans);
	}
	

	public static void main(String[] args) {		
		Army1 A1=new Army1();
		A1.ArmyData(1,"CRPF",300);

	}
}
