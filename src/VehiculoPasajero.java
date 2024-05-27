public class VehiculoPasajero extends Vehiculo {

    private int numPasajeros;
    

    //constructor 
    public VehiculoPasajero(String Marca, String Modelo, int Año, int Kilometraje, int numPasajeros){
        super(Marca, Modelo, Año, Kilometraje);
        this.numPasajeros= numPasajeros;
    }

    //enviar y traer los datos
    public int getNumPasajeros() {
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros) {
        this.numPasajeros = numPasajeros;
    }

    //sobreescribir el metodo mostrarInfo
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de pasajeros: " + numPasajeros);
    }
}
