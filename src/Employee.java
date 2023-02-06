public class Employee {
    // создадим переменные, которые участвуют в конструкторе
    private String nameEmployer;
    private int numberOtdel;
    private double zarplataEmployera;




    private int id;
    private static int idGenerate = 1;

    // делаем геттеры и сеттеры

    public String getNameEmployer() {
        return nameEmployer;
    }

    public void setNameEmployer(String nameEmployer) {
        this.nameEmployer = nameEmployer;
    }

    public int getNumberOtdel() {
        return numberOtdel;
    }

    public void setNumberOtdel(int numberOtdel) {
        this.numberOtdel = numberOtdel;
    }

    public double getZarplataEmployera() {
        return zarplataEmployera;
    }

    public void  setZarplataEmployera(double zarplataEmployera) {
        this.zarplataEmployera = zarplataEmployera;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Employee (String nameEmployer, int numberOtdel, double zarplataEmployera) {
        this.nameEmployer = nameEmployer;
        this.numberOtdel = numberOtdel;
        this.zarplataEmployera = zarplataEmployera;
        this.id = idGenerate++;
    }

    @Override
    public String toString() {
        return " id сотрудника: " + this.id + ", Ф.И.О. - " + this.nameEmployer +
                ", номер отдела: " + this.numberOtdel + " , зарплата сотрудника: " +
                this.zarplataEmployera;
    }
}