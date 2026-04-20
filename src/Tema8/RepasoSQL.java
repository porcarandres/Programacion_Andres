package Tema8;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        String sentenciaSQL = "SELECT nombre,apellido FROM profesor";
        String sentenciaSQL2 = "SELECT nombre,apellido FROM estudiante WHERE fecha_nacimiento > '01-01-1980' ";

        try(Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
            PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)){

            //no hace falta meterlo en el try, porque se cierra automáticamente al cerrarse el PreparedStatement
            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String apellido = resultados.getString("apellido");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + apellido + ", " + nombre);
            }

        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
