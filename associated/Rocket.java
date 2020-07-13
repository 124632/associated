class Rocket {
	String name;
	double weight;
	double price;
	String orgname;

	Satellite st;  // HAS -A  at compilation time

	Rocket() {
		System.out.println(" rocket default constructor....");
	}

	void combustion() {
		System.out.println(" fule combustion activity...");
	}
}