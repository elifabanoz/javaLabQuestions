package labb;

public class Main {

	public static void main(String[] args) {
		HumanBeing arda = new HumanBeing("Arda",12000,"Google");
		arda.step(5000);
		System.out.println(arda);
		
		HumanBeing hayri= new HumanBeing("Hayri",11000,"Google");
		System.out.println(hayri);
		System.out.println("Company Population:" + HumanBeing.getCompanyPopulation());
		
		 HumanBeing can = new HumanBeing("Can", 10000, "Google");
	        can.step(500);
	        System.out.println(can);
	        HumanBeing efe = new HumanBeing("Efe", 10000, "Google");
	        efe.step(3000);
	        System.out.println(efe);
	        HumanBeing joe = new HumanBeing("Hayri", 11000, "Google");
	        System.out.println(joe);
	        System.out.println();
	        System.out.println(arda.comparePeople(hayri));
	        System.out.println(hayri.comparePeople(joe));
	        System.out.println(can.comparePeople(arda));
	        System.out.println(efe.comparePeople(can));
	        System.out.println();
	        System.out.println("Company Population : " +
	        		HumanBeing.getCompanyPopulation()); 
	

	}

}
