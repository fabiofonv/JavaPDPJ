public class Advogado {
    private String nome;
    private String oab;
    private int cpf;
    public Advogado(String nome, String oab, int cpf) {
        this.nome = nome;
        this.oab = oab;
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public String getOab() {
        return oab;
    }
    public int getCpf() {
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setOab(String oAB) {
        oab = oAB;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    
}
