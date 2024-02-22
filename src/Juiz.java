public class Juiz {
    private String nome;
    private int matrícula;
    private int cpf;
    
    public Juiz(String nome, int matrícula, int cpf) {
        this.nome = nome;
        this.matrícula = matrícula;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(int matrícula) {
        this.matrícula = matrícula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}
