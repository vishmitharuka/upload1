
package Controllers;

import entities.Staff;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;


@Named(value = "staffControllers")
@SessionScoped
public class StaffControllers implements Serializable {

    private Staff currentstaff;
    public StaffControllers() {
    }
    
    public void addNewStaffMember(){
        currentstaff = new Staff();
    }

    public Staff getCurrentstaff() {
        return currentstaff;
    }

    public void setCurrentstaff(Staff currentstaff) {
        this.currentstaff = currentstaff;
    }
    
}
