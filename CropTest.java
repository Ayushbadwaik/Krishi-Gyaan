import java.awt.*;
import java.awt.event.*;

 class CropTest extends Frame implements ActionListener {
    Label questionLabel;
    Button nextButton, prevButton; // Added Previous button
    CheckboxGroup optionsGroup;
    Checkbox option1, option2, option3, option4;
    int score = 0;
    int currentQuestion = 0;

    // Sample questions and options (you can expand this to fit your crop-related content)
    String[] questions = {
        "What is the best season to plant wheat?",
        "How much water does rice need?",
        "What is the ideal pH level for growing potatoes?",
        "Which nutrient is essential for healthy tomato plants?",
        "How often should sugarcane be irrigated during the growing season?",
        "What is the average yield of cotton per hectare?",
        "What is the primary pest affecting soybean crops?",
        "How long does it take for maize to mature?",
        "What are the common diseases in mango orchards?",
        "Which method is best for controlling weeds in vegetable gardens?",
        "What temperature range is optimal for growing strawberries?",
        "What are the signs of nitrogen deficiency in plants?",
        "How should pulses be rotated in crop cycles?",
        "What is the recommended spacing for planting brinjal (eggplant)?",
        "What are the benefits of crop rotation?",
        "How can farmers prevent soil erosion?",
        "What is the purpose of green manure in farming?",
        "How does climate affect the yield of kharif crops?",
        "What are the advantages of organic farming?",
        "How can farmers improve soil fertility sustainably?"
    };

    String[][] options = {
        {"Winter", "Summer", "Monsoon", "Spring"},
        {"High", "Low", "Moderate", "None"},
        {"5.5 - 6.5", "6.0 - 7.0", "7.0 - 8.0", "8.0 - 9.0"},
        {"Potassium", "Phosphorus", "Nitrogen", "Calcium"},
        {"Once a week", "Twice a week", "Every 10 days", "Daily"},
        {"500 kg", "1500 kg", "3500 kg", "2000 kg"},
        {"Aphids", "Whiteflies", "Locusts", "Caterpillars"},
        {"60 days", "90 days", "120 days", "150 days"},
        {"Powdery mildew", "Blight", "Rust", "Fruit fly"},
        {"Mulching", "Hand weeding", "Flame weeding", "All of the above"},
        {"15 - 20°C", "20 - 25°C", "25 - 30°C", "30 - 35°C"},
        {"Yellowing leaves", "Stunted growth", "Dark green leaves", "Leaf drop"},
        {"After 2 years", "Every year", "After 5 years", "Never"},
        {"30 cm", "45 cm", "60 cm", "75 cm"},
        {"Improved yield", "Better soil health", "Pest resistance", "All of the above"},
        {"Planting cover crops", "Contouring", "Terracing", "All of the above"},
        {"To add nutrients", "To suppress weeds", "To improve soil structure", "All of the above"},
        {"During the monsoon", "In winter", "In summer", "All year round"},
        {"Reduced pesticide use", "Increased yield", "Higher soil acidity", "Lower soil erosion"},
        {"Picking time", "Harvesting equipment", "Soil type", "Weather conditions"}
    };

    // Array of correct answer indices for each question
    int[] correctAnswers = {
       1,  
    2,  
    0, 
    2,  
    1,  
    1,  
    0,  
    1,  
    0,  
    3,  
    1,  
    0,  
    0,  
    1,  
    3,  
    3,  
    3,  
    1,  
    0,  
    3,  
    };

    public CropTest(String crop) {
        setLayout(new GridLayout(6, 1)); // Use GridLayout for better arrangement
        setBackground(new Color(220, 255, 220)); // Light green background

        // Initialize the question label and radio buttons
        questionLabel = new Label(questions[currentQuestion]);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel);

        // Create a panel for the options and set a GridLayout
        Panel optionsPanel = new Panel();
        optionsPanel.setLayout(new GridLayout(4, 1)); // 4 rows, 1 column
        optionsPanel.setBackground(new Color(200, 255, 200)); // Slightly different green

        // Initialize options (radio buttons) and add to the panel
        optionsGroup = new CheckboxGroup();
        option1 = new Checkbox(options[currentQuestion][0], optionsGroup, false);
        option2 = new Checkbox(options[currentQuestion][1], optionsGroup, false);
        option3 = new Checkbox(options[currentQuestion][2], optionsGroup, false);
        option4 = new Checkbox(options[currentQuestion][3], optionsGroup, false);

        // Set option colors
        option1.setForeground(new Color(0, 0, 128)); // Dark blue
        option2.setForeground(new Color(0, 128, 0)); // Dark green
        option3.setForeground(new Color(255, 140, 0)); // Orange
        option4.setForeground(new Color(128, 0, 128)); // Purple

        // Add the options to the options panel
        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        // Add the options panel to the main frame
        add(optionsPanel);

        // Next button to proceed to the next question
        nextButton = new Button("Next");
        nextButton.setBackground(new Color(0, 191, 255)); // Deep sky blue
        nextButton.setForeground(Color.WHITE);
        nextButton.addActionListener(this);
        add(nextButton);

        // Previous button to go back to the last question
        prevButton = new Button("Previous");
        prevButton.setBackground(new Color(255, 99, 71)); // Tomato red
        prevButton.setForeground(Color.WHITE);
        prevButton.addActionListener(this);
        add(prevButton);

        // Setting the window properties
        setSize(400, 400);
        setTitle(crop + " - Knowledge Test");
        setVisible(true);
    }

    // Action handling for the Next and Previous buttons
    public void actionPerformed(ActionEvent e) {
        // Check the selected answer
        Checkbox selectedOption = optionsGroup.getSelectedCheckbox();
        if (selectedOption != null) {
            int selectedIndex = getSelectedOptionIndex();
            if (selectedIndex == correctAnswers[currentQuestion]) {
                score++;  // Increment score for correct answer
            }
        }

        if (e.getSource() == nextButton) {
            currentQuestion++;
            // If more questions remain, update the UI to the next question
            if (currentQuestion < questions.length) {
                updateQuestion();
            } else {
                // If all questions are done, show the final score
                dispose();  // Close the test window
                new ScoreAnalysis(score);  // Display the score
            }
        } else if (e.getSource() == prevButton) {
            // Go back to the last question
            if (currentQuestion > 0) {
                currentQuestion--;
                updateQuestion();
            }
        }
    }

    // Helper method to determine which radio button is selected
    private int getSelectedOptionIndex() {
        if (option1.getState()) return 0;
        if (option2.getState()) return 1;
        if (option3.getState()) return 2;
        if (option4.getState()) return 3;
        return -1;  // If none selected
    }

    // Update the question and options for the current question
    private void updateQuestion() {
        questionLabel.setText(questions[currentQuestion]);
        option1.setLabel(options[currentQuestion][0]);
        option2.setLabel(options[currentQuestion][1]);
        option3.setLabel(options[currentQuestion][2]);
        option4.setLabel(options[currentQuestion][3]);
        optionsGroup.setSelectedCheckbox(null);  // Deselect any previous selection
    }

    public static void main(String[] args) {
        new CropTest("Crop Knowledge");
    }
}