class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 21;
        boolean maleGender = false;
        double height = 1.85;
        
        if (age > 20) {
            System.out.println("Вам разрешено брать в аренду суперкары.");
        } else {
            System.out.println("Вам разрешено брать в аренду автомобили не выше среднего класса.");
        }
        
        if (!maleGender) {
            System.out.println("Вы мужчина.");
        } else {
            System.out.println("Вы женщина.");
        }
        
        if (height < 1.80) {
            System.out.println("Вам будет удобно сидеть на любом месте.");
        } else {
            System.out.println("Выберите места у аварийных выходов.");
        }
        
        char firstLetterName = "Mariya".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Первая буква имени M");
        } else if (firstLetterName == 'I') {
            System.out.println("Первая буква имени I"); 
        } else {
            System.out.println("Первая буква имени ни M, ни I"); 
        }

        System.out.println("\n2. Поиск max и min числа\n");
        int num1 = 5;
        int num2 = 8;

        if (num1 > num2) {
            System.out.println("Максимальное число " + num1 + ", минимальное число " + num2);
        } else if (num1 < num2) {
            System.out.println("Максимальное число " + num2 + ", минимальное число " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа\n");
        int num = 89;
        System.out.print("Число " + num);

        if (num == 0) {
            System.out.println(" равно нулю");
        } else {
            if (num % 2 == 0) {
                System.out.print(" четное");
            } else {
                System.out.print(" нечетное");
            }
            if (num > 0) {
                System.out.println(" положительное"); 
            } else {
                System.out.println(" отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int srcNum1 = 123;
        int srcNum2 = 321;
        int hundreds1 = srcNum1 / 100;
        int tens1 = (srcNum1 % 100) / 10;
        int ones1 = srcNum1 % 10;
        int hundreds2 = srcNum2 / 100;;
        int tens2 = (srcNum2 % 100) / 10;
        int ones2 = srcNum2 % 10;
        System.out.print("В числах " + srcNum1 + " и " + srcNum2);
        
        if (hundreds1 == hundreds2) {
            System.out.println(" одинаковая цифра " + hundreds1 + " в первом разряде");
        }
        if (tens1 == tens2) {
            System.out.println(" одинаковая цифра " + tens1 + " во втором разряде");
        }
        if (ones1 == ones2) {
            System.out.println(" одинаковая цифра " + ones1 + " в третьем разряде");
        } 
        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println(" одинаковых цифр нет");
        }

        System.out.println("\n5. Определение символа по его коду\n");
        char simbol = '\u0057';
        
        if (simbol >= 'a' && simbol <= 'z') {
            System.out.println("Символ  " + simbol + " является маленькой буквой");
        } else if (simbol >= 'A' && simbol <= 'Z') {
            System.out.println("Символ  " + simbol + " является БОЛЬШОЙ буквой");
        } else if (simbol >= '0' && simbol <= '9') {
            System.out.println("Символ  " + simbol + " является цифрой");
        } else {
            System.out.println("Символ  " + simbol + " не является цифрой или буквой");
        }

      System.out.println("\n6. Подсчет суммы вклада и начисленных банком % \n");
        int deposit = 300000;
        int interestRate = 5; 
        if (deposit >= 100000 && deposit <= 300000) {
            interestRate = 7;
        } else if (deposit > 300000) {
            interestRate = 10;
        } 
        System.out.println("При сумме вклада  " + deposit + " рублей, начисленный процент равен " + 
                deposit * interestRate / 100 + " рублей, \nитоговая сумма равна " + 
                (deposit * interestRate / 100 + deposit) + " рублей");

        System.out.println("\n7. Определение оценки по предметам \n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyRating = 2;
        int programmingRating = 2;
        
        if (historyPercent > 60 && historyPercent <= 73) {
            historyRating = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyRating = 4;
        } else if (historyPercent > 91) {
            historyRating = 5;
        } 
        
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingRating = 3;
        } else if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingRating = 4;
        } else if (programmingPercent > 91) {
             programmingRating = 5;
        } 
        System.out.println("Оценка по истории " + historyRating);
        System.out.println("Оценка по программированию " + programmingRating);
        System.out.println("Средний балл по предметам " + (programmingRating + historyRating) / 2);
        System.out.println("Средний процент по предметам " + (historyPercent + 
                programmingPercent) / 2);

        System.out.println("\n8. Расчет прибыли за год \n");
        int rentalCost = 5000;
        int saleSum = 13000;
        int costPrice = 9000;
        int profitSum = (saleSum - rentalCost - costPrice) * 12;
        
        if (profitSum > 0) {
            System.out.println("Прибыль за год:  +" + profitSum + " рублей");
         } else {
            System.out.println("Прибыль за год:  " + profitSum + " рублей");
        }

        System.out.println("\n9. Подсчет количества банкнот \n");
        int cash = 567;
        int srcSum = cash;
        int banknoteBankomat100 = 10;
        int banknoteBankomat10 = 5;
        int banknoteBankomat1 = 50;
        int numBanknote100 = 0;
        int numBanknote10 = 0;
        int numBanknote1 = 0;
        int banknote100 = srcSum / 100;
        
        if (banknote100 <= banknoteBankomat100) {
           numBanknote100 = banknote100;
        } else {
            numBanknote100 = banknoteBankomat100;
        } 
        int banknote10 = (srcSum - (numBanknote100 * 100)) / 10;
        
        if (banknote10 <= banknoteBankomat10) {
            numBanknote10 = banknote10;
        } else  {
            numBanknote10 = banknoteBankomat10;
        } 
        int banknote1 = (srcSum - (numBanknote100 * 100) - (numBanknote10 * 10)) / 1;
        
        if (banknote1 <= banknoteBankomat1) {
            numBanknote1 = banknote1;
            int sumBanknote = numBanknote100 * 100 + numBanknote10 * 10 + numBanknote1;
            System.out.println("Сумма для выдачи (USD): " + sumBanknote);
            System.out.println("Выдано: " + numBanknote100 + " банкнот номиналом 100 USD");
            System.out.println("Выдано: " + numBanknote10 + " банкнот номиналом 10 USD");
            System.out.println("Выдано: " + numBanknote1 + " банкнот номиналом 1 USD");
        } else {
            System.out.println("Банкнот не хватает для выдачи нужной суммы ");
        }
    }
}