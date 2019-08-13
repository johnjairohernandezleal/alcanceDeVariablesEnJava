public class Main {
    public static void main(String[] args) {

        // creamos variables locales

        int operandoA= 6;
        int operandoB= 2;
        Aritmetica objeto1 = new Aritmetica(operandoA,operandoB);
        // imprimimos los valores de los operandos
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);

        System.out.println("suma = " + objeto1.sumar());
        System.out.println("objeto1.restar() = " + objeto1.restar());
        System.out.println("objeto1.multiplicar() = " + objeto1.multiplicar());
        System.out.println("objeto1.dividir() = " + objeto1.dividir());
    }
}
