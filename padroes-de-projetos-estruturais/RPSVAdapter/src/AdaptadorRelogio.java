public class AdaptadorRelogio {
    int hora;
    int minuto;

    public void setHora(Relogio24Horas relogio){
        hora = relogio.hora;
        minuto = relogio.minuto;
    }

    public void setHora(Relogio12Horas relogio){
        hora = relogio.hora;
        minuto = relogio.minuto;
        if(relogio.isPM){
            hora += 12;
        }
    }

    public int getMinuto(){
        return minuto;
    }

    public int getHora12(){//retorna a hora em formato 12h
        return hora%12;
    }

    public boolean getIsPM(){//retorna um boolean dizendo se é antes ou depois de meio dia
        if(hora>12) {
            return true;
        }

        return false;
    }

    public int getHora24(){//retorna a hora em formato 24h
        return hora;
    }
}
