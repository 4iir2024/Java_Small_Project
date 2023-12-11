package pack_1;

public class Machine implements Comparable<Machine> {
	
	private String Nom;
	private String Type;
	private String fabriquant;
	private int qte;
	
	
	public Machine() {
		
		
	}
	
	

	public Machine(String nom, String type, String fabriquant, int qte) {
		super();
		Nom = nom;
		Type = type;
		this.fabriquant = fabriquant;
		this.qte = qte;
	}
	
	




	public String getNom() {
		return Nom;
	}



	public void setNom(String nom) {
		Nom = nom;
	}



	public String getType() {
		return Type;
	}



	public void setType(String type) {
		Type = type;
	}



	public String getFabriquant() {
		return fabriquant;
	}



	public void setFabriquant(String fabriquant) {
		this.fabriquant = fabriquant;
	}



	public int getQte() {
		return qte;
	}



	public void setQte(int qte) {
		this.qte = qte;
	}
	
	



	@Override
	public String toString() {
		return "Machine informations is => Nom=" + Nom + ", Type=" + Type + ", fabriquant=" + fabriquant + ", qte=" + qte ;
	}
	
	



	@Override
	public boolean equals(Object object) {
		
		return super.equals(object);
	}



	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}



	public static void main(String[] args) {
		

	}



	@Override
	public int compareTo(Machine o) {
		 
		return 0;
	}



	

}
