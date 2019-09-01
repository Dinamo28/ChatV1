package chatv1;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Cliente1 {
    static Scanner sc = new Scanner(System.in);
    Socket cliente;
    DataOutputStream buffSalida;
    DataInputStream buffEntrada;
    DataInputStream teclado;
    String nombre;
    ChatFrame vChat;
    
    public Cliente1(Socket cliente, DataOutputStream buffSalida, DataInputStream buffEntrada, DataInputStream teclado, String nombre) {
        this.cliente = cliente;
        this.buffSalida = buffSalida;
        this.buffEntrada = buffEntrada;
        this.teclado = teclado;
        this.nombre = nombre;
        
    }
    
    public void setVentana(ChatFrame vChat){
        this.vChat=vChat;
    }
    
    public void RecibirDatos() {
        Thread hilo = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String mesgIn = buffEntrada.readUTF();
                        vChat.MensajeEntrante(mesgIn);
                        //System.out.println(nombre + "recibir: " + mesgIn);
                    }
                } catch (Exception e) {
                    System.out.print("Hola");
                }
            }
        });
        hilo.start();
    }
    
    

    public void EnviarDatos(String msg) {

        try {

            buffSalida.writeUTF("<"+nombre+"> " + msg);
            buffSalida.flush();
        } catch (Exception e) {
        };

    }
    
    public void EscribirDatos() {
        try {
            String line = "";
            while (!line.equals(".bye")) {
                line = teclado.readLine();
                buffSalida.writeUTF("P. Gonzale3: " + line);
                buffSalida.flush();
            }
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        Socket cliente;
        int puerto = 9000;
        String ip = "";
        System.out.println("Escribe la ip");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("default")) {
            ip = "127.0.0.1";
        }else ip = ans;
        
        //"177.228.66.77";//"10.10.180.134";
        
        DataOutputStream buffSalida;
        DataInputStream buffEntrada, teclado;
        
        ChatFrame vChat = new ChatFrame();
        vChat.setVisible(true);
        
        String tec = "h";
        String msg;
        try {
            cliente = new Socket(ip, puerto);
            buffSalida = new DataOutputStream(cliente.getOutputStream());
            buffEntrada = new DataInputStream(cliente.getInputStream());
            teclado = new DataInputStream(System.in);
            
            System.out.println("Elige un nombre:");
            String nombre = sc.nextLine();
            
            Cliente1 cliente1 = new Cliente1(cliente, buffSalida, buffEntrada, teclado, nombre);
            vChat.setCliente(cliente1);
            cliente1.setVentana(vChat);
            cliente1.RecibirDatos();

        } catch (Exception e) {
        }
    }

}
