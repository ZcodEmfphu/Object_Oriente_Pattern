package final3;

public abstract class CurrencyUnit {
	protected String symbol = "";
	protected double rateCurency;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public double getRateCurency() {
		return rateCurency;
	}

	public void setRateCurency(double rateCurency) {
		this.rateCurency = rateCurency;
	}

	@Override
	public String toString() {
		return "CurrencyUnit [symbol=" + symbol + ", rateCurency=" + rateCurency + "]";
	}

}
