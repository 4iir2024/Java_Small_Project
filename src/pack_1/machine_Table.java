package pack_1;

import java.util.Arrays;

public class machine_Table {
	private Machine[] machines;
	
	
	// a.
	public machine_Table(Machine[] machines) {
        this.machines = machines;
    }
	
	
	// b.
	public void trierTab() {
        Arrays.sort(machines);
    }
	
	// c.
	public void ajouterElement(Machine machine) {
	   
	    Machine[] nouveauTableau = new Machine[machines.length + 1];

	    
	    System.arraycopy(machines, 0, nouveauTableau, 0, machines.length);

	    
	    nouveauTableau[machines.length] = machine;

	    
	    machines = nouveauTableau;
	}

	
	
	// d.
	
	public void supprimerElement(Machine machine) {
	    
	    int index = -1;
	    for (int i = 0; i < machines.length; i++) {
	        if (machines[i].equals(machine)) {
	            index = i;
	            break;
	        }
	    }

	    
	    if (index != -1) {
	        Machine[] nouveauTableau = new Machine[machines.length - 1];
	        System.arraycopy(machines, 0, nouveauTableau, 0, index);
	        System.arraycopy(machines, index + 1, nouveauTableau, index, machines.length - index - 1);
	        machines = nouveauTableau;
	    } else {
	        System.out.println("Machine non trouvée dans le tableau.");
	    }
	}
	
	// e.
	 public int compterMachines() {
	        return machines.length;
	    }
	 
	 
	 // f.
	 
	 public void inverserOrdre() {
		    int debut = 0;
		    int fin = machines.length - 1;

		    while (debut < fin) {
		         
		        Machine temp = machines[debut];
		        machines[debut] = machines[fin];
		        machines[fin] = temp;

		         
		        debut++;
		        fin--;
		    }
		}
	 
	 
	 // g.
	 public void afficherMachines() {
	        for (Machine machines : machines) {
	            System.out.println(machines);
	        }
	    }
	 
	 // h.
	 
	 public Machine plusGrand() {
		    if (machines.length == 0) {
		        
		        return null;
		    }

		     
		    Machine plusGrand = machines[0];

		     
		    for (int i = 1; i < machines.length; i++) {
		        if (machines[i].compareTo(plusGrand) > 0) {
		            plusGrand = machines[i];
		        }
		    }

		    return plusGrand;
		}
	 
	 
	 // i.
	 
	 public boolean testerEgalite(machine_Table machine) {
		     
		    if (machines.length != machine.machines.length) {
		        return false;
		    }

		    
		    for (int i = 0; i < machines.length; i++) {
		        if (!machines[i].equals(machine.machines[i])) {
		            return false;  
		        }
		    }

		    
		    return true;
		}



	 
	 
	
	

	


	public static void main(String[] args) {
		 

	}

}
