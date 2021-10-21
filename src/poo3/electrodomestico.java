package poo3;

import com.sun.javaws.exceptions.ExitException;

public class electrodomestico {

   protected static String color="blanco";
   protected static char consumoEnerg='F';
   protected static double precioBase=100.00;
   protected static double peso=5;




    public electrodomestico() {
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.precioBase=precioBase;
        this.peso=peso;

    }

    public electrodomestico(double precioBase, double peso){
        this.precioBase=precioBase;
        this.peso=peso;
        this.color=color;
        this.consumoEnerg=consumoEnerg;
    }

    public electrodomestico(String color, char consumoEnerg, double precioBase, double peso){
        this.color=color;
        this.consumoEnerg=consumoEnerg;
        this.precioBase=precioBase;
        this.peso=peso;
    }

    public static String getColor() {
        return color;
    }

    public static char getConsumoEnerg() {
        return consumoEnerg;
    }

    public static double getPrecioBase() {
        return precioBase;
    }

    public static double getPeso() {
        return peso;
    }

    protected static char letras []={'A','B','C','D','E','F'};

    public void comprobarConsumoEnerg(char consumo){
        boolean x=false;

        for (int i=0; i<letras.length && !x; i++){
            if (x){
               consumo=consumoEnerg;
            }else{
                consumo=consumoEnerg;
            }
        }
    }

    protected static String colors []={"blanco","negro","rojo","azul","gris"};

    public void comprobarColor(String cool){
        boolean x=false;

        for (int i=0; i<colors.length && !x; i++){
             if (colors[i].equals(cool)){
                 x=true;
             }
        }
        if (x){
            cool=color;
        }else{
            cool=color;
        }
    }

    public double precioFinal(){
        double x=0;
        double z=0;
        switch (consumoEnerg){
            case 'A':
                x=100;
                break;
            case 'B':
                x=80;
                break;
            case 'C':
                x=60;
                break;
            case 'D':
                x=50;
                break;
            case 'E':
                x=30;
                break;
            case 'F':
                x=10;
                break;
        }

        if (peso<=19){
            z=10;
        }
        if (peso >= 20 && peso <=49){
            z=50;
        }
        if (peso>=50 && peso<=79){
            z=80;
        }
        if (peso>=80){
            z=100;
        }
        return precioBase+x+z;
    }


}
