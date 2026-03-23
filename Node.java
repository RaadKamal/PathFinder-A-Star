import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class Node extends JButton implements ActionListener {

    Node parent;
    int row;
    int col;
    int gCost;
    int hCost; 
    int fCost;
    boolean start;
    boolean goal;
    boolean open;
    boolean checked;
    boolean solid;

    public Node(int row, int col) {
        this.row = row;
        this.col = col;
        // Keep the empty nodes clean white
        setBackground(Color.white);
        setForeground(Color.black);
        addActionListener(this);
    }

    public void setAsStart() {
        start = true;
        // Darker Ruby Red
        setBackground(new Color(150, 0, 0));
        setForeground(Color.white);
        setText("Start");
    }

    public void setAsGoal() {
        goal = true;
        // Deep Navy Blue
        setBackground(new Color(0, 0, 102));
        setForeground(Color.white);
        setText("Goal");
    }

    public void setAsSolid() {
        // Dark Slate Gray/Charcoal
        setBackground(new Color(45, 45, 45));
        setForeground(Color.white);
        setText("Solid");
        solid = true; 
    }

    public void setAsOpen() {
        open = true;
        // leaving this invisible
    }
    
    public void setAsChecked() {
        if(start == false && goal == false) {
            // Burnt Orange / Darker Amber
            setBackground(new Color(204, 102, 0));
            setForeground(Color.white);
            setText("Checked");
        }
        checked = true;
    }

    public void setAsPath() {
        // Deep Forest Green
        setBackground(new Color(0, 102, 0));
        setForeground(Color.white);
        setText("PATH");
    }

    public void actionPerformed(ActionEvent e) {
        if(start == false && goal == false && solid == false) {
            // Darker Orange when clicked manually
            setBackground(new Color(204, 102, 0));
            setForeground(Color.white);
        }
    }
}
