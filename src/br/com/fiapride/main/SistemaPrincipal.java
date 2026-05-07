package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {
    static void main() {
        Celular meuCelular = new Celular();
        meuCelular.marca = "Iphone";

        Celular celularDoProfessor = new Celular();
        celularDoProfessor.marca = "Samsung";

        System.out.println("O meu celular é: "+ meuCelular.marca);
        System.out.println("O celular do professor é: "+ celularDoProfessor.marca);
    }
}
