package Ejercicio_1;

public abstract class Dispositivo implements Activador{
    protected boolean activada;
    protected TActivador activador;
    protected String id;
    protected String contrasena;
    
    public Dispositivo(){};

    public void setActivada(boolean activada) {
        this.activada = activada;
    }
    public void setActivador(TActivador activador) {
        this.activador = activador;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isActivada() {
        return activada;
    }
    public TActivador getActivador() {
        return activador;
    }
    public String getId() {
        return id;
    }
    public String getContrasena() {
        return contrasena;
    }

    public String tipoHerencia(){
        if(this instanceof Alarma){
            return "Alarama";
        }else if(this instanceof CajaFuerte){
            return "Caja fuerte";
        }else if(this instanceof Puerta){
            return "Puerta";
        }else{
            return "Ventana";
        } 
    }
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if(obj.getClass() != this.getClass()) {
            return false;
        }
        if(((Dispositivo)(obj)).id != this.id) {
            return false;
        }
        return true;
    }
    @Override
    public String activador(int num, String codigo){
        if(activador!=TActivador.SIN_ACTIVADOR ){
            if(codigo.equals(contrasena)){
                if(num>0){
                    //Hacer la parte de tiempo.
                    activada = true;
                    return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' se activo correctamente.";
                }
                return "El tiempo debe de ser mayor a cero"; 
            }
            return "la contrasena del dispositivo "+tipoHerencia()+" de nombre '"+id+
                    "' es diferente."; 
        }
        return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' no tiene activador.";
    };
    @Override
    public String activador(int num){
        if(activador!=TActivador.SIN_ACTIVADOR ){
            if(num>0){
                //Hacer la parte de tiempo.
                activada = true;
                return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' se activo correctamente.";
            }
            return "El tiempo debe de ser mayor a cero"; 
        }
        return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' no tiene activador.";
    };
    @Override
    public String activador(String codigo){
        if(activador!=TActivador.SIN_ACTIVADOR ){
            if(codigo.equals(contrasena)){
                activada = true;
                return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' se activo correctamente.";
            }
            return "La contrasena del dispositivo "+tipoHerencia()+" de nombre '"+id+
                    "' es diferente."; 
        }
        return "El dispositivo "+tipoHerencia()+" de nombre '"+id+"' no tiene activador.";
    };
}
