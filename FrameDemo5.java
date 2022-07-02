import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class MarvellousFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj;
    public TextField tobj;


    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        bobj = new Button("Marvellous");
        tobj = new TextField();
        //               x      y      width    height 
        tobj.setBounds(60, 60, 170, 20);
        bobj.setBounds(110, 120, 90, 20);
        fobj.setSize(600, 600);

        fobj.add(bobj);  //tatat watii
        fobj.add(tobj);  //tatat chamcha

        fobj.setSize(600, 600);
        fobj.setVisible(true);
        fobj.setLayout(null);


        bobj.addActionListener(this);
        fobj.addWindowListener(this);
    }

        public void windowClosing(WindowEvent obj)
        {
            System.exit(0);
        }

        public void actionPerformed(ActionEvent obj)
        {
            tobj.setText("Jay Ganesh...");

        }
    }



class FrameDemo5
{

    public static void main(String arg[])
    {
        MarvellousFrame mobj = new MarvellousFrame("PPA");

    }
}
