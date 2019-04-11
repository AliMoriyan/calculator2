/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator2;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author ali moriyan
 */

public class FXMLDocumentController implements Initializable {
    
    int kii = 0;
    @FXML
    private Label label;
    @FXML
    private TextArea entryID;
    @FXML
    private Button sqrtID;
    @FXML
    private Label resultID;
    @FXML
    private TextArea showID;
    @FXML
    private Button pow2ID;
    @FXML
    private Button sinID;
    @FXML
    private Button pow3ID;
    @FXML
    private Button cosID;
    @FXML
    private Button tanID;
    @FXML
    private Button cleanID;
    @FXML
    private Button sevenID;
    @FXML
    private Button nineID;
    @FXML
    private Button fourID;
    @FXML
    private Button eightID;
    @FXML
    private Button threeID;
    @FXML
    private Button twoID;
    @FXML
    private Button oneID;
    @FXML
    private Button sixID;
    @FXML
    private Button fiveID;
    @FXML
    private Button dotID;
    @FXML
    private Button zeroID;
    @FXML
    private Button posNegID;
    @FXML
    private Button posetiveID;
    @FXML
    private Button negativeID;
    @FXML
    private Button equalID;
    @FXML
    private Button darSadID;
    @FXML
    private Button taghsimID;
    @FXML
    private Button multipiteID;
    @FXML
    private Button randID;
    @FXML
    private Button backID;
    @FXML
    private Button base8ID;
    @FXML
    private Button bace2ID;
    
    String all = "";
    @FXML
    private AnchorPane allID;
    @FXML
    private Button standardID;
    @FXML
    private Button scientificID;
    @FXML
    private Button programmerID;
    @FXML
    private Button offID;
    @FXML
    private Separator line2;
    @FXML
    private Separator line1;
    @FXML
    private Label scieLabale;
    @FXML
    private Label stanLable;
    @FXML
    private Label posOrNegLabel;
    @FXML
    private Label dutLabel1;
    @FXML
    private Label stanLabel11;
    @FXML
    private Label randLabel;
    @FXML
    private Label proLabel;
    @FXML
    private Label change;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        allID.setMaxSize(320, 491.0);
        offID.setText("on");
        entryID.setVisible(false);
        sqrtID.setVisible(false);
        pow2ID.setVisible(false);
        pow3ID.setVisible(false);
        resultID.setVisible(false);
        showID.setVisible(false);
        sinID.setVisible(false);
        cosID.setVisible(false);
        tanID.setVisible(false);
        randID.setVisible(false);
        base8ID.setVisible(false);
        bace2ID.setVisible(false);
        oneID.setVisible(false);
        twoID.setVisible(false);
        threeID.setVisible(false);
        fourID.setVisible(false);
        fiveID.setVisible(false);
        sixID.setVisible(false);
        sevenID.setVisible(false);
        eightID.setVisible(false);
        nineID.setVisible(false);
        dotID.setVisible(false);
        posNegID.setVisible(false);
        zeroID.setVisible(false);
        standardID.setVisible(false);
        scientificID.setVisible(false);
        programmerID.setVisible(false);
        posetiveID.setVisible(false);
        negativeID.setVisible(false);
        multipiteID.setVisible(false);
        taghsimID.setVisible(false);
        darSadID.setVisible(false);
        equalID.setVisible(false);
        cleanID.setVisible(false);
        backID.setVisible(false);
        line1.setVisible(false);
        line2.setVisible(false);
        
    }    

    
    @FXML
    private void sqrt(ActionEvent event) {
        String s1 = entryID.getText();
        String s = number(s1);
        if (s.equals("")) {
            showID.setText("error");
        }else {
            if (checkNumber(s)) {
                if (Integer.parseInt(s) < 0) {
                    showID.setText("ERROR");
                }else {
                    int a = Integer.parseInt(s);
                    entryID.setText(newString(s) +  Math.round(Math.sqrt(a))+"");
                    showID.setText("sqrt (" + s + ") = " + Math.sqrt(a));
                }
            }else {
                double b = Double.parseDouble(s);
                entryID.setText(newString(s) +  Math.round(Math.sqrt(b))+"");
                showID.setText("sqrt (" + s + ") = " + Math.sqrt(b));
            }
        }
    }

    
    @FXML
    private void result(MouseEvent event) {
    }

    @FXML
    private void pow2(ActionEvent event) {
        String s = entryID.getText();
        
        if (s.equals("")) {
            showID.setText("error");
        }else {
            if (checkNumber(s)) {
                int num = Integer.parseInt(number(s));
                entryID.setText(newString(s)+Math.round(Math.pow(num, 2)));
                showID.setText(num + "^" + "2 = " + Math.round(Math.pow(num, 2)));
            }else {
                double num1 = Double.parseDouble(number(s));
                entryID.setText(newString(s)+nextdut(Math.pow(num1, 2)));
                showID.setText(num1 + "^" + "2 = " + Math.pow(num1, 2));
            }
        }
    }

    @FXML
    private void sin(ActionEvent event) {
        String s = entryID.getText();
        String num = number(s);
        double num2;
        
        if (s.equals("")) {
            showID.setText("error");
        }else {
            num2 = Math.sin(Float.parseFloat(num));
            entryID.setText(newString(s)+""+nextdut(num2));
            showID.setText("sin(" + num + ") = " +num2);
        }
    }

    @FXML
    private void pow3(ActionEvent event) {
        String s = entryID.getText();
        
        if (s.equals("")) {
            showID.setText("error");
        }else {
            if (checkNumber(s)) {
                int num = Integer.parseInt(number(s));
                entryID.setText(newString(s)+Math.round(Math.pow(num, 3)));
                showID.setText(num + "^" + "3 = " + Math.round(Math.pow(num, 3)));
            }else {
                double num1 = Double.parseDouble(number(s));
                entryID.setText(newString(s)+nextdut(Math.pow(num1, 3)));
                showID.setText(num1 + "^" + "3 = " + Math.pow(num1, 3));
            }
        }
    }

    @FXML
    private void cos(ActionEvent event) {
        String s = entryID.getText();
        String num = number(s);
        double num2;
        
        if (s.equals("")) {
            showID.setText("error");
        }else {
            num2 = Math.cos(Float.parseFloat(num));
            entryID.setText(newString(s)+""+nextdut(num2));
            showID.setText("cos(" + num + ") = " +num2);
        }
    }

    @FXML
    private void tan(ActionEvent event) {
        String s = entryID.getText();
        String num = number(s);
        double num2;
        
        if (s.equals("")) {
            showID.setText("error");
        }else {
            num2 = Math.tan(Float.parseFloat(num));
            entryID.setText(newString(s)+""+nextdut(num2));
            showID.setText("tan(" + num + ") = " +num2);
        }
    }

    @FXML
    private void clean(ActionEvent event) {
        entryID.setText("");
        showID.setText("");
    }

    @FXML
    private void seven(ActionEvent event) {
        String num;
        
        num = entryID.getText();
        entryID.setText(num+"7");
    }

    @FXML
    private void nine(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"9");
    }

    @FXML
    private void four(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"4");
    }

    @FXML
    private void eight(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"8");
    }

    @FXML
    private void three(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"3");
    }

    @FXML
    private void two(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"2");
    }

    @FXML
    private void one(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"1");
    }

    @FXML
    private void six(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"6");
    }

    @FXML
    private void five(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"5");
    }

    @FXML
    private void dot(ActionEvent event) {
         String num;
        if (entryID.getText().indexOf('.') == -1) {
            num = entryID.getText();
            entryID.setText(num+".");
        }
    }

    @FXML
    private void zero(ActionEvent event) {
         String num;
        
        num = entryID.getText();
        entryID.setText(num+"0");
    }

    

    @FXML
    private void posetive(ActionEvent event) {
         String num;
        if (checkForNumber(entryID.getText())) {
            num = entryID.getText();
            entryID.setText(num+"+");
        }
    }

    private void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void negative(ActionEvent event) {
         String num;
         
        if (checkForNumber(entryID.getText())) {
            num = entryID.getText();
            entryID.setText(num+"-");
        }
    }

    @FXML
    private void equal(ActionEvent event) {
        String s = entryID.getText();
        showID.setText(s);
        String number = "";
        int fromIndex = 0;
        while (s.indexOf("%",fromIndex) != -1) {                    
            int loc = s.indexOf("%",fromIndex);
            System.out.println("index : " + s.indexOf("%"));
            int next = 0, back = 0;
            double next1 = 0, back1 = 0;
            boolean n = false, n1 = false, b = false, b1 = false;
            System.out.println(nextNumber(s, loc));
            if (checkNumber(nextNumber(s, loc))) {
                next = Integer.parseInt(nextNumber(s, loc));
                n = true;
            }else {
                next1 = nextdut(Double.parseDouble(nextNumber(s, loc)));
                n1 = true;
            }
            System.out.println("0n : " + n + "\nn1 : " + n1 + "\nb : " + b + "\nb1 : " + b1);

            if (checkNumber(backNumber(s, loc))) {
                back = Integer.parseInt(backNumber(s, loc));
                b = true;   
            }else {
                back1 = nextdut(Double.parseDouble(backNumber(s, loc)));
                b1 = true;
            }
            System.out.println("1n : " + n + "\nn1 : " + n1 + "\nb : " + b + "\nb1 : " + b1);

            System.out.println("2n : " + next + "\nn1 : " + next1 + "\nb : " + back + "\nb1 : " + back1);
            System.out.println("back : " + backNumber(s, loc) + " next : " + nextNumber(s, loc));
            int locNext, locBack;

            locNext = locCharNext(s, loc);
            locBack = locCharBack(s, loc);
            System.out.println("loc next : " + locNext);
            System.out.println("loc back : " + locBack);
            double ansFloat = -1;
            
            if (n & b) {
                ansFloat = back % next;
            }else if (n & b1) {
                ansFloat = back1 % next;
            }else if (n1 & b) {
                ansFloat = next1 % back;
            }else if (n1 & b1) {
                ansFloat = next1 % back1;
            }
            ansFloat = nextdut(ansFloat);
            System.out.println(ansFloat);
            
            for (int i = 0; i <= locBack; i++) {
                number = number + s.charAt(i);
            }
            System.out.println("num1 :" + number);
            number = number + doubleToString(ansFloat);
                        System.out.println("num1 :" + number);

            for (int i = locNext; i < s.length(); i++) {
                number = number + s.charAt(i);
            }
                        System.out.println("num1 :" + number);

            fromIndex = loc+1;
        }
        
        entryID.setText(number);
    }

    public static String doubleToString(double a) {
        return a + "";
    }
    
    public static int locCharNext(String s, int loc) {
        int i = loc + 1;
        System.out.println("i : " + i);
        for ( ; i < s.length(); i++) {
            if (s.charAt(i) == '-' || (s.charAt(i) == '+' || s.charAt(i) == '*') || (s.charAt(i) == '/' || s.charAt(i) == '%')) {
                return i;
            }
        }
        return s.length() - 1;
    }
    
    public static int locCharBack(String s, int loc) {
        int i = loc - 1;
        for ( ; i >= 0; i--) {
            if (s.charAt(i) == '-' || (s.charAt(i) == '+' || s.charAt(i) == '*') || (s.charAt(i) == '/' || s.charAt(i) == '%')) {
                return i;
            }
        }
        return 0;
    }
    
    public static String nextNumber(String s, int loc) {
        String num = "";
        for (int i = loc + 1; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '.') {
                num = num + s.charAt(i);
            }else
                break;
        }
        return num;
    }
    
    public static String backNumber(String s, int loc) {
        String num = "";
        for (int i = loc - 1; i >= 0; i--) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '.') {
                num = s.charAt(i) + num;
            }else
                break;
        }
        return num;
    }
    
    /*public static int locEndNum (String s, int loc) {
        for (int i = loc; i < s.length(); i++) {
            if (s.charAt(i) < '0' && s.charAt(i) > '9') {
                return i;
            }
        }
    }*/
    
    
   /* public static String endProccess(String s) {
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {            
            
        }
        if ((s.indexOf("+") == -1 && s.indexOf("-") == -1) && (s.indexOf("*") == -1 && s.indexOf("/") == -1)) {
            
        }
    }*/
    
    @FXML
    private void darSAD(ActionEvent event) {
         String num;
        if (checkForNumber(entryID.getText())) {
            num = entryID.getText();
            entryID.setText(num+"%");
        }
    }


    @FXML
    private void taghsim(ActionEvent event) {
         String num;
        if (checkForNumber(entryID.getText())) {
            num = entryID.getText();
            entryID.setText(num+"/");
        }
    }

    @FXML
    private void multipite(ActionEvent event) {
         String num;
        if (checkForNumber(entryID.getText())) {
            num = entryID.getText();
            entryID.setText(num+"*");
        }
    }

    @FXML
    private void rand(ActionEvent event) {
        entryID.setText("");
        showID.setText(Math.random()+"");
    }

    @FXML
    private void back(ActionEvent event) {
        char[] ar = entryID.getText().toCharArray();
        String s = "";
        
        for (int i = 0; i < ar.length-1; i++) {
            s = s + ar[i];
        }
        entryID.setText(s);
    }

    @FXML
    private void base8(ActionEvent event) {
        String s = entryID.getText();
        String s1 = number(s);
        if (s.indexOf('+') == -1 && s.indexOf('-') == -1 && s.indexOf('*') == -1 && s.indexOf('/') == -1) {
            if (checkNumber(s1)) {
                int num = Integer.parseInt(s1);
                showID.setText(s1 + " to base 8 : " + baseRecursiveConvertor(num, 8, ""));
            }else {
                showID.setText("ERROR");
            }
        }else
            showID.setText("ERROR\nInvalid Input");
    }

    @FXML
    private void base2(ActionEvent event) {
        String s = entryID.getText();
        String s1 = number(s);
        if (s.indexOf('+') == -1 && s.indexOf('-') == -1 && s.indexOf('*') == -1 && s.indexOf('/') == -1) {
            if (checkNumber(s1)) {
                int num = Integer.parseInt(s1);
                showID.setText(s1 + " to base 2 : " + baseRecursiveConvertor(num, 2, ""));
            }else {
                showID.setText("ERROR");
            }
        }else
            showID.setText("ERROR\nInvalid Input");
    }
    
    @FXML
    private void posNeg(ActionEvent event) {
        String s = posOrNeg(entryID.getText());
        char[] ar = s.toCharArray();
        String s1 = "";
        if (ar[0] == '-') {
            for (int i = 1; i < s.length(); i++) {
                s1 = ar[i] + s1;
            }
            entryID.setText(newString(s) + "-" + s1);
        }else
            System.out.println("1");
    }
    
    public static String posOrNeg(String s) {
        char[] ar = s.toCharArray();
        String num = "";
        int ci = 0;
        if (s.equals("")) {
            return "-";
        }else {
            for (int i = s.length()-1; i >= 0; i--) {
                if ((ar[i] >= '0' && ar[i] <= '9') || ar[i] == '.') {
                    num = ar[i] + num;
                }else {
                    ci = i;
                    break;
                }
            }
        }
        return ar[ci] + num;
    }
    
    public static boolean checkForNumber(String s) {
        char[] s1 = s.toCharArray();
        if (s1[s.length()-1] >= '0' && s1[s.length()-1] <= '9')
            return true;
        return false;
    }
    
    public static String SeparationOfNumbersForBase2 (String s) {
        String s1 = "", s2 = "";
        
        for (int i = 0; i < s.indexOf('.'); i++) {
            s1 = s1 + s.charAt(i);
        }
        for (int i = s.length()-1; i > s.lastIndexOf('.'); i--) {
            s2 = s2 + s.charAt(i);
        }
        s2 = "0." + s2;
        int cs1 = Integer.parseInt(s1);
        double cs2 = Double.parseDouble(s2);
        
        String baseS1 = baseRecursiveConvertor(cs1, 2, "");
        String baseS2 = changeBaseBackDut(cs2, 2, 0, "");
        
        return baseS1 + '.' + cs2;
     }
    
    public static String baseRecursiveConvertor (int number, int base, String res) {
        if (number ==0)
            return res;
        return baseRecursiveConvertor(number / base, base,(number % base) + res);
    }
    
    public static String changeBaseBackDut (double number, int base, int counter, String res) {
       /* int number1 = Integer.parseInt(number + ""), number2;
        number = number - number1;
        for (int i = 0; i < 6; i++) {
            number = number * base;
            number2 = 
        }*/
       String s = "";
        int number1 = Integer.parseInt(number + ""), number2;
        number = number - number1;
        for (int i = 0; i < 6; i++) {
            number = number * base;
            number2 = Integer.parseInt(number + "");
            number = number - number2;
            s = s + number2;
            
        }
        return s;
    }
    
    
    public static String number(String s) {
        String num = "";
        char[] ar = s.toCharArray();
        for (int i = ar.length-1; i >= 0; i--) {
            if ((ar[i] == '+' || ar[i] == '-') || (ar[i] == '/' || ar[i] == '*')) {
                break;
            }else {
                num = ar[i]+num;
            }
        }
        return num;
    }
    
    public static boolean checkNumber(String s) {
        if (s.indexOf('.') == -1) {
            return true;
        }else
            return false;
    }
    
    public static String newString(String s) {
        String temp = "";
        int max = 0;
        if (s.lastIndexOf('+') != -1) {
            max = s.lastIndexOf('+');
        }else if (s.lastIndexOf('-') != -1) {
            max = s.lastIndexOf('-');
        }else if (s.lastIndexOf('*') != -1) {
            max = s.lastIndexOf('*');
        }else if (s.lastIndexOf('/') != -1) {
            max = s.lastIndexOf('/');
        }
        
        
        if (s.lastIndexOf('*') != -1 && s.lastIndexOf('*') >= max) {
            for (int i = 0; i < s.lastIndexOf('*'); i++) {
                    temp = temp + s.charAt(i);
                }
                return temp + '*';
        }else if (s.lastIndexOf('/') != -1 && s.lastIndexOf('/') >= max) {
            for (int i = 0; i < s.lastIndexOf('/'); i++) {
                    temp = temp + s.charAt(i);
                }
                return temp + '/';
        }else if (s.lastIndexOf('+') != -1 && s.lastIndexOf('+') >= max) {
            for (int i = 0; i < s.lastIndexOf('+'); i++) {
                    temp = temp + s.charAt(i);
                }
                return temp + '+';
        }else if (s.lastIndexOf('-') != -1 && s.lastIndexOf('-') >= max) {
            for (int i = 0; i < s.lastIndexOf('-'); i++) {
                    temp = temp + s.charAt(i);
                }
                return temp + '-';
        }
        
        return "";
        
       /* if (s.lastIndexOf('+') == -1) {
            if (s.lastIndexOf('-') == -1) {
                if (s.lastIndexOf('*') == -1) {
                    if (s.lastIndexOf('/') == -1) {
                        return "";
                    }
                    for (int i = 0; i < s.lastIndexOf('+'); i++) {
                        temp = temp + s.charAt(i);
                    }
                    return temp + '/';
                }
                for (int i = 0; i < s.lastIndexOf('*'); i++) {
                    temp = temp + s.charAt(i);
                }
                return temp + '*';
            }
            for (int i = 0; i < s.lastIndexOf('-'); i++) {
                temp = temp + s.charAt(i);
            }
            return temp + '-';
        }
        for (int i = 0; i < s.lastIndexOf('+'); i++) {
            temp = temp + s.charAt(i);
        }
        return temp + '+';*/
    }
    
    public static double nextdut(double a) {
        a *= 100;
        a = Math.round(a);
        a /= 100;
        return a;
    }
    
    
    
    public static boolean backNumber(String s) {
        char[] ar = s.toCharArray();
        if (ar[s.length()-1] >= '0' && ar[s.length()-1] <= '9') {
            return true;
        }else if (s == "") {
            return false;
        }else
            return false;
    }
    
    

    @FXML
    private void standard(ActionEvent event) {
        change.setText("      Standard ");
        entryID.setVisible(true);
        sqrtID.setVisible(true);
        pow2ID.setVisible(true);
        pow3ID.setVisible(true);
        resultID.setVisible(true);
        showID.setVisible(true);
        sinID.setVisible(true);
        cosID.setVisible(true);
        tanID.setVisible(true);
        randID.setVisible(true);
        base8ID.setVisible(true);
        bace2ID.setVisible(true);
        oneID.setVisible(true);
        twoID.setVisible(true);
        threeID.setVisible(true);
        fourID.setVisible(true);
        fiveID.setVisible(true);
        sixID.setVisible(true);
        sevenID.setVisible(true);
        eightID.setVisible(true);
        nineID.setVisible(true);
        dotID.setVisible(true);
        posNegID.setVisible(true);
        zeroID.setVisible(true);
        posetiveID.setVisible(true);
        negativeID.setVisible(true);
        multipiteID.setVisible(true);
        taghsimID.setVisible(true);
        darSadID.setVisible(true);
        equalID.setVisible(true);
        cleanID.setVisible(true);
        backID.setVisible(true);
        line1.setVisible(true);
        line2.setVisible(true);
        dutLabel1.setVisible(false);
        posOrNegLabel.setVisible(false);
        stanLable.setVisible(false);
        stanLabel11.setVisible(false);
        randLabel.setVisible(true);
        proLabel.setVisible(true);
        scieLabale.setVisible(true);
    }

    @FXML
    private void scientific(ActionEvent event) {
        change.setText("      Scientific ");
        entryID.setVisible(true);
        sqrtID.setVisible(true);
        pow2ID.setVisible(true);
        pow3ID.setVisible(true);
        resultID.setVisible(true);
        showID.setVisible(true);
        sinID.setVisible(true);
        cosID.setVisible(true);
        tanID.setVisible(true);
        randID.setVisible(true);
        base8ID.setVisible(true);
        bace2ID.setVisible(true);
        oneID.setVisible(true);
        twoID.setVisible(true);
        threeID.setVisible(true);
        fourID.setVisible(true);
        fiveID.setVisible(true);
        sixID.setVisible(true);
        sevenID.setVisible(true);
        eightID.setVisible(true);
        nineID.setVisible(true);
        dotID.setVisible(true);
        posNegID.setVisible(true);
        zeroID.setVisible(true);
        posetiveID.setVisible(true);
        negativeID.setVisible(true);
        multipiteID.setVisible(true);
        taghsimID.setVisible(true);
        darSadID.setVisible(true);
        equalID.setVisible(true);
        cleanID.setVisible(true);
        backID.setVisible(true);
        line1.setVisible(true);
        line2.setVisible(true);
        dutLabel1.setVisible(false);
        posOrNegLabel.setVisible(false);
        stanLable.setVisible(false);
        stanLabel11.setVisible(false);
        randLabel.setVisible(false);
        proLabel.setVisible(true);
        scieLabale.setVisible(false);
    }

    @FXML
    private void programmer(ActionEvent event) {
        change.setText("      Programmer ");
        entryID.setVisible(true);
        sqrtID.setVisible(true);
        pow2ID.setVisible(true);
        pow3ID.setVisible(true);
        resultID.setVisible(true);
        showID.setVisible(true);
        sinID.setVisible(true);
        cosID.setVisible(true);
        tanID.setVisible(true);
        randID.setVisible(true);
        base8ID.setVisible(true);
        bace2ID.setVisible(true);
        oneID.setVisible(true);
        twoID.setVisible(true);
        threeID.setVisible(true);
        fourID.setVisible(true);
        fiveID.setVisible(true);
        sixID.setVisible(true);
        sevenID.setVisible(true);
        eightID.setVisible(true);
        nineID.setVisible(true);
        dotID.setVisible(true);
        posNegID.setVisible(true);
        zeroID.setVisible(true);
        posetiveID.setVisible(true);
        negativeID.setVisible(true);
        multipiteID.setVisible(true);
        taghsimID.setVisible(true);
        darSadID.setVisible(true);
        equalID.setVisible(true);
        cleanID.setVisible(true);
        backID.setVisible(true);
        line1.setVisible(true);
        line2.setVisible(true);
        dutLabel1.setVisible(true);
        posOrNegLabel.setVisible(true);
        stanLable.setVisible(true);
        stanLabel11.setVisible(true);
        randLabel.setVisible(true);
        proLabel.setVisible(false);
        scieLabale.setVisible(true);
    }

    @FXML
    private void off(ActionEvent event) {
        
        if (kii % 2 == 0) {
            offID.setText("on");
            entryID.setVisible(false);
            sqrtID.setVisible(false);
            pow2ID.setVisible(false);
            pow3ID.setVisible(false);
            resultID.setVisible(false);
            showID.setVisible(false);
            sinID.setVisible(false);
            cosID.setVisible(false);
            tanID.setVisible(false);
            randID.setVisible(false);
            base8ID.setVisible(false);
            bace2ID.setVisible(false);
            oneID.setVisible(false);
            twoID.setVisible(false);
            threeID.setVisible(false);
            fourID.setVisible(false);
            fiveID.setVisible(false);
            sixID.setVisible(false);
            sevenID.setVisible(false);
            eightID.setVisible(false);
            nineID.setVisible(false);
            dotID.setVisible(false);
            posNegID.setVisible(false);
            zeroID.setVisible(false);
            standardID.setVisible(false);
            scientificID.setVisible(false);
            programmerID.setVisible(false);
            posetiveID.setVisible(false);
            negativeID.setVisible(false);
            multipiteID.setVisible(false);
            taghsimID.setVisible(false);
            darSadID.setVisible(false);
            equalID.setVisible(false);
            cleanID.setVisible(false);
            backID.setVisible(false);
            line1.setVisible(false);
            line2.setVisible(false);
            kii++;
        }else {
            offID.setText("off");
            
            standardID.setVisible(true);
            scientificID.setVisible(true);
            programmerID.setVisible(true);
            
            kii++;
        }
    }

}
