public class ClinicoGeral extends Medico {
    private boolean atendeEmCasa;

    public ClinicoGeral(String nome,int crm, boolean trabalhaNoHospital, boolean atendeEmCasa) {
        super(nome, crm, trabalhaNoHospital);
        this.atendeEmCasa = atendeEmCasa;
    }

    public void receitar() {
    }

    public boolean isAtendeEmCasa() {
        return atendeEmCasa;
    }

    public void setAtendeEmCasa(boolean atendeEmCasa) {
        this.atendeEmCasa = atendeEmCasa;
    }
}