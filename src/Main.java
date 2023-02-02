public class Main {
    public static void main(String[] args) {
        Employee rabotnik = new Employee("Иван", "Иванович", "Иванов", 1, 10000);
        System.out.printf(" ФИО %s %s %s, номер отдела %d, с зарплатой %d%n",
                rabotnik.getFirstNameEmployer(),
                rabotnik.getOtchestvoEmployer(),
                rabotnik.getSecondNameEmployer(),
                rabotnik.getNumbersOtdels,
                rabotnik.getZarplataEmployers());
    }

}