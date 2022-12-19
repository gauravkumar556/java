import java.awt.*;
class Webpage extends Frame { 
	Webpage()
	{
		Label l1=new Label("Name");
		Label l2=new Label("Email id ");
		Label l3=new Label("Phone number");
		Label l4=new Label("date of birth");
		Label l5=new Label("Gender");

		TextField t1=new TextField(50);
		TextField t2=new TextField(50);
		TextField t3=new TextField(50);
		TextField t4=new TextField(50);
		Button b1=new Button("Submit");

		l1.setBounds(10,100,100,100);
		t1.setBounds(100,100,20,100);
		l2.setBounds(10,90,100,100);
		t2.setBounds(100,90,100,100);
		l3.setBounds(10,80,100,100);
		t3.setBounds(100,80,100,100);
		l4.setBounds(10,70,100,100);
		t4.setBounds(100,70,100,100);
		l5.setBounds(10,60,100,100);
		b1.setBounds(700,10,50,100);


		add (l1);
		add (t1);
		add (l2);
		add (t2);
		add (l3);
		add (t3);
		add(l4);
		add(t4);
		add (l5);
		add(b1);

		
		setSize(1500,1500);
		setLayout(null);
 		setVisible(true);
	}
	public static void main(String args[])
	{
		new Webpage();
	}
}
	

		
