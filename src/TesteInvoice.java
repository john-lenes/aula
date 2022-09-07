import java.sql.SQLOutput;
import java.util.Scanner;

public class TesteInvoice {
    public static void main(String[] args) {

        ///////TESTE ATRIBUINDO VALORES PARA AS VARIÁVEIS, VALIDANDO METÓDO SET////////

        /*
        Integer numeroItemFaturado = 34;
        String descricaoItemFaturado = "HD Seagate";
        Integer quantidadeComprada = 3;
        Double precoUnitario = 110.95;

        Invoice invoice1 = new Invoice();
        invoice1.setNumeroItemFaturado(numeroItemFaturado);
        invoice1.setDescricaoItemFaturado(descricaoItemFaturado);
        invoice1.setQuantidadeComprada(quantidadeComprada);
        invoice1.setPrecoUnitario(precoUnitario);

        System.out.println("Número do Item Faturado: "+invoice1.getNumeroItemFaturado());
        System.out.println("Descrição: "+invoice1.getDescricaoItemFaturado());
        System.out.println("Quantidade: "+invoice1.getQuantidadeComprada());
        System.out.println("Preço unitário: "+invoice1.getPrecoUnitario());
        System.out.println("Valor Total: "+invoice1.getInvoiceAmount());
        */

        //////ITENS//////
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos produtos deseja faturar (1 a 10)?");
        int quantidadeProdutos = ler.nextInt();
        Invoice vet[] = new Invoice[quantidadeProdutos];

        for (int contador = 0; contador < vet.length; contador = contador + 1) {

            System.out.printf("Digite o código do item %d: ", contador);
            Integer numeroItemFaturadoRecebido = ler.nextInt();

            System.out.printf("Informe a descrição do produto %s: ", contador);
            String descricaoItemRecebido = ler.next();

            System.out.printf("Digite a quantidade de produto %d: ", contador);
            Integer quantidadeCompradaRecebido = ler.nextInt();

            System.out.printf("Digite o valor unitário do produto: ", contador);
            Double precoUnitarioRecebido = ler.nextDouble();
            System.out.println();

            Invoice p1 = new Invoice(numeroItemFaturadoRecebido, descricaoItemRecebido, quantidadeCompradaRecebido, precoUnitarioRecebido);
            vet[contador] = p1;
        }

        //////LISTAR PRODUTOS//////
        System.out.println("\nLista Produto(s):");
        for (int contador = 0; contador < vet.length; contador = contador + 1) {

            Invoice p1 = vet[contador];
            System.out.printf("Código do produto: %d", p1.getNumeroItemFaturado());
            System.out.printf("\nDescrição do item: %s", p1.getDescricaoItemFaturado());
            System.out.printf("\nQuantidade item comprada: %d", p1.getQuantidadeItemComprada());
            System.out.printf("\nPreço unitário do item: %.2f", p1.getPrecoUnitario());
            System.out.printf("\nValor total do item faturado: %.2f", p1.getInvoiceAmount());
            System.out.println("\n");
        }

        //////BUSCAR ITEM//////
        System.out.println("\nDigite o código do produto que deseja buscar:");
        Integer numeroItemBuscar = ler.nextInt();

        boolean buscar = false;

        for (int contador = 0; contador < vet.length && buscar == false; contador = contador + 1) {

            Invoice p1 = vet[contador];
            Integer numeroItemAtual = p1.getNumeroItemFaturado();

            if (numeroItemAtual.equals(numeroItemBuscar)) {
                buscar = true;

                System.out.printf("\n\nEncontrou o produto na posição %d do vetor!!!\n", contador);
                System.out.println("Dados do produto encontrado:");
                System.out.printf("Código do produto: %d", p1.getNumeroItemFaturado());
                System.out.printf("\nDescrição do Produto: %s", p1.getDescricaoItemFaturado());
                System.out.printf("\nQuantidade de produto comprada: %d", p1.getQuantidadeItemComprada());
                System.out.printf("\nPreço unitário do item: %.2f", p1.getPrecoUnitario());
                System.out.printf("\nValor total do item faturado: %.2f", p1.getInvoiceAmount());
                System.out.println("\n");

            }
        }

        if (buscar == false) {
            System.out.println("Produto não encontrado!!!");
        }


    }
}


