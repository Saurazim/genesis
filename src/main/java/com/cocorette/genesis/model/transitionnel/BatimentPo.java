package com.cocorette.genesis.model.transitionnel;

public class BatimentPo {
    private int id;
    private String inuav;

    public BatimentPo(int id, String inuav) {
        this.id = id;
        this.inuav = inuav;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInuav() {
        return inuav;
    }

    public void setInuav(String inuav) {
        this.inuav = inuav;
    }
}
