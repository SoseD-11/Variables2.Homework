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

        System.out.println("Задача 5");
        short totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int allCansPerClass = whiteCansPerClass + brownCansPerClass;
        int totalClasses = totalCans / allCansPerClass;
        int allWhiteBought = totalClasses * whiteCansPerClass;
        int allBrownBought = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + allWhiteBought + " банок белой краски и " + allBrownBought + " банок коричневой краски");

        System.out.println("Задача 6");
        int oneBanana = 80;
        int milk100Ml = 105;
        int twoIceCreams = 2 * 100;
        int oneEggs = 70;
        int  recipeInGr = oneBanana * 5 + milk100Ml * 2 + twoIceCreams + oneEggs * 4;
        int kg = 1000;
        float recipeInKg = recipeInGr / (float)kg;
        System.out.println(recipeInKg + " кг");

        System.out.println("Задача 7");
        int allWeightInKg = 7;
        int allWeightInGr = 1000 * allWeightInKg;
        int aGramsPerDay = 250;
        int bGramsPerDay = 500;
        int allDays250 = allWeightInGr / aGramsPerDay;
        int allDays500 = allWeightInGr / bGramsPerDay;
        int average = (allDays500 + allDays250) / 2;
        System.out.println(allDays250 + " дней потребуется для похудения, если спортсмен будет терять по 250 грамм в день");
        System.out.println(allDays500 + " дней потребуется для похудения, если спортсмен будет терять по 500 грамм в день");
        System.out.println(average + " день может потребоваться в среднем, чтобы добиться результата похудения");

        System.out.println("Задача 8");
        int allPercent = 100;
        int upPercent = 10;
        int marysMonthlySalary = 67760;
        int mary10Up = (marysMonthlySalary * upPercent) / allPercent + marysMonthlySalary;
        int denisMonthlySalary = 83690;
        int denis10Up = (denisMonthlySalary * upPercent) / allPercent + denisMonthlySalary;
        int kristiMonthlySalary = 76230;
        int kristi10Up = (kristiMonthlySalary * upPercent) / allPercent + kristiMonthlySalary;
        int marysYear = marysMonthlySalary * 12;
        int marysYearUp10 = mary10Up * 12;
        int differenceMary = marysYearUp10 - marysYear;
        int denisYear = denisMonthlySalary * 12;
        int denisYear10Up = denis10Up * 12;
        int differenceDenis = denisYear10Up - denisYear;
        int kristiYear = kristiMonthlySalary * 12;
        int kristiYear10Up = kristi10Up * 12;
        int differenceKristi = kristiYear10Up - kristiYear;

        System.out.println("Маша теперь получает " + mary10Up + " рублей. Годовой доход вырос на " + differenceMary + " рублей");
        System.out.println("Денис теперь получает " + denis10Up + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println("Кристина теперь получает " + kristi10Up + " рублей. Годовой доход вырос на " + differenceKristi + " рублей");



    }
}