public class ConverteParaDocx extends ConverteArquivo{
    public void converter(String arquivo){
        System.out.println("Convertendo " + arquivo + " para DOCX");
    }

    @Override
    public void salvar(String arquivo) {
        System.out.println("Salvando " + arquivo + ".docx");
    }
}
