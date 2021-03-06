package negocio;

import java.util.Calendar;
/**
 *
 * @author Aryel
 */
public class Sessao {
    private int idSessao;
    private Calendar data;
    private String queixas_paciente;
    private String plano_tratamento;
    private String diagnostico_final;
    private int evolucao;
    private boolean pago;
    private int idAnamnese;

    public int getIdSessao() {
        return idSessao;
    }

    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getQueixas_paciente() {
        return queixas_paciente;
    }

    public void setQueixas_paciente(String queixas_paciente) {
        this.queixas_paciente = queixas_paciente;
    }

    public String getPlano_tratamento() {
        return plano_tratamento;
    }

    public void setPlano_tratamento(String plano_tratamento) {
        this.plano_tratamento = plano_tratamento;
    }

    public String getDiagnostico_final() {
        return diagnostico_final;
    }

    public void setDiagnostico_final(String diagnostico_final) {
        this.diagnostico_final = diagnostico_final;
    }

    public int getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(int evolucao) {
        this.evolucao = evolucao;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public int getIdAnamnese() {
        return idAnamnese;
    }

    public void setIdAnamnese(int idAnamnese) {
        this.idAnamnese = idAnamnese;
    }
    
}
