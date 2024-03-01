public class Caso {
    private int numero;
    private int matJuiz;
    private String oabAdvAcu;
    private String oabAdvDef;
    private int cpfReclamado;
    private int cpfReclamante;

    public Caso(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getMatJuiz() {
        return matJuiz;
    }

    public void setMatJuiz(int matJuiz) {
        this.matJuiz = matJuiz;
    }

    public String getOabAdvAcu() {
        return oabAdvAcu;
    }

    public void setOabAdvAcu(String oabAdvAcu) {
        this.oabAdvAcu = oabAdvAcu;
    }

    public String getOabAdvDef() {
        return oabAdvDef;
    }

    public void setOabAdvDef(String oabAdvDef) {
        this.oabAdvDef = oabAdvDef;
    }

    public int getCpfReclamado() {
        return cpfReclamado;
    }

    public void setCpfReclamado(int cpfReclamado) {
        this.cpfReclamado = cpfReclamado;
    }

    public int getCpfReclamante() {
        return cpfReclamante;
    }

    public void setCpfReclamante(int cpfReclamante) {
        this.cpfReclamante = cpfReclamante;
    }

    public void imprimir() {
        System.out.println("Nº                  : ");
        System.out.println("Matrícula do Juiz   : ");
        System.out.println("Advogado de Defesa  : ");
        System.out.println("CPF do(a) Reclamado : ");
        System.out.println("Advogado de Acusação: ");
        System.out.println("CPF do(a) Reclamante: ");
    }
    
}
