import java.util.HashMap;
public class ATMMachine {
	private HashMap <Integer, Double> machine = new HashMap <Integer, Double> ();
	
	public void openAccount (Integer i){
		if(machine.containsKey(i)) {//making sure account doesn't exist
			System.out.println("Nah");
		}
		machine.put (i,0.0);//adding account
	}
	
	public void openAccount (Integer i, Double d){
		if(machine.containsKey(i)) {//making sure account doesn't exist
			System.out.println("Nah");
		}
		machine.put(i,d);//adding account with balance d
	}
	
	public void closeAccount (Integer i){
		if (machine.containsKey(i)) {//making sure the account exists
			if (checkBalance (i) == 0.0) {//making sure the balance is 0
				machine.remove(i);
			}
			else {
				System.out.println ("Nah");
			}
		}
		else {
			System.out.println ("Nah");
		}
	}
	
	public Double checkBalance (Integer i){
		return machine.get(i);
	}
	
	public boolean depositMoney (Integer i, Double d) {
		if(d<0) {//making sure the deposit is positive
			System.out.println ("Nah");
			return false;
		}
		if (machine.containsKey(i)) {//making sure the account exists
			machine.put(i, machine.get(i)+d);//adding money
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (Integer i, Double d) {
		if(d<0||machine.get(i)<d) {//making sure that the account has enough money to lose and that the deposit is positive
			System.out.println ("Nah");
			return false;
		}
		if (machine.containsKey(i)) {//making sure the account exists
			machine.put(i, machine.get(i)-d);//removing money
			return true;
		}
		return false;
	}
	
}
