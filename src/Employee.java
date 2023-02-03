public class Employee {
    public Employee ( String firstNameEmployer, String otchestvoEmployer,
                     String secondNameEmployer, int numbersOtdels, int zarplataEmployers ) {
        this.idCreator = idCreator;
        this.firstNameEmployer = firstNameEmployer;
        this.otchestvoEmployer = otchestvoEmployer;
        this.secondNameEmployer = secondNameEmployer;
        this.numbersOtdels = numbersOtdels;
        this.zarplataEmployers = zarplataEmployers;

    }

    // присваиваем Айди новому сотруднику
    public static int idCreator; {
        int id = 1;
        id = id++;


    }
    // указываем переменные на ФИО, номер отдела, зп сотрудника
    ////////////////////////////////////////////////////////////////
    // указываем имена сотруднков
    private String firstNameEmployer;
    public String getFirstNameEmployer() {
        return firstNameEmployer;
    }
    private String otchestvoEmployer;
    public String getOtchestvoEmployer() {
        return otchestvoEmployer;
    }
    private String secondNameEmployer;
    public String getSecondNameEmployer() {
        return secondNameEmployer;
    }


    ////////////////////////////////////////////////////////////////////////////////
    // указываем количество отделов 1-5 или сами отделы
    private int numbersOtdels;
    public void setNumbersOtdels(int numbersOtdels) {
        this.numbersOtdels = numbersOtdels;
    }

    public int getNumbersOtdels() {
        return numbersOtdels;
    }


//////////////////////////////////////////////////////////////////
    // указываем зарплату сотрудников
    private int zarplataEmployers;
    public int getZarplataEmployers() {
        return zarplataEmployers;
    }
    public void setZarplataEmployers(int zarplataEmployers) {
        this.zarplataEmployers = zarplataEmployers;
    }





    // Добавить статическую переменную-счетчик, которая будет отвечать за id.
    // Добавить в класс Employee поле id, которое проставляется из счетчика,
    // а затем счетчик увеличивает свое значение.

    // методы
    // создаем ФИО
    // создаем геттер по фио

    // методы
    // создаем номер отдела
    // создаем геттер для номера отдела
    // создаем сеттер для номера отдела



    //создаем счетчик
}
