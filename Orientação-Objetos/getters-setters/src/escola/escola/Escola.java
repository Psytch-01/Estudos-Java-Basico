package escola;

public class Escola {
    public static void main(String[] args) throws Exception {
        
        Aluno julio = new Aluno();
        julio.setNome("Julio Cesar");
        julio.setIdade(24);
        julio.setSexo("Masculino");

        System.out.println("O aluno " + julio.getNome() + " tem " + julio.getIdade() + " anos e é do sexo " + julio.getSexo() + ".");
        
        Aluno vitoria = new Aluno();
        vitoria.setNome("Vitória Samantha");
        vitoria.setIdade(22);
        vitoria.setSexo("Feminino");
        
        System.out.println("A aluna " + vitoria.getNome() + " tem " + vitoria.getIdade() + " anos e é do sexo " + vitoria.getSexo() + ".");
    }
}
