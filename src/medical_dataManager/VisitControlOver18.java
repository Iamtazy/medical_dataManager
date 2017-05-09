package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlOver18_ctr")
@SessionScoped
public class VisitControlOver18 {
	
	
	
	private Database database = new Database();
	    
	    private List<Visit> visitList;
	    
	    public VisitControlOver18() {
	    	visitList = database.ListVisitsOver18();
	    }

		public List<Visit> getVisitList() {
			visitList = database.ListVisitsOver18();
			return visitList;
		}

		public void setVisitList(List<Visit> visitList) {
			this.visitList = visitList;
		}
		

	    
	   
}