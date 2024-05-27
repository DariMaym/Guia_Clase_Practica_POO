public class Auto extends VehiculoPasajero{
    private String tipoCombustible;
    //constructor
    public Auto(String Marca, String Modelo, int Año, int Kilometraje, int numPasajeros, String tipoCombustible){
        super(Marca, Modelo, Año, Kilometraje, numPasajeros);
        this.tipoCombustible=tipoCombustible;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo de combustible: " + tipoCombustible);
    }

    
    @Override
    void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("    -Llantas-");
        System.out.println("    -Frenos-");
        System.out.println("    -Trasmision delantera-");
        System.out.println("    -Filtro de aire del motor-");
        System.out.println("    -Bateria-");
        System.out.println("    -Alineacion de ruedas-");
        System.out.println("    -Sustitucion de bujias-");
    }

    void calcularCostoMantenimiento(int costoporKm, int kilometrosRecorridos){
        System.out.print("El costo del mantenimiento es de: ");
        int costoTotal = costoporKm * kilometrosRecorridos;
        System.out.println(costoTotal+ "$");

    }


}
