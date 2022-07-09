import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Viaje
{
    private String origen;
    private String destino;
    private GregorianCalendar horaSalida;
    private GregorianCalendar horaLlegada;
    
    private Pasajero[] pasajeros;
   
    private int capacidad;
    private int cont;
    private Bus bus;
    
    public Viaje()
    {
        
    }
    
    public Viaje(String origen, String destino, GregorianCalendar horaSalida, GregorianCalendar horaLlegada, int capacidad)
    {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.capacidad = capacidad;
        
        this.pasajeros = new Pasajero[capacidad];
        
        this.cont=0;
    }
    
    public String getOrigen()
    {
        return this.origen;
    }//end method getOrigen

    public void setOrigen(String origen)
    {
        this.origen = origen;
    }//end method setOrigen

    public String getDestino()
    {
        return this.destino;
    }//end method getDestino

    public void setDestino(String destino)
    {
        this.destino = destino;
    }//end method setDestino

    public GregorianCalendar getHoraSalida()
    {
        return this.horaSalida;
    }//end method getHoraSalida

    public void setHoraSalida(GregorianCalendar horaSalida)
    {
        this.horaSalida = horaSalida;
    }//end method setHoraSalida

    public GregorianCalendar getHoraLlegada()
    {
        return this.horaLlegada;
    }//end method getHoraLlegada

    public void setHoraLlegada(GregorianCalendar horaLlegada)
    {
        this.horaLlegada = horaLlegada;
    }//end method setHoraLlegada

    public Pasajero[] getPasajeros()
    {
        return this.pasajeros;
    }//end method getPasajeros

    public void setPasajeros(Pasajero[] pasajeros)
    {
        this.pasajeros = pasajeros;
    }//end method setPasajeros

    public Bus getBus()
    {
        return this.bus;
    }//end method getBus

    public void setBus(Bus bus)
    {
        this.bus = bus;
    }
    
    public void anadirPasajero(Pasajero p)
    {
        this.pasajeros[this.cont] = p;
        this.cont++;
        
    }
    
    public String buscarPasajeros(String busqueda)
    {
        String resultado = "";
        
        for (int i = 0; i < this.cont; i++)
        {
            if (this.pasajeros[i].getNombre().equals(busqueda) || this.pasajeros[i].getApellido().equals(busqueda) || (this.pasajeros[i].getNumDocumento()+"").equals(busqueda))
            {
                resultado = resultado + this.pasajeros[i].toString() + "\n";
            }
        }
        
        return resultado;
    }
    
    public int getCont()
    {
        return this.cont;
    }
    
    public String toString()
    {
        SimpleDateFormat formato = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        String mensaje = "Origen: "+this.origen+"\n"+
                         "Destino: "+this.destino+"\n"+
                         "Salida: "+formato.format(this.horaSalida.getTime())+"\n"+
                         "Llegada: "+formato.format(this.horaLlegada.getTime())+"\n";
        return mensaje;
    }
}






