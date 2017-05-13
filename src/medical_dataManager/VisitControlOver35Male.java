package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlOver35Male_ctr")
@SessionScoped
public class VisitControlOver35Male {
	
	
	
	private Database database = new Database();
	    
	    private List<Visit> visitListOver35Male;
	    
	    public VisitControlOver35Male() {
	    	visitListOver35Male = database.ListVisitsOver35Male();
	    }

		public List<Visit> getVisitListOver35Male() {
			visitListOver35Male = database.ListVisitsOver35Male();
			return visitListOver35Male;
		}

		public void setVisitListOver35Male(List<Visit> visitList) {
			this.visitListOver35Male = visitList;
		}
		

	    
	   
}