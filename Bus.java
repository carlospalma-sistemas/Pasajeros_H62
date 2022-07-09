public class Bus extends Vehiculo
{
    private int numPuestos;
    private String tipo;
    private int numInterno;
    
    public Bus()
    {
         
    }
    
    public Bus(int numPuestos, String placa, String tipo, int numInterno)
    {
        this.numPuestos = numPuestos;
        this.tipo = tipo;
        this.numInterno = numInterno;
    }
    
    /**GET Method Propertie numPuestos*/
    public int getNumPuestos(){
        return this.numPuestos;
    }//end method getNumPuestos

    /**SET Method Propertie numPuestos*/
    public void setNumPuestos(int numPuestos){
        this.numPuestos = numPuestos;
    }//end method setNumPuestos

    /**GET Method Propertie tipo*/
    public String getTipo(){
        return this.tipo;
    }//end method getTipo

    /**SET Method Propertie tipo*/
    public void setTipo(String tipo){
        this.tipo = tipo;
    }//end method setTipo

    /**GET Method Propertie numInterno*/
    public int getNumInterno(){
        return this.numInterno;
    }//end method getNumInterno

    /**SET Method Propertie numInterno*/
    public void setNumInterno(int numInterno){
        this.numInterno = numInterno;
    }//end method setNumInterno
    
    public String getNombreEmpresa()
     {
         return "Brasilia";
     }

}