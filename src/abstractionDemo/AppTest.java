package abstractionDemo;

public class AppTest {

	public static void main(String[] args) {
	BOABank boa = new BOABank();
	boa.depositMoney();
	boa.withdrawMoney();
	
	iciciBank icici = new iciciBank();
	icici.deposiMoney();
	icici.withdrawMoney();
			
}
}