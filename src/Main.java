import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char[] Employee = new char[10];
        System.out.println(Arrays.toString(Employee));
        Employee rabotnik = new Employee( "Иван", "Иванович", "Иванов", 1, 10000);
        System.out.printf(" %d ФИО: %s %s %s, номер отдела %s, с зарплатой %d рублей %n",
                rabotnik.idCreator,
                rabotnik.getFirstNameEmployer(),
                rabotnik.getOtchestvoEmployer(),
                rabotnik.getSecondNameEmployer(),
                rabotnik.getNumbersOtdels(),
                rabotnik.getZarplataEmployers());
        Employee rabotnik2 = new Employee("Сергей", "Сергеевич", "Сергеев", 2, 15000);
        System.out.printf(" %d ФИО: %s %s %s, номер отдела %s, с зарплатой %d рублей %n",
                rabotnik2.idCreator,
                rabotnik2.getFirstNameEmployer(),
                rabotnik2.getOtchestvoEmployer(),
                rabotnik2.getSecondNameEmployer(),
                rabotnik2.getNumbersOtdels(),
                rabotnik2.getZarplataEmployers());

        System.out.println(Employee[1]);
       //
        System.out.println( ""+rabotnik.getFirstNameEmployer() +""+rabotnik.getOtchestvoEmployer()+""+rabotnik.getSecondNameEmployer()
        + rabotnik.getNumbersOtdels() + ""+  rabotnik.getZarplataEmployers() );
    }

}