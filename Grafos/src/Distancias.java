public class Distancias implements Comparable{
    private String cidade1;
    private String cidade2;
    private double distancia;

    public Distancias(String cidade1, String cidade2, double distancia) {
        this.cidade1 = cidade1;
        this.cidade2 = cidade2;
        this.distancia = distancia;
    }


    @Override
    public int compareTo(Object outra) {
        if(this.distancia < ((Distancias) outra).getDistancia()) {
            return 1;
        } else if(this.distancia > ((Distancias) outra).getDistancia()) {
            return -1;
        }
        return 0;
    }

    public double getDistancia() {
        return this.distancia;
    }

}
