package online.javafun.apibmi;

public class Bmi {
    private Double weight;
    private Double height;
    private Double bmi;
    private String type;

    public Bmi(Double weight, Double height) {
        this.weight = weight;
        this.height = height;
        this.bmi =  weight / Math.pow(height / 100, 2);
        calculateType();
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getBmi() {
        return bmi;
    }

    public void setBmi(Double bmi) {
        this.bmi = bmi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void calculateType() {
        if (bmi < 16.0) {
            type = "wygłodzenie";
        } else if (bmi < 16.99) {
            type = "wychudzenie";
        } else if (bmi < 18.49) {
            type = "niedowaga";
        } else if (bmi < 24.99) {
            type = "pożądana masa ciała";
        } else if (bmi < 29.99) {
            type = "nadwaga";
        } else if (bmi < 34.99) {
            type = "otyłość I stopnia";
        } else if (bmi < 39.99) {
            type = "otyłość II stopnia (duża)";
        } else {
            type = "otyłość III stopnia (chorobliwa)";
        }
    }
}
