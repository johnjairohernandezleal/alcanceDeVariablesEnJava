public class Aritmetica {
    // atributos de la clase
    int a;
    int b;

    //constructor vacio
    Aritmetica(){

    }

    Aritmetica(int a, int b){
       this.a = a;
        this.b = b;
    }

    int sumar(){
        return a+b;
    }
    int restar(){
        return  a-b;
    }
    int multiplicar(){
        return a*b;
    }

    int dividir(){
        return a/b;
    }
}
