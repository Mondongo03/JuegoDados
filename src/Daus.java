import java.util.Objects;

public class Daus {
    int num;

    public Daus(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    //ToString para devolver datos
    @Override
    public String toString() {
        return "Daus " + num;
    }
    //Equals para comparar los dados
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Daus daus = (Daus) o;
        return num == daus.num;
    }

}
