package daniel.interfazgrafica;

public class EnvioEstandar implements Envio {
    public String codigo;
    public String destinatario;
    public double peso;
    public String direccion;

    public EnvioEstandar(String codigo, String destinatario, double peso, String direccion) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.peso = peso;
        this.direccion = direccion;
    }

    @Override
    public double calcularCosto() {
        return this.peso * 5000;
    }

    @Override public String getCodigo() { return this.codigo; }
    @Override public String getDestinatario() { return this.destinatario; }
    @Override public double getPeso() { return this.peso; }
    @Override public String getTipo() { return "Estándar"; }
}