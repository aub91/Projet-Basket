package fr.afcepf.ai101.jsf.controller;

import java.io.IOException;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.errors.ApiException;
import com.google.maps.model.GeocodingResult;

@SessionScoped
@ManagedBean(name="mbMap")
public class MapManagedBean {
    private String centre;
    private String lat = "48.856614";
    private String longi = "2.352221";
    private String zoom = "6";
    private String apiKey = "AIzaSyCf-7j3fGn9ixB1w2exeFysSJtWlWUYiFc";
    public void click() {
    	if(centre != null && centre != "") {
    	GeoApiContext context = new GeoApiContext.Builder().apiKey(apiKey).build();
			GeocodingResult[] results;
			try {
				results = GeocodingApi.geocode(context, centre).await();
				lat = String.valueOf(results[0].geometry.location.lat);
				longi = String.valueOf(results[0].geometry.location.lng);
				zoom = "14";
			} catch (ApiException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
    	}
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

	public String getApiKey() {
		return apiKey;
	}

	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	public String getZoom() {
		return zoom;
	}

	public void setZoom(String zoom) {
		this.zoom = zoom;
	}
    
}
