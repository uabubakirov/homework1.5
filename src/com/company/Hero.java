package com.company;

public class Hero {
    private int damage;
    private int hitPoints;
    private String superPower;
    public Hero(int damage,int hitPoints,String superPower){
        this.damage=damage;
        this.hitPoints=hitPoints;
        this.superPower=superPower;
    }
    public Hero(int damage,int hitPoints){
        this.damage=damage;
        this.hitPoints=hitPoints;
    }



    public int getDamage() {
        return damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public String getSuperPower() {
        return superPower;
    }

//    public void setDamage(int damage) {
//        this.damage = damage;
//    }
//
//    public void setHitPoints(int hitPoints) {
//        this.hitPoints = hitPoints;
//    }
//
//    public void setSuperPower(String superPower) {
//        this.superPower = superPower;
//    }
}
