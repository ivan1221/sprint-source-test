package com.claro.amx.ApiManager.pojo;

public class PojoHolaMundo {
    private final String saludo ="Hola mundo";
    private String saludo2;

    public PojoHolaMundo(String dato){
            this.saludo2 = dato;
    }

    public String getSaludo() {
        return saludo;
    }

    public String getSaludo2() {
        return saludo2;
    }

    public void setSaludo2(String saludo2) {
        this.saludo2 = saludo2;
    }
}
