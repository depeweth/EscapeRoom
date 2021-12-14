import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscapeRoom {
    /*
    come up with idea that involves a pineapple
    LOOK BACK THROUGH OLD CODE TO SEE WHAT I NEED
    set up GUI
    get buttons
    find some kind of ending
     */

    static JLabel story;
    static JLabel story2;

    public static void main(String[] args) {
        JFrame window = new JFrame("Escape room!");
        JPanel panel = new JPanel();
        JButton button = new JButton("Smash the pineapple that is sitting one the table on the ground");
        JButton button2 = new JButton("Start eating the walls (Yummy)");
        JButton button3 = new JButton("Just wait to see what happens");
        JButton button4 = new JButton("Unplug the cord going from one side of the strawberry to the other");

        story = new JLabel("You are stuck in a strawberry universe and you need to get");
        story2 = new JLabel(" back to your pineapple universe what do you do?");


        window.setSize(600, 400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(story);
        panel.add(story2);
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        button.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener2());
        button3.addActionListener(new ButtonListener3());
        button4.addActionListener(new ButtonListener4());


            if (button.isSelected()) {
                panel.remove(button);

                panel.updateUI();
            }


        window.add(panel);

        window.setVisible(true);

    }

    private static class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("Pineapple");
            story.setText("As you smash the pineapple the room changes into a pineapple");
            story2.setText(" ");

        }
    }

    private static class ButtonListener2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("Strawberry");
            story.setText("The strawberry was poisons and now you are dead");
            story2.setText(" ");
        }
    }

    private static class ButtonListener3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("Noise");
            story.setText("You hear a odd noise coming from the outside of the strawberry");
            story2.setText(" ");
        }
    }

    private static class ButtonListener4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            System.out.println("Die");
            story.setText("You unplug your heart and you have a stroke");
            story2.setText(" ");
        }
    }
}
