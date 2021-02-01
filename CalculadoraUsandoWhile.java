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
        int resultado = 0;
        if (a < 0 || b < 0){
            resultado = -1; 
        }

        else{
            if(a == b){
                resultado = b;
            }
            else{
                while (a != b){

                    if(b<=a){
                        suma = suma + b;
                        b++;
                    }

                    else{
                        suma = suma + a;
                        a++;       
                    }                               
                }
                if(a>b){
                    resultado = suma + a;
                }
                else{
                    resultado = suma + b;
                }
            }
        }
        return resultado;
    }

    public boolean esPrimo(int n){
        boolean primo = true;
        int resto = 1;
        int div = 2;
        
        while( resto != 0 && (n > div)){
            resto=n%div;
            div++;
        }
        if(resto == 0){
            primo = false;
        }
        return primo;
    }
}