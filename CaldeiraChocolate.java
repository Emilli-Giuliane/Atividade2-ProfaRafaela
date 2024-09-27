public class CaldeiraChocolate {

    private boolean vazia;   
    private boolean fervida; 

    private static CaldeiraChocolate instancia;

    
    private CaldeiraChocolate() {
        vazia = true;   
        fervida = false; 
    }

    
    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate(); 
        }
        return instancia;
    }

    
    public void encher() {
        if (vazia) {
            vazia = false;    
            fervida = false;  
            System.out.println("A caldeira foi preenchida com leite e chocolate.");
        } else {
            System.out.println("A caldeira já está cheia e não pode ser preenchida.");
        }
    }

    
    public void ferver() {
        if (!vazia && !fervida) {
            fervida = true;   
            System.out.println("A mistura está fervendo.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia. Não é possível ferver.");
        } else {
            System.out.println("A mistura já foi fervida.");
        }
    }

    
    public void drenar() {
        if (!vazia && fervida) {
            vazia = true;     
            System.out.println("A mistura fervida foi drenada.");
        } else if (vazia) {
            System.out.println("A caldeira está vazia. Não há nada para drenar.");
        } else {
            System.out.println("A mistura ainda não foi fervida.");
        }
    }
        // getters e setters
        public boolean getVazia(){
            return vazia;
        }
        public void setVazia(boolean vazia){
            this.vazia = vazia;
        }
        public boolean getFervida(){
            return fervida;
        }
        public void setFervida(boolean fervida){
            this.fervida = fervida;
        }
}