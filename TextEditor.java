import java.awt.*;
import java.awt.event.*;

public class TextEditor extends Frame {
    TextField textField;
    Label outputLabel;
    Checkbox boldCheckbox, italicCheckbox;
    Choice fontSizeChoice, fontFamilyChoice;

    public TextEditor() {
        // Set up the Frame
        setTitle("Simple Text Editor");
        setSize(500, 250);
        setLayout(new FlowLayout());

        // Create TextField for the user to input text
        textField = new TextField(30);
        add(new Label("Enter Text:"));
        add(textField);

        // Create a Label to display the output text
        outputLabel = new Label("Output will appear here");
        outputLabel.setFont(new Font("Arial", Font.PLAIN, 14)); // Default font
        add(outputLabel);

        // Create a Choice (dropdown) for font family
        fontFamilyChoice = new Choice();
        fontFamilyChoice.add("Arial");
        fontFamilyChoice.add("Courier New");
        fontFamilyChoice.add("Times New Roman");
        fontFamilyChoice.add("Verdana");
        fontFamilyChoice.select("Arial"); // Default font
        add(new Label("Font Family:"));
        add(fontFamilyChoice);

        // Create a Choice (dropdown) for font size
        fontSizeChoice = new Choice();
        fontSizeChoice.add("12");
        fontSizeChoice.add("14");
        fontSizeChoice.add("16");
        fontSizeChoice.add("18");
        fontSizeChoice.add("20");
        fontSizeChoice.add("24");
        fontSizeChoice.add("28");
        fontSizeChoice.select("14");  // Default font size
        add(new Label("Font Size:"));
        add(fontSizeChoice);

        // Create checkboxes for bold and italic
        boldCheckbox = new Checkbox("Bold");
        italicCheckbox = new Checkbox("Italic");
        add(boldCheckbox);
        add(italicCheckbox);

        // Event listeners to apply changes
        textField.addTextListener(new TextListener() {
            public void textValueChanged(TextEvent e) {
                updateLabelText();
            }
        });

        fontSizeChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateLabelText();
            }
        });

        fontFamilyChoice.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateLabelText();
            }
        });

        boldCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateLabelText();
            }
        });

        italicCheckbox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                updateLabelText();
            }
        });

        // Window listener to handle closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    // Method to update the label text based on user selections
    private void updateLabelText() {
        String text = textField.getText();  // Get the text entered in the TextField

        // Get selected font size and font family
        String selectedFamily = fontFamilyChoice.getSelectedItem();
        int fontSize = Integer.parseInt(fontSizeChoice.getSelectedItem());

        // Determine the style based on the checkboxes
        int style = Font.PLAIN;
        if (boldCheckbox.getState()) {
            style = Font.BOLD;
        }
        if (italicCheckbox.getState()) {
            style |= Font.ITALIC;
        }

        // Set the font of the output label
        outputLabel.setFont(new Font(selectedFamily, style, fontSize));

        // Update the output label with the text entered in the TextField
        outputLabel.setText(text);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setVisible(true);
    }
}
