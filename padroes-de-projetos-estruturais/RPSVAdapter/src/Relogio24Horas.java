public class Relogio24Horas {
    //encapsulamento foi ignorado para evitar excesso de código
    int hora;
    int minuto;

    public Relogio24Horas(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
    }

    public void time(){
        System.out.println("Relogio 24h: "+hora+":"+minuto);
    }
}
