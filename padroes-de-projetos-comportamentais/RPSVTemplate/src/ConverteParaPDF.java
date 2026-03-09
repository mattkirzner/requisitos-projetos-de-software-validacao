public class ConverteParaPDF extends ConverteArquivo{
    public void converter(String arquivo){
        System.out.println("Convertendo " + arquivo + " para PDF");
    }

    @Override
    public void salvar(String arquivo) {
        System.out.println("Salvando " + arquivo + ".pdf");
    }
}
