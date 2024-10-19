package clases;

public class Algoritmos {
    
    // Identificar pares
    public static void esPar(int num){
        boolean esPar = num % 2 == 0;

        if(esPar){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // Identificar primos
    public static void esPrimo(int num){
        boolean esPrimo = num % 1 == 0 && num % num == 0;
        boolean noEsPrimo = num % 1 == 0 && num % num == 0 && num % 2 == 0; 

        if(noEsPrimo){
            System.out.println(false);
        } else if(esPrimo){
            System.out.println(true);
        }
    }

    // String en reversa
    public static void stringEnReversa(String string){
        StringBuilder sb = new StringBuilder(string);
        System.out.println(sb.reverse().toString());
    }
    
    // Identificar palindromos
    public static void esPalindromo(String string){
        StringBuilder sb = new StringBuilder(string);
        if(string.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    // Secuencia FizzBuzz
    public static void secuenciaFizzBuzz(int num){
        for(int i = 1; i <= num; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
