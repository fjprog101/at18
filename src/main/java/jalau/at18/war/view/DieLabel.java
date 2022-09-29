package jalau.at18.war.view;

import javax.swing.JLabel;

import jalau.at18.war.model.Die;
import jalau.at18.war.observer.Observer;
import jalau.at18.war.observer.Subject;

public class DieLabel extends JLabel implements Observer {

    public DieLabel() {
        super("0");
    }

    public void update(Subject subject) {
        Die source = (Die) subject;
        setText(source.getFace().getSymbol());
    }
}
