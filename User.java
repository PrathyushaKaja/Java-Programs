package inheritanceConcept;
/*
 * Here, we didn't extend this class with any other parent class that is 
 * why we have to create an object to access the other class properties
 */
public class User {

	public static void main(String[] args) {
		Sim2G sim2g = new Sim2G();
		sim2g.calling();
		sim2g.sms();
		System.out.println();
		Sim3G sim3g = new Sim3G();
		sim3g.calling();
		sim3g.sms();
		sim3g.gprs();
		System.out.println();
		Sim4G sim4g = new Sim4G();
		sim4g.calling();
		sim4g.gprs();
		sim4g.sms();
		sim4g.volte();
		System.out.println();
		Sim5G sim5g = new Sim5G();
		sim5g.calling();
		sim5g.FiveGPlus();
		sim5g.gprs();
		sim5g.sms();
		sim5g.volte();
	}

}
