package pack_1;

public class Robot extends Machine {
	
	private int numSerie;
	private double capCharge;
	
	
	
	public Robot() {
		
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public double getCapCharge() {
		return capCharge;
	}

	public void setCapCharge(double capCharge) {
		this.capCharge = capCharge;
	}

	public Robot(int numSerie, double capCharge) {
		super();
		this.numSerie = numSerie;
		this.capCharge = capCharge;
	}
	
	



	@Override
	public String toString() {
		super.toString();
		return "Robot informatios is => numSerie=" + numSerie + ", capCharge=" + capCharge ;
	}
	
	
	

	@Override
	public boolean equals(Object object) {
		super.equals(object);
		return super.equals(object);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		super.clone();
		return super.clone();
	}

	public static void main(String[] args) {
		

	}

}
