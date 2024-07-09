package questsix;

public class QuestSix {

    public static void main(String[] args) {
        
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos("Nome Aleatório", "99 9876-5432", "pessoa.aleatória@gmail.com","30/02/2005", "Bairro Comum, Rua Não Aleatória, Número 00");

        System.out.println("Informações da Pessoa: \n");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Data de aniversário: " + pessoa.getData());
        System.out.println("Endereço: " + pessoa.getEndereco());
    }  
}