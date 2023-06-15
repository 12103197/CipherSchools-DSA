package coreJava;
class Train{
	String train_name;
	double total_no_of_passengers;
	int no_of_passengers_dead;
	String speed;
	void collision() {
		System.out.println("Collision of two trains");
	}
}
public class TrainStudy {
	public static void main(String [] args) {
		Train coromandle_express = new Train();
		coromandle_express.train_name = "Coromandle_express";
		coromandle_express.total_no_of_passengers = 3023;
		coromandle_express.no_of_passengers_dead = 108;
		coromandle_express.speed = "196 km/hr";
		System.out.println("Train Name:"+coromandle_express.train_name);
		System.out.println("Total No. of passengers:"+coromandle_express.total_no_of_passengers);
		System.out.println("No. of passengers dead:"+coromandle_express.no_of_passengers_dead);
		System.out.println("Speed of the train:"+coromandle_express.speed);
		
	}
	
	
	

}
