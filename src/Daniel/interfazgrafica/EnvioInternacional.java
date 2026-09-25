package daniel.interfazgrafica;

public class EnvioInternacional implements Envio {
    public String codigo;
    public String destinatario;
    public double peso;
    public String paisDestino;

    public EnvioInternacional(String codigo, String destinatario, double peso, String paisDestino) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
        this.paisDestino = paisDestino;
    }

    @Override
    public double calcularCosto() {
        double costoBase = this.peso * 12000;
        return costoBase + (costoBase * 0.10) + (costoBase * 0.05); // Base + Impuesto + Seguro
    }

    @Override public String getCodigo() { return this.codigo; }
    @Override public String getDestinatario() { return this.destinatario; }
    @Override public double getPeso() { return this.peso; }
    @Override public String getTipo() { return "Internacional"; }
}