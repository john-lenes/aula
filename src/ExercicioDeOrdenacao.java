import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDeOrdenacao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        FuncaoOrdenacao funcaoOrdenacao = new FuncaoOrdenacao();
        System.out.println("O retorno da função é: "+funcaoOrdenacao.ordenar(lista, scan));

    }



}

