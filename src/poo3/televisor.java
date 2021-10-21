package poo3;

public class televisor extends electrodomestico {
    private static double pulgadas=20;
    private static boolean tdt=false;

    public televisor() {
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.precioBase=precioBase;
        this.peso=peso;
        this.pulgadas=pulgadas;
        this.tdt=tdt;
    }

    public televisor(double precioBase, double peso) {
        super(precioBase, peso);
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.pulgadas=pulgadas;
        this.tdt=tdt;
    }

    public televisor(String color, char consumoEnerg, double precioBase, double peso, double pulgadas, boolean tdt) {
        super(color, consumoEnerg, precioBase, peso);
        this.pulgadas=pulgadas;
        this.tdt=tdt;
    }

    public static double getPulgadas() {
        return pulgadas;
    }

    public static boolean getTdt() {
        return tdt;
    }

    @Override
    public double precioFinal() {
        double n=0;
        double c=0;
        if (pulgadas>40){
            n=0.3;
        }
        if (tdt == true){
            c=50;
        }
        return (super.precioFinal()+c)*n;
    }



}
