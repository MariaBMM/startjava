class VariablesTheme {

    public static void main (String args[]) {
        System.out.println("\n1. Вывод значений переменных на консоль\n");
        byte kernel = 8;
        short sizeRam = 64;
        int sizeHdd = 1024;
        long price = 149000;
        double freqCpu = 4.23;
        float formFactorHdd = 2.5f;
        char monitorSize = '\"';
        boolean presenceOs = true;
        System.out.println("Количество ядер: " + kernel);
        System.out.println("Оперативная память: " + sizeRam + " Гб");
        System.out.println("Жесткий диск: " + sizeHdd + " Гб");
        System.out.println("Цена: " + price + " рублей");
        System.out.println("Частота процессора: " + freqCpu + " ГГц");
        System.out.println("Форм-фактор жесткого диска: " + formFactorHdd + "\"");
        System.out.println("Диагональ монитора 27" + monitorSize);
        System.out.println("Наличие ОС: " + presenceOs);

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");
        int pricePen = 100;
        int priceBook =200;
        int discount = 11;
        /*int sum;
        double totalDiscount;
        double finalPrice;*/
        int sum = pricePen + priceBook;
        double totalDiscount = sum * 0.11;
        double finalPrice = sum - totalDiscount;
        System.out.println("Сумма скидки: " + totalDiscount + " руб");
        System.out.println("Общая стоимость товаров со скидкой: " + finalPrice + " руб");

        System.out.println("\n3. Вывод слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов\n");
        byte num1 = 127;
        short num2 = 32767;
        int num3 = 2147483647;
        long num4 = 9223372036854775807l;
        System.out.println("Первоначальное значение типа byte " + num1);
        System.out.println("Первоначальное значение типа short " + num2);
        System.out.println("Первоначальное значение типа int " + num3);
        System.out.println("Первоначальное значение типа long " + num4);
        num1++;
        num2++;
        num3++;
        num4++;
        System.out.println("Значение после инкремента типа byte " + num1);
        System.out.println("Значение после инкремента типа short " + num2);
        System.out.println("Значение после инкремента типа int " + num3);
        System.out.println("Значение после инкремента типа long " + num4);
        --num1;
        --num2;
        --num3;
        --num4;
        num1--;
        num2--;
        num3--;
        num4--;
        System.out.println("Значение после декремента типа byte " + num1);
        System.out.println("Значение после декремента типа short " + num2);
        System.out.println("Значение после декремента типа int " + num3);
        System.out.println("Значение после декремента типа long " + num4);

        System.out.println("\n5. Перестановка значений переменных\n");
        int a = 2;
        int b = 5;
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("Исходные значения a = " + a + ", b = " + b);
        a += b;
        b = a-b;
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
        a ^=b;
        b ^=a;
        a ^=b;
        System.out.println("Новые значения a = " + a + ", b = " + b);

        System.out.println("\n6. Вывод символов и их кодов\n");
        char symbol1 = '#';
        char symbol2 = '&';
        char symbol3 = '@';
        char symbol4 = '^';
        char symbol5 = '_';
        System.out.println("35 " + symbol1);
        System.out.println("38 " + symbol2);
        System.out.println("64 " + symbol3);
        System.out.println("94 " + symbol4);
        System.out.println("95 " + symbol5);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка\n");
        char symbol6 = '/';
        char symbol7= '\\';
        char symbol8 = '_';
        char symbol9 = '(';
        char symbol10 = ')';
        System.out.println("    " + symbol6 + symbol7 + "\n   " + symbol6 + "  " + symbol7 + "\n  " + symbol6 + symbol8 + symbol9 + " " + symbol10 + symbol7 + "\n " + symbol6 + "      " + symbol7 + "\n" + symbol6 + symbol8 + symbol8 + symbol8 + symbol8 + symbol6 + symbol7 + symbol8 + symbol8 + symbol7);
        
        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа\n");
        int srcNum=123;
        int dig1 = srcNum / 100;
        int dig2 = (srcNum % 100) / 10;
        int dig3 = srcNum % 10;
        System.out.println("Число 123 содержит:\n" + dig1 + " сотен\n" + dig2 +" десятков\n" + dig3 + " единиц");
        System.out.println("Сумма его цифр = " + (dig1 + dig2 + dig3));
        System.out.println("Произведение = " + (dig1 * dig2 * dig3));

        System.out.println("\n9. Вывод времени\n");
        int srcSec = 86399;
        int dighour = srcSec / 3600;
        int digminute = (srcSec % 3600) / 60;
        int digsec = (srcSec % 3600) % 60;
        System.out.println(dighour + ":"+ digminute + ":"+ digsec);

    }
}