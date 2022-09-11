public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int numI = 3;
        byte numB = 100;
        short numS = 15200;
        long numL = 786987;
        float numF = 23.12f;
        double numD = 78.30;
        System.out.println("Значение переменной numI с типом int равно " + numI);
        System.out.println("Значение переменной numB с типом byte равно " + numB);
        System.out.println("Значение переменной numS с типом short равно " + numS);
        System.out.println("Значение переменной numL с типом long равно " + numL);
        System.out.println("Значение переменной numF с типом float равно " + numF);
        System.out.println("Значение переменной numD с типом double равно " + numD);

        System.out.println("Задача 2");
        double d = 27.12;
        long l = 987678965549L;
        float f = 2.786f;
        short s = 569;
        int temp = -159;
        boolean exTemp = temp > -150;
        char un = 27897;
        byte b = 67;
        System.out.println(d);
        System.out.println(l);
        System.out.println(f);
        System.out.println(exTemp);
        System.out.println(s);
        System.out.println(temp);
        System.out.println(un);
        System.out.println(b);

        System.out.println("Задача 3");
        byte theStudentsLp = 23;
        byte theStudentsAs = 27;
        byte theStudentsEa = 30;
        short allPaper = 480;
        int allStudents = theStudentsAs + theStudentsEa + theStudentsLp;
        int personPaper = allPaper / allStudents;
        System.out.println("На каждого ученика рассчитано " + personPaper + " листов бумаги");

        System.out.println("Задача 4");
        byte bottle = 16;
        byte timeMin = 2;
        byte min20 = 20;
        int minDay = 24 * 60;
        int threeDays = minDay * 3;
        int oneMonth = minDay * 30;
        int performance1Min = bottle / timeMin;
        int performance20Min = performance1Min * min20;
        int performanceDay = performance1Min * minDay;
        int performanceThreeDay = performance1Min * threeDays;
        int performanceOneMonth = performance1Min * oneMonth;
        System.out.println("За 20 минут машина произвела бутылок " + performance20Min + " штук" );
        System.out.println("За сутки минут машина произвела бутылок " + performanceDay + " штук" );
        System.out.println("За 3 дня машина произвела бутылок " + performanceThreeDay + " штук" );
        System.out.println("За 1 месяц машина произвела бутылок " + performanceOneMonth + " штук" );



    }
}