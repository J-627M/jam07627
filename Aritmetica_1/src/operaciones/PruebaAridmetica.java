package operaciones;

public class PruebaAridmetica {

    public static void main(String[] args) {

        var a = 10;
        var b = 2;

        miMetodo();

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        var resultado = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado = " + resultado);

    }

    public static void miMetodo() {
        System.out.println("otro metodo");
    }

}
