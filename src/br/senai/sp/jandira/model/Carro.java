package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Carro extends Veiculos {

    Scanner scanner = new Scanner(System.in);

    boolean airbag = false;

    public void cadastrarCarro(){
        System.out.println("/// Cadastro ///");
        System.out.println("Informe o modelo e a marca do veículo:");
        super.marca = scanner.nextLine();
        System.out.println("Informe o modelo");
        super.modelo = scanner.nextLine();
        System.out.println("Informe se tem airbag [true ou false]");
        airbag = scanner.nextBoolean();
        System.out.println("---------------------------------------------------------------");
    }
}
