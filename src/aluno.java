public class aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;

    public aluno(){

    }

    public aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome(){
        return nome;
    }
    public String setNome(){
        return nome;
    }


    public double getNota1() {
        return nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public double getNota3() {
        return nota3;
    }


    public double media(double nota1, double nota2, double nota3){
         return  (nota1 + nota2+ nota3) / 3;

    }


    @Override
    public String toString() {
        return "aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }


}
