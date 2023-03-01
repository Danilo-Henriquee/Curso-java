package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		double impost = 0.0;
		if(getAnualIncome() < 20000.00) {
			if(healthExpenditures > 0) {
				impost = (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
			}
		}
		else {
			if(healthExpenditures > 0) {
				impost = (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);
			}
		}
		
		return impost;
	}
	
	
}
