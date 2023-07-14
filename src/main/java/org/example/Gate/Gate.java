package org.example.Gate;

import org.example.Utils.Utils;

public class Gate {

    private String id;
    private boolean avaibility;
    private int gateNumber;
    private String idAirplane;

    public Gate(int gateNumber) {
        this.gateNumber = gateNumber;
        this.id = Utils.getID();
        this.avaibility = true;
    }

    public Gate(int gateNumber, String idAirplane) {
        this.gateNumber = gateNumber;
        this.idAirplane = idAirplane;
        this.id = Utils.getID();
        this.avaibility = false;
    }

    public String getId() {
        return id;
    }

    public boolean isAvaibility() {
        return avaibility;
    }

    public void setAvaibility(boolean avaibility) {
        this.avaibility = avaibility;
    }

    public int getGateNumber() {
        return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
        this.gateNumber = gateNumber;
    }

    public String getIdAirplane() {
        return idAirplane;
    }

    public void setIdAirplane(String idAirplane) throws Exception{
        if(this.idAirplane.isEmpty()) {
            this.idAirplane = idAirplane;
            this.avaibility = true;
        }

        throw new Exception();

    }

    @Override
    public String toString() {
        return "Gate{" +
                "id='" + id + '\'' +
                ", avaibility=" + avaibility +
                ", gateNumber=" + gateNumber +
                ", idAirplane='" + idAirplane + '\'' +
                '}';
    }
}
