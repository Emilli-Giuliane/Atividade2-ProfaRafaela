public class FabricaDeChocolate {
    public static void main(String[] args) {
        CaldeiraChocolate caldeira = CaldeiraChocolate.getInstancia();

        CaldeiraChocolate caldeira2 = CaldeiraChocolate.getInstancia();
        caldeira.encher();
        System.out.println(caldeira2.getVazia());
        caldeira. ferver();
        System.out.println(caldeira2.getFervida());
        caldeira.ferver();   
        caldeira.drenar();   
        caldeira.encher();   
        caldeira.encher();  
        caldeira.ferver();   
        caldeira.ferver();   
        caldeira.drenar();   
        caldeira.drenar();   
    }
}