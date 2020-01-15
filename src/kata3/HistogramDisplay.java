package kata3;

import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }

    private JPanel createPanel() {
        ChartPanel chartPanel = new ChartPane(createChart(createDataset()));
    }
    
    public void execute(){
        setVisible(true);
    }
    
}
