package ej2;

public abstract class Billete implements Dinero.IDinero {
        int valor;
        int impBillete;

    public void billete(int valor, int impBillete){
        this.valor=valor;
        this.impBillete=impBillete;
    }
    @Override
    public void valor() {
        valor=impBillete;
    }

    public int getImpBillete() {
        return impBillete;
    }

    public void setImpBillete(int impBillete) {
        this.impBillete = impBillete;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
