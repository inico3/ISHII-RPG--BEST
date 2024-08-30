import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // プレイヤーと敵のスキルを作成
                Skill attackSkill1 = new AttackSkill("猫パンチ", 3, 20);
                Skill healingSkill = new HealingSkill("けつたたき", 2, 15);

                Skill attackSkill2 = new AttackSkill("面", 2, 50);
                Skill attackSkill3 = new AttackSkill("レスバ", 1, 30);

                Skill enemySkill1 = new AttackSkill("トークルーム作成", 5, 20);
                Skill enemySkill2 = new AttackSkill("余計な一言", 1, 0);

                // プレイヤーと敵を作成
                Player player1 = new Player("ネコ", 100, 15, attackSkill1, healingSkill);
                Player player2 = new Player("木戸亮輔", 100, 15, attackSkill2, attackSkill3);

                Enemy enemy = new Enemy("おおがしゅういちろう", 150, 10, enemySkill1, enemySkill2);

                // バトルウィンドウを表示
                new BattleWindow(player1, player2, enemy);
            }
        });
    }
}