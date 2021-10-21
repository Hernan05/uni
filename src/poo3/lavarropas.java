package poo3;

public class lavarropas extends electrodomestico {

    private static double carga=5;

    public lavarropas (){
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.precioBase=precioBase;
        this.peso=peso;
        this.carga=carga;
    }

    public lavarropas(double precioBase, double peso) {
        super(precioBase, peso);
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.carga=carga;
    }

    public lavarropas(String color, char consumoEnerg, double precioBase, double peso, double carga) {
        super(color, consumoEnerg, precioBase, peso);
        this.carga=carga;
    }

    public static double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double b=0;
        if (carga >30){
            b=50;
        }

        return super.precioFinal()+b;
    }


}


