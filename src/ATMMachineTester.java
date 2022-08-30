
public class ATMMachineTester {

	public static void main(String[] args) {
		ATMMachine jim = new ATMMachine ();
		for (Integer i = 0; i <1000000;i++) {
			jim.openAccount(i,5.0);
		}
		jim.openAccount(1000000000);
		System.out.println ("done");
		System.out.println (jim.checkBalance(999999));
		System.out.println(jim.depositMoney (1,900.0));
		System.out.println(jim.withdrawMoney (1,900.0));
		System.out.println(jim.withdrawMoney(1,5.0));
		System.out.println(jim.withdrawMoney(1,1.0));
		System.out.println(jim.depositMoney (1,-1900.0));
		System.out.println(jim.withdrawMoney (1,-1900.0));
		jim.closeAccount(1);
		jim.closeAccount(2);
		
		
	}

}