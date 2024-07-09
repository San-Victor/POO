package questtwo;

public class QuestTwo {

    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa("Pessoa Aleatória", 18, "123.456.789-00");
    Aluno aluno = new Aluno("Estudante Aleatório", 18, "123.456.789-00", "Ciências da Computação", " POO(Programação Orientada a Objeto)");

        System.out.println(pessoa);
        System.out.println(aluno);
    }  
}