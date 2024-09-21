public class E_factorial {
    //int n=5; // no creo aquí porque necesitaría crear una instancia para acceder a esta variable

    public static void main(String[] args) {
        int n=5;
        E_factorial ef = new E_factorial();
        System.out.println("El factorial es: " + ef.factorial(n));
    }

    public int factorial(int n) {
        if (n==1 || n==0){
           return 1; //caso base
        }
        if (n<0) {
            System.out.println("ingresa un número positivo");
            return -1; //El retorno -1 indica error
        }
        return n * (factorial(n-1));

    }
}