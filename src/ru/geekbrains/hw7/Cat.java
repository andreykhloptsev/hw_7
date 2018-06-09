package ru.geekbrains.hw7;

/**
 * Created by Akhloptsev
 */
public class Cat {
   private String name;
   private int appetit;
   private boolean fullness;

    public Cat(String name, int appetit, boolean fullness) {
        this.name = name;
        this.appetit = appetit;
        this.fullness = fullness;
    }

    public void eat(Plate p){
        if (p.getFood()>=appetit) {
            p.setFood(p.getFood()-appetit);
            fullness = true;
            System.out.println(name + " сыт");
            System.out.println("В тарелке осталось "+ p.getFood()+ " еды");
        } else
        {
            System.out.println("В тарелке недостаточно еды");
            System.out.println(name + " голоден");
            System.out.println("В тарелке осталось "+ p.getFood()+ " еды");
        }
    }

    public void info()
    {
        System.out.println("Name: "+name+", appetit: "+appetit+", fullnes: "+fullness);
    }

}
