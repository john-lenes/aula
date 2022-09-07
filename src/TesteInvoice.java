import java.sql.SQLOutput;

public class TesteInvoice {
    public static void main(String[] args) {

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
        System.out.println("Preço unt: "+invoice1.getPrecoUnitario());
        System.out.println("Valor Total: "+invoice1.getInvoiceAmount());
    }
}


