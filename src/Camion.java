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

}
