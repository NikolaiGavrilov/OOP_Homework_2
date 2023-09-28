
public class Cat {
    private String name;
    private int appetite;
    private boolean fulness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fulness = false;
    }

    public void showHungerStatus(){
        if (this.fulness == false){
            System.out.println("Ваш котик " + this.name + " голоден, скорее его покормите!");
        } else {
            System.out.println("Ваш котик " + this.name + " сыт и доволен жизнью!");
        }
    }

    public void eat() {
        this.fulness = true;
        System.out.println("Ваш котик " + this.name +" покушал!");
     }

    public int getAppetite() {
        return this.appetite;
    }

    public void dontEat() {
        this.fulness = false;
        System.out.println("Ваш котик " + this.name + " счёл количество подношений недостаточным и отказался есть.");
    }

    public boolean getFulness() {
        if (this.fulness == false) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return this.name;
    }
}