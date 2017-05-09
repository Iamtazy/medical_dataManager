package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlOver35Male_ctr")
@SessionScoped
public class VisitControlOver35Male {
	
	
	
	private Database database = new Database();
	    
	    private List<Visit> visitList;
	    
	    public VisitControlOver35Male() {
	    	visitList = database.ListVisitsOver35Male();
	    }

		public List<Visit> getVisitList2() {
			visitList = database.ListVisitsOver35Male();
			return visitList;
		}

		public void setVisitList2(List<Visit> visitList) {
			this.visitList = visitList;
		}
		

	    
	   
}