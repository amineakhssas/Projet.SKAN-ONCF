package model;

import java.sql.Date;

public class Ticket {
	    private int trajetID;
            private String gareDepart;
            private String gareArrivee;
            private String dateDepart;
            private String heureDepart;
            private String confort;

    public Ticket(String gareDepart, String gareArrivee, String dateDepart, String heureDepart, String confort) {
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.confort = confort;
       
    }

    public String getConfort() {
        return confort;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public String getGareArrivee() {
        return gareArrivee;
    }

    public String getGareDepart() {
        return gareDepart;
    }

    public String getHeureDepart() {
        return heureDepart;
    }

    public int getTrajetID() {
        return trajetID;
    }

    public void setConfort(String confort) {
        this.confort = confort;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public void setGareArrivee(String gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public void setGareDepart(String gareDepart) {
        this.gareDepart = gareDepart;
    }

    public void setHeureDepart(String heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setTrajetID(int trajetID) {
        this.trajetID = trajetID;
    }
            
}   