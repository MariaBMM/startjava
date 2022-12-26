class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Вывод значений переменных на консоль\n");
        byte core = 8;
        short sizeRam = 64;
        int sizeHdd = 1024;
        long price = 149000;
        double freqCpu = 4.23;
        float formFactorHdd = 2.5f;
        char monitorSize = '\"';
        boolean presenceOs = true;
        System.out.println("Количество ядер: " + core);
        System.out.println("Оперативная память: " + sizeRam + " Гб");
        System.out.println("Жесткий диск: " + sizeHdd + " Гб");
        System.out.println("Цена: " + price + " рублей");
        System.out.println("Частота процессора: " + freqCpu + " ГГц");
        System.out.println("Форм-фактор жесткого диска: " + formFactorHdd + "\"");
        System.out.println("Диагональ монитора 27" + monitorSize);
        System.out.println("Наличие ОС: " + presenceOs);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook = 200;
        int discount = 11;
        int sum = pricePen + priceBook;
        double discountSum = sum * 0.11;
        double discountPrice = sum - discountSum;
        System.out.println("Сумма скидки: " + discountSum + " руб");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807l;
        System.out.println("Первоначальное значение типа byte " + maxByte);
        System.out.println("Значение после инкремента типа byte " + ++maxByte);
        --maxByte;
        System.out.println("Значение после декремента типа byte " + --maxByte);
        System.out.println("\nПервоначальное значение типа short " + maxShort);
        System.out.println("Значение после инкремента типа short " + ++maxShort);
         --maxShort;
        System.out.println("Значение после декремента типа short " + --maxShort); 
        System.out.println("\nПервоначальное значение типа int " + maxInt);
        System.out.println("Значение после инкремента типа int " + ++maxInt);
        --maxInt;
        System.out.println("Значение после декремента типа int " + --maxInt);
        System.out.println("\nПервоначальное значение типа long " + maxLong);
        System.out.println("Значение после инкремента типа long " + ++maxLong);
        --maxLong;
        System.out.println("Значение после декремента типа long " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения a = " + a + ", b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("Новые значения a = " + a + ", b = " + b);
        System.out.println("Перестановка с помощью третьей переменной");
        System.out.println("Исходные значения a = " + a + ", b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Новые значения a = " + a + ", b = " + b);
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.println("Исходные значения a = " + a + ", b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения a = " + a + ", b = " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';
        System.out.println((int) symbol1 + " " + symbol1);
        System.out.println((int) symbol2 + " " + symbol2);
        System.out.println((int) symbol3 + " " + symbol3);
        System.out.println((int) symbol4 + " " + symbol4);
        System.out.println((int) symbol5 + " " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash= '\\';
        char underscore = '_';
        char openParenthesis = '(';
        char closeParenthesis = ')';
        System.out.println("    " + slash + backslash + "\n   " + slash + "  " + 
                backslash+ "\n  " + slash + underscore + openParenthesis + " " + 
                closeParenthesis + backslash + "\n " + slash + "      " + backslash + "\n" + 
                slash + underscore + underscore + underscore + underscore + slash + 
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        int hundreds = srcNum / 100;
        int tens = (srcNum % 100) / 10;
        int ones = srcNum % 10;
        System.out.println("Число 123 содержит:\n" + hundreds + " сотен\n" + tens + 
                " десятков\n" + ones + " единиц");
        System.out.println("Сумма его цифр = " + (hundreds + tens + ones));
        System.out.println("Произведение = " + (hundreds * tens * ones));

        System.out.println("\n9. Вывод времени\n");
        int srcSec = 86399;
        int hour = srcSec / 3600;
        int minute = (srcSec % 3600) / 60;
        int sec = srcSec % 60;
        System.out.println(hour + ":"+ minute + ":"+ sec);
    }
}