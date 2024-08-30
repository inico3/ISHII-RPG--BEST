public class Enemy {
    private String name;
    private int hp;
    private int basicAttackPower;
    private Skill[] skills;

    public Enemy(String name, int hp, int basicAttackPower, Skill... skills) {
        this.name = name;
        this.hp = hp;
        this.basicAttackPower = basicAttackPower;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBasicAttackPower() {
        return basicAttackPower;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public void attack(Player player) {
        player.setHp(player.getHp() - basicAttackPower);
        if (player.getHp() < 0) player.setHp(0);
    }
}