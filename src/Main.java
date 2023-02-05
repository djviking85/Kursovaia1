import java.util.Arrays;

public class Main {
    private static Employee[] employers = new Employee[10];
    public static void main(String[] args) {
        // вбиваем в массив юзеров
        employers [0] = new Employee( "Иван Иванович Иванов", 1, 10000);
        employers [1] = new Employee( "Сергей Сергеевич Сергеев", 2, 12500);
        employers [2] = new Employee( "Лубрикант Лубрикантович Лубрикантов", 3, 2000);
        employers [3] = new Employee( "Петр Петрович Петров", 4, 18600);
        employers [4] = new Employee( "Заяц Волчков Селедкин", 4, 10020);
        employers [5] = new Employee( "Директор Важный Клен", 5, 200000);
        // Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        kolichestvoPersonala();
        // Посчитать сумму затрат на зарплаты в месяц.
        allZatratiDenegInMounth();
        // Найти сотрудника с минимальной зарплатой.
        printMinZarplataEmployer();
        // Найти сотрудника с максимальной зарплатой.
        printMaxZarplataEmployer();
        // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
        sredneeZnachenie();
        // Получить Ф. И. О. всех сотрудников (вывести в консоль).
        allNames();

    }
private static void kolichestvoPersonala() {
        // метод на количество персонала
    for (Employee employee : employers) {
        if (employee != null) {
            System.out.println(employee);
        }

    }
}
    // метод на подсчет сумму затрат на зарплаты в месяц.
    private static void allZatratiDenegInMounth() {
        double summa = 0;
                for (Employee employee : employers) {
                    if (employee != null)
                        summa = summa + employee.getZarplataEmployera();
                            }
        System.out.println("Сумма затрат на зарплаты в месяц - " +summa);
    }

    // Метод на поиск сотрудника с минимальной зарплатой.
    private static void printMinZarplataEmployer() {
        double minZp = Double.MAX_VALUE;
        Employee minZarplataEmpl = null;

            for (Employee employee : employers) {
                if (employee != null && employee.getZarplataEmployera() < minZp) {
                    minZp = employee.getZarplataEmployera();
                    minZarplataEmpl = employee;
                }
                }

        System.out.println(minZarplataEmpl);
    }


    // Метод на поиск сотрудника с максимальной зарплатой.
    private static void printMaxZarplataEmployer() {
        double maxZp = Double.MIN_VALUE;
        Employee maxZarplataEmpl = null;

            for (Employee employee : employers) {
                if (employee != null && employee.getZarplataEmployera() > maxZp) {
                    maxZp = employee.getZarplataEmployera();
                    maxZarplataEmpl = employee;
                }
            }

        System.out.println(maxZarplataEmpl);
    }
    // Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    private static void   sredneeZnachenie() {

        int neNull = 0;
        for (Employee employee : employers) {
            if (employee != null )
                neNull = neNull+1;}
            double sredne = 0;
            for (Employee employee : employers) {
                if (employee != null )
            sredne = sredne + employee.getZarplataEmployera();


        }
        // доделать среднее арифм-ое - не воркает
        System.out.println("среднее значение по деньгам - " + sredne/ neNull);
    }
    // Получить Ф. И. О. всех сотрудников (вывести в консоль).
private static void allNames () {
    for (Employee employee : employers) {
        if (employee != null) {
            System.out.println(employee.getNameEmployer());
        }

    }
}
}
