package payroll;

abstract public class Person {
	private String name;

	int INCREASE_CAP = 20; // cap on pay increase

	/**
	 * constructor
 	 */
	public Person(String name) {
		this.name = name;
	}

	/**
	 * Get the name of the Worker
 	 */
	public String getName()
	{
		return "Person's name is " + name;
	}

	/**
	 * Implement change of address and print it out
 	 */
	public void changeAddress(String address) {
		System.out.println("New address is " + address);
	}

	/**
	 * Give worker day off
 	 */
	private void giveDayOff() {
		System.out.println("Giving a day off to " + name);
	}

	/**
	 * Promote a Worker
 	 */
	public void promote(int percent) {
		System.out.println(" Promoting a worker....");
		giveDayOff();

		// calling an abstract method
		increasePay(percent);
	}

	// an abstract method to be inplemented in subclasses
	public abstract boolean increasePay(int percent);
}
