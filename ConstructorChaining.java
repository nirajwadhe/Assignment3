package Demo;

class Truck5 extends VehicleC10{
	double payloadCapacity;
	double towingCapacity;
	
	Truck5(){
		super();
		payloadCapacity=0.0;
		towingCapacity=0.0;
		System.out.println("I am default constructor of Truck");
	}
	Truck5(double payloadCapacity, double towingCapacity){
		super.VehicleC10(make, model, year, color);
//		super.VehicleC10("India", "ABC", 2022, "unknown");
		this.payloadCapacity=payloadCapacity;
		this.towingCapacity=towingCapacity;
		System.out.println("I am parameterized constructor of Truck");
		System.out.println(payloadCapacity+" "+towingCapacity);
	}
	Truck5(String make, String model, int year){
		super.VehicleC10(make, model, year);
//		super.VehicleC10("America", "XYZ", 2023);
		payloadCapacity=0.0;
		towingCapacity=0.0;
		System.out.println("I am same constructor in Truck");
	}
}

class Car5 extends VehicleC10{
	int numDoors;
	boolean automatic;
	
	Car5(){
		super();
		numDoors=0;
		automatic=false;
		System.out.println("I am default constructor of Car");
	}
	
	Car5(int numDoors, boolean automatic) {
		super.VehicleC10(make, model, numDoors, color);
		this.numDoors=numDoors;
		this.automatic=automatic;
		System.out.println("I am parameterized constructor of Car");
		System.out.println(numDoors+" "+automatic);
	}
	
	Car5(String make, String model, int year){
		super.VehicleC10(make, model, year);
		numDoors=0;
		automatic=false;
		System.out.println("I am same constructor in Car");
	}
}

public class VehicleC10 {

	String make;
	String model;
	int year;
	String color;
	
	VehicleC10(){
		make=null;
		model=null;
		year=0;
		color=null;
		System.out.println("I am default constructor of Vehicle");
	}

	public void VehicleC10(String make, String model, int year, String color) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
		System.out.println("I am parameterized constructor of Vehicle");
		System.out.println(make+" "+model+" "+year+" "+color);
	}
	
	public void VehicleC10(String make, String model, int year) {
		color="unknown";
		System.out.println("I am same constructor in Vehicle");
		System.out.println(make+" "+model+" "+year);
	}
	
	public static void main(String[] args) {
		
		VehicleC10 v1=new VehicleC10();
		v1.VehicleC10("Canada", "PQR", 2021, "unknown");
		v1.VehicleC10("Korea", "UVW", 2020);
		
		Car5 c5=new Car5();
		System.out.println("\n");
		
		Car5 c6=new Car5(5,true);
		System.out.println("\n");
		
		Car5 c7=new Car5("India","ABC",2022);
		System.out.println("\n");
		System.out.println("\n");
		
		
		Truck5 t5=new Truck5();
		System.out.println("\n");
		
		Truck5 t6=new Truck5(1234.56,7896.54);
		System.out.println("\n");
		
		Truck5 t7=new Truck5("America","XYZ",2023);

	}

}
