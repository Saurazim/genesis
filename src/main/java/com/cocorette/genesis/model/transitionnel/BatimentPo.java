package com.cocorette.genesis.model.transitionnel;

public class BatimentPo {
    private int id;
    private String codeInterne;

    public BatimentPo(){}

    public BatimentPo(int id){
        this.id = id;
    }

    public BatimentPo(int id, String codeInterne) {
        this.id = id;
        this.codeInterne = codeInterne;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodeInterne() {
        return codeInterne;
    }

    public void setCodeInterne(String codeInterne) {
        this.codeInterne = codeInterne;
    }
}
