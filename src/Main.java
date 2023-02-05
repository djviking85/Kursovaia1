import java.util.Arrays;

public class Main {
    private static Employee[] employers = new Employee[10];

    public static void main(String[] args) {
        // вбиваем в массив юзеров
        employers[0] = new Employee("Иван Иванович Иванов", 1, 10000);
        employers[1] = new Employee("Сергей Сергеевич Сергеев", 2, 12500);
        employers[2] = new Employee("Лубрикант Лубрикантович Лубрикантов", 3, 2000);
        employers[3] = new Employee("Петр Петрович Петров", 4, 18600);
        employers[4] = new Employee("Заяц Волчков Селедкин", 4, 10020);
        employers[5] = new Employee("Директор Важный Клен", 5, 200000);
        employers[6] = new Employee("Работник Работающий Закопейкин", 4, 500);
        employers[7] = new Employee("Неплохой Получаевич Зарплатов", 2, 105000);
        employers[8] = new Employee("Силикон Силиконович Резинкин", 3, 2000);
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
        // СЛОЖНО =========================================================================================

        // Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
        indexacia(20);
        // Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
        // Сотрудника с минимальной зарплатой.
        sotrudnikMinZp(4);
        // Сотрудника с максимальной зарплатой.
        sotrudnikMaxZp(2);
        // Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
        sredneeZnachenieOtdela(2);
        // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
        indexaciaOtdela(10, 3);
        // Напечатать всех сотрудников отдела (все данные, кроме отдела).
        allNamesOtdel(4);


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
        System.out.println("Сумма затрат на зарплаты в месяц - " + summa);
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
    private static void sredneeZnachenie() {

        int neNull = 0;
        for (Employee employee : employers) {
            if (employee != null)
                neNull = neNull + 1;
        }
        double sredne = 0;
        for (Employee employee : employers) {
            if (employee != null)
                sredne = sredne + employee.getZarplataEmployera();


        }
        // доделать среднее арифм-ое - не воркает
        System.out.println("среднее значение по деньгам - " + sredne / neNull);
    }

    // Получить Ф. И. О. всех сотрудников (вывести в консоль).
    private static void allNames() {
        for (Employee employee : employers) {
            if (employee != null) {
                System.out.println(employee.getNameEmployer());
            }

        }
    }
    // Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
    public static void indexacia (double procent) {
        double total = 0;
        for (Employee employee : employers) {
            if (employee != null) {

                    total = total + employee.getZarplataEmployera();
                    total = (total * (procent / 100))+total;
                }
            }

            System.out.println( "Если мы проиндексируем зарплаты на " + procent + " процентов, то мы получим бюджет на зарплату: " + total+ " рублей");

        }
        // сложные
    // Получить в качестве параметра номер отдела (1–5) и найти (всего 6 методов):
    // Сотрудника с минимальной зарплатой.
    private static void sotrudnikMinZp(int numberOtdel) {
        double minZp = Double.MAX_VALUE;
        Employee minZarplataEmpl = null;

        for (Employee employee : employers) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel && employee.getZarplataEmployera() < minZp) {
                minZp = employee.getZarplataEmployera();
                minZarplataEmpl = employee;
            }
        }
        System.out.println(minZarplataEmpl);
    }
    // Сотрудника с макс зарплатой.
    private static void sotrudnikMaxZp(int numberOtdel) {
        double maxZp = Double.MIN_VALUE;
        Employee maxZarplataEmpl = null;

        for (Employee employee : employers) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel && employee.getZarplataEmployera() > maxZp) {
                maxZp = employee.getZarplataEmployera();
                maxZarplataEmpl = employee;
            }
        }

        System.out.println(maxZarplataEmpl);
    }
    // Среднюю зарплату по отделу (учесть, что количество людей в отделе отличается от employees.length).
    private static void sredneeZnachenieOtdela(int numberOtdel) {

        int neNull = 0;
        for (Employee employee : employers) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel)
                neNull = neNull + 1;
        }
        double sredne = 0;
        for (Employee employee : employers ) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel)
                sredne = sredne + employee.getZarplataEmployera();
        }
        System.out.println("Среднее значение по "+ numberOtdel+ " отделу, равна " + sredne/neNull + " рублей");
    }
    // Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
    public static void indexaciaOtdela (double procent, int numberOtdel) {
        double total = 0;
        for (Employee employee : employers) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel) {
            employee.setZarplataEmployera() = employee.getZarplataEmployera()+ employee.getZarplataEmployera()*(procent/100);

                //     total = employee.getZarplataEmployera()+ employee.getZarplataEmployera()*(procent/100);
                 // почему тут не выходит нужная сумма. как идет умножение???!
          //      total = total + (total * (procent / 100));
            }
        }

        System.out.println( "Если мы проиндексируем зарплаты на " + procent + " процентов, в " +numberOtdel+ " отделе, то мы получим бюджет на зарплату: " + total + " рублей");

    }
    // Напечатать всех сотрудников отдела (все данные, кроме отдела).
    private static void allNamesOtdel(int numberOtdel) {
        for (Employee employee : employers) {
            if (employee != null && employee.getNumberOtdel() == numberOtdel) {
                System.out.println(" В " +numberOtdel+" отделе. id сотрудника = " + employee.getId()+ " Ф.И.О - " + employee.getNameEmployer()+ " , зарплата сотрудника - " + employee.getZarplataEmployera());
            }

        }
    }
}

