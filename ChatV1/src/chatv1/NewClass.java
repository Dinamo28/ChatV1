package chatv1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class NewClass {
    public static void guardarArchivosTxT(String username, String alias, String contraseña) {
        File Archivo;
        FileWriter fw;
        PrintWriter linea;
        try {
            String ruta = "C:\\Users\\Public\\usuarios.txt";
            String contenido = username + "\n" + alias + "\n" + contraseña;
            Archivo = new File(ruta);
            // Si el archivo no existe es creado
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
    public void leerArchivo() {
        String correo = "";
        String contraseña = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String temp1 = "";
            String temp2 = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i%5 == 0) {
                    temp1 = temp1 + cadena + "\n";
                }
                i = i+1;
                if (i%6 == 0) {
                    temp2 = temp2 + cadena + "\n";
                }
                if (i == 7) {
                    i = 1;
                }
            }           
            correo = temp1;
            contraseña = temp2;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "no shavo no se pudo");
        }
    }
    public boolean leerCorreoYContraseña(String contraseña, String username) {
        boolean resultado = false;
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Public\\usuarios.txt"));
            String tempcorreo = "";
            String tempcontraseña = "";
            String cadena;
            int i = 1;
            while ((cadena = br.readLine()) != null) {
                if (i%5 == 0) {
                    tempcorreo = cadena;
                }
                if (i%6 == 0) {
                    tempcontraseña = cadena;
                }
                i = i+1;
                if (i == 7) {
                    if (username.equals(tempcorreo) && contraseña.equals(tempcontraseña)) {
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