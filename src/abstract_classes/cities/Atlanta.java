package abstract_classes.cities;

public class Atlanta extends City {

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		return population * growthRate + growthRate * 2;
	}

}
