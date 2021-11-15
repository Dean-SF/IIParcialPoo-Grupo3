package Ejercicio_1;

public class Main_1 {
    public static void main(String args[]){
        Alarma alarma1 = new Alarma("Alarmita",TActivador.SIN_ACTIVADOR);
        Alarma alarma2 = new Alarma("OtraAlarmita",TActivador.POR_CODIGO,"123");

        CajaFuerte caja1 = new CajaFuerte("CajaMuyFuerte", TActivador.DOS_ACTIVADORES,"124");
        CajaFuerte caja2 = new CajaFuerte("CajaPocoFuerte", TActivador.POR_TIEMPO);

        Puerta puerta1 = new Puerta("PuertaNoSegura", TActivador.SIN_ACTIVADOR);
        Puerta puerta2 = new Puerta("PuertaUltraSegura", TActivador.DOS_ACTIVADORES,"125");
        
        Ventana ventana1 = new Ventana("VentanaFrontal", TActivador.POR_CODIGO,"126");
        Ventana ventana2 = new Ventana("VentanaTrasera", TActivador.POR_TIEMPO);

        System.out.println("----------- SE CREAN LOS SIGUIENTES DISPOSITIVOS: -----------");
        System.out.println("Dos Alarmas con codigo 'Alarmita' y 'OtraAlarmita', sin activador y "+
        "la otra por codigo respectivamente\n el codigo es 123");

        System.out.println("\nDos cajas fuertes con codio 'CajaMuyFuerte' y 'CajaPocoFuerte' con dos activadores y" +
        " por tiempo respectvamente\nel codigo es 124");

        System.out.println("\nDos puertas con codigo 'PuertaNoSegura' y 'PuertaUltraSegura', sin activadores y con dos " +
        "activadores respectivamente\nel codigo es 125");

        System.out.println("\nDos ventanas con codigo 'VentanaFrontal' y 'VentanaTrasera' por codigo y por tiempo " + 
        "respectivamente\nel codigo es 126");
        SistemaSeguridad sistema = new SistemaSeguridad();
        sistema.agregarDispositivo(alarma1);
        sistema.agregarDispositivo(alarma2);

        sistema.agregarDispositivo(caja1);
        sistema.agregarDispositivo(caja2);

        sistema.agregarDispositivo(puerta1);
        sistema.agregarDispositivo(puerta2);

        sistema.agregarDispositivo(ventana1);
        sistema.agregarDispositivo(ventana2);
        System.out.println("-------- SE AGREGAN TODOS A UN SISTEMA DE SEGURIDAD ---------");
        System.out.println("Se ejecuta el protocolo de activacion");
        sistema.ejecutarMecanismoActivacion();
    }
}
