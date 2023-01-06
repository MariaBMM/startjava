class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java\n");
        int age = 21;
        boolean maleGender = false;
        double height = 1.85;
        char firstLetterName = 'M';
        
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
        
        firstLetterName = "Mariya".charAt(0);
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
        int max = num1;

        if (max > num2) {
            System.out.println("Максимальное число " + max + ", минимальное число " + num2);
        } else if (max < num2) {
            max = num2;
            System.out.println("Максимальное число " + max + ", минимальное число " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа\n");
        int num = 89;

        if (num == 0) {
            System.out.println("Число " + num + " равно нулю");
        } else {
            if (num % 2 == 0) {
                System.out.println("Число " + num + " четное");
            } else {
                System.out.println("Число " + num + " нечетное");
            }
            if (num > 0) {
                System.out.println("Число " + num + " положительное"); 
            } else {
                System.out.println("Число " + num + " отрицательное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах\n");
        int srcNum1 = 123;
        int srcNum2 = 321;
        int dig11 = srcNum1 / 100;
        int dig12 = (srcNum1 % 100) / 10;
        int dig13 = srcNum1 % 10;
        int dig21 = srcNum2 / 100;;
        int dig22 = (srcNum2 % 100) / 10;
        int dig23 = srcNum2 % 10;
        
        if (dig11 == dig21) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + 
                    dig11 + " в первом разряде");
        }
        if (dig12 == dig22) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + 
                    dig12 + " во втором разряде");
        }
        if (dig13 == dig23) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковая цифра " + 
                    dig13 + " в третьем разряде");
        } 
        if (dig11 != dig21 && dig12 != dig22 && dig13 != dig23) {
            System.out.println("В числах " + srcNum1 + " и " + srcNum2 + " одинаковых цифр нет");
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
        
        if (deposit > 0 && deposit < 100000) {
            System.out.println("При сумме вклада  " + deposit + 
                    " рублей, начисленный процент равен " + (int) (deposit * 0.05) + 
                    " рублей, итоговая сумма равна " + 
                    (int) (deposit * 0.05 + deposit) + " рублей");
        } else if (deposit >= 100000 && deposit <= 300000) {
            System.out.println("При сумме вклада  " + deposit + 
                    " рублей, начисленный процент равен " + (int) (deposit * 0.07) + 
                    " рублей, итоговая сумма равна " + 
                    (int) (deposit * 0.07 + deposit) + " рублей");
        } else if (deposit > 300000) {
            System.out.println("При сумме вклада  " + deposit + 
                    " рублей, начисленный процент равен " + (int) (deposit * 0.10) + 
                    " рублей, итоговая сумма равна " + 
                    (int) (deposit * 0.10+ deposit) + " рублей");
        } 

        System.out.println("\n7. Определение оценки по предметам \n");
        int historyPercent = 59;
        int programmingPercent = 91;
        int historyRating = 0;
        int programmingRating =0;
        
        if (historyPercent >= 0 && historyPercent <= 60) {
           historyRating = 2;
         } else if (historyPercent > 60 && historyPercent <= 73) {
            historyRating = 3;
        } else if (historyPercent > 73 && historyPercent <= 91) {
            historyRating = 4;
        } else if (historyPercent > 91) {
            historyRating = 5;
        } 
        
        if (programmingPercent >= 0 && programmingPercent <= 60) {
           programmingRating = 2;
        } else if (programmingPercent > 60 && programmingPercent <= 73) {
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
        int srcsum = 567;
        int banknote100 = 10;
        int banknote10 = 5;
        int banknote1 = 50;
        int numbanknote100 = 0;
        int numbanknote10 = 0;
        int numbanknote1 = 0;
        int b100 = srcsum / 100;
        
        if (b100 <= banknote100) {
           numbanknote100 = b100;
        } else {
            numbanknote100 = banknote100;
        } 
        int b10 = (srcsum - (numbanknote100 * 100)) / 10;
        if (b10 <= banknote10) {
            numbanknote10 = b10;
        } else {
            numbanknote10 = banknote10;
        } 
        numbanknote1 = (srcsum - (numbanknote100 * 100) - (numbanknote10 * 10)) / 1;
        int sumbanknote = numbanknote100 * 100 + numbanknote10 * 10 + numbanknote1;
        System.out.println("Сумма для выдачи (USD): " + sumbanknote);
        System.out.println("Выдано: " + numbanknote100 + " банкнот номиналом 100 USD");
        System.out.println("Выдано: " + numbanknote10 + " банкнот номиналом 10 USD");
        System.out.println("Выдано: " + numbanknote1 + " банкнот номиналом 1 USD");
    }
}