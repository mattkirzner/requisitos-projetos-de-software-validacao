//Aluno: Matheus Rangel Kirzner
//Esse código ilustra o padrão de projeto Adapter
//um relógio em formato 12h é adaptado para 24 horas e vice-versa

void main() {
    AdaptadorRelogio adaptador = new AdaptadorRelogio();
    Relogio24Horas relogio1 = new Relogio24Horas(13, 30);

    adaptador.setHora(relogio1);

    Relogio12Horas relogio2 = new Relogio12Horas(adaptador.getHora12(), adaptador.getMinuto(), adaptador.getIsPM());

    relogio2.time();

    Relogio12Horas relogio3 = new Relogio12Horas(5, 24, true);

    adaptador.setHora(relogio3);

    Relogio24Horas relogio4 = new Relogio24Horas(adaptador.getHora24(), adaptador.getMinuto());

    relogio4.time();
}
