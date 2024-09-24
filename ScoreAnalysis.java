import java.awt.*;
import java.awt.event.*;
import java.net.URI;

public class ScoreAnalysis extends Frame {

    public ScoreAnalysis(int score) {
        setLayout(new GridLayout(0, 1)); // Use GridLayout for better arrangement

        // Setting colors for the frame
        setBackground(Color.LIGHT_GRAY); // Background color for the frame

        // Create a label to show the score
        Label resultLabel = new Label("You scored: " + score + " out of 20"); // Display score out of 20
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Set font for the label
        resultLabel.setForeground(Color.BLUE); // Text color for the score
        add(resultLabel);

        // Provide a link to a video for further learning
        Label videoLink = new Label("MAHARASHTRA GOVERNMENT AGRICULTURE SCHEMES");
        videoLink.setFont(new Font("Arial", Font.PLAIN, 14)); // Set font for the video link label
        videoLink.setForeground(Color.GREEN); // Text color for the link
        add(videoLink);
        
        // Create clickable links for the URLs
        addClickableLink("https://krishi.maharashtra.gov.in/");
        addClickableLink("https://www.myscheme.gov.in/schemes/chief-minister-sustainable-agriculture-irrigation-scheme");

        // Create a button to close the analysis frame
        Button closeButton = new Button("Close");
        closeButton.setBackground(Color.YELLOW); // Button background color
        closeButton.setForeground(Color.BLACK); // Button text color
        closeButton.addActionListener(e -> dispose()); // Close the frame when button is clicked
        add(closeButton);

        // Frame settings
        setSize(400, 200);
        setTitle("Score Analysis");
        setVisible(true);
        
        // Adding a window listener to handle close operation
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose(); // Close the frame when the window is closed
            }
        });
    }

    // Method to add a clickable link
    private void addClickableLink(String url) {
        Label urlLabel = new Label(url);
        urlLabel.setFont(new Font("Arial", Font.ITALIC, 12)); // Italic font for the URL
        urlLabel.setForeground(Color.RED); // Text color for the URL
        urlLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                openWebpage(url);
            }
        });
        add(urlLabel);
    }

    // Method to open the specified URL in the default browser
    private void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URI(urlString));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ScoreAnalysis(15); // Example score, you can change this as needed
    }
}
