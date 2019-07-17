import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
String question1 = JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, "Hello " +question1);

}
}