package com.cocorette.genesis.bo;

public class ContactBo {
    private String mail;
    private String telFixe;
    private String telPort;
    private String fax;

    public ContactBo(){}

    public ContactBo(String mail, String telFixe, String telPort, String fax){
        this.mail = mail;
        this.telFixe = telFixe;
        this.telPort = telPort;
        this.fax = fax;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelPort() {
        return telPort;
    }

    public void setTelPort(String telPort) {
        this.telPort = telPort;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
}
