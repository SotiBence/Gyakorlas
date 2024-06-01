
package gyakorlas;


public class Gyakorlas {
    
    private static final String SEP = System.lineSeparator();
    private static int[] sorozat = {5, 6, 2, 4, 1};

    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        konzolraIr("A sorozat elemei: " + SEP);
        konzolraIr(sorozatElemei() + SEP);
        progTetelekFelhasznalasa();
    }
    
        private static void progTetelekFelhasznalasa() {
            osszegzesBemutatasa();
            megszamlalasBemutatasa();
            szelsoertekBemutatasa();
            kivalasztasBemutatasa();
            eldontesekBemutatasa();
            linKerBemutatasa();
        }
        
        
    private static int osszegzes(){
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg = osszeg + sorozat[i];
        }
		System.out.println(osszeg);
        return osszeg;
    }
    
    private static boolean eldontes(){
        int N = sorozat.length;
        int ker = 5;
        int i = 0;
        while(i < N && !(sorozat[i] > ker)){
            i++;
        }
        boolean valasz = i < N;  
        return valasz;
    }
    
    private static int megszamlalas(){
        int n = sorozat.length;
        int szamlalo = 0;
        for (int szam : sorozat) {
            if(szam > 0 && szam % 2 == 0)
                szamlalo++;
        }
            System.out.println(szamlalo);
        return szamlalo;
    }
    
    private static int minKivalasztas(){
        int n = sorozat.length;
        int min = sorozat[0];
        for (int i = 0; i < n; i++) {
            if (sorozat[i] < min) {
                min = sorozat[i];
            }
        }
            System.out.println("Legkisebb: " + min);
    return min;
    }
    
    private static int maxKivalasztas(){
        int n = sorozat.length;
        int max = sorozat[0];
        for (int i = 0; i < n; i++) {
            if (sorozat[i] > max) {
                max = sorozat[i];
            }
        }
            System.out.println("Legnagyobb: " + max);
        return max;
    }
    
    private static int kivalasztas(){
        
        int i =0;
        while(!(sorozat[i] >= 4)){
            i++;
        }
        
        return i;
    }
    
    private static boolean eldontesEgy(){
       int n = sorozat.length;
       int i = 0;
       while(i < n && !(sorozat[i] % 2 == 1)){
           i++;
       }
        return i < n;
    }
    
    private static boolean eldontesMind(){
        int n = sorozat.length;
        int i =0;
        while(i < n && sorozat[i] > 5){
            i++;
        }
        return i >= n;
    }
    
    private static int linKereses(){
        int n = sorozat.length;
        int i = 0;
        while(i < n && !(sorozat[i] % 2 == 1 && sorozat[i] > 5)){
            i++;
        }
        boolean van = i < n;
        if (van) {
            return i;
            //System.out.printf("A keresett elem (> %d):\n",ker);
            //System.out.printf("helye: " + i);
            //System.out.println("értéke: " + sorozat[i]);
        }else{
            return -i;
            //System.out.println("nincs a keresésnek megfelelő elem: ");
            //System.out.println("nincs > " + ker);
        }
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }

    private static void osszegzesBemutatasa() {
        konzolraIr("osszgzes: ");
        int osszeg = osszegzes();
        konzolraIr(osszeg + SEP);
        double atlag = (double)osszeg / sorozat.length;
        konzolraIr("a sorozat átlaga: %.2f%s".formatted(atlag,SEP));
    }

    private static void megszamlalasBemutatasa() {
        konzolraIr("megszamlalas ");
        megszamlalas();
        
    }

    private static void szelsoertekBemutatasa() {
        konzolraIr("Min kivalasztas: ");
        minKivalasztas();
        konzolraIr("Max kivalasztas: ");
        maxKivalasztas();
    }

    private static void kivalasztasBemutatasa() {
        konzolraIr("az elso elem ami > 5 : " );
        konzolraIr(sorozat[kivalasztas()] + SEP);
    }

    private static void eldontesekBemutatasa() {
        String valasz = eldontesEgy() ? "van" : "nincs";
        konzolraIr("van legalabb 1 paratlan : " + valasz + SEP);
                valasz = eldontesMind() ? "igen" : "nem";
        konzolraIr("minden elem > 5 : " + valasz + SEP);
    }

    private static void linKerBemutatasa() {
        konzolraIr("A keresett elem paratlan és > 10" + SEP);
        int i = linKereses();
        if (i != -1) {
            konzolraIr("Van ilyen elem" + SEP);
        }else{
            konzolraIr("Nincs ilyen elem");
        }
    }

    private static String sorozatElemei() {
        for (int i = 0; i < sorozat.length; i++) {
            System.out.print(sorozat[i] + " ");
        }
        return " ";
    }


    
}
