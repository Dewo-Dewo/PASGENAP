package com.example.pasgenap;


public class ModelView {
    private String name, nim, noHp, email;

    public ModelView(String name, String nim, String noHp, String email) {
        this.name = name;
        this.nim = nim;
        this.noHp = noHp;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
