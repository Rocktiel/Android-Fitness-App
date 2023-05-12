package com.example.mobilprogramlamaproje;

public class antrenman {
    String name,weight,set,repetition;

    public antrenman(String name, String weight, String set, String repetition) {
        this.name = name;
        this.weight = weight;
        this.set = set;
        this.repetition = repetition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getRepetition() {
        return repetition;
    }

    public void setRepetition(String repetition) {
        this.repetition = repetition;
    }
}
