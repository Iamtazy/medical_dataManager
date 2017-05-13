package medical_dataManager;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean (name="visitControlEvery5_ctr")
@SessionScoped
public class VisitControlEvery5 {
	
	
	
	private Database database=new Database();
	    
	    private List<Visit> visitListEvery5;
	    
	    public VisitControlEvery5() {
	    	visitListEvery5 = database.ListVisitsEvery5();
	    }

		public List<Visit> getVisitList() {
			visitListEvery5 = database.ListVisitsEvery5();
			return visitListEvery5;
		}

		public void setVisitList(List<Visit> visitList) {
			this.visitListEvery5 = visitList;
		}
		

	    
	   


}
