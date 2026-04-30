package Tema8;

import java.sql.*;

public class Howarts {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://ad-postgres.ctngpo0lxboa.us-east-1.rds.amazonaws.com:5432/hogwarts";
        String usuario = "postgres";
        String contrasenya = "12345678";

        try (Connection con = DriverManager.getConnection(url, usuario, contrasenya)) {
            Statement stmt = con.createStatement();

            // 1. Consulta por casa
            System.out.println("--- 1. ESTUDIANTES DE GRYFFINDOR ---");
            ResultSet rs1 = stmt.executeQuery("SELECT e.nombre, e.apellido FROM Estudiante e JOIN Casa c ON e.id_casa = c.id_casa WHERE c.nombre = 'Gryffindor'");
            while (rs1.next()) {
                System.out.println(rs1.getString("nombre") + " " + rs1.getString("apellido"));
            }

            // 2. Mascota de Hermione
            System.out.println("\n--- 2. MASCOTA DE HERMIONE ---");
            ResultSet rs2 = stmt.executeQuery("SELECT m.nombre, m.especie FROM Mascota m JOIN Estudiante e ON m.id_estudiante = e.id_estudiante WHERE e.nombre = 'Hermione' AND e.apellido = 'Granger'");
            if (rs2.next()) {
                System.out.println("Mascota: " + rs2.getString("nombre") + " (" + rs2.getString("especie") + ")");
            }

            // 3. Conteo de estudiantes
            System.out.println("\n--- 3. NÚMERO DE ESTUDIANTES POR CASA ---");
            ResultSet rs3 = stmt.executeQuery("SELECT c.nombre, COUNT(e.id_estudiante) AS total FROM Casa c LEFT JOIN Estudiante e ON c.id_casa = e.id_casa GROUP BY c.nombre");
            while (rs3.next()) {
                System.out.println(rs3.getString("nombre") + ": " + rs3.getInt("total"));
            }

            // 4. Insertar asignatura
            System.out.println("\n--- 4. INSERTANDO ASIGNATURA ---");
            stmt.executeUpdate("INSERT INTO Asignatura (nombre, aula, obligatoria) VALUES ('Programacion Java', 'Aula 101', true)");

            // 5. Modificar aula
            System.out.println("\n--- 5. MODIFICANDO AULA ---");
            stmt.executeUpdate("UPDATE Asignatura SET aula = 'Laboratorio Magico' WHERE nombre = 'Programacion Java'");

            // 6. Eliminar asignatura
            System.out.println("\n--- 6. ELIMINANDO ASIGNATURA ---");
            stmt.executeUpdate("DELETE FROM Asignatura WHERE nombre = 'Programacion Java'");

            System.out.println("\n¡Todo ejecutado correctamente!");

        } catch (SQLException e) {
            System.err.println("Error de SQL: " + e.getMessage());
        }
    }
}
