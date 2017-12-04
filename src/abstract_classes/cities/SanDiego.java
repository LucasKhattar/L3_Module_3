package abstract_classes.cities;

public class SanDiego extends City {

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		return population * growthRate + 1000000;
	}

}
