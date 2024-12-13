public class Media {
    double nota1;
    double nota2;

calcularMedia mediaAluno(){
    calcularMedia notaResultado = new calcularMedia();
    notaResultado.resultado = (nota1 + nota2) / 2;
    return notaResultado;

}


    void impressaoMediaAlunos(){
        System.out.println("MÉDIA ALUNOS:");
        System.out.println("=======================");
        System.out.printf("Nota-1: %.2f%n",nota1);
        System.out.printf("Nota-2: %.2f%n",nota2);
        System.out.printf("Nota Final: %.2f%n", mediaAluno().resultado);

    }


}
