package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlOver45Female_ctr")
@SessionScoped
public class VisitControlOver45Female {
	
	
	
	private Database database = new Database();
	    
	    private List<Visit> visitListOver45Female;
	    
	    public VisitControlOver45Female() {
	    	visitListOver45Female = database.ListVisitsOver45Female();
	    }

		public List<Visit> getVisitList3() {
			visitListOver45Female = database.ListVisitsOver45Female();
			return visitListOver45Female;
		}

		public void setVisitList(List<Visit> visitList) {
			this.visitListOver45Female = visitList;
		}
		

	    
	   
}