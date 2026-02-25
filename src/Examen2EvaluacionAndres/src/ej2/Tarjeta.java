package ej2;

public abstract class Tarjeta implements Dinero.IDinero {

    String numero;
    double saldo;
    double credito;

    @Override
    public void valor() {
        double v = saldo + credito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
