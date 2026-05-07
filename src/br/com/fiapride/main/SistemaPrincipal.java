package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {
    static void main() {
        Celular meuCelular = new Celular("Iphone",100);
        meuCelular.ligar();
        meuCelular.carregarCelular(15);
        meuCelular.statusCelular();
        meuCelular.desligar();

        System.out.println("---------------------------------------------");
        Celular celularDoProfessor = new Celular("Samsung",75);
        celularDoProfessor.desligar();
        celularDoProfessor.ligar();
        celularDoProfessor.carregarCelular(10);
        celularDoProfessor.statusCelular();
        celularDoProfessor.desligar();
    }
}
