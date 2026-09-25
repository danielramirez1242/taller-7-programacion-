package daniel.interfazgrafica;

public class EnvioExpress implements Envio {
    public String codigo;
    public String destinatario;
    public double peso;
    public String horaLimite;

    public EnvioExpress(String codigo, String destinatario, double peso, String horaLimite) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
        this.horaLimite = horaLimite;
    }

    @Override
    public double calcularCosto() {
        return (this.peso * 5000) + 15000;
    }

    @Override public String getCodigo() { return this.codigo; }
    @Override public String getDestinatario() { return this.destinatario; }
    @Override public double getPeso() { return this.peso; }
    @Override public String getTipo() { return "Express"; }
}