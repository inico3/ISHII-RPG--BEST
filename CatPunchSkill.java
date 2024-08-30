public class CatPunchSkill extends Skill {
    private static final int DAMAGE = 20;

    public CatPunchSkill() {
        super("猫パンチ", 3);
    }

    @Override
    public void use(Player player, Enemy enemy) {
        
        enemy.setHp(enemy.getHp() - DAMAGE);
    }
}