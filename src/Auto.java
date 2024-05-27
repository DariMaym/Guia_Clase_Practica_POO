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


}
