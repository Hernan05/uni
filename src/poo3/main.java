package poo3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class main {

    public static void main(String [] args){

electrodomestico e=new electrodomestico();
lavarropas la=new lavarropas();
televisor t=new televisor();

        List<electrodomestico> imp=new ArrayList<>();
        imp.add(0, new lavarropas("negro", 'A', 150, 10, 7));
        imp.add(1, new televisor("negro", 'A', 120, 12, 30, false));
        imp.add(2, new lavarropas("azul", 'A', 120, 10, 7));






    }
}
