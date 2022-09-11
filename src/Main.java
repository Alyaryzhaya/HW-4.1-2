public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService(); // объект

        int price = 15000; // цена билета (может называться иначе чем cost)
        int miles = service.calculate(price); // переменная мили = посчитай их от цены билета

        System.out.println(miles);  // вывести на экран возвращенный результат

    }


}

