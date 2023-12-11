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

	public Robot(String nom, String type, String fabriquant, int qte,int numSerie, double capCharge) {
		super(nom,type,fabriquant,qte);
		this.numSerie = numSerie;
		this.capCharge = capCharge;
	}
	
	



	@Override
	public String toString() {
		
		return super.toString()+ "Robot informatios is => numSerie=" + numSerie + ", capCharge=" + capCharge ;
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
