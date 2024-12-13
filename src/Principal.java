public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro Lucas";
        aluno1.cpf = "122.923.345-22";
        aluno1.celular = "(81)-97312-6775";

        Media media1 = new Media();
        media1.nota1 = 5.1;
        media1.nota2 = 7.5;


        aluno1.impressaoDadosAlunos();

        media1.impressaoMediaAlunos();

        calcularMedia medya = media1.mediaAluno();

        if (medya.aprovado()){
            System.out.println("Aprovado, Parabéns!" + aluno1.nome);
        } else if (medya.recuperacao()){
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }


     }

}
