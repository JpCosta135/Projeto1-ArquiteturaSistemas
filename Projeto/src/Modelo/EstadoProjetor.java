package Modelo;

public enum EstadoProjetor {
    DISPONIVEL {
        @Override public String getDescricao() { return "Disponível"; }
    },
    EM_USO {
        @Override public String getDescricao() { return "Em Uso"; }
    },
    MANUTENCAO {
        @Override public String getDescricao() { return "Manutenção"; }
    },
    INDISPONIVEL {
        @Override public String getDescricao() { return "Indisponível"; }
    };

    public abstract String getDescricao();
}
