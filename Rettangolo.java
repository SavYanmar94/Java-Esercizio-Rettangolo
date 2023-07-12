public class Rettangolo {
    public int base ; 
    public int altezza ; 


    public Rettangolo(int base, int altezza) {   // costruttore personalizzato

        this.base = base;           
        this.altezza = altezza; 

    }

    public Rettangolo(){ 


    }


    public void displayDimensioni() {

        System.out.println("La base misura: " + base);
        System.out.println("L'altezza misura: "  + altezza);
    }

    public void displayArea() {

        System.out.println("L'area del rettangolo è " + (base * altezza));

    }


    public void displayForma() {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
