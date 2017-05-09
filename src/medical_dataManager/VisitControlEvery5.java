package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlEvery5_ctr")
@SessionScoped
public class VisitControlEvery5 {
	
	
	
	private Database database=new Database();
	    
	    private List<Visit> visitList;
	    
	    public VisitControlEvery5() {
	    	visitList = database.ListVisitsEvery5();
	    }

		public List<Visit> getVisitList() {
			visitList = database.ListVisitsEvery5();
			return visitList;
		}

		public void setVisitList(List<Visit> visitList) {
			this.visitList = visitList;
		}
		

	    
	   


}
