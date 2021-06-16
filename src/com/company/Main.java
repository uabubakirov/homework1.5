package com.company;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHitPoints(700);
        boss.setTypeDeffence("Magical");
        System.out.println("Урон босса: "+boss.getDamage() + ". Здоровье босса: " + boss.getHitPoints() + ". Тип защиты босса: " + boss.getTypeDeffence());
        System.out.println("----------------------------------------");
        System.out.println(Arrays.toString(createHeroes()));
    }
    public static Hero[] createHeroes(){
        Hero firstHero = new Hero(20,240,"Magic");

        Hero secondHero = new Hero(30,260,"Physic");

        Hero thirdHero = new Hero(10,300);

        Hero[] heroes = {firstHero,secondHero,thirdHero};
        return heroes;

    }
}
//    Создать класс Героя (Hero), с приватными полями здоровье, урон и суперспособность.
//        Написать 2 разных конструктора для создания объекта.
//        В одном конструкторе задаются все поля, в другом только здоровье и урон.
//        Добавить в класс Hero геттеры для всех полей.
//        Создать класс Босса (Boss), с приватными полями здоровье, урон и тип защиты.
//        Добавить в класс геттеры и сеттеры для всех полей.
//        В классе Main создать 1 экземпляр босса и задать ему все свойства (значения полям).
//        Затем распечатать всю информацию о боссе.
//        ДЗ на сообразительность:
//        Добавить метод в классе Main который называется createHeroes,
//        в теле метода необходимо создать 3х героев с помощью класса Hero,
//        используя при этом разные варианты конструкторов (либо первый либо второй).
//        Затем поместить созданные экземпляры героев в
//        массив и вернуть его с помощью команды return, как возвращаемый результат метода createHeroes. Hero[]
//        Затем вызвать этот метод в методе main и распечатать информацию о всех героях массива через цикл.