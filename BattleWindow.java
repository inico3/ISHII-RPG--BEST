import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BattleWindow {
    private JFrame frame;
    private JTextArea logArea;
    private Player player1;
    private Player player2;
    private Enemy enemy;

    public BattleWindow(Player player1, Player player2, Enemy enemy) {
        this.player1 = player1;
        this.player2 = player2;
        this.enemy = enemy;

        frame = new JFrame("バトルウィンドウ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);

        // ログエリア
        logArea = new JTextArea();
        logArea.setBounds(10, 10, 460, 200);
        logArea.setEditable(false);
        frame.add(logArea);

        // プレイヤー1のスキルボタン
        JButton skill1Button = new JButton("猫パンチ");
        skill1Button.setBounds(10, 220, 150, 30);
        skill1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1.useSkill(player1.getSkill1(), enemy);
                skillLog("猫パンチ");
                
            }
        });
        frame.add(skill1Button);

        JButton skill2Button = new JButton("けつたたき");
        skill2Button.setBounds(10, 260, 150, 30);
        skill2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player1.useSkill(player1.getSkill2(), enemy);
                skillLog("けつたたき");
            }
        });
        frame.add(skill2Button);

        // プレイヤー2のスキルボタン
        JButton skill3Button = new JButton("面");
        skill3Button.setBounds(170, 220, 150, 30);
        skill3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2.useSkill(player2.getSkill1(), enemy);
                skillLog("面");
            }
        });
        frame.add(skill3Button);

        JButton skill4Button = new JButton("レスバ");
        skill4Button.setBounds(170, 260, 150, 30);
        skill4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                player2.useSkill(player2.getSkill2(), enemy);
                skillLog("レスバ");
            }
        });
        frame.add(skill4Button);

        frame.setVisible(true);
    }

    private void updateLog() {
        logArea.setText("プレイヤー1: " + player1.getName() + " HP: " + player1.getHp() + "\n"
                + "プレイヤー2: " + player2.getName() + " HP: " + player2.getHp() + "\n"
                + "敵: " + enemy.getName() + " HP: " + enemy.getHp() + "\n");
    }
    public void skillLog(String skillname) {
        logArea.setText(skillname + "が使用されました！\n残りのHPは" + enemy.getHp() +"です\n" +"プレイヤー1: " + player1.getName() + " HP: " + player1.getHp() + "\n"
        + "プレイヤー2: " + player2.getName() + " HP: " + player2.getHp() + "\n"
        + "敵: " + enemy.getName() + " HP: " + enemy.getHp() + "\n");
    }
}