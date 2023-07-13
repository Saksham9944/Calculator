package calculatorapp;

import javax.crypto.spec.PSource;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{

    double num1=0,num2=0,result=0;
    int index=0;
    char sign;
    JFrame frame=new JFrame("CALCULATOR");
    JTextField textField=new JTextField();
    JLabel label=new JLabel();
    JRadioButton onbtn =new JRadioButton("ON");
    JRadioButton ofbtn =new JRadioButton("OFF");

//    these are 0 to 9 buttons
    JButton zerobtn=new JButton("0");
    JButton onebtn=new JButton("1");
    JButton twobtn=new JButton("2");
    JButton threebtn=new JButton("3");
    JButton fourbtn=new JButton("4");
    JButton fivebtn=new JButton("5");
    JButton sixbtn=new JButton("6");
    JButton sevenbtn=new JButton("7");
    JButton eightbtn=new JButton("8");
    JButton ninebtn=new JButton("9");


    //    other operational buttons
    JButton clrbtn=new JButton("AC");
    JButton deletebtn=new JButton("DEL");
    JButton addbtn=new JButton("+");
    JButton subbtn=new JButton("-");
    JButton multbtn=new JButton("x");
    JButton divbtn=new JButton("/");
    JButton equalbtn=new JButton("=");
    JButton pointbtn=new JButton(".");
    JButton squarebtn=new JButton("x\u00B2");
    JButton squarerootbtn=new JButton("\u221A");
    JButton reciprocalbtn=new JButton("1/x");

    public static void main(String[] args) {

        Calculator calc=new Calculator();

    }

    Calculator()
    {
        calc_basic_frame();
        components();
        actionevent();
    }
    public void components()
    {
//        label.setBounds(250,0,50,50);
//        label.setForeground(Color.WHITE);
//        frame.add(label);

        textField.setBounds(20,20,350,50);
        textField.setEditable(false);
        textField.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
//        it will set the text at any location
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        onbtn.setBounds(20,80,60,40);
        onbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        onbtn.setSelected(true);
        onbtn.setBackground(Color.black);
        onbtn.setForeground(Color.yellow);
        onbtn.setFocusable(false);
        frame.add(onbtn);

        ofbtn.setBounds(20,110,60,40);
        ofbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
        ofbtn.setSelected(false);
        ofbtn.setBackground(Color.black);
        ofbtn.setForeground(Color.yellow);
        ofbtn.setFocusable(false);
        frame.add(ofbtn);

        ButtonGroup buttonGroup=new ButtonGroup();
        buttonGroup.add(onbtn);
        buttonGroup.add(ofbtn);

        squarerootbtn.setBounds(40,160,60,50);
        squarerootbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        squarerootbtn.setForeground(Color.white);
        squarerootbtn.setBackground(Color.gray);
        squarerootbtn.setFocusable(false);
        frame.add(squarerootbtn);

        squarebtn.setBounds(120,160,60,50);
        squarebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        squarebtn.setForeground(Color.white);
        squarebtn.setBackground(Color.gray);
        squarebtn.setFocusable(false);
        frame.add(squarebtn);

        reciprocalbtn.setBounds(200,160,60,50);
        reciprocalbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        reciprocalbtn.setForeground(Color.white);
        reciprocalbtn.setBackground(Color.gray);
        reciprocalbtn.setFocusable(false);
        frame.add(reciprocalbtn);

        onebtn.setBounds(40,230,60,50);
        onebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        onebtn.setForeground(Color.white);
        onebtn.setBackground(Color.gray);
        onebtn.setFocusable(false);
        frame.add(onebtn);

        twobtn.setBounds(120,230,60,50);
        twobtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        twobtn.setForeground(Color.white);
        twobtn.setBackground(Color.gray);
        twobtn.setFocusable(false);
        frame.add(twobtn);

        threebtn.setBounds(200,230,60,50);
        threebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
       threebtn.setForeground(Color.white);
        threebtn.setBackground(Color.gray);
        threebtn.setFocusable(false);
        frame.add(threebtn);

       fourbtn.setBounds(40,300,60,50);
       fourbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        fourbtn.setForeground(Color.white);
        fourbtn.setBackground(Color.gray);
        fourbtn.setFocusable(false);
        frame.add(fourbtn);

        fivebtn.setBounds(120,300,60,50);
        fivebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        fivebtn.setForeground(Color.white);
        fivebtn.setBackground(Color.gray);
        fivebtn.setFocusable(false);
        frame.add(fivebtn);

        sixbtn.setBounds(200,300,60,50);
        sixbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        sixbtn.setForeground(Color.white);
        sixbtn.setBackground(Color.gray);
        sixbtn.setFocusable(false);
        frame.add(sixbtn);

        sevenbtn.setBounds(40,370,60,50);
        sevenbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
       sevenbtn.setForeground(Color.white);
       sevenbtn.setBackground(Color.gray);
        sevenbtn.setFocusable(false);
        frame.add(sevenbtn);

        eightbtn.setBounds(120,370,60,50);
        eightbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        frame.add(eightbtn);
        eightbtn.setForeground(Color.white);
        eightbtn.setBackground(Color.gray);
        eightbtn.setFocusable(false);

        ninebtn.setBounds(200,370,60,50);
        ninebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        ninebtn.setForeground(Color.white);
        ninebtn.setBackground(Color.gray);
        ninebtn.setFocusable(false);
        frame.add(ninebtn);

        zerobtn.setBounds(40,440,140,50);
        zerobtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        zerobtn.setForeground(Color.white);
        zerobtn.setBackground(Color.gray);
        zerobtn.setFocusable(false);
        frame.add(zerobtn);

        pointbtn.setBounds(200,440,60,50);
        pointbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        pointbtn.setForeground(Color.white);
        pointbtn.setBackground(Color.gray);
        pointbtn.setFocusable(false);
        frame.add(pointbtn);

        equalbtn.setBounds(280,370,70,120);
        equalbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        equalbtn.setBackground(Color.gray);
        equalbtn.setForeground(Color.white);
        equalbtn.setFocusable(false);
        frame.add(equalbtn);

        divbtn.setBounds(280,300,70,50);
        divbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        divbtn.setForeground(Color.white);
        divbtn.setBackground(Color.gray);
        divbtn.setFocusable(false);
        frame.add(divbtn);

        multbtn.setBounds(280,230,70,50);
        multbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,25));
        multbtn.setForeground(Color.white);
        multbtn.setBackground(Color.gray);
        multbtn.setFocusable(false);
        frame.add(multbtn);

        subbtn.setBounds(280,160,70,50);
        subbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        subbtn.setForeground(Color.white);
        subbtn.setBackground(Color.gray);
        subbtn.setFocusable(false);
        frame.add(subbtn);

        addbtn.setBounds(280,95,70,50);
        addbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,30));
        addbtn.setForeground(Color.white);
        addbtn.setBackground(Color.gray);
        addbtn.setFocusable(false);
        frame.add(addbtn);

        clrbtn.setBounds(90,95,80,50);
        clrbtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        clrbtn.setForeground(Color.white);
        clrbtn.setBackground(Color.RED);
        clrbtn.setFocusable(false);
        frame.add(clrbtn);

        deletebtn.setBounds(180,95,80,50);
        deletebtn.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        deletebtn.setForeground(Color.white);
        deletebtn.setBackground(Color.RED);
        deletebtn.setFocusable(false);
        frame.add(deletebtn);
    }
    public void calc_basic_frame()
    {
        frame.setSize(400,570);
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
//        this will set the location of the frame in the center of the screen
        frame.setLocationRelativeTo(null);
//        this will close the frame from the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionevent()
    {
        onbtn.addActionListener(this);
        ofbtn.addActionListener(this);
        onebtn.addActionListener(this);
        twobtn.addActionListener(this);
        threebtn.addActionListener(this);
        fourbtn.addActionListener(this);
        fivebtn.addActionListener(this);
        sixbtn.addActionListener(this);
        sevenbtn.addActionListener(this);
        eightbtn.addActionListener(this);
        ninebtn.addActionListener(this);
        zerobtn.addActionListener(this);
        clrbtn.addActionListener(this);
        deletebtn.addActionListener(this);
        addbtn.addActionListener(this);
        subbtn.addActionListener(this);
        multbtn.addActionListener(this);
        divbtn.addActionListener(this);
        squarebtn.addActionListener(this);
        squarerootbtn.addActionListener(this);
        equalbtn.addActionListener(this);
        pointbtn.addActionListener(this);
        reciprocalbtn.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
Object btn= e.getSource();
if (btn==onbtn)
{
    enablecalc();

} else if (btn==ofbtn) {
    disablecalc();
    textField.setText("");
}
else if (btn==clrbtn) {
    textField.setText("");
}
else if (btn==deletebtn) {
    int lengthofnum=textField.getText().length();
    if (lengthofnum>0)
    {
        StringBuilder delete=new StringBuilder(textField.getText());
        delete.deleteCharAt(lengthofnum-1);
        textField.setText(delete.toString());
    }
    if (textField.getText().endsWith(""));
}
else if (btn==zerobtn) {
    if (textField.getText().equals("0"))
        return;
    else
        textField.setText(textField.getText()+"0");
} else if (btn==onebtn) {
    textField.setText(textField.getText()+"1");
}
else if (btn==twobtn) {
    textField.setText(textField.getText()+"2");
}
else if (btn==threebtn) {
    textField.setText(textField.getText()+"3");
}
else if (btn==fourbtn) {
    textField.setText(textField.getText()+"4");
}else if (btn==fivebtn) {
    textField.setText(textField.getText()+"5");
}else if (btn==sixbtn) {
    textField.setText(textField.getText()+"6");
}else if (btn==sevenbtn) {
    textField.setText(textField.getText()+"7");
}else if (btn==eightbtn) {
    textField.setText(textField.getText()+"8");
}else if (btn==ninebtn) {
    textField.setText(textField.getText()+"9");
}
else if (btn==pointbtn) {
    if(textField.getText().contains("."))
    {
        return;
    }
    textField.setText(textField.getText()+".");
} else if (btn==addbtn) {
    String str=textField.getText();
    index=str.length();
  num1=Double.parseDouble(textField.getText());
  sign='+';
    textField.setText(textField.getText()+"+");
}
else if (btn==subbtn) {
    String str=textField.getText();
    index=str.length();
    num1=Double.parseDouble(textField.getText());
    sign='-';
    textField.setText(textField.getText()+"-");
}
else if (btn==multbtn) {
    String str=textField.getText();
    index=str.length();
    num1=Double.parseDouble(textField.getText());
    sign='*';
    textField.setText(textField.getText()+"x");
}
else if (btn==divbtn) {
    String str=textField.getText();
    index=str.length();
    num1=Double.parseDouble(textField.getText());
    sign='/';
    textField.setText(textField.getText()+"/");
} else if (btn==squarebtn) {
    num1=Double.parseDouble(textField.getText());
    double sq=Math.pow(num1,2);
    String square=Double.toString(sq);
    if (square.endsWith(".0"))
    {
        textField.setText(square.replace(".0",""));
    }
    else
        textField.setText(square);
}
else if (btn==squarerootbtn) {
    num1=Double.parseDouble(textField.getText());
    double sq=Math.sqrt(num1);
    String squareroot=Double.toString(sq);
    textField.setText(squareroot);
}
else if (btn==reciprocalbtn) {
    num1=Double.parseDouble(textField.getText());
    double reci=1/num1;
    String reciprocal=Double.toString(reci);
    if (reciprocal.endsWith(".0"))
    {
        textField.setText(reciprocal.replace(".0",""));
    }
    else
        textField.setText(reciprocal);
}
//Main claculation button
else if (btn==equalbtn) {
    String str=textField.getText();
    str=str.substring(index+1);
    num2=Double.parseDouble(str);
  switch (sign)
  {
      case '+':
          result=num1+num2;
          break;
      case '-':
          result=num1-num2;
          break;
      case '*':
          result=num1*num2;
          break;
      case '/':
          result=num1/num2;
          break;
  }
  if (Double.toString(result).endsWith(".0"))
  {
      textField.setText(Double.toString(result).replace(".0",""));
  }
  else
  {
      textField.setText(Double.toString(result));
  }
  num1=result;
}

//  actionevent() function end;
}

    public void enablecalc()
    {
        onbtn.setEnabled(true);
        ofbtn.setEnabled(true);
        clrbtn.setEnabled(true);
        deletebtn.setEnabled(true);
        addbtn.setEnabled(true);
        subbtn.setEnabled(true);
        multbtn.setEnabled(true);
        divbtn.setEnabled(true);
       equalbtn.setEnabled(true);
        pointbtn.setEnabled(true);
        squarerootbtn.setEnabled(true);
        squarebtn.setEnabled(true);
        reciprocalbtn.setEnabled(true);
        zerobtn.setEnabled(true);
        onebtn.setEnabled(true);
        twobtn.setEnabled(true);
        threebtn.setEnabled(true);
        fourbtn.setEnabled(true);
        fivebtn.setEnabled(true);
        sixbtn.setEnabled(true);
        sevenbtn.setEnabled(true);
        eightbtn.setEnabled(true);
        ninebtn.setEnabled(true);
    }

    public void disablecalc()
    {

        ofbtn.setEnabled(false);
        clrbtn.setEnabled(false);
        deletebtn.setEnabled(false);
        addbtn.setEnabled(false);
        subbtn.setEnabled(false);
        multbtn.setEnabled(false);
        divbtn.setEnabled(false);
        equalbtn.setEnabled(false);
        pointbtn.setEnabled(false);
        squarerootbtn.setEnabled(false);
        squarebtn.setEnabled(false);
        reciprocalbtn.setEnabled(false);
        zerobtn.setEnabled(false);
        onebtn.setEnabled(false);
        twobtn.setEnabled(false);
        threebtn.setEnabled(false);
        fourbtn.setEnabled(false);
        fivebtn.setEnabled(false);
        sixbtn.setEnabled(false);
        sevenbtn.setEnabled(false);
        eightbtn.setEnabled(false);
        ninebtn.setEnabled(false);

    }
}
