
package gyakorlas;


public class Gyakorlas {


    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        
    }
    
    private static int osszegzes(){
        int[] tomb = {3, 8, 2, 4};
        int osszeg = 0;
        for (int i=0; i<tomb.length; i++) {
            osszeg = osszeg + tomb[i];
        }    
		System.out.println(osszeg);
        return osszeg;
    }
    
    private static int eldontes(){
        return 0;
    }
    
    private static int megszamlalas(){
        return 0;
    }
    
    private static int minKivalasztas(){
        
    return 0;
    }
    
    private static int maxKivalasztas(){
        
        return 0;
    }
    
    private static int kivalasztas(){
        
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
