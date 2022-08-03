public class Caneta {
    private String modelo;
    private String cor;
    private Float ponta;
    public String marca;
    private Boolean tampada;

    public Caneta (String modelo, String cor, Float ponta, Boolean tampada){ // método construtor
        this.modelo = modelo;
        //this.tampar();
        this.cor =cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public Float getPonta(){
        return ponta;
    }

    public void setPonta(Float ponta){
        this.ponta = ponta;
    }

    public void tampar (){
        this.tampada=true;
    }

    public void destampar() {
        this.tampada=false;
    }

    public void status(){
        System.out.println("O modelo da caneta é "+ this.getModelo());
        System.out.println("A cor da caneta é  "+ this.getCor());
        System.out.println("A numeração da ponta da caneta é " + this.getPonta());
        System.out.println("A marca da caneta é " + this.marca);
        System.out.println("A caneta está tampada? " + this.tampada);

    }

}
