import java.util.Arrays;

public class Main {
    private static Employee[] employers = new Employee[10];
    public static void main(String[] args) {
        employers [0] = new Employee( "Иван Иванович Иванов", 1, 10000);
        employers [1] = new Employee( "Сергей Сергеевич Сергеев", 2, 12500);
        employers [2] = new Employee( "Лубрикант Лубрикантович Лубрикантов", 3, 2000);
        employers [3] = new Employee( "Петр Петрович Петров", 4, 18600);
        employers [4] = new Employee( "Заяц Волчков Селедкин", 4, 10020);
        employers [5] = new Employee( "Директор Важный Клен", 5, 200000);
        kolichestvoPersonala();
    }
private static void kolichestvoPersonala() {
    for (int i = 0; i < employers.length; i++) {
        if (employers != null) {
            System.out.println(Arrays.toString(employers));
        }

    }
}

}