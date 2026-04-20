package Tema8;

import java.sql.*;

public class RepasoSQL {
    public static void main(String[] args) {

        String sentenciaSQL = "SELECT nombre,apellido FROM profesor";
        String sentenciaSQL2 = "SELECT nombre,apellido FROM estudiante WHERE fecha_nacimiento > '01-01-1980' ";
        String sentenciaSQL3 = "SELECT nombre,apellido FROM estudiante ORDER BY fecha_nacimiento ASC";
        String sentenciaSQL4 = "SELECT c.nombre_casa, COUNT(e.id_estudiante) AS num_estudiante FROM Casa c JOIN Estudiante e ON c.id_casa = e.id_casa GROUP BY c.nombre_casa";
        String sentenciaSQL5 = "SELECT AVG(calificacion) AS media, MAX(calificacion) AS maxima FROM Estudiante_Asignatura JOIN Asignatura ON Estudiante_Asignatura.id_asignatura = Asignatura.id_asignatura WHERE nombre_asignatura = 'Pociones'";
        String sentenciaSQL6 = "SELECT DISTINCT anyo_curso FROM Estudiante";


        try(Connection con2 = DriverManager.getConnection("jdbc:postgresql://localhost:5432/anavicianofabregat");
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

            //3
            PreparedStatement sentencia3 = con2.prepareStatement(sentenciaSQL3);
            ResultSet resultado3 = sentencia3.executeQuery();

            while(resultado3.next()){
                String apellido = resultado3.getString("apellido");
                String nombre = resultado3.getString("nombre");
                System.out.println("personas: " + apellido + ", " + nombre);

            }
            //4
            PreparedStatement sentencia4 = con2.prepareStatement(sentenciaSQL4);
            ResultSet resultado4 = sentencia4.executeQuery();

            while (resultado4.next()) {
                String num_estudiante = resultado4.getString("num_estudiante");
                String nombre_casa= resultado4.getString("nombre_casa");
                System.out.println("Casa: " +nombre_casa + " | Total: " + num_estudiante);
            }
            //5
            PreparedStatement sentencia5 = con2.prepareStatement(sentenciaSQL5);
            ResultSet resultado5 = sentencia5.executeQuery();

            while (resultado5.next()) {
                String media = resultado5.getString("media");
                String maxima = resultado5.getString("maxima");
                System.out.println("|Asignatura Pociones| --> Media: " + media + " | Maxima: " + maxima);
            }
            //6
            PreparedStatement sentencia6 = con2.prepareStatement(sentenciaSQL6);
            ResultSet resultado6 = sentencia6.executeQuery();

            while (resultado6.next()) {
                int anyo_cursos = resultado6.getInt("anyo_cursos");
                System.out.println("Curos: " + anyo_cursos);
            }


        }

        catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
