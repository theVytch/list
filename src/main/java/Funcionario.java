public class Funcionario {


    private Integer ID;
    private String Nome;
    private Double Salario;


    public Funcionario() {
    }

    public Funcionario(Integer ID, String nome, Double salario) {
        this.ID = ID;
        Nome = nome;
        Salario = salario;
    }

    public Integer getID() {
        return ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

    public void aumentoDeSalario(Double valorPorcentagem){
        Salario = Salario + Salario * valorPorcentagem / 100.0;
    }

    @Override
    public String toString() {
        return  ID +
                ", " + Nome +
                ", " + String.format("%.2f", Salario);
    }
}
