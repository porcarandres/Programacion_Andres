package Tema_5_Colecciones2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class AcortadorURL {
    private Map<String, String> diccionarioUrls;

    public AcortadorURL() {
        this.diccionarioUrls = new HashMap<>();
    }

    public String crearRegistro(String urlOriginal) {
        String clave = generarClaveAleatoria(5);
        diccionarioUrls.put(clave, urlOriginal);
        return clave;
    }

    public String resolverDireccion(String clave) {
        if (diccionarioUrls.containsKey(clave)) {
            return diccionarioUrls.get(clave);
        }
        return "Error: La dirección no existe.";
    }

    public void borrarRegistro(String clave) {
        if (diccionarioUrls.remove(clave) != null) {
            System.out.println("Registro " + clave + " borrado.");
        } else {
            System.out.println("No se encontró la clave.");
        }
    }

    public void mostrarTodos() {
        if (diccionarioUrls.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            diccionarioUrls.forEach((clave, url) ->
                    System.out.println("https://acortar.link/" + clave + " --- " + url));
        }
    }

    private String generarClaveAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        while (sb.length() < longitud) {
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }
        return sb.toString();
    }
}