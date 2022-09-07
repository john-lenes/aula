import java.util.Scanner;

public class Teste {
    
    public static void main(String[] args){
        
        //////Cadastro de turmas//////
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas turmas deseja cadastrar (1 a 10)?");
        int quantidadeTurmas = ler.nextInt();
        
        Turma vet[] = new Turma[quantidadeTurmas];
        
        for(int contador = 0; contador < vet.length; contador = contador + 1){
            
            System.out.printf("Digite o id da turma %d: ", contador);
            Long idTurmaRecebido = ler.nextLong();
            
            System.out.printf("Informe a data de início da turma %d, exemplo Dia/Mês/Ano: ", contador);
            String dataInicioRecebido = ler.next();
            
            System.out.printf("Digite o turno da turma %d: ", contador);
            String turnoRecebido = ler.next();
            
            System.out.printf("Digite a capacidade de alunos da turma %d: ", contador);
            Byte capacidadeAlunosRecebido = ler.nextByte();
            System.out.println();
            
            Turma t1 = new Turma(idTurmaRecebido, dataInicioRecebido, turnoRecebido, capacidadeAlunosRecebido);
            vet[contador] = t1;
        }
        
        //////BUSCAR TURMA CADASTRADA//////
        System.out.println("\nDigite o id da Turma que deseja buscar:");
        Long idTurmaBuscar = ler.nextLong();
        
        boolean buscar = false;
        
        for( int contador = 0; contador < vet.length && buscar == false; contador = contador + 1){
            
            Turma t1 = vet[contador];
            Long idTurmaAtual = t1.getidTurma();
            
            if(idTurmaAtual.equals(idTurmaBuscar)) {
                buscar = true;
                
                System.out.printf("\n\nEncontrou a turma na posição %d do vetor!!!\n", contador);
                System.out.println("Dados de Turma encontrada:");
                System.out.printf("Id Turma: %d", t1.getidTurma());
                System.out.printf("\nData de início: %s", t1.getdataInicio());
                System.out.printf("\nTurno: %s", t1.getturno());
                System.out.printf("\nCapacidade de alunos: %d", t1.getcapacidadeAlunos());
                
            }
        }
        
        if(buscar == false){
            System.out.println("Turma não encontrada!!!");
        }
        
        //////LISTAR RELATÓRIO TURMAS CADASTRADAS//////
        System.out.println("\n\nRelatório de Turmas cadastradas:");
        for(int contador = 0; contador < vet.length; contador = contador + 1){
            
            Turma t1 = vet[contador];
            System.out.printf("Id turma: %d", t1.getidTurma());
            System.out.printf("\nData de Início: %s", t1.getdataInicio());
            System.out.printf("\nTurno: %s", t1.getturno());
            System.out.printf("\nCapacidade de Alunos: %d", t1.getcapacidadeAlunos());
            System.out.println("\n");
        }
    }
    
}