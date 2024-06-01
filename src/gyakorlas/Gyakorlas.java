
package gyakorlas;


public class Gyakorlas {
    
    private static int[] sorozat = {5, 6, 2, 4, 1};

    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        
    }
    
    private static int osszegzes(){
        int osszeg = 0;
        for (int i = 0; i < sorozat.length; i++) {
            osszeg = osszeg + sorozat[i];
        }
		System.out.println(osszeg);
        return osszeg;
    }
    
    private static int eldontes(){
        int n = sorozat.length;
        int ker = 2;
        
        int i = 0;
        while(i < n && sorozat[i] != ker){
        i++;
        if(i < n){
            System.out.println("Van ilyen szám");
        }else{
            System.out.println("Nincs ilyen szám");
        }
    }
        return 0;
    }
    
    private static int megszamlalas(){
        int n = sorozat.length;
        int szamlalo = 0;
        for (int i = 0; i < n; i++) {
            if (sorozat[i] > 5) {
                szamlalo++;
            }
            System.out.println(szamlalo);
        }
        return szamlalo;
    }
    
    private static int minKivalasztas(){
        
    return 0;
    }
    
    private static int maxKivalasztas(){
        
        return 0;
    }
    
    private static int kivalasztas(){
        int n = sorozat.length;
        int ker =2;
        
        int i =0;
        while(sorozat[i] != ker){
            i++;
        }
        System.out.printf("%d\n", i + 1);
        
        return 0;
    }
    
    private static boolean eldontesEgy(){
       
        return false;
    }
    
    private static boolean eldontesMind(){
        
        return false;
    }
    
    private static int linKereses(){
        
        return -1;
    }

    private static void konzolraIr(String kimenet) {
        System.out.print(kimenet);
    }
    
}
