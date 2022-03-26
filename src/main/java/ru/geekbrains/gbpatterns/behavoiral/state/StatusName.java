package ru.geekbrains.gbpatterns.behavoiral.state;

public enum StatusName {
    NEW("новый"),
    SEND("отправлен"),
    DELIEVERED("доставлен");

    private String statusName;
    StatusName(String statusName){
        this.statusName = statusName;
    }
    public String getStatusName(){
        return statusName;
    }
}
