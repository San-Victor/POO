package questfour;

public class QuestFour {

    public static void main(String[] args) {
        Veiculo.Motocicletas motocicletas = new Veiculo.Motocicletas("Preta", 150, 2015, 15599, 150);
        Veiculo.Carro carro = new Veiculo.Carro("Branco", 160, 2020, 49699, 4);
        Veiculo.Caminhao caminhao = new Veiculo.Caminhao("Azul", 500, 2016, 356299, 16000);


        System.out.println("\nInformações da Motocicleta: \n");
        System.out.println("Ano:"+ motocicletas.getAno());
        System.out.println("Cor:"+ motocicletas.getCor());
        System.out.println("Preço:"+ motocicletas.getValor());
        System.out.println("Cilindrada:"+ motocicletas.getCilidrada());


        System.out.println("\nInformações do Carro: \n");
        System.out.println("Ano:"+ carro.getAno());
        System.out.println("Cor:"+ carro.getCor());
        System.out.println("Valor:"+ carro.getValor());
        System.out.println("Número de Portas:"+ carro.getNumPortas());
        

        System.out.println("\nInformações do Caminhão");
        System.out.println("Ano:"+ caminhao.getAno());
        System.out.println("Cor:"+ caminhao.getCor());
        System.out.println("Valor:"+ caminhao.getValor());
        System.out.println("Capacidade de Cargas:"+ caminhao.getCapCargas());



    }

}