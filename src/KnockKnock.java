import javax.swing.JOptionPane;

public class KnockKnock {
	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Here is my knock knock joke...");
String question1 = JOptionPane.showInputDialog(null, "Knock knock?");
String question2 = JOptionPane.showInputDialog("Cow says.");
JOptionPane.showMessageDialog(null, "No, a cow says moooooo!");
}
}