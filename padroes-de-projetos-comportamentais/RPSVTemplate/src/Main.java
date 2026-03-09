//Aluno: Matheus Rangel Kirzner
//Esse código exemplifica o uso do padrão Template, e simula conversão de arquivos para pdf ou docx

void main() {
    ConverteParaPDF pdf = new ConverteParaPDF();
    ConverteParaDocx docx = new ConverteParaDocx();

    pdf.rodar("Texto");
    docx.rodar("Texto");
}
