/*
 Christian Aiello CIS206 Final Exam Program
*/

public class Mountain {
    private String name; 
    private String country; 
    private double elevation; 

    public Mountain() {
        this.name = "";
        this.country = "";
        this.elevation = 0;
    }
    public Mountain(String name, String country, double elevation) {
        this.name = name;
        this.country = country;
        this.elevation = elevation;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public double getElevation() {
        return elevation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setElevation(double elevation) {
        this.elevation = elevation;
    }

    public double toMeters() {
        double Meter2Feet = 3.2808;
        return this.elevation / Meter2Feet;
    }
}
