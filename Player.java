public class Player {
    private String name;
    private int hp;
    private int basicAttackPower;
    private Skill skill1;
    private Skill skill2;

    public Player(String name, int hp, int basicAttackPower, Skill skill1, Skill skill2) {
        this.name = name;
        this.hp = hp;
        this.basicAttackPower = basicAttackPower;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(basicAttackPower);
    }

    public void useSkill(Skill skill, Enemy enemy) {
        skill.use(this, enemy);
    }

    public void takeDamage(int damage) {
        this.hp -= damage;
        if (this.hp < 0) this.hp = 0;
    }

    public void heal(int amount) {
        this.hp += amount;
        // 最大HPを制限する場合は追加のロジックをここに追加
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean setHp(int hp) {
        this.hp=hp;
        return true;
    }
    public int getBasicAttackPower() {
        return basicAttackPower;
    }

    public Skill getSkill1() {
        return skill1;
    }

    public Skill getSkill2() {
        return skill2;
    }
}