package Ejercicio_1;

import java.util.LinkedList;
import java.util.Scanner;

public class SistemaSeguridad {
    private LinkedList<Dispositivo> dispositivos = new LinkedList<Dispositivo>();

    public SistemaSeguridad() {
        // Constructor default
    }

    public boolean agregarDispositivo(Dispositivo device) {
        if(dispositivos.contains(device)) {
            return false;
        }
        dispositivos.add(device);
        return true;
    }

    public boolean eliminarDispositivo(String id) {
        Dispositivo dispositivo = consultarDispositivo(id);
        if(dispositivo != null) {
            dispositivos.remove(dispositivo);
            return true;
        }
            
        return false;
    }

    public Dispositivo consultarDispositivo(String id){
        for(Dispositivo actual : dispositivos) {
            if(actual.getId().equals(id)) {
                return actual;
            }
        }
        return null;
    }
    
    public boolean cambiarMecanismoActivacion(String id, TActivador tipo) {
        Dispositivo dispositivo = consultarDispositivo(id);
        if(dispositivo == null) {
            return false;
        }
        dispositivo.setActivador(tipo);
        return true;
    }

    public boolean cambiarMecanismoActivacion(String id, TActivador tipo, String contraseña) {
        Dispositivo dispositivo = consultarDispositivo(id);
        if(dispositivo == null) {
            return false;
        }
        dispositivo.setActivador(tipo);
        dispositivo.setContrasena(contraseña);
        return true;
    }

    public void ejecutarMecanismoActivacion() {
        Scanner input = new Scanner(System.in);
        for(Dispositivo actual : dispositivos) {
            TActivador activador = actual.getActivador();
            if(activador == TActivador.SIN_ACTIVADOR) {
                System.out.println("El dispositivo: " + actual.tipoHerencia() + " de ID: " + actual.getId() + 
                " no tiene activador");;
            } else if(activador == TActivador.POR_CODIGO) {
                System.out.println("Digite el codigo del dispositivo con ID: " + actual.getId());
                String codigo = input.nextLine();
                System.out.println(actual.activador(codigo));
            } else if(activador == TActivador.POR_TIEMPO) {
                System.out.println("Digite el tiempo del temporizador para el dispositivo con ID: " + actual.getId());
                int time = input.nextInt();
                Thread ejecucion = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(actual.activador(time));
                    }
                });
                ejecucion.start();
            } else if(activador == TActivador.DOS_ACTIVADORES) {
                System.out.println("Digite el tiempo del temporizador para el dispositivo con ID: " + actual.getId());
                int time = input.nextInt();
                System.out.println("Digite el codigo del dispositivo con ID: " + actual.getId());
                input.nextLine();
                String codigo = input.nextLine();
                Thread ejecucion = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(actual.activador(time,codigo));
                    }
                });
                ejecucion.start();
            }
        }
        input.close();
    }

    public boolean ejecutarMecanismoCodigo(String codigo, String id) {
        Dispositivo actual = consultarDispositivo(id);
        if(actual == null)
            return false;
        actual.activador(codigo);
        return true;
    }

    public boolean ejecutarMecanismoTiempo(int tiempo, String id) {
        Dispositivo actual = consultarDispositivo(id);
        if(actual == null)
            return false;
        actual.activador(tiempo);
        return true;
    }

}
