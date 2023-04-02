import java.util.ArrayList;

public class TablicaASCII {
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> lista2 = new ArrayList<>();
        for(int i=48;i<123;i++){
        if(i >= 58 && i <= 64){
            continue;
        }
        if(i >= 91 && i <= 96){
            continue;
        }
        lista.add((char)i+"");
        lista2.add((char)i+"");
        System.out.print((char)i);
    }
        System.out.println();
        System.out.println(lista);
        lista.toArray();
        lista2.toArray();
        for (int i = 0; i <lista.size(); i++) {

    }
}
