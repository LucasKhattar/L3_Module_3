package abstract_classes.cities;

public class LosAngeles extends City {

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}

	public double getAnnualTaxes() {
		return population * growthRate + growthRate * .5;
	}

}
