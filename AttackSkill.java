public class AttackSkill extends Skill {
    private int damage;

    public AttackSkill(String name, int maxUsageCount, int damage) {
        super(name, maxUsageCount);
        this.damage = damage;
    }

    @Override
    public void use(Player player, Enemy enemy) {
        if (getUsageCount() > 0) {
            enemy.takeDamage(damage);
            decrementUsage();
        }
    }

    public int getDamage() {
        return damage;
    }
}