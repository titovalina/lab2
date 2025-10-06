import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.1 Точка координат
        System.out.println("1.1 Точка координат");
        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 10);
        Point p3 = new Point(15, 7);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // 2.1 Прямая (Линия)
        System.out.println("\n 2.1 Прямая (Линия)");
        Line line1 = new Line(new Point(1, 3), new Point(23, 8));
        Line line2 = new Line(new Point(5, 10), new Point(25, 10));
        Line line3 = new Line(line1.getStart(), line2.getEnd());

        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        // Изменяем координаты первой и второй линий
        line1.setStart(new Point(4, 5));
        line1.setEnd(new Point(25, 9));
        line2.setStart(new Point(7, 11));
        line2.setEnd(new Point(27, 11));
        line3.setStart(line1.getStart());
        line3.setEnd(line2.getEnd()); // Убеждаемся, что line3 следует за line2 после изменений

        System.out.println("\nПосле изменения координат:");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        // Изменяем координаты первой линии так, чтобы не менялись координаты третьей
        line1.setStart(new Point(1, 3));
        line1.setEnd(new Point(23, 8));

        System.out.println("\nПосле изменения line1, но line3 осталась прежней:");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 3: " + line3);

        // 3.1 Студент
        System.out.println("\n3.1 Студент");

        // 1. Создать студента Васю с оценками: 3,4,5.
        int[] vasyaGrades = {3, 4, 5};
        Student vasya = new Student("Вася", vasyaGrades);
        System.out.println("Создан студент Вася: " + vasya);

        // 2. Создать студента Петю и скопировать оценки Васи, присвоив содержимое поля с оценками Васи полю с оценками Пети.
        Student petya = new Student("Петя", vasya.getGrades()); // Поверхностное копирование (одна и та же ссылка)
        System.out.println("Создан студент Петя: " + petya);

        // 3. Заменить первую оценку Пети на число 5. Вывести на экран строковое представление Васи и Пети. Объяснить результат.
        petya.getGrades()[0] = 5;
        System.out.println("После изменения первой оценки Пети:");
        System.out.println("Вася: " + vasya);
        System.out.println("Петя: " + petya);

        // 4. Создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи не влияло на Андрея.
        int[] andreyGrades = new int[vasyaGrades.length];
        System.arraycopy(vasyaGrades, 0, andreyGrades, 0, vasyaGrades.length);
        Student andrey = new Student("Андрей", andreyGrades);
        System.out.println("Создан студент Андрей: " + andrey);

        vasya.getGrades()[0] = 2; // Меняем оценку Васи, проверяем Андрея
        System.out.println("После изменения первой оценки Васи:");
        System.out.println("Вася после изменения: " + vasya);
        System.out.println("Андрей: " + andrey);

        // 4.1 Создаем Точку (только с координатами X и Y)
        System.out.println("\n 4.1 Создаем Точку (только с X и Y)");
        Point point1 = new Point(3, 5);
        Point point2 = new Point(25, 6);
        Point point3 = new Point(7, 8);

        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point3);

        // 4.2 Создаем Линию (с точками и координатами)
        System.out.println("\n 4.2 Создаем Линию (с точками и координатами)");
        Line line4 = new Line(new Point(1, 3), new Point(23, 8)); // С точками
        Line line5 = new Line(5, 10, 25, 10); // С координатами
        Line line6 = new Line(line4.getStart(), line5.getEnd()); //Связь по точкам

        System.out.println("Линия 4: " + line4);
        System.out.println("Линия 5: " + line5);
        System.out.println("Линия 6: " + line6);

        // 5.1 Длина Линии
        System.out.println("\n 5.1 Длина Линии");
        Line line7 = new Line(new Point(1, 1), new Point(10, 15));
        int length = line7.getLength();
        System.out.println("Длина линии: " + length);

        scanner.close();
    }
}
