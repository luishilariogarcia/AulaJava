import java.util.*;
public class Horario implements MeuHorario {
    
    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
    
    private int hora, minuto, segundo;
    
    public Horario(){
        setHora(8);
        setMinuto(15);
        setSegundo(46);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return segundo;
    }

    public String toString() {
        return getHora()+":"+getMinuto()+":"+getSegundo();
    }
}