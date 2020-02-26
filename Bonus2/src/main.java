
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vi frame = new Vi();
        frame.setDefaultCloseOperation(Vi.EXIT_ON_CLOSE);      
       
        frame.add(new CellPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

	}

}
