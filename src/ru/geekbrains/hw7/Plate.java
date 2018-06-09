package ru.geekbrains.hw7;

/**
 * Created by Akhloptsev
 */
public class Plate {
   private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood(int extraFood){
        setFood(getFood()+extraFood);
        System.out.println("Теперь в тарелке "+getFood()+" еды");
    }
}
