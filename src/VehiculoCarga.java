public class VehiculoCarga extends Vehiculo{
    private int CapacidadCarga;
    //constructor 
    public VehiculoCarga(String Marca, String Modelo, int Año, int Kilometraje, int CapacidadCarga){
        super(Marca, Modelo, Año, Kilometraje);
        this.CapacidadCarga=CapacidadCarga;
    }

    public int getCapacidadCarga() {
        return CapacidadCarga;
    }
    public void setCapacidadCarga(int capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    //sobreescribir el metodo para mostrar la informacion
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Capacidad de carga: " + CapacidadCarga + "kg");
    }



}
