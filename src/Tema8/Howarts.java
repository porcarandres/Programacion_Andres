package Tema8;

import java.sql.*;

public class Howarts {

    public static void main(String[] args) {

        String sentenciaSQL = "SELECT nombre,apellido FROM profesor";
        String sentenciaSQL2 = "SELECT nombre,apellido FROM estudiante WHERE fecha_nacimiento > '01-01-1980' ";


        try(Connection con2 = DriverManager.getConnection("jdbc:postgresql://ad-postgres.ctngpo0lxboa.us-east-1.rds.amazonaws.com:5432/hogwarts","postgres","12345678");
            //1
            PreparedStatement sentencia = con2.prepareStatement(sentenciaSQL)){
            ResultSet resultados = sentencia.executeQuery();

            while(resultados.next()){
                String apellido = resultados.getString("apellido");
                String nombre = resultados.getString("nombre");
                System.out.println("personas: " + apellido + ", " + nombre);
            }
            //2
            PreparedStatement sentencia2 = con2.prepareStatement(sentenciaSQL2);
            ResultSet resultado = sentencia2.executeQuery();

            while(resultado.next()){
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
