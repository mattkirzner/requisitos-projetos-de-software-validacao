public class Relogio12Horas {
    //encapsulamento foi ignorado para evitar excesso de código
    int hora;
    int minuto;
    boolean isPM; //diz se é antes ou depois de meio dia;

    public Relogio12Horas(int hora, int minuto, boolean isPM){
        this.hora = hora;
        this.minuto = minuto;
        this.isPM = isPM;
    }

    public void time() {
        if (isPM) {
            System.out.println("Relogio 12h: " + hora + ":" + minuto + " PM");
        }
        else {
            System.out.println("Relogio 12h: " + hora + ":" + minuto + " AM");
        }
    }

}
