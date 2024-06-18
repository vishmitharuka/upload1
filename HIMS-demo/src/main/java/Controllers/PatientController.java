
package Controllers;

import entities.Patient;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "patientController")
@SessionScoped
public class PatientController implements Serializable {

    private Patient current;
           
    public PatientController() {
    }

    public void addNewPatient(){
        current = new Patient();  
    }
    public Patient getCurrent() {
        return current;
    }

    public void setCurrent(Patient current) {
        this.current = current;
    }

}
