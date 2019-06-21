import java.awt.*; 
import java.awt.event.*;
import java.applet.*; 
import javax.swing.*;

class CurrencyConverter extends Frame implements ItemListener, ActionListener
{ 
    //initialized all the GUI components
    JComboBox convertFrom, convertTo;
    JTextField txtFrom, txtTo;
    JButton compute, exit;
    JLabel from, to;
    JLabel lblFrom, lblTo;
    JPanel mainPanel = new JPanel();

    double input = 0;
    double result = 0;

    public CurrencyConverter() { 
        //add all the GUI components
        super("Money Currency Converter v.1.0"); 
        setSize(420,300);
        setLayout(null);
        setBackground(Color.lightGray);

        lblFrom = new JLabel("From:");
        lblFrom.setBounds(30,45,250,30);
        lblFrom.setForeground(Color.RED);
        add(lblFrom);

        convertFrom = new JComboBox();
        convertFrom.setBounds(30,70,150,30);
        convertFrom.addItem("Indian Rupee");
        convertFrom.addItem("US Dollar");
        convertFrom.addItem("Japan Yen");
        convertFrom.addItem("German Euro");
        convertFrom.addItem("Taiwan Dollar");
        add(convertFrom);

        lblTo = new JLabel("To:");
        lblTo.setBounds(230,45,250,30);
        lblTo.setForeground(Color.RED);
        add(lblTo);

        convertTo = new JComboBox();
        convertTo.setBounds(230,70,150,30);
        convertTo.addItem("Indian Rupee");
        convertTo.addItem("US Dollar");
        convertTo.addItem("Japan Yen");
        convertTo.addItem("German Euro");
        convertTo.addItem("Taiwan Dollar");
        add(convertTo);

        from = new JLabel("Enter Amount to Convert:");
        from.setBounds(50,110,300,30);
        add(from);

        txtFrom = new JTextField(15);
        txtFrom.setBounds(50,140,300,30);
        add(txtFrom);

        compute = new JButton("Compute");
        compute.setBounds(100,250,100,30);
        add(compute);

        to = new JLabel("Total Amount Converted:");
        to.setBounds(50,170,300,30);
        add(to);   

        txtTo = new JTextField(15);
        txtTo.setBounds(50,200,300,30);
        txtTo.setEditable(false);
        txtTo.setForeground(Color.RED);
        add(txtTo);

        exit = new JButton("Exit");
        exit.setBounds(210,250,100,30);
        add(exit);
        
        //register all the GUI components who will listen or invoke the methods
        convertFrom.addItemListener(this);
        convertTo.addItemListener(this);
        compute.addActionListener(this);
        txtFrom.addActionListener(this);
        exit.addActionListener(this);
        
        //this will close the applet window if the user clicked the close or exit button
        addWindowListener(new WindowAdapter() { 
                public void windowClosing(WindowEvent e) { 
                    System.exit(0); 
                } 
            });
    }
    //the exit method
    public void exit(){ 
        setVisible(false); 
        dispose(); 
        System.exit(0); 
    } 
    //show or make the applet window frame visible 
    public static void main(String args[]) { 
        CurrencyConverter w = new CurrencyConverter(); 
        w.setVisible(true); 
    } 

    public void ConvertINR() {
        if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.014);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 1.56);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="German Euro")
        {
            result = (input * 0.011918951);
            txtTo.setText(""+result);
        }
        else 
        {
            result = (input * 0.43);
            txtTo.setText(""+result);
        }
    }

    public void ConvertUSDollar() {
        if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 72.11);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 112.06);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="German Euro")
        {
            result = (input * 30.77);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.681);
            txtTo.setText(""+result);
        }
    }

    public void ConvertYen() {
        if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 0.64);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.0089);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="German Euro")
        {
            result = (input * 0.01);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 0.27);
            txtTo.setText(""+result);
        }
    }

    public void ConvertGermanEuro() {
        if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 83.59);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 1.1632);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 130.33);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="German Euro")
        {
            result = (input);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input * 35.762);
            txtTo.setText(""+result);
        }
    }

    public void ConvertTaiDollar() {
        if(convertTo.getSelectedItem()=="Indian Rupee")
        {
            result = (input * 2.3375);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="US Dollar")
        {
            result = (input * 0.03253);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="Japan Yen")
        {
            result = (input * 3.6444);
            txtTo.setText(""+result);
        }
        else if(convertTo.getSelectedItem()=="German Euro")
        {
            result = (input * 0.02796);
            txtTo.setText(""+result);
        }
        else
        {
            result = (input);
            txtTo.setText(""+result);
        }
    }

    public void actionPerformed(ActionEvent e) {

        input = Double.parseDouble(txtFrom.getText());
        String msg = txtFrom.getText();

        if(e.getSource()==compute)
        {
            if(convertFrom.getSelectedItem()=="Indian Rupee")
            {
                ConvertINR();                 
            }
            else if(convertFrom.getSelectedItem()=="US Dollar")
            {
                ConvertUSDollar();
            }
            else if(convertFrom.getSelectedItem()=="Japan Yen")
            {
                ConvertYen();
            }
            else if(convertFrom.getSelectedItem()=="German Euro")
            {
                ConvertGermanEuro();
            }
            else
            {
                ConvertTaiDollar();
            }

        }
        //this will asked the user to exit or not
        else
        {
            //this will display a confirm dialog box
            int choice = JOptionPane.showConfirmDialog(null,"Do you really want to quit?","Exit",JOptionPane.YES_NO_OPTION);
            if(choice==0) {
                dispose();
                System.exit(0);
            }
        }
    }

    public void itemStateChanged(ItemEvent e)
    {

    }
} 