package br.com.uri.controllers;

@javax.faces.bean.ManagedBean
@javax.faces.bean.RequestScoped
public class CalculadoraController {
    private Integer valor1;
    private Integer valor2;
    private Integer resultado;

    public Integer getValor1() {
        return valor1;
    }

    public void setValor1(Integer valor1) {
        this.valor1 = valor1;
    }

    public Integer getValor2() {
        return valor2;
    }

    public void setValor2(Integer valor2) {
        this.valor2 = valor2;
    }

    public Integer getResultado() {
        return resultado;
    }
    
    public void somar() {
        this.resultado = valor1 + valor2;
    }
}