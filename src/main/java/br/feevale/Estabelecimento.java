package br.feevale;

import java.util.ArrayList;
import java.util.List;

public class Estabelecimento {

    private List<Atendimento> atendimentos = new ArrayList<>();
    private int contador = 1;

    // Gera número único
    public int gerarNumero() {
        return contador++;
    }

    // Cria e registra atendimento
    public Atendimento registrarAtendimento(Pedido pedido) {
        int numero = gerarNumero();
        Atendimento atendimento = new Atendimento(numero, null, pedido);
        atendimentos.add(atendimento);
        return atendimento;
    }

    // Retorna a lista de atendimentos
    public List<Atendimento> getAtendimentos() {
        return atendimentos;
    }
}
