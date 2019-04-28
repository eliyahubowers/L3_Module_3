package abstract_classes.cities;

public abstract class City {
	protected int population;
	protected double growthRate;
	
	public City(int population, double growthRate) {
		this.population = population;
		this.growthRate = growthRate;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public double getGrowthRate() {
		return growthRate;
	}
	
	abstract double getAnnualTaxes();
}

//---------------- 

class SanDiego extends City{
	
	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double pop = getPopulation();
		double gro = getGrowthRate();
		return (pop*gro)+1000000;
	}
	
}

class Boston extends City{
	
	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double pop = getPopulation();
		double gro = getGrowthRate();
		return (pop*gro)+(.5*pop);
	}
	
}

class LosAngeles extends City{
	
	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);	
	}

	double getAnnualTaxes() {
		double pop = getPopulation();
		double gro = getGrowthRate();
		return (pop*gro)*(gro/2);
	}
	
}

class Atlanta extends City{
	
	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	double getAnnualTaxes() {
		double pop = getPopulation();
		double gro = getGrowthRate();
		return (pop*gro)*(gro*2);
	}
	
}