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

        public boolean anyadirCuenta(Cuenta nuevaCuenta){
            boolean anyadida = false;
            if(contadorCuentas< cuentas.length){
                cuentas[contadorCuentas] = nuevaCuenta;
                contadorCuentas ++;
                anyadida= true;
            } else {
                System.out.println("Error "+dni+" ya tiene 3 cuentas.");
                anyadida= false;
            }
            return anyadida;
        }

        public Cuenta[] getCuentas() {
            return cuentas;
        }
        public boolean esMoroso(){
            boolean moroso = false;
            for (int i = 0; i < contadorCuentas; i++) {
                if (cuentas[i].setSaldoDispo() < 0) {
                    moroso = true;
                }
                else {
                    moroso = false;
                }
            }
            return moroso;
        }

    public String toString() {
        String resultado = "Persona con DNI: " + this.dni;
        resultado += "Cuentas asociadas:";

        for (int i = 0; i < contadorCuentas; i++) {
            resultado += cuentas[i].toString();
        }
        return resultado;
    }
}
