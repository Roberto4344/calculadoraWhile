/**
 * Vamos a crear una claculadora
 */
public class CalculadoraUsandoWhile {

    public void multiplosCinco(){
        int index = 15;
        while (index <= 90){
            System.out.println(index);
            index = index +5;
        }
    }

    public void sumaDeValores(){
        int index = 0;
        int suma = 0;
        while (index <= 10){
            suma= suma + index;
            index++;  
        }
        System.out.println(suma);
    }

    public int sumaDeValoresEnElIntervalo(int a, int b){
        int suma = 0;
        if (a == b){
            suma = b; 
        }
        else{
            if(a < 0 || b < 0){
                suma= -1;
            }
            else{
                if(a>b){
                    while (b <= a){                        
                        suma = suma + b;
                        b++;
                    }
                }
                else{
                    while (a <= b){
                        suma = suma + a;
                        a++;                        
                    }
                }
            }
        }
        return suma;
    }
}