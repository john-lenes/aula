import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FuncaoOrdenacao {
    public int ordenar(List<Integer> listaDeNumeros, Scanner scan){
        boolean repetir;
        do {
            repetir = true;
            Integer novoNumero = scan.nextInt();
            Integer quantidadeDeDigitosNovoNumero = Integer.toString(novoNumero).length();
            if(quantidadeDeDigitosNovoNumero != 5){
                return 0;
            }
            listaDeNumeros.add(novoNumero);
            System.out.println("Deseja inserir mais um valor?(S/N)");
            scan.nextLine();
            String resposta = scan.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                repetir = false;
            }
        }while(repetir);

        if(listaDeNumeros.size() < 4 || listaDeNumeros.size() > 10){
            return 0;
        }
        System.out.println("-----VALORES DE ENTRADA-----");
        listaDeNumeros.forEach(i -> System.out.println(i));
        Collections.sort(listaDeNumeros);
        System.out.println("-----LISTA EM ORDEM CRESCENTE-----");
        listaDeNumeros.forEach(i -> System.out.println(i));
        return 1;
    }
}
