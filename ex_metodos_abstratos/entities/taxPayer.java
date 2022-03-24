package entities;

import entities.enums.Type;

public abstract class taxPayer {

    private Double name;
    private Double anualIncome;
    private Type type;

    public taxPayer() {
    }

    public taxPayer(Double name, Double anualIncome, Type type) {
        this.name = name;
        this.anualIncome = anualIncome;
        this.type = type;
    }

    public Double getName() {
        return name;
    }

    public void setName(Double name) {
        this.name = name;
    }

    public Double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
