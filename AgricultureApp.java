import java.awt.*;
import java.awt.event.*;

public class AgricultureApp extends Frame implements ActionListener {
    Choice cropChoice;
    Button learnButton, testButton;
    
    public AgricultureApp() {
        // Set the background color of the frame to a light green
        setBackground(new Color(204, 255, 204));  // Light green background
        setLayout(new FlowLayout());
        
        // Title and crop selection
        Label title = new Label("Agriculture Knowledge App");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        title.setForeground(new Color(34, 139, 34)); // Dark green title color
        add(title);
        
        Label selectCropLabel = new Label("Select Crop:");
        selectCropLabel.setForeground(new Color(34, 139, 34)); // Dark green label color
        add(selectCropLabel);

        // Dropdown for crop selection
        cropChoice = new Choice();
        cropChoice.add("Video Links");
       cropChoice.add("Wheat");
cropChoice.add("Rice");
cropChoice.add("Cotton");
cropChoice.add("Barley");
cropChoice.add("Sugarcane");
cropChoice.add("Maize (Corn)");
cropChoice.add("Soybean");
cropChoice.add("Potato");
cropChoice.add("Tomato");
cropChoice.add("Onion");
cropChoice.add("Carrot");
cropChoice.add("Garlic");
cropChoice.add("Cabbage");
cropChoice.add("Cauliflower");
cropChoice.add("Spinach");
cropChoice.add("Lettuce");
cropChoice.add("Peas");
cropChoice.add("Beans");
cropChoice.add("Chickpeas");
cropChoice.add("Lentils");
cropChoice.add("Millet");
cropChoice.add("Sorghum");
cropChoice.add("Oats");
cropChoice.add("Rye");
cropChoice.add("Quinoa");
cropChoice.add("Cassava");
cropChoice.add("Groundnut (Peanut)");
cropChoice.add("Sunflower");
cropChoice.add("Mustard");
cropChoice.add("Flaxseed");
cropChoice.add("Coconut");
cropChoice.add("Palm Oil");
cropChoice.add("Taro");
cropChoice.add("Sweet Potato");
cropChoice.add("Zucchini");
cropChoice.add("Pumpkin");
cropChoice.add("Bell Pepper");
cropChoice.add("Chili Pepper");
cropChoice.add("Eggplant (Brinjal)");
cropChoice.add("Okra");
cropChoice.add("Radish");
cropChoice.add("Beetroot");
cropChoice.add("Turnip");
cropChoice.add("Avocado");
cropChoice.add("Pineapple");
cropChoice.add("Mango");
cropChoice.add("Banana");
cropChoice.add("Grapes");
cropChoice.add("Papaya");

        add(cropChoice);

        // Learn button
        learnButton = new Button("Learn");
        learnButton.setBackground(new Color(50, 205, 50)); // Lime green button
        learnButton.setForeground(Color.WHITE); // White text
        learnButton.addActionListener(this);
        add(learnButton);

        // Test button
        testButton = new Button("Take Test");
        testButton.setBackground(new Color(50, 205, 50)); // Lime green button
        testButton.setForeground(Color.WHITE); // White text
        testButton.addActionListener(this);
        add(testButton);

        setSize(400, 300);
        setTitle("Agriculture Knowledge App");
        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        String selectedCrop = cropChoice.getSelectedItem();
        if (e.getSource() == learnButton) {
            new CropLearningModule(selectedCrop);  // Open learning module
        } else if (e.getSource() == testButton) {
            new CropTest(selectedCrop);  // Open test module
        }
    }

    public static void main(String[] args) {
        new AgricultureApp();
    }
}
