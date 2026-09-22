package Modelo;

public class Projetor {
    private String nome;
    private String codigo;
    private boolean disponivel;

    private Projetor(Builder builder) {
        this.nome = builder.nome;
        this.codigo = builder.codigo;
        this.disponivel = builder.disponivel;
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
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return "nome:"+ nome + " codigo:" + codigo + " disponivel:" + disponivel;
    }
    public static class Builder{
        private String nome;
        private String codigo;
        private boolean disponivel;

        public Builder nome(String nome){
            this.nome = nome;
            return this;
        }

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder disponivel(boolean disponivel) {
            this.disponivel = disponivel;
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

