import java.awt.*;
import java.awt.event.*;

public class CropLearningModule extends Frame {
    
    public CropLearningModule(String crop) {
        setLayout(new FlowLayout());

        // Get crop information from CropInfo class
        String cropInfo = CropInfo.getInfo(crop);
        TextArea infoArea = new TextArea(cropInfo, 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);
        add(infoArea);

        // Back button
        Button backButton = new Button("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close this frame
            }
        });
        add(backButton);

        setSize(600, 400);
        setTitle(crop + " Information");
        setVisible(true);
    }
}
