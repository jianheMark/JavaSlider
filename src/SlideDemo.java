import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SlideDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;

    JLabel label = new JLabel(String.valueOf(JLabel.LEFT));
    JSlider slider;

    public SlideDemo() {
        frame = new JFrame("Slide Demo");
        panel = new JPanel();


        slider = new JSlider(0,100,50);
        panel.add(slider);
        panel.add(label);

        slider.setPreferredSize(new Dimension(400,400));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);

        slider.setFont(new Font("helvetica",Font.PLAIN,25));
        label.setFont(new Font("helvetica",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);


        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(10);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setVisible(true);

    }

    /**
     * Invoked when the target of the listener has changed its state.
     *
     * @param e a ChangeEvent object
     */
    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("C equals " + slider.getValue());


    }
}
