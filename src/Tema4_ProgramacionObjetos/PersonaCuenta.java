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

        public String getDni() {
            return dni;
        }

}
