public abstract class Vehiculo
{
    private String placa;
    
    public void setPlaca(String placa)
    {
        this.placa = placa;
    }
    
    public String getPlaca()
    {
        return this.placa;
    }
    
    public abstract String getNombreEmpresa();
}
