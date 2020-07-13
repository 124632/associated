class Tester {
	public satic void main(String[] args) {
		System.out.println(" main method started.....");

		Rocket r1 = new Rocket();
		r1.name = " PSLV-1";
		r1.weight = 10000.50;
		r1.price = 97304500.78;
		r1.orgName = " ISRO";

		Satellite s1 = new Satellite();
		s1.name = " MOM";
		s1.numofRotn = 10;
		s1.launchDate = " 18th oct 2019";

		r1.st=s1; // HAS-A at runtime

		System.out.println(" Rocket orgName:"+r1.orgName); 
		System.out.println(" Satellite Name"+r1.st.name+"\n");

		r1.combustion();
		r1.st.capturephotos();
		System.out.println(" main method ended.....");
	}
}

		 