package final3;

public class CurrencyMeasure extends CurrencyUnit {

	private CurrencyUnit currencyUnit;
	private double value;

	public CurrencyMeasure(CurrencyUnit currencyUnit, double value) {
		super();
		this.currencyUnit = currencyUnit;
		this.value = value;
	}

	public double convertToBaseCurrency() {
		return value / currencyUnit.getRateCurency();
	}

	public double convertCurrencyToCurrency(CurrencyUnit start, CurrencyUnit end) {
		return start.rateCurency / end.rateCurency;
	}

}
