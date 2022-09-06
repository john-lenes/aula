import java.util.Scanner;


public class ExercicioDosTriangulos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();
        if(a < 0 ||
                a > 99 ||
                b < 0 ||
                b > 99 ||
                c < 0 ||
                c > 99
        ){
            System.out.println("O valor dos lados deve estar entre 0 e 99");
        }

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        System.out.println("-------------------");

        if(b == c && b > a){
            float d = 0;
            d = a;
            a = b;
            b = d;
        }
        if(b > a && b > c){
           float d = 0;
            d = a;
            a = b;
            b = d;
        }

        if(c > a && c > b){
            float d = 0;
            d = a;
            a = c;
            c = d;
        }

        int quantidadeDeLadosIguais = 0;

        if(a == b && a != c ){
            quantidadeDeLadosIguais = 2;
        }

        if(a == c && a != b ){
            quantidadeDeLadosIguais = 2;
        }

        if(b == c && b != a ){
            quantidadeDeLadosIguais = 2;
        }

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);

        if(a >= b + c){
            System.out.println("Não forma um triângulo");
            System.exit(0);
        }
        System.out.println("Quantidade de lados iguais = " + quantidadeDeLadosIguais);
        
        if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("Triângulo retângulo");
        }
        if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("Triângulo Obtusangulo");
        }
        if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)){
            System.out.println("Triângulo acutangulo");
        }
        if(a == b && b == c){
            System.out.println("Triângulo equilátero");
        }
        if(quantidadeDeLadosIguais == 2){
            System.out.println("Triângulo Isóceles");
        }

    }
}
