package Tema4_ProgramacionObjetos;

public class Cuenta {
    int numCuenta;
    int saldoDispo;

    public Cuenta(int numCuenta, int saldoDispo){
        this.numCuenta=numCuenta;
        this.saldoDispo= saldoDispo;
    }

    public Cuenta(){
        this.numCuenta= 11111;
        this.saldoDispo= 0;
    }

    public void getNumCuenta(int numCuenta){
        this.numCuenta=numCuenta;
    }
    public int setNumCuenta(){
        return numCuenta;
    }
    public void getSaldoDispo(int saldoDispo){
        this.saldoDispo=saldoDispo;
    }
    public int setSaldoDispo(){
        return saldoDispo;
    }

    public void pagar(int paga){
         saldoDispo -= paga;
    }

    public void abonar(int abona){
         saldoDispo += abona;
    }
}
