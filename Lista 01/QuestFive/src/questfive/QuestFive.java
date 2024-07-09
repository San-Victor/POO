package questfive;

public class QuestFive {

    public static void main(String[] args) {
         System.out.println("\nPrimeira data inserida: \n");
        Data data = new Data(18, 5, 2024);
        data.exibeData();

        System.out.println("\nData após a modificação: \n");
        data.setDia(30);
        data.setMes(8);
        data.setAno(2027);

        data.exibeData();
    }
    
}
