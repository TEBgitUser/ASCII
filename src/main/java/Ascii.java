import java.util.ArrayList;
public class Ascii {
    ArrayList <String> tablica = new ArrayList<>();
    public void licz() {
        for (int i = 48; i < 123; i++) {
            if(i>=58 && i<=64){
                continue;
            }
            if(i>=91 && i<=96){
                continue;
            }
            tablica.add((char) i+"");
            System.out.print((char) i);
        }
        for (int i = 0; i < tablica.size(); i++) {

        }
        System.out.println();
        System.out.print("\n" + tablica);
    }
}