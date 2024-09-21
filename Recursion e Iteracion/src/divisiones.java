public class divisiones {
    public static void main(String[] args) {
        int dividendo=15, divisor=3, cociente=0, residuo=0;
        if (divisor!=0){
            while (dividendo>=divisor){
                dividendo = dividendo - divisor;
                cociente++;
            }
            residuo = dividendo;
            System.out.println("El cociente es: " + cociente);
            System.out.println("El residuo es: " + residuo);
        }
        else {
            System.out.println("El divisor debe ser diferente de 0");
        }
    }
}
