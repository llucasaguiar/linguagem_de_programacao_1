public class Medico {
    protected String nome;
    protected int crm;
    protected boolean trabalhaNoHospital;

    public Medico(String nome,int crm, boolean trabalhaNoHospital) {
        this.nome = nome;
        this.crm = crm;
        this.trabalhaNoHospital = trabalhaNoHospital;
    }

    public void tratarPaciente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public boolean isTrabalhaNoHospital() {
        return trabalhaNoHospital;
    }

    public void setTrabalhaNoHospital(boolean trabalhaNoHospital) {
        this.trabalhaNoHospital = trabalhaNoHospital;
    }
}