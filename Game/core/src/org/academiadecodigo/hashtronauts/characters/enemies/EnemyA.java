package org.academiadecodigo.hashtronauts.characters.enemies;

public class EnemyA extends Enemy {

    public EnemyA (int health) {
        health = health;
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public void getHit(int dmg) {
        super.getHit(dmg);
    }

    @Override
    public boolean isDefending() {
        return super.isDefending();
    }

    @Override
    public void setDefending() {
        super.setDefending();
    }

    @Override
    public void defend() {
        super.defend();
    }

    @Override
    public int attack() {
        return 2;
    }

    @Override
    public void useSkill() {
    }

    @Override
    public boolean isDead() {
        return super.isDead();
    }

}