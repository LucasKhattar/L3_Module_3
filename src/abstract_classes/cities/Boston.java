package abstract_classes.cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		return population * growthRate + population * .5;
	}

}
