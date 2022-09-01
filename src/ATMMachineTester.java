
public class ATMMachineTester {//personal tester

	public static void main(String[] args) {
		
		ATM jim = new ATM ();
		for (Integer i = 0; i <1000000;i++) {//checking large numbers of accounts
			jim.openAccount(i,5.0);//checking 2 input constructor
		}
		jim.openAccount(1000000000);//checking 1 input constructor
		System.out.println (jim.checkBalance(999999));//should be 5.0, checking checkBalance
		System.out.println(jim.depositMoney (1,900.0));//should be true, checking depositMoney
		System.out.println(jim.withdrawMoney (1,900.0));//should be true, checking withdrawMoney
		System.out.println(jim.withdrawMoney(1,5.0));//should be true, checking withdrawMoney
		System.out.println(jim.withdrawMoney(1,1.0));//should be false, checking withdrawMoney
		System.out.println(jim.depositMoney (1,-1900.0));//should be false, checking depositMoney
		System.out.println(jim.withdrawMoney (1,-1900.0));//should be false, checking withdrawMoney
		jim.closeAccount(1);//should work
		jim.closeAccount(2);//shouldn't work
		System.out.println(jim.checkBalance (1));//should give 0.0
		System.out.println(jim.checkBalance (2));//should give 5.0
		
		ATM sam = new ATM ();
		//testing rounding system
		sam.openAccount(00001,1.51);
		sam.depositMoney(00001, 433.46);
		sam.depositMoney(00001, 434.78);
		sam.depositMoney(00001, 424.92);
		sam.depositMoney(00001, 474.11);
		sam.depositMoney(00001, 154.31);
		sam.depositMoney(00001, 433.46);
		sam.depositMoney(00001, 434.78);
		sam.depositMoney(00001, 424.92);
		sam.depositMoney(00001, 474.11);
		sam.depositMoney(00001, 154.31);
		sam.depositMoney(00001, 433.46);
		sam.depositMoney(00001, 434.78);
		sam.depositMoney(00001, 424.92);
		sam.depositMoney(00001, 474.11);
		sam.depositMoney(00001, 154.31);
		sam.depositMoney(00001, 0.0);
		sam.depositMoney(00001, 0.0);
		sam.depositMoney(00001, -0.1);
		sam.depositMoney(00001, -0.1);
		sam.depositMoney(00001, -0.1);
		sam.depositMoney(00001, 433.46);
		sam.depositMoney(00001, 434.78);
		sam.depositMoney(00001, 424.92);
		sam.depositMoney(00001, 474.11);
		sam.depositMoney(00001, 154.31);
		System.out.println(sam.checkBalance(00001));//should be 7687.83
		
		
	}

}