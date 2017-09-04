package fr.afcepf.ai101.jsf.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="mbMap")
public class MapManagedBean {
    private String centre;
    private String lat = "43.300000";
    private String longi = "5.400000";
    public void click() {
        lat = "48.856614";
        longi = "2.352221";
    }
    
    /**
     * @return the lat
     */
    public String getLat() {
        return lat;
    }

    /**
     * @param paramLat the lat to set
     */
    public void setLat(String paramLat) {
        lat = paramLat;
    }

    /**
     * @return the longi
     */
    public String getLongi() {
        return longi;
    }

    /**
     * @param paramLongi the longi to set
     */
    public void setLongi(String paramLongi) {
        longi = paramLongi;
    }

    /**
     * @return the centre
     */
    public String getCentre() {
        return centre;
    }

    /**
     * @param paramCentre the centre to set
     */
    public void setCentre(String paramCentre) {
        centre = paramCentre;
    }
    
}
