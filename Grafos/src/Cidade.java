public class Cidade {

    private double latitude;
    private double longitude;
    private String nome;

    public Cidade(String n, double lat, double lon){
        latitude = lat;
        longitude = lon;
        nome = n;
    }

    public String getNome() {
        return nome;
    }
    public double getLatitude() {
        return latitude;
    }
    public double getLongitude() {
        return longitude;
    }
    

}
