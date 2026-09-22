package Modelo;

public class Projetor {
    private String nome;
    private String codigo;
    private EstadoProjetor estado;

    private Projetor(Builder builder) {
        this.nome = builder.nome;
        this.codigo = builder.codigo;
        this.estado = builder.estado;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public EstadoProjetor getEstado() {
        return estado;
    }
    public void setEstado(EstadoProjetor estado) {
        this.estado = estado;
    }

    public String toString() {
        return "nome:"+ nome + " codigo:" + codigo + " estado: " + estado;
    }
    public static class Builder{
        private String nome;
        private String codigo;
        private EstadoProjetor estado;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder estadoInicial(EstadoProjetor estado) {
            this.estado = estado;
            return this;
        }

        public Projetor build() {
            // Aqui você pode adicionar validações, se necessário
            if (nome == null || codigo == null) {
                throw new IllegalStateException("Nome e código são obrigatórios para criar um Projetor.");
            }
            return new Projetor(this);
        }
    }


}

