public class FaceSkill extends Skill {
    private static final int DAMAGE = 50;

    public FaceSkill() {
        super("面", 1);
    }

    @Override
    public void use(Player player, Enemy enemy) {
        enemy.setHp(enemy.getHp() - DAMAGE);
    }
}