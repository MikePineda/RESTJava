package com.mike.yutub.messenger.resources.beans;

import javax.ws.rs.QueryParam;

public class EmpleadoFilterBean {
    private @QueryParam("crPlaza") String crPlaza;
    private @QueryParam("crTienda") String crTienda;
    private @QueryParam("start") int start;
    private @QueryParam("size") int size;

    public String getCrPlaza() {
        return crPlaza;
    }

    public void setCrPlaza(String crPlaza) {
        this.crPlaza = crPlaza;
    }

    public String getCrTienda() {
        return crTienda;
    }

    public void setCrTienda(String crTienda) {
        this.crTienda = crTienda;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
}
