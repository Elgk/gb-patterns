package ru.geekbrains.gbpatterns.behavoiral.interpretator;

public class Interpretator {
    Operation interpret;

    // в Spring используется @Validator(regexp="") выражение задается в файле кофигурации

    public Operation makeOperation(String spell,int[] arg){
        return  new Operation(){
            // spell: (x + y) * z   преобоазовать в операцию
        };

    }
}
