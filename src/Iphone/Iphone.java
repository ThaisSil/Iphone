package Iphone;

import java.awt.*;

public abstract class Iphone implements reprodutorMusica, aparelhoTelefone, navegadorInternet {

    // Atributos de instância
    private String numero;
    private String modelo;
    private List musicas = new List();

    // Construtor
    public Iphone(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    // Métodos de instância

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    // Métodos de interface

    @Override
    public void ligar(String numero) {
        // Implementação específica do Iphone
    }

    @Override
    public void atender(String numero) {
        // Implementação específica do Iphone
    }

    @Override
    public void iniciarCorreioVoz(String mensagem, String destinatario) {
        // Implementação específica do Iphone
    }

    @Override
    public void exibirPagina(String url) {
        // Implementação específica do Iphone
    }

    @Override
    public void adicionarNovaAba(String url) {
        // Implementação específica do Iphone
    }

    @Override
    public void atualizarPagina() {
        // Implementação específica do Iphone
    }

    public void tocar() {
        tocar((Musica) null);
    }

    @Override
    public void pausar() {
        // Implementação específica do Iphone
    }

    @Override
    public void selecionarMusica() {
        // Implementação específica do Iphone
    }

    // Métodos adicionais

    public void adicionarMusica(Musica musica) {
        musicas.add(musica.toString());
    }

    public void removerMusica(Musica musica) {
        musicas.remove(musica.toString());
    }


    public void tocar(Musica musica) {

    }
}
