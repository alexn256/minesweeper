package project.view;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

public class GameOverFrame extends JDialog {

    private JLabel time;
    private JLabel bestTime;
    private JLabel totalGames;
    private JLabel wins;
    private JLabel bestDate;
    private JLabel winStatistic;

    public GameOverFrame() {
        super();
        GridLayout gridLayout = new GridLayout(1, 3);
        gridLayout.setHgap(10);

        JPanel rootPanel = new JPanel(new BorderLayout());
        JPanel buttonPanel = new JPanel(gridLayout);
        GridLayout statLayout = new GridLayout(2, 3);
        JPanel statPanel = new JPanel(statLayout);
        statPanel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        JButton exit = new JButton("Выйти");
        JButton restart = new JButton("Переиграть");
        JButton newGame = new JButton("Новая Игра");
        exit.setFocusPainted(false);
        restart.setFocusPainted(false);
        newGame.setFocusPainted(false);

        buttonPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        rootPanel.add(buttonPanel, "South");
        rootPanel.add(statPanel, "Center");
        rootPanel.add(new JPanel(), "West");
        rootPanel.add(new JPanel(), "East");

        JLabel times = new JLabel("Время:");
        JPanel timePanel = new JPanel();
        timePanel.add(times);
        timePanel.add(new JLabel("1 сек."));
        statPanel.add(timePanel);

        JPanel dates = new JPanel();
        JLabel dateLabel = new JLabel("Дата:");
        dates.add(dateLabel);
        dates.add(new JLabel(" 15.11.2017"));
        statPanel.add(dates);

        JPanel win = new JPanel();
        JLabel winLabel = new JLabel("Выиграно:");
        win.add(winLabel);
        win.add(new JLabel(" 10"));
        statPanel.add(win);

        JPanel best = new JPanel();
        JLabel bestLabel = new JLabel("Лучшее время:");
        best.add(bestLabel);
        best.add(new JLabel(" 61 сек."));
        statPanel.add(best);

        JPanel total = new JPanel();
        JLabel totalLabel = new JLabel("Проведено игр:");
        total.add(totalLabel);
        total.add(new JLabel(" 2"));
        statPanel.add(total);

        JPanel persent = new JPanel();
        JLabel persentLabel = new JLabel("Процент:");
        persent.add(persentLabel);
        persent.add(new JLabel(" 20%"));
        statPanel.add(persent);

        buttonPanel.add(exit);
        buttonPanel.add(restart);
        buttonPanel.add(newGame);

        JPanel titleLabel = new JPanel(new GridLayout(2,1));
        JLabel title1 = new JLabel("К сожалению Вы проиграли. В следующий раз вам повезет", SwingConstants.CENTER);
        JLabel title2 = new JLabel("больше!", SwingConstants.CENTER);
        titleLabel.setBorder(new EmptyBorder(15, 10, 10, 10));
        titleLabel.add(title1);
        titleLabel.add(title2);
        rootPanel.add(titleLabel, BorderLayout.NORTH);

        add(rootPanel);
        setResizable(false);
        setSize(420, 180);
        setTitle("Игра окончена");
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void visobleControll(){
        if (isVisible()){
            setVisible(false);
        }
        else{
            setVisible(true);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        new GameOverFrame();
    }
}