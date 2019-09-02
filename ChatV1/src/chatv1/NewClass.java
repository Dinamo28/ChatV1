package chatv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

public class NewClass {
    public static void guardarArchivosTxT(String username, String alias, String contraseña) {
        File Archivo;
        FileWriter fw;
        PrintWriter linea;
        try {
            String ruta = "C:\\Users\\Public\\usuarios.txt";
            String contenido = alias + "\n" + username + "\n" + contraseña;
            Archivo = new File(ruta);
            if (!Archivo.exists()) {
                Archivo.createNewFile();
            }
            fw = new FileWriter(Archivo, true);
            linea = new PrintWriter(fw);
            linea.println(contenido);
            linea.close();
            fw.close();
            JOptionPane.showMessageDialog(null, "Your data has been saved succesfully! :)");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "There was an error, try again :(");
        }
    }
    public static void Log(String log){
        File archivo;
        FileWriter fw;
        PrintWriter linea;
        try {
            LocalDateTime myObj = LocalDateTime.now();
            String ruta = "C:\\Users\\Public\\" +myObj+".txt";
            String contenido = log;
            archivo = new File(ruta);
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            fw = new FileWriter(archivo, true);
            linea = new PrintWriter(fw);
            linea.println(contenido);
            linea.close();
            fw.close();
        } catch (Exception e) {

        }
    }
    static public String obtenerAlias(String contraseña, String username){
        String alias = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String tempcorreo = "";
            String tempcontraseña = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i==1) {
                    alias = cadena;
                }
                if (i%2 == 0) {
                    tempcorreo = cadena;
                }
                if (i%3 == 0) {
                    tempcontraseña = cadena;
                }
                i = i+1;
                if (i == 4) {
                    if (username.equals(tempcorreo) && contraseña.equals(tempcontraseña)) {
                        
                        break;
                    }
                    i = 1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong! :(");
        }
        System.out.println(alias);
        return alias;
    }
    public boolean leerusernameYContraseña(String contraseña, String username) {
        boolean resultado = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String tempuser = "";
            String tempcontraseña = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i%2 == 0) {
                    tempuser = cadena;
                }
                if (i%3 == 0) {
                    tempcontraseña = cadena;
                }
                i = i+1;
                if (i == 4) {
                    if (username.equals(tempuser) && contraseña.equals(tempcontraseña)) {
                        resultado = true;
                        break;
                    }
                    i = 1;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong! :(");
        }
        return resultado;
    }
}
