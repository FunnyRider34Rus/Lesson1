package Lesson7;

/* Пролог
   Генерал заходит с проверкой в столовую части и спрашивает бойцов:
   Генерал: "Ну и как Вас тут кормят? Еды хватает?"
   Бойцы: "Конечно! Даже остаётся!"
   Генерал: "И что Вы с нею делаете?"
   Бойцы: "Доедаем, аж не хватает"
 */

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[]{                                                  //заводим котов
            new Cat("Мурзик", 5),
            new Cat("Маруся", 3),
            new Cat("Биг Босс", 10)
        };

        Plate plate = new Plate(10);                                      //добываем тарелку с едой

        plate.addFood(2);                                                   //чаевые котам

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);                                                  //кормим котов

            //plate.setFood(plate.getFood() - cat[i].getAppetite());            //не нужна, тк модифицировал код

            if (cat[i].getSatiety()) {                                          //узнаем доволен ли кот
                System.out.println("Кот " + cat[i].getName() + " сытый");
            } else {
                System.out.println("Кот " + cat[i].getName() + " голодный");
            }

            plate.info();                                                       //а вдруг нам что-то осталось?

        }
    }
}
