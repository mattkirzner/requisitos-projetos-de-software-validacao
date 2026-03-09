public abstract class ConverteArquivo {
    public void rodar(String arquivo){
        carregar(arquivo);
        converter(arquivo);
        salvar(arquivo);
    }

    public void carregar(String arquivo){
        System.out.println("Carregando " + arquivo);
    }

    public abstract void converter(String arquivo);

    public void salvar(String arquivo){
        System.out.println("Salvando" + arquivo);
    }
}
