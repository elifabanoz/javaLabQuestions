package labb;

public class HumanBeing implements Behavior, Comparable<HumanBeing> {
	private String name;
	private int PersonSalary;
	private int dailyStep;
	private String companyName;
	private static int companyPopulation=0;
	
	
	public HumanBeing(String name, int PersonSalary, String companyName) {
		this.name=name;
		this.PersonSalary=PersonSalary;
		this.dailyStep=0;
		this.companyName=companyName;
		companyPopulation++;
	}
	
	public String tellName() {
		return name;
	}
	
	public int tellSalary() {
		return PersonSalary;
	}
	
	public int step(int actualDailyStep) {
		dailyStep+=actualDailyStep;
		return dailyStep;
	}
	public String tellCompanyName() {
		return companyName;
	}
	
	public static int getCompanyPopulation() {
		return companyPopulation;
	}
	
	public String toString() {
		String x= "Name :" + tellName() + ", Salary:" + tellSalary() + ",Step:" +dailyStep+ ", Company Name:" +tellCompanyName();
		return x;
	}
	
	public int compareTo(HumanBeing other) {
		if(this.name.equals(other.name)&& this.PersonSalary==other.PersonSalary) {
			return 10;
		}
		else if(!this.name.equals(other.name)&& this.PersonSalary== other.PersonSalary) {
			return 0;
		}
		else if(!this.name.equals(other.name)&& this.PersonSalary<other.PersonSalary) {
			return -1;
		}
		else if(!this.name.equals(other.name)&& this.PersonSalary>other.PersonSalary) {
			return 1;
		}else {
			return 0;
		}
	}
	public String comparePeople(HumanBeing other) {
		int result=compareTo(other);
		if(result==1) {
			return this.name +"'s salary is greater than " + other.name+ "'s salary.";
		}else if(result==0) {
			return this.name + " and " + other.name + " have same salary.";
		}else if(result==10) {
			 return this.name + " and " + other.name + " are the same persons.";
		}else if(result==-1) {
			return this.name + "'s salary is smaller than " + other.name + "'s salary.";
		}
		return "";
	}

}
