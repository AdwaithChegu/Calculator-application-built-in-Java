
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener {
    JFrame jf;
    JButton seven,eight,nine,one,two,three,four,five,six,zero,delete,decimal,addition,equal,minus,division,multiplication,squareroot;
    JButton log,sine,cose,tanx,lnx,cubeofx;
    JLabel s;
    boolean isoperatorclicked=false;
    String oldvalue;
    char operator;
  
    
    Calculator(){
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(480, 560);
        jf.setLocation(300, 150);
        jf.getContentPane().setBackground(Color.BLACK);


        s=new JLabel();
        
        s.setBounds(30, 50, 410, 40);
        s.setBackground(Color.white);
        s.setOpaque(true);
        s.setHorizontalAlignment(SwingConstants.RIGHT);
        s.setForeground(Color.BLACK);
        jf.add(s);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        seven=new JButton("7");
        seven.setBounds(30, 130, 60, 60); 
        seven.setFont(new Font("bold", 30, 20));
        seven.addActionListener(this);      
        jf.add(seven);

        eight=new JButton("8");
        eight.setBounds(120, 130, 60, 60);
        eight.setFont(new Font("bold", 30, 20)); 
        eight.addActionListener(this);
        jf.add(eight);

        nine=new JButton("9");
        nine.setBounds(200, 130, 60, 60);
        nine.setFont(new Font("bold", 30, 20));
        nine.addActionListener(this);
        jf.add(nine);


        division=new JButton("÷");
        division.setBounds(280, 130, 60, 60);
        division.setFont(new Font("bold", 30, 20)); 
        division.addActionListener(this);
        jf.add(division);

        sine=new JButton("sin");
        sine.setBounds(360, 130, 80, 60);
        sine.setFont(new Font("bold", 30, 20)); 
        sine.addActionListener(this);
        jf.add(sine);

        four=new JButton("4");
        four.setBounds(30, 210, 60, 60);
        four.setFont(new Font("bold", 30, 20)); 
        four.addActionListener(this);
        jf.add(four);

        five=new JButton("5");
        five.setBounds(120, 210, 60, 60);
        five.setFont(new Font("bold", 30, 20));
        five.addActionListener(this); 
        jf.add(five);

        six=new JButton("6");
        six.setBounds(200, 210, 60, 60);
        six.setFont(new Font("bold", 30, 20));
        six.addActionListener(this); 
        jf.add(six);

        multiplication=new JButton("×");
        multiplication.setBounds(280, 210, 60, 60);
        multiplication.setFont(new Font("bold", 30, 20));
        multiplication.addActionListener(this); 
        jf.add(multiplication);

        cose=new JButton("cos");
        cose.setBounds(360, 210, 80, 60);
        cose.setFont(new Font("bold", 30, 20)); 
        cose.addActionListener(this);
        jf.add(cose);

        
        one=new JButton("1");
        one.setBounds(30, 290, 60, 60);
        one.setFont(new Font("bold", 30, 20));
        one.addActionListener(this); 
        jf.add(one);

        two=new JButton("2");
        two.setBounds(120, 290, 60, 60);
        two.setFont(new Font("bold", 30, 20));
        two.addActionListener(this); 
        jf.add(two);

        three=new JButton("3");
        three.setBounds(200, 290, 60, 60);
        three.setFont(new Font("bold", 30, 20));
        three.addActionListener(this); 
        jf.add(three);

        minus=new JButton("−");
        minus.setBounds(280, 290, 60, 60);
        minus.setFont(new Font("bold", 30, 20)); 
        minus.addActionListener(this);
        jf.add(minus);

        tanx=new JButton("tan");
        tanx.setBounds(360, 290, 80, 60);
        tanx.setFont(new Font("bold", 30, 20)); 
        tanx.addActionListener(this);
        jf.add(tanx);

        zero=new JButton("0");
        zero.setBounds(30, 370, 60, 60);
        zero.setFont(new Font("bold", 30, 20)); 
        zero.addActionListener(this);
        jf.add(zero);

        decimal=new JButton(".");
        decimal.setBounds(120, 370, 60, 60);
        decimal.setFont(new Font("bold", 40, 50));
        decimal.addActionListener(this); 
        jf.add(decimal);

        equal=new JButton("=");
        equal.setBounds(200, 370, 60, 60);
        equal.setFont(new Font("bold", 30, 20)); 
        equal.addActionListener(this); 
        jf.add(equal);


        addition=new JButton("+");
        addition.setBounds(280, 370, 60, 60);
        addition.setFont(new Font("bold", 30, 20));
        addition.addActionListener(this); 
        jf.add(addition);

        lnx=new JButton("ln");
        lnx.setBounds(360, 370, 80, 60);
        lnx.setFont(new Font("bold", 30, 20)); 
        lnx.addActionListener(this);
        jf.add(lnx);

        squareroot=new JButton("√");
        squareroot.setBounds(260, 450, 80, 60);
        squareroot.setFont(new Font("bold", 30, 20));
        squareroot.addActionListener(this); 
        jf.add(squareroot);


        delete=new JButton("delete");
        delete.setBounds(30, 450, 110, 60);
        delete.setFont(new Font("bold", 30, 20)); 
        delete.addActionListener(this);
        jf.add(delete);

        log=new JButton("log");
        log.setBounds(160, 450, 80, 60);
        log.setFont(new Font("bold", 30, 20)); 
        log.addActionListener(this); 
        jf.add(log);
        
        cubeofx=new JButton("x³");
        cubeofx.setBounds(360, 450, 80, 60);
        cubeofx.setFont(new Font("bold", 30, 20));
        cubeofx.addActionListener(this); 
        jf.add(cubeofx);


    }


    public static void main(String[] args) {
        
        new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==seven){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("7");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"7");

            }
           
            
        }else if(e.getSource()==eight){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("8");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"8");

            }
           
           
        }else if(e.getSource()==nine){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("9");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"9");

            }
           
           
        }else if(e.getSource()==one){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("1");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"1");

            }
           
            
        }else if(e.getSource()==two){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("2");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"2");

            }
            
        }else if(e.getSource()==three){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("3");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"3");

            }
           
        }else if(e.getSource()==four){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("4");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"4");

            }
        }else if(e.getSource()==five){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("5");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"5");

            }
        }else if(e.getSource()==six){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("6");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"6");

            };
        }else if(e.getSource()==zero){
            s.setFont(new Font("bold", 30, 20));
            if(isoperatorclicked){
                s.setText("0");
                isoperatorclicked=false;

            }else { 
                s.setText(s.getText()+"0");

            }
        }else if(e.getSource()==delete){
            s.setFont(new Font("bold", 30, 20));
            s.setText("");


        }else if(e.getSource()==decimal){
            s.setFont(new Font("bold", 40, 30));
            s.setText(s.getText()+"."); 
            
            
        }else if(e.getSource()==addition){
            operator='+';
            oldvalue=s.getText();
            isoperatorclicked=true;
            
           
        }else if(e.getSource()==division){
            operator='/';
            oldvalue=s.getText();
            isoperatorclicked=true;
            
        }else if(e.getSource()==minus){
            operator='-';
            oldvalue=s.getText();
            isoperatorclicked=true;
            
            
        }else if(e.getSource()==multiplication){
            operator='*';
            oldvalue=s.getText();
            isoperatorclicked=true;

        }else if(e.getSource()==squareroot){
                operator='1';
                oldvalue=s.getText();
                isoperatorclicked=true;    

        }else if(e.getSource()==log){
                operator='2';
                oldvalue=s.getText();
                isoperatorclicked=true; 
        
        }else if(e.getSource()==sine){
                    operator='3';
                    oldvalue=s.getText();
                    isoperatorclicked=true; 

        }else if(e.getSource()==cose){
                    operator='4';
                    oldvalue=s.getText();
                    isoperatorclicked=true;

        }else if(e.getSource()==tanx){
                    operator='5';
                    oldvalue=s.getText();
                    isoperatorclicked=true; 

        }else if(e.getSource()==cubeofx){
                    operator='6';
                    oldvalue=s.getText();
                    isoperatorclicked=true; 
    
        }else if(e.getSource()==equal){
            String newvalue=s.getText();
            float oldvaluef=Float.parseFloat(oldvalue);
            float newvaluef=Float.parseFloat(newvalue);
            switch(operator){

                case '+':
        
                float result=oldvaluef+newvaluef;
                s.setText(result+"");
                oldvalue=s.getText();
                break;

                case '*':
        
                float result1=oldvaluef*newvaluef;
                s.setText(result1+"");
                oldvalue=s.getText();
                break;

                case '/':
        
                float result2=oldvaluef/newvaluef;
                s.setText(result2+"");
                oldvalue=s.getText();
                break;

                case '-':
        
                float result3=oldvaluef-newvaluef;
                s.setText(result3+"");
                oldvalue=s.getText();
                break;

                case '1':
        
                Double result4=Math.sqrt(oldvaluef);
                s.setText(result4+"");
                oldvalue=s.getText();
                break;

                case '2':
        
                Double result5=Math.log10(oldvaluef);
                s.setText(result5+"");
                oldvalue=s.getText();
                break;

                case '3':
                Double oldvaluea=Math.toRadians(oldvaluef);
                Double result6=Math.sin(oldvaluea);
                s.setText(result6+"");
                oldvalue=s.getText();
                break;

                case '4':
                Double oldvalueb=Math.toRadians(oldvaluef);
                Double result7=Math.cos(oldvalueb);
                s.setText(result7+"");
                oldvalue=s.getText();
                break;

                case '5':
                Double oldvaluec=Math.toRadians(oldvaluef);
                Double result8=Math.tan(oldvaluec);
                s.setText(result8+"");
                oldvalue=s.getText();
                break;

                case '6':
        
                Double result9=Math.pow(oldvaluef,3);
                s.setText(result9+"");
                oldvalue=s.getText();
                break;




            }
            
           
        }        

      
        

  
    }
}

     

