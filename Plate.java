public class Plate{
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        if (this.food > 0){
            System.out.println("В тарелке находится " + this.food + " вкусняшек.");
        } else if (this.food == 0){
            System.out.println("В тарелке нет вкусняшек.");
        } else if (this.food < 0) {
            replacePlate();
        }
    }

    public int getFood() {
        return this.food;
    }

    public void addFood(int i) {
        this.food += i;
        System.out.println("Вы подсыпали в миску " + this.food + " вкусняшек.");
    }

    public int giveFood(int i) {
        this.food -= i;
        return this.food;
        }
    
    public void setFood(int i) {
        this.food = i;
        if (this.food == 0){
            System.out.println("В тарелке не осталось вкусняшек.");
        } else if (this.food > 0) {
            System.out.println("В тарелке осталось " + i + " вкусняшек.");
        } else {
            replacePlate();
        }
    }

    /**
     * Метод замены тарелки на случай, если в тарелке оказывается отрицательное количество вкусняшек.
     */
    public void replacePlate(){
        this.food = (-this.food);
        System.out.println("Котик съел тарелку, пришлось её заменить и насыпать туда " + this.food + " новых вкусняшек.");
        
    }
}