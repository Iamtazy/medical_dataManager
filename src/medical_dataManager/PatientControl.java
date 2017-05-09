package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="patientControl_ctr")
@SessionScoped
public class PatientControl {
	
	
	
	private Database database = new Database();
	    
	    private List<Patient> patientList;
	    

	    
	  
	    
	    public PatientControl() {
	    	patientList = database.ListPatients();
	    }

		public List<Patient> getPatientList() {
			patientList = database.ListPatients();
			return patientList;
		}

		public void setPatientList(List<Patient> patientList) {
			this.patientList = patientList;
		}
		
		
		    
	
			
	    
	   
}