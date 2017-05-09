package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlOver45Female_ctr")
@SessionScoped
public class VisitControlOver45Female {
	
	
	
	private Database database = new Database();
	    
	    private List<Visit> visitList;
	    
	    public VisitControlOver45Female() {
	    	visitList = database.ListVisitsOver45Female();
	    }

		public List<Visit> getVisitList3() {
			visitList = database.ListVisitsOver45Female();
			return visitList;
		}

		public void setVisitList(List<Visit> visitList) {
			this.visitList = visitList;
		}
		

	    
	   
}