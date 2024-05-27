public class Camion extends VehiculoCarga{
    private int numEjes;

    //constructor
    public Camion(String Marca, String Modelo, int Año, int Kilometraje, int capacidadCarga, int numEjes){
        super(Marca, Modelo, Año, Kilometraje, capacidadCarga);
        this.numEjes=numEjes;
    }

    public int getNumEjes() {
        return numEjes;
    }
    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de Ejes: " + numEjes);
    }

    @Override
    void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("    -Frenos-");
        System.out.println("    -Lubricante-");
        System.out.println("    -Bateria-");
        System.out.println("    -Sistema Electrico-");
        System.out.println("    -Amortiguadores-");
        System.out.println("    -Correa de distribucion-");
    }

    //metodo inventado por mi, para practicar
    void mantenimientoCamion(int añosDeOperacion, int costoporKm, int kilometrosRecorridos){
        System.out.print("Precio del mantenimiento: ");
        int costoTotal = kilometrosRecorridos/añosDeOperacion
    * costoporKm;
        System.out.println(costoTotal+"$");
    }

}
