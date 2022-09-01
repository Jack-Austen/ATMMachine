import java.util.HashMap;
public class ATM {
	private HashMap <Integer, Double> machine = new HashMap <Integer, Double> ();//making the hashmap
	
	public void openAccount (Integer i){
		if(!machine.containsKey(i)) {//making sure account doesn't exist
			machine.put (i,0.0);//adding account
		}
	}
	
	public void openAccount (Integer i, Double d){
		if(!machine.containsKey(i)) {//making sure account doesn't exist
			machine.put (i,d);//adding account with balance d
		}
	}
	
	public void closeAccount (Integer i){
		if (machine.containsKey(i)) {//making sure the account exists
			if (checkBalance (i) == 0.0) {//making sure the balance is 0
				machine.remove(i);
			}
		}
	}
	
	public Double checkBalance (Integer i){
		if(machine.containsKey(i)) {//making sure account exists
			double k = machine.get(i);//saving the current value
			machine.put(i,machine.get(i)-machine.get(i)%.01);//rounding the value to 2 decimal places
			if (k-machine.get(i)>.001) {//checking if we rounded away a number that was supposed to be there
				machine.put(i,machine.get(i)+.01);//correcting to accurate value
			}
			return machine.get(i);
		}
		return 0.0;
	}
	
	public boolean depositMoney (Integer i, Double d) {
		if (machine.containsKey(i)) {//making sure the account exists
			if(d<0) {//making sure the deposit is positive
				return false;
			}
			machine.put(i, machine.get(i)+d);//adding money
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (Integer i, Double d) {
		if (machine.containsKey(i)) {//making sure the account exists
			if(d<0||machine.get(i)<d) {//making sure that the account has enough money to lose and that the deposit is positive
				return false;
			}
			machine.put(i, machine.get(i)-d);//removing money
			return true;
		}
		return false;
	}
	
}
