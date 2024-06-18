
package entities;


public class Patient {
    private String name;
    private String ageInYears;
    private String TelNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgeInYears() {
        return ageInYears;
    }

    public void setAgeInYears(String ageInYears) {
        this.ageInYears = ageInYears;
    }

    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String TelNo) {
        this.TelNo = TelNo;
    }
}
