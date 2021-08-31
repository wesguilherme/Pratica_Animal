package com.company;

import com.company.model.Cachorro;
import com.company.model.Gato;
import com.company.model.Vaca;

public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Au Au");
        cachorro.emitirSom();
        cachorro.comerMeat();
        cachorro.comerAnimal();

        Gato gato = new Gato("Miau");
        gato.emitirSom();
        gato.comerMeat();
        gato.comerAnimal();

        Vaca vaca =  new Vaca("MUUU");
        vaca.emitirSom();
        vaca.comerHerb();
        vaca.comerAnimal();

    }

}