public class DebateSkill extends Skill {
    private static final int DAMAGE = 30;

    public DebateSkill() {
        super("レスバ", 1);
    }

    @Override
    public void use(Player player, Enemy enemy) {
        enemy.setHp(enemy.getHp() - DAMAGE);
    }
}