// Допустим, в программе есть класс Кот. У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём
// пищи). Эти поля мы заполняем с помощью конструктора. Также есть метод eat(), который заставляет
// кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду:
// Чтобы можно было хранить еду, создадим класс Тарелка с полем food (еда измеряется в целых
// числах и не важно, что это за единицы измерения). При создании тарелки мы можем указать
// начальное значение food. В процессе работы с помощью метода info() можно вывести в консоль
// информацию о тарелке.
// Если в методе main() создать объекты этих классов, то можно узнать информацию о тарелке и
// вызвать пустой метод eat() у кота. Эти объекты пока никак не могут взаимодействовать между собой.
// Можно добавить в классы геттеры и сеттеры и получить код вроде.

// ЗАДАНИЕ

// 1. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
// 2. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
// 3. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
// 4. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
// Достаточно выполнить первые 2 подпункта задачи.
// Формат сдачи: ссылка на гитхаб проект

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 20);
        cats[1] = new Cat("Ryzhik", 10);
        cats[2] = new Cat("Pushok", 35);
        cats[3] = new Cat("Murka", 50);
        Plate plate = new Plate(100);

        for (int i = 0; i < cats.length; i++){
            plate.info();
            if (plate.getFood() < cats[i].getAppetite()){
                cats[i].dontEat();
                plate.setFood(plate.getFood());
                cats[i].showHungerStatus();
                if (cats[i].getFulness() == false) {
                    plate.addFood(cats[i].getAppetite());
                    cats[i].eat();
                    plate.setFood(plate.getFood() - cats[i].getAppetite());
                    cats[i].showHungerStatus();
                }

            } else {
                cats[i].eat();
                plate.setFood(plate.getFood() - cats[i].getAppetite());
                cats[i].showHungerStatus();
            }
            System.out.println("");
        }
        
    }
}