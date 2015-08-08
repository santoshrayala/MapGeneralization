package cup;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

class Draw extends JPanel {

    private final ArrayList<Map> lines = new ArrayList<>();
    
    

    public void addLine(int x1, int y1, int x2, int y2) {
        this.lines.add(new Map(x1, y1, x2, y2));
    }

    @Override
    public void paintComponent(Graphics g) {
        for(final Map r : lines) {
            r.paint(g);
        }
    }
}
public class Map {
    public final int x1;
    public final int x2;
    public final int y1;
    public final int y2;
    public Map(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public static void readPoints(ArrayList al)
    {
        al.stream().forEach((a1) -> {
            System.out.println("Coordinates : " + a1);});
    }
    public void paint(Graphics g) {
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }
}

    
    