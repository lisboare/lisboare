import javax.swing.*;

public class MinecraftLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Minecraft Launcher");
            frame.setSize(800, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create a label to display a welcome message
            JLabel label = new JLabel("Welcome to Minecraft Launcher!");
            label.setHorizontalAlignment(SwingConstants.CENTER);
            frame.add(label);

            // Create a button to start the game
            JButton playButton = new JButton("Play");
            playButton.addActionListener(e -> {
    // Prompt the user to enter their Minecraft username
    String username = JOptionPane.showInputDialog(frame, "Enter your Minecraft username:");
    if (username != null && !username.isEmpty()) {
        playButton.setEnabled(false); // Disable the button to prevent multiple clicks
        label.setText("Loading Minecraft for " + username + "...");
        // Simulate the game launch process with a delay
        SwingUtilities.invokeLater(() -> {
            try {
                Thread.sleep(2000); // Simulate a 2-second delay
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            label.setText("Minecraft is running for " + username + "!");
            playButton.setEnabled(true); // Enable the button again
        });
    } else {
        JOptionPane.showMessageDialog(frame, "Please enter a valid username!");
    }
});
    playButton.setEnabled(false); // Disable the button to prevent multiple clicks
    label.setText("Loading Minecraft...");
    // Simulate the game launch process with a delay
    SwingUtilities.invokeLater(() -> {
    JFrame frame = new JFrame("Minecraft Launcher");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Create a label to display a welcome message
    JLabel label = new JLabel("Welcome to Scorpio Client!");
    label.setHorizontalAlignment(SwingConstants.CENTER);
    frame.add(label);

    // Create a drop-down list for version selection
    String[] versions = { "1.17.1", "1.16.5", "1.15.2", "1.14.4", "1.13.2" };
    JComboBox<String> versionComboBox = new JComboBox<>(versions);
    frame.add(versionComboBox);

    // Create a button to start the game
    JButton playButton = new JButton("Play");
    playButton.addActionListener(e -> {
        // Prompt the user to enter their Minecraft username
        String username = JOptionPane.showInputDialog(frame, "Enter your Minecraft username:");
        if (username != null && !username.isEmpty()) {
            // Get the selected version from the drop-down list
            String selectedVersion = (String) versionComboBox.getSelectedItem();
            
            playButton.setEnabled(false); // Disable the button to prevent multiple clicks
            label.setText("Loading Minecraft " + selectedVersion + " for " + username + "...");
            // Simulate the game launch process with a delay
            SwingUtilities.invokeLater(() -> {
                try {
                    Thread.sleep(2000); // Simulate a 2-second delay
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                label.setText("Minecraft " + selectedVersion + " is running for " + username + "!");
                playButton.setEnabled(true); // Enable the button again
            });
        } else {
            JOptionPane.showMessageDialog(frame, "Please enter a valid username!");
        }
    });

    frame.setLayout(new java.awt.FlowLayout());
    frame.setVisible(true);
});
    }
}
