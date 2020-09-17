import Entidades.Aluno;

public class Programa {
    public static void main(String[] args) {
    Aluno aluno1 = new Aluno( );
    aluno1.nome = "Pedro";
    aluno1.idade = 15;
    aluno1.matricula = "1234";
    aluno1.endereco = "rua pries 5";

    Aluno aluno2 = new Aluno ( );
    aluno2.nome = "Maria";
    aluno2.idade = 23;
    aluno2.matricula = "1233";
    aluno2.endereco = "rue saint Marie";

    System.out.println("Nome:" + aluno1.nome);
    System.out.println("Idade:" + aluno1.idade);


    }



}
