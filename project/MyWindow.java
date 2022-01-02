package com.Mohit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame
{
    private JLabel heading;

    private JLabel clockLabel;

    private Font font = new Font("",Font.BOLD,35);

    MyWindow()
    {
        super.setTitle("My Clock");
        super.setSize(400,400);
        super.setLocation(300,50);
          this.createGUI();
          this.startClock();
        super.setVisible(true);


    }
  // make method
    // to use gridLayout we set container int row and col

    public void createGUI()
    {
 // GUI
         heading = new JLabel("My Clock");
         clockLabel = new JLabel("clock");

         heading.setFont(font);
         clockLabel.setFont(font);


         this.setLayout(new GridLayout(2,1));

         this.add(heading);

         this.add(clockLabel);

    }

    public void startClock()
    {
     Timer timer= new Timer(1000, new ActionListener()
     {
         @Override
         public void actionPerformed(ActionEvent e) {
             // best way get date time by using to.string
        //    String  dateTime = new Date().toString();
//    to find formated date
       //      String  dateTime=new Date().toLocaleString(); // it give local formate date or time  according india..
             Date d = new Date();

             SimpleDateFormat sfd = new SimpleDateFormat("hh : mm: ss a");

             String dateTime= sfd.format(d);

           clockLabel.setText(dateTime);
         }
     });

     timer.start();

    }


}
