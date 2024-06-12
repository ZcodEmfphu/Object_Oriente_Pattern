package final3;

public class CurrencyCenter {

	public static void main(String[] args) {

		CurrencyUnit euro = new Euro();
		CurrencyUnit gbp = new GBP();
		CurrencyUnit jpy = new JPY();
		CurrencyUnit usd = new USD();
		CurrencyUnit vnd = new VND();

		CurrencyMeasure euroMeasure = new CurrencyMeasure(euro, 200);

		
		System.out.println(euroMeasure.convertToBaseCurrency() + " " + euro.symbol);
		System.out.println();
	}
}
