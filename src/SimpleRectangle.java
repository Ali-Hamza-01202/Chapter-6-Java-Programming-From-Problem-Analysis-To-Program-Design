import javax.swing.JOptionPane;
public class SimpleRectangle {

	public static void main(String[] args) 
	
	{

		// to provide length
		String SLength = JOptionPane.showInputDialog("Enter the length of rectangle : ");
		double length = Double.parseDouble(SLength);
		// to provide width
		String SWidth = JOptionPane.showInputDialog("Enter the width of rectangle : ");
		double width = Double.parseDouble(SWidth);
		double area = length * width;
		double perimeter = 2 *(length+width);
		// to display result
		JOptionPane.showMessageDialog(null, "Area is : "+area+"\nPerimeter is : "+perimeter,"Rectangle",JOptionPane.INFORMATION_MESSAGE);
	}

}
