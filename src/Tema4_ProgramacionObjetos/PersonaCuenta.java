package Tema4_ProgramacionObjetos;

public class PersonaCuenta {

        private String dni;
        private Cuenta[] cuentas;
        private int contadorCuentas;

        public PersonaCuenta(String dni) {
            this.dni = dni;
            this.cuentas = new Cuenta[3];
            this.contadorCuentas = 0;
        }
        public PersonaCuenta(){
            this.dni= "1111111A";
            this.cuentas= new Cuenta[3];
            this.contadorCuentas= 0;
        }

        public String getDni() {
            return dni;
        }

        public boolean añadirCuenta(Cuenta nuevaCuenta){
            if(contadorCuentas< cuentas.length){
                cuentas[contadorCuentas] = nuevaCuenta;
                contadorCuentas ++;
                return true;
            } else {
                System.out.println("Error "+dni+" ya tiene 3 cuentas.");
                return false;
            }
        }
        public boolean esMoroso(){
            for (int i = 0; i < contadorCuentas; i++) {
                if (cuentas[i].setSaldoDispo() < 0){
                    return true;
                }

            }
            return false;
        }
        public String toString() {
        String resultado = "DNI: " + this.dni + "\n";

        for (int i = 0; i < this.cuentas.length; i++) {
            if (this.cuentas[i] != null) {
                resultado += "Cuenta: " + this.cuentas[i].numCuenta + " Saldo: " + this.cuentas[i].setSaldoDispo()+"€\n";
            }
        }
        return resultado;
    }
}
