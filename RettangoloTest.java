
public class RettangoloTest {
    public static void main(String[] args) {
        Rettangolo primoRettangolo = new Rettangolo();
        primoRettangolo.base = 15;
        primoRettangolo.altezza = 5;
        primoRettangolo.displayDimensioni(); 
        primoRettangolo.displayArea(); 
        primoRettangolo.displayForma();
        Rettangolo secondoRettangolo = new Rettangolo(20,7);
        secondoRettangolo.displayDimensioni();
        secondoRettangolo.displayArea();
        secondoRettangolo.displayForma();
        

        
    }
}
