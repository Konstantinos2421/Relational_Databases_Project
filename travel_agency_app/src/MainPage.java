import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.table.*;
import com.formdev.flatlaf.FlatLightLaf;

public class MainPage extends javax.swing.JFrame {
    
    private Database db = new Database();
    
    public void addBranchComboBoxes(String content){
        jComboBox1.addItem(content);
        jComboBox5.addItem(content);
        jComboBox8.addItem(content);
        jComboBox11.addItem(content);
        jComboBox14.addItem(content);
        jComboBox18.addItem(content);
        jComboBox20.addItem(content);
        jComboBox25.addItem(content);
        jComboBox26.addItem(content);
        jComboBox27.addItem(content);
        jComboBox28.addItem(content);
        jComboBox29.addItem(content);
        jComboBox31.addItem(content);
        jComboBox33.addItem(content);
        jComboBox37.addItem(content);
        jComboBox40.addItem(content);
        jComboBox42.addItem(content);
        jComboBox45.addItem(content);
        jComboBox48.addItem(content);
        jComboBox54.addItem(content);
        jComboBox55.addItem(content);
        jComboBox57.addItem(content);
        jComboBox61.addItem(content);
        jComboBox62.addItem(content);
        jComboBox64.addItem(content);
        jComboBox65.addItem(content);
        jComboBox68.addItem(content);
        jComboBox75.addItem(content);
        jComboBox76.addItem(content);
        jComboBox79.addItem(content);
        jComboBox84.addItem(content);
        jComboBox87.addItem(content);
        jComboBox95.addItem(content);
        jComboBox97.addItem(content);
    }
    
    public void modifyBranchComboBoxes(int index, String content){
        jComboBox1.removeItemAt(index); jComboBox1.insertItemAt(content, index);
        jComboBox5.removeItemAt(index); jComboBox5.insertItemAt(content, index);
        jComboBox8.removeItemAt(index); jComboBox8.insertItemAt(content, index);
        jComboBox11.removeItemAt(index); jComboBox11.insertItemAt(content, index);
        jComboBox14.removeItemAt(index); jComboBox14.insertItemAt(content, index);
        jComboBox18.removeItemAt(index); jComboBox18.insertItemAt(content, index);
        jComboBox20.removeItemAt(index); jComboBox20.insertItemAt(content, index);
        jComboBox25.removeItemAt(index); jComboBox25.insertItemAt(content, index);
        jComboBox26.removeItemAt(index); jComboBox26.insertItemAt(content, index);
        jComboBox27.removeItemAt(index); jComboBox27.insertItemAt(content, index);
        jComboBox28.removeItemAt(index); jComboBox29.insertItemAt(content, index);
        jComboBox31.removeItemAt(index); jComboBox31.insertItemAt(content, index);
        jComboBox33.removeItemAt(index); jComboBox33.insertItemAt(content, index);
        jComboBox37.removeItemAt(index); jComboBox40.insertItemAt(content, index);
        jComboBox42.removeItemAt(index); jComboBox45.insertItemAt(content, index);
        jComboBox48.removeItemAt(index); jComboBox48.insertItemAt(content, index);
        jComboBox54.removeItemAt(index); jComboBox54.insertItemAt(content, index);
        jComboBox55.removeItemAt(index); jComboBox55.insertItemAt(content, index);
        jComboBox57.removeItemAt(index); jComboBox57.insertItemAt(content, index);
        jComboBox61.removeItemAt(index); jComboBox61.insertItemAt(content, index);
        jComboBox62.removeItemAt(index); jComboBox64.insertItemAt(content, index);
        jComboBox65.removeItemAt(index); jComboBox65.insertItemAt(content, index);
        jComboBox68.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox75.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox76.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox79.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox84.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox87.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox95.removeItemAt(index); jComboBox68.insertItemAt(content, index);
        jComboBox97.removeItemAt(index); jComboBox68.insertItemAt(content, index);
    }
    
    public void deleteBranchComboBoxes(int index){
        jComboBox1.removeItemAt(index);
        jComboBox5.removeItemAt(index);
        jComboBox8.removeItemAt(index);
        jComboBox11.removeItemAt(index);
        jComboBox14.removeItemAt(index);
        jComboBox18.removeItemAt(index);
        jComboBox20.removeItemAt(index);
        jComboBox25.removeItemAt(index);
        jComboBox26.removeItemAt(index);
        jComboBox27.removeItemAt(index);
        jComboBox28.removeItemAt(index);
        jComboBox29.removeItemAt(index);
        jComboBox31.removeItemAt(index);
        jComboBox33.removeItemAt(index);
        jComboBox37.removeItemAt(index);
        jComboBox40.removeItemAt(index);
        jComboBox42.removeItemAt(index);
        jComboBox45.removeItemAt(index);
        jComboBox48.removeItemAt(index);
        jComboBox54.removeItemAt(index);
        jComboBox55.removeItemAt(index);
        jComboBox57.removeItemAt(index);
        jComboBox61.removeItemAt(index);
        jComboBox62.removeItemAt(index);
        jComboBox64.removeItemAt(index);
        jComboBox65.removeItemAt(index);
        jComboBox68.removeItemAt(index);
        jComboBox75.removeItemAt(index);
        jComboBox76.removeItemAt(index);
        jComboBox79.removeItemAt(index);
        jComboBox84.removeItemAt(index);
        jComboBox87.removeItemAt(index);
        jComboBox95.removeItemAt(index);
        jComboBox97.removeItemAt(index);
    }
    
    
    public void addDestinationComboBoxes(String content){
        jComboBox10.addItem(content);
        jComboBox22.addItem(content);
        jComboBox23.addItem(content);
        jComboBox39.addItem(content);
        jComboBox71.addItem(content);
        jComboBox73.addItem(content);
        jComboBox90.addItem(content);
        jComboBox92.addItem(content);
    }
    
    public void modifyDestinationComboBoxes(int index, String content){
        jComboBox10.removeItemAt(index); jComboBox10.insertItemAt(content, index);
        jComboBox22.removeItemAt(index); jComboBox22.insertItemAt(content, index);
        jComboBox23.removeItemAt(index); jComboBox23.insertItemAt(content, index);
        jComboBox39.removeItemAt(index); jComboBox39.insertItemAt(content, index);
        jComboBox71.removeItemAt(index); jComboBox71.insertItemAt(content, index);
        jComboBox73.removeItemAt(index); jComboBox73.insertItemAt(content, index);
        jComboBox90.removeItemAt(index); jComboBox90.insertItemAt(content, index);
        jComboBox92.removeItemAt(index); jComboBox92.insertItemAt(content, index);
    }
    
    public void deleteDestinationComboBoxes(int index){
        jComboBox10.removeItemAt(index);
        jComboBox22.removeItemAt(index);
        jComboBox23.removeItemAt(index);
        jComboBox39.removeItemAt(index);
        jComboBox71.removeItemAt(index);
        jComboBox73.removeItemAt(index);
        jComboBox90.removeItemAt(index);
        jComboBox92.removeItemAt(index);
    }
    
    
    public void addGuideComboBoxes(String content){
        jComboBox6.addItem(content);
        jComboBox35.addItem(content);
        jComboBox69.addItem(content);
    }
    
    public void modifyGuideComboBoxes(int index, String content){
        jComboBox6.removeItemAt(index); jComboBox6.insertItemAt(content, index);
        jComboBox35.removeItemAt(index); jComboBox35.insertItemAt(content, index);
        jComboBox69.removeItemAt(index); jComboBox69.insertItemAt(content, index);
    }
    
    public void deleteGuideComboBoxes(int index){
        jComboBox6.removeItemAt(index);
        jComboBox35.removeItemAt(index);
        jComboBox69.removeItemAt(index);
    }
    
    
    public void addOfferComboBoxes(String content){
        jComboBox24.addItem(content);
        jComboBox51.addItem(content);
        jComboBox52.addItem(content);
        jComboBox91.addItem(content);
        jComboBox93.addItem(content);
    }
    
    public void modifyOfferComboBoxes(int index, String content){
        jComboBox24.removeItemAt(index); jComboBox24.insertItemAt(content, index);
        jComboBox51.removeItemAt(index); jComboBox51.insertItemAt(content, index);
        jComboBox52.removeItemAt(index); jComboBox52.insertItemAt(content, index);
        jComboBox91.removeItemAt(index); jComboBox91.insertItemAt(content, index);
        jComboBox93.removeItemAt(index); jComboBox93.insertItemAt(content, index);
    }
    
    public void deleteOfferComboBoxes(int index){
        jComboBox24.removeItemAt(index);
        jComboBox51.removeItemAt(index);
        jComboBox52.removeItemAt(index);
        jComboBox91.removeItemAt(index);
        jComboBox93.removeItemAt(index);
    }

    
    public MainPage(String current_user) {
        try {
            db.st.execute("SET @IT_manager = '" + current_user + "';");
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {}
        
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jSpinner2 = new javax.swing.JSpinner();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox<>();
        jTextField17 = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jComboBox10 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jComboBox11 = new javax.swing.JComboBox<>();
        jComboBox12 = new javax.swing.JComboBox<>();
        jComboBox13 = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        jComboBox15 = new javax.swing.JComboBox<>();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jComboBox16 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        jComboBox17 = new javax.swing.JComboBox<>();
        jPanel20 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jComboBox18 = new javax.swing.JComboBox<>();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton10 = new javax.swing.JButton();
        jComboBox19 = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jComboBox20 = new javax.swing.JComboBox<>();
        jComboBox21 = new javax.swing.JComboBox<>();
        jComboBox22 = new javax.swing.JComboBox<>();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jComboBox23 = new javax.swing.JComboBox<>();
        jButton12 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jComboBox24 = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jComboBox25 = new javax.swing.JComboBox<>();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel36 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jComboBox54 = new javax.swing.JComboBox<>();
        jTextField42 = new javax.swing.JTextField();
        jSpinner4 = new javax.swing.JSpinner();
        jTextField43 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        jComboBox55 = new javax.swing.JComboBox<>();
        jButton34 = new javax.swing.JButton();
        jComboBox56 = new javax.swing.JComboBox<>();
        jTextField44 = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jComboBox57 = new javax.swing.JComboBox<>();
        jComboBox58 = new javax.swing.JComboBox<>();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jComboBox59 = new javax.swing.JComboBox<>();
        jComboBox60 = new javax.swing.JComboBox<>();
        jSpinner5 = new javax.swing.JSpinner();
        jTextField48 = new javax.swing.JTextField();
        jComboBox61 = new javax.swing.JComboBox<>();
        jButton35 = new javax.swing.JButton();
        jPanel39 = new javax.swing.JPanel();
        jLabel158 = new javax.swing.JLabel();
        jComboBox62 = new javax.swing.JComboBox<>();
        jComboBox63 = new javax.swing.JComboBox<>();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jTextField52 = new javax.swing.JTextField();
        jComboBox64 = new javax.swing.JComboBox<>();
        jButton36 = new javax.swing.JButton();
        jPanel40 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        jComboBox69 = new javax.swing.JComboBox<>();
        jComboBox70 = new javax.swing.JComboBox<>();
        jTextField57 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jPanel41 = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        jComboBox65 = new javax.swing.JComboBox<>();
        jComboBox66 = new javax.swing.JComboBox<>();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jComboBox67 = new javax.swing.JComboBox<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jTextField56 = new javax.swing.JTextField();
        jComboBox68 = new javax.swing.JComboBox<>();
        jButton37 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel181 = new javax.swing.JLabel();
        jComboBox71 = new javax.swing.JComboBox<>();
        jTextField58 = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jComboBox72 = new javax.swing.JComboBox<>();
        jTextField59 = new javax.swing.JTextField();
        jComboBox73 = new javax.swing.JComboBox<>();
        jButton39 = new javax.swing.JButton();
        jPanel43 = new javax.swing.JPanel();
        jLabel188 = new javax.swing.JLabel();
        jComboBox74 = new javax.swing.JComboBox<>();
        jComboBox75 = new javax.swing.JComboBox<>();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jSpinner6 = new javax.swing.JSpinner();
        jComboBox76 = new javax.swing.JComboBox<>();
        jComboBox77 = new javax.swing.JComboBox<>();
        jComboBox78 = new javax.swing.JComboBox<>();
        jButton40 = new javax.swing.JButton();
        jPanel44 = new javax.swing.JPanel();
        jLabel198 = new javax.swing.JLabel();
        jComboBox79 = new javax.swing.JComboBox<>();
        jComboBox80 = new javax.swing.JComboBox<>();
        jComboBox81 = new javax.swing.JComboBox<>();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jComboBox82 = new javax.swing.JComboBox<>();
        jComboBox83 = new javax.swing.JComboBox<>();
        jButton41 = new javax.swing.JButton();
        jPanel45 = new javax.swing.JPanel();
        jLabel206 = new javax.swing.JLabel();
        jComboBox84 = new javax.swing.JComboBox<>();
        jComboBox85 = new javax.swing.JComboBox<>();
        jComboBox86 = new javax.swing.JComboBox<>();
        jTextField65 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jButton42 = new javax.swing.JButton();
        jPanel46 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        jComboBox87 = new javax.swing.JComboBox<>();
        jComboBox88 = new javax.swing.JComboBox<>();
        jComboBox89 = new javax.swing.JComboBox<>();
        jTextField67 = new javax.swing.JTextField();
        jTextField68 = new javax.swing.JTextField();
        jButton43 = new javax.swing.JButton();
        jComboBox90 = new javax.swing.JComboBox<>();
        jPanel47 = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jComboBox91 = new javax.swing.JComboBox<>();
        jTextField69 = new javax.swing.JTextField();
        jTextField70 = new javax.swing.JTextField();
        jTextField71 = new javax.swing.JTextField();
        jComboBox92 = new javax.swing.JComboBox<>();
        jButton44 = new javax.swing.JButton();
        jPanel48 = new javax.swing.JPanel();
        jLabel226 = new javax.swing.JLabel();
        jComboBox93 = new javax.swing.JComboBox<>();
        jComboBox94 = new javax.swing.JComboBox<>();
        jTextField72 = new javax.swing.JTextField();
        jTextField73 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jButton45 = new javax.swing.JButton();
        jPanel49 = new javax.swing.JPanel();
        jLabel232 = new javax.swing.JLabel();
        jComboBox95 = new javax.swing.JComboBox<>();
        jComboBox96 = new javax.swing.JComboBox<>();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jTextField79 = new javax.swing.JTextField();
        jTextField80 = new javax.swing.JTextField();
        jComboBox97 = new javax.swing.JComboBox<>();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton46 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox28 = new javax.swing.JComboBox<>();
        jButton20 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jComboBox29 = new javax.swing.JComboBox<>();
        jComboBox30 = new javax.swing.JComboBox<>();
        jButton21 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jComboBox31 = new javax.swing.JComboBox<>();
        jComboBox32 = new javax.swing.JComboBox<>();
        jButton22 = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jComboBox33 = new javax.swing.JComboBox<>();
        jComboBox34 = new javax.swing.JComboBox<>();
        jButton23 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        jComboBox35 = new javax.swing.JComboBox<>();
        jComboBox36 = new javax.swing.JComboBox<>();
        jButton24 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        jComboBox37 = new javax.swing.JComboBox<>();
        jComboBox38 = new javax.swing.JComboBox<>();
        jButton25 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jComboBox39 = new javax.swing.JComboBox<>();
        jButton26 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        jComboBox40 = new javax.swing.JComboBox<>();
        jComboBox41 = new javax.swing.JComboBox<>();
        jButton27 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jComboBox42 = new javax.swing.JComboBox<>();
        jComboBox43 = new javax.swing.JComboBox<>();
        jComboBox44 = new javax.swing.JComboBox<>();
        jButton28 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        jComboBox45 = new javax.swing.JComboBox<>();
        jComboBox46 = new javax.swing.JComboBox<>();
        jComboBox47 = new javax.swing.JComboBox<>();
        jButton29 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jPanel33 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        jComboBox48 = new javax.swing.JComboBox<>();
        jComboBox49 = new javax.swing.JComboBox<>();
        jComboBox50 = new javax.swing.JComboBox<>();
        jButton30 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        jComboBox51 = new javax.swing.JComboBox<>();
        jButton31 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jLabel135 = new javax.swing.JLabel();
        jComboBox52 = new javax.swing.JComboBox<>();
        jComboBox53 = new javax.swing.JComboBox<>();
        jButton32 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        jComboBox26 = new javax.swing.JComboBox<>();
        jTextField13 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jTextField41 = new javax.swing.JTextField();
        jButton19 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel99 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        jComboBox27 = new javax.swing.JComboBox<>();
        jButton17 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Travel Agency");
        setPreferredSize(new java.awt.Dimension(1250, 800));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(989, 688));

        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTabbedPane2.setMinimumSize(new java.awt.Dimension(989, 688));
        jTabbedPane2.setPreferredSize(new java.awt.Dimension(1180, 800));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERT BRANCH");

        jTextField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Street", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "City", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jSpinner1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Street Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Insert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(354, 354, 354)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(514, 514, 514))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(448, 448, 448))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(297, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Branch", jPanel11);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INSERT PHONE NUMBER");

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(281, 281, 281)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(475, 475, 475))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel5)
                .addGap(84, 84, 84)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jButton2)
                .addContainerGap(303, Short.MAX_VALUE))
        );

        try{
            jComboBox1.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox1.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Phone Number", jPanel12);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("INSERT DRIVER");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "B", "C", "D" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "License", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton3.setText("Insert");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOCAL", "ABROAD" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Route", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jSpinner2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Months of Experience", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(475, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField7)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, 0, 475, Short.MAX_VALUE)
                                    .addComponent(jSpinner2))))
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(465, 465, 465))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel8)
                .addGap(44, 44, 44)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jButton3)
                .addContainerGap(114, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Driver", jPanel13);

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("INSERT GUIDE");

        jTextField8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setText("Insert");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                    .addComponent(jTextField10)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8)
                    .addComponent(jTextField11)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(208, 208, 208))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(459, 459, 459))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel20)
                .addGap(51, 51, 51)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addContainerGap(99, Short.MAX_VALUE))
        );

        try{
            jComboBox5.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox5.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Guide", jPanel14);

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("INSERT LANGUAGE");

        jComboBox6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lamguage", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Insert");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(328, 328, 328))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(445, 445, 445))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel26)
                .addGap(88, 88, 88)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox6.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN guide ON worker.wrk_AT = guide.gui_AT ORDER BY wrk_name ASC;");
            while(rs.next())
            jComboBox6.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Language", jPanel15);

        jLabel29.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("INSERT ADMIN");

        jComboBox7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOGISTICS", "ADMINISTRATIVE", "ACCOUNTING" }));
        jComboBox7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton6.setText("Insert");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diploma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextField14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(305, 305, 305))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(522, 522, 522))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel29)
                .addGap(40, 40, 40)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton6)
                .addContainerGap())
        );

        try{
            jComboBox8.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox8.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Admin", jPanel16);

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("INSERT DESTINATION");

        jTextField18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane3.setViewportView(jTextArea3);

        jComboBox9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOCAL", "ABROAD" }));
        jComboBox9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton7.setText("Insert");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jComboBox10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(434, 434, 434)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(227, 227, 227))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addGap(462, 462, 462))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(347, 347, 347))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel37)
                .addGap(48, 48, 48)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton7)
                .addContainerGap())
        );

        try{
            jComboBox10.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination ORDER BY dst_name ASC;");
            while(rs.next())
            jComboBox10.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Destination", jPanel17);

        jLabel43.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("INSERT TRIP");

        jTextField20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departure Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jSpinner3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Max Seats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox11.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox11PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setText("Departure and return date and time must be in form yyyy-mm-dd hh:mm:ss");

        jButton8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton8.setText("Insert");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(451, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(255, 255, 255))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(469, 469, 469))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(356, 356, 356))))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel43)
                .addGap(39, 39, 39)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel52)
                .addGap(40, 40, 40)
                .addComponent(jButton8)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        try{
            jComboBox11.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox11.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox12.addItem("--");
        jComboBox13.addItem("--");

        jTabbedPane2.addTab("Trip", jPanel18);

        jLabel49.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("INSERT RESERVATION");

        jComboBox14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox14.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox14PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox15.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox15PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "ADULT", "MINOR" }));
        jComboBox16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Age Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton9.setText("Insert");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBox17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox17.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seat Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(448, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel19Layout.createSequentialGroup()
                            .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(233, 233, 233)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(461, 461, 461))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(348, 348, 348))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel49)
                .addGap(50, 50, 50)
                .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton9)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        try{
            jComboBox14.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox14.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox15.addItem("--");
        jComboBox17.addItem("--");

        jTabbedPane2.addTab("Reservation", jPanel19);

        jLabel60.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("INSERT EVENT FOR TRIP");

        jComboBox18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox18.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox18PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "End Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane4.setViewportView(jTextArea4);

        jButton10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton10.setText("Insert");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jComboBox19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField25, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox19, javax.swing.GroupLayout.Alignment.LEADING, 0, 496, Short.MAX_VALUE)
                                .addComponent(jComboBox18, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(246, 246, 246))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(341, 341, 341))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(458, 458, 458))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel60)
                .addGap(53, 53, 53)
                .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jComboBox19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton10)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        try{
            jComboBox18.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox18.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox19.addItem("--");

        jTabbedPane2.addTab("Event", jPanel20);

        jLabel54.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("ADD DESTINATION FOR A TRIP");

        jButton11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton11.setText("Insert");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jComboBox20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox20.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox20PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arrival Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departure Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jLabel73.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel73.setText("Arival and departure date and time must be in form yyyy-mm-dd hh:mm:ss");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap(446, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(265, 265, 265))
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel21Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jButton11)
                        .addGap(478, 478, 478))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(355, 355, 355))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel54)
                .addGap(61, 61, 61)
                .addComponent(jComboBox20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jComboBox21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jComboBox22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel73)
                .addGap(39, 39, 39)
                .addComponent(jButton11)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        try{
            jComboBox20.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox20.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox21.addItem("--");
        try{
            jComboBox22.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox22.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Connect Trip With Destination", jPanel21);

        jLabel71.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("INSERT OFFER");

        jTextField29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer End Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton12.setText("Insert");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel77.setText("Offer start and end date must be in form yyyy-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(459, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(291, 291, 291)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(353, 353, 353))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(488, 488, 488))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(363, 363, 363))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel71)
                .addGap(48, 48, 48)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jComboBox23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel77)
                .addGap(40, 40, 40)
                .addComponent(jButton12)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        try{
            jComboBox23.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox23.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("Offer", jPanel1);

        jLabel78.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("INSERT RESERVATION FOR AN OFFER");

        jTextField32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment In Advance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton13.setText("Insert");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jComboBox24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(460, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(312, 312, 312)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addGap(496, 496, 496))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel78)
                .addGap(68, 68, 68)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboBox24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton13)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        try{
            jComboBox24.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers;");
            while(rs.next())
            jComboBox24.addItem("Offer id: " + rs.getString(1));
        }catch(Exception e){}

        jTabbedPane2.addTab("Reservation For Offer", jPanel22);

        jLabel83.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("INSERT IT MANAGER");

        jTextField35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField39.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton14.setText("Insert");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(267, 267, 267)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addGap(470, 470, 470))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(310, 310, 310))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel83)
                .addGap(48, 48, 48)
                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jComboBox25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton14)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        try{
            jComboBox25.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox25.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane2.addTab("IT Manager", jPanel23);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Insert Data", jPanel2);

        jTabbedPane4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel138.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("MODIFY BRANCH");

        jComboBox54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox54.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox54PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField42.setEditable(false);
        jTextField42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Street", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jSpinner4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Street Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jSpinner4.setEnabled(false);

        jTextField43.setEditable(false);
        jTextField43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "City", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton33.setText("Modify");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addGap(0, 468, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(284, 284, 284))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(424, 424, 424))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                        .addComponent(jButton33)
                        .addGap(488, 488, 488))))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel138)
                .addGap(61, 61, 61)
                .addComponent(jComboBox54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButton33)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        try{
            jComboBox54.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox54.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        ((DefaultEditor)jSpinner4.getEditor()).getTextField().setEditable(false);

        jTabbedPane4.addTab("Branch", jPanel36);

        jLabel143.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("MODIFY PHONE NUMBER");

        jComboBox55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox55.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox55PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton34.setText("Modify");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jComboBox56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Old Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox56.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox56PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField44.setEditable(false);
        jTextField44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel37Layout.createSequentialGroup()
                            .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(344, 344, 344)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addComponent(jButton34)
                        .addGap(523, 523, 523))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                        .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(407, 407, 407))))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel143)
                .addGap(75, 75, 75)
                .addComponent(jComboBox55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jComboBox56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jButton34)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox55.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox55.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox56.addItem("--");

        jTabbedPane4.addTab("Phone Number", jPanel37);

        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel147.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("MODIFY DRIVER");
        jPanel38.add(jLabel147, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 304, -1));

        jComboBox57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox57.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox57PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel38.add(jComboBox57, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 358, -1));
        try{
            jComboBox57.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox57.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jComboBox58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox58.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox58PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel38.add(jComboBox58, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 358, -1));
        jComboBox58.addItem("--");

        jTextField45.setEditable(false);
        jTextField45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel38.add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 358, -1));

        jTextField46.setEditable(false);
        jTextField46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel38.add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 358, -1));

        jTextField47.setEditable(false);
        jTextField47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel38.add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 358, -1));

        jComboBox59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox59.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "A", "B", "C", "D" }));
        jComboBox59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "License", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox59.setEnabled(false);
        jPanel38.add(jComboBox59, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 358, -1));

        jComboBox60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox60.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOCAL", "ABROAD" }));
        jComboBox60.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Route", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox60.setEnabled(false);
        jPanel38.add(jComboBox60, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 358, -1));

        jSpinner5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Months of Experience", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jSpinner5.setEnabled(false);
        jPanel38.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 358, -1));

        jTextField48.setEditable(false);
        jTextField48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel38.add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, 358, -1));

        jComboBox61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox61.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox61.setEnabled(false);
        jPanel38.add(jComboBox61, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 450, 358, -1));
        try{
            jComboBox61.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox61.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jButton35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton35.setText("Modify");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel38.add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 540, -1, -1));

        jTabbedPane4.addTab("Driver", jPanel38);

        jLabel158.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel158.setText("MODIFY GUIDE");

        jComboBox62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox62.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox62.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox62PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox63.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox63.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox63PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField49.setEditable(false);
        jTextField49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField50.setEditable(false);
        jTextField50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField51.setEditable(false);
        jTextField51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CV", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane11.setViewportView(jTextArea6);

        jTextField52.setEditable(false);
        jTextField52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox64.setEnabled(false);

        jButton36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton36.setText("Modify");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(559, 559, 559)
                        .addComponent(jButton36))
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(jLabel158, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(161, 161, 161))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel158)
                .addGap(70, 70, 70)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(jComboBox62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton36)
                .addContainerGap())
        );

        try{
            jComboBox62.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox62.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox63.addItem("--");
        try{
            jComboBox64.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox64.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane4.addTab("Guide", jPanel39);

        jLabel177.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("MODIFY LANGUAGE");

        jComboBox69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox69.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox69PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox70.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Old Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox70.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox70PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField57.setEditable(false);
        jTextField57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField57.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton38.setText("Modify");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(323, 323, 323))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(jButton38)
                        .addGap(516, 516, 516))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel177)
                .addGap(71, 71, 71)
                .addComponent(jComboBox69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jComboBox70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jButton38)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox69.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN guide ON worker.wrk_AT = guide.gui_AT ORDER BY wrk_name ASC;");
            while(rs.next())
            jComboBox69.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
        }catch(Exception e){}
        jComboBox70.addItem("--");

        jTabbedPane4.addTab("Language", jPanel40);

        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel167.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("MODIFY ADMIN");
        jPanel41.add(jLabel167, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 304, -1));

        jComboBox65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox65.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Branch"));
        jComboBox65.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox65PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel41.add(jComboBox65, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 355, -1));
        try{
            jComboBox65.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox65.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jComboBox66.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox66.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox66PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel41.add(jComboBox66, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 355, -1));
        jComboBox66.addItem("--");

        jTextField53.setEditable(false);
        jTextField53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel41.add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 355, -1));

        jTextField54.setEditable(false);
        jTextField54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField54.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel41.add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 355, -1));

        jTextField55.setEditable(false);
        jTextField55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField55.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel41.add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 355, -1));

        jComboBox67.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox67.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOGISTICS", "ADMINISTRATIVE", "ACCOUNTING" }));
        jComboBox67.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox67.setEnabled(false);
        jPanel41.add(jComboBox67, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 355, -1));

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Diploma", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane12.setViewportView(jTextArea7);

        jPanel41.add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 355, 123));

        jTextField56.setEditable(false);
        jTextField56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField56.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel41.add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 355, -1));

        jComboBox68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox68.setEnabled(false);
        jPanel41.add(jComboBox68, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 355, -1));
        try{
            jComboBox68.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox68.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jButton37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton37.setText("Modify");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel41.add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        jTabbedPane4.addTab("Admin", jPanel41);

        jLabel181.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("MODIFY DESTINATION");

        jComboBox71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox71.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox71.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox71PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField58.setEditable(false);
        jTextField58.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField58.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane13.setViewportView(jTextArea8);

        jComboBox72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox72.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "LOCAL", "ABROAD" }));
        jComboBox72.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox72.setEnabled(false);

        jTextField59.setEditable(false);
        jTextField59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField59.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox73.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox73.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Location", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox73.setEnabled(false);

        jButton39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton39.setText("Modify");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox72, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel42Layout.createSequentialGroup()
                            .addComponent(jComboBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(299, 299, 299)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jButton39)
                        .addGap(508, 508, 508))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(395, 395, 395))))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel181)
                .addGap(41, 41, 41)
                .addComponent(jComboBox71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jComboBox72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jComboBox73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox71.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox71.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}
        try{
            jComboBox73.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination ORDER BY dst_name ASC;");
            while(rs.next())
            jComboBox73.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane4.addTab("Destination", jPanel42);

        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel188.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel188.setText("MODIFY TRIP");
        jPanel43.add(jLabel188, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 304, -1));

        jComboBox74.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox74.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox74.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox74PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel43.add(jComboBox74, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 390, -1));
        jComboBox74.addItem("--");

        jComboBox75.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox75.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox75.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox75PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel43.add(jComboBox75, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 390, -1));
        try{
            jComboBox75.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox75.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTextField60.setEditable(false);
        jTextField60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField60.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departure Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel43.add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 390, -1));

        jTextField61.setEditable(false);
        jTextField61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField61.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel43.add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 390, -1));

        jTextField62.setEditable(false);
        jTextField62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField62.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel43.add(jTextField62, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 389, -1));

        jSpinner6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinner6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Max Seats", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jSpinner6.setEnabled(false);
        jPanel43.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 389, -1));

        jComboBox76.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox76.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox76.setEnabled(false);
        jComboBox76.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox76PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel43.add(jComboBox76, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 389, -1));
        try{
            jComboBox76.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox76.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jComboBox77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox77.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox77.setEnabled(false);
        jPanel43.add(jComboBox77, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 389, -1));
        jComboBox77.addItem("--");

        jComboBox78.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox78.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox78.setEnabled(false);
        jPanel43.add(jComboBox78, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 389, -1));
        jComboBox78.addItem("--");

        jButton40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton40.setText("Modify");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel43.add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, -1, -1));

        jTabbedPane4.addTab("Trip", jPanel43);

        jLabel198.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel198.setText("MODIFY RESERVATION");

        jComboBox79.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox79.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox79.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox79PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox80.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox80.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox80.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox80PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox81.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox81.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox81.setFocusable(false);
        jComboBox81.setOpaque(true);
        jComboBox81.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox81PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField63.setEditable(false);
        jTextField63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField63.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField64.setEditable(false);
        jTextField64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField64.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox82.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox82.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "ADULT", "MINOR" }));
        jComboBox82.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Age Group", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox82.setEnabled(false);

        jComboBox83.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox83.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seat Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox83.setEnabled(false);

        jButton41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton41.setText("Modify");
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addGap(0, 465, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(314, 314, 314))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addComponent(jButton41)
                        .addGap(509, 509, 509))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel44Layout.createSequentialGroup()
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(399, 399, 399))))
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel198)
                .addGap(55, 55, 55)
                .addComponent(jComboBox79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jComboBox81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jComboBox83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox79.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox79.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox80.addItem("--");
        jComboBox81.addItem("--");
        jComboBox83.addItem("--");

        jTabbedPane4.addTab("Reservation", jPanel44);

        jLabel206.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel206.setText("MODIFY EVENT");

        jComboBox84.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox84.setBorder(javax.swing.BorderFactory.createTitledBorder("Branch"));
        jComboBox84.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox84PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox85.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox85.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox85.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox85PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox86.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox86.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Start Date - Time"));
        jComboBox86.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox86PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField65.setEditable(false);
        jTextField65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField65.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Start Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField66.setEditable(false);
        jTextField66.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField66.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New End Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane14.setViewportView(jTextArea9);

        jButton42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton42.setText("Modify");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox84, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox86, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(307, 307, 307))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addComponent(jButton42)
                        .addGap(506, 506, 506))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel45Layout.createSequentialGroup()
                        .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(398, 398, 398))))
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel206)
                .addGap(40, 40, 40)
                .addComponent(jComboBox84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jComboBox85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jComboBox86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTextField65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox84.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox84.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox85.addItem("--");
        jComboBox86.addItem("--");

        jTabbedPane4.addTab("Event", jPanel45);

        jLabel213.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("MODIFY DESTINATION FROM TRIP");

        jComboBox87.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox87.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox87.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox87PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox88.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox88.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox88.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox88PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox89.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox89.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Old Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox89.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox89PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField67.setEditable(false);
        jTextField67.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField67.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arrival Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField68.setEditable(false);
        jTextField68.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField68.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departure Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton43.setText("Modify");
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jComboBox90.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox90.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox90.setEnabled(false);

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox88, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox89, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(324, 324, 324))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addComponent(jButton43)
                        .addGap(512, 512, 512))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(381, 381, 381))))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel213)
                .addGap(49, 49, 49)
                .addComponent(jComboBox87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBox88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBox89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jComboBox90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTextField68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton43)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        try{
            jComboBox87.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox87.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox88.addItem("--");
        jComboBox89.addItem("--");
        try{
            jComboBox90.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox90.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane4.addTab("Destination For Trip", jPanel46);

        jLabel220.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel220.setText("MODIFY OFFER");

        jComboBox91.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox91.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox91.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox91PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField69.setEditable(false);
        jTextField69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField69.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField70.setEditable(false);
        jTextField70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField70.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer End Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField71.setEditable(false);
        jTextField71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField71.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cost", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jComboBox92.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox92.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox92.setEnabled(false);

        jButton44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton44.setText("Modify");
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap(464, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox91, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jButton44)
                        .addGap(506, 506, 506))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                        .addComponent(jLabel220, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(373, 373, 373))))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel220)
                .addGap(62, 62, 62)
                .addComponent(jComboBox91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jTextField69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jTextField70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jComboBox92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jButton44)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        try{
            jComboBox91.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers;");
            while(rs.next())
            jComboBox91.addItem("Offer id: " + rs.getString(1));
        }catch(Exception e){}
        try{
            jComboBox92.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox92.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane4.addTab("Offer", jPanel47);

        jLabel226.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel226.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel226.setText("MODIFY RESERVATION OF AN OFFER");

        jComboBox93.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox93.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox93.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox93PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox94.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox94.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox94.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox94PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTextField72.setEditable(false);
        jTextField72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField72.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField73.setEditable(false);
        jTextField73.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField73.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField74.setEditable(false);
        jTextField74.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField74.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Payment In Advance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton45.setText("Modify");
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox93, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addComponent(jButton45)
                        .addGap(500, 500, 500))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                        .addComponent(jLabel226, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))))
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel226)
                .addGap(57, 57, 57)
                .addComponent(jComboBox93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jComboBox94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jTextField72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jTextField73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton45)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        try{
            jComboBox93.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers;");
            while(rs.next())
            jComboBox93.addItem("Offer id: " + rs.getString(1));
        }catch(Exception e){}
        jComboBox53.addItem("--");

        jTabbedPane4.addTab("Reservation For Offer", jPanel48);

        jPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel232.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel232.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel232.setText("MODIFY IT MANAGER");
        jPanel49.add(jLabel232, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 391, -1));

        jComboBox95.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox95.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox95.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox95PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel49.add(jComboBox95, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 371, -1));
        try{
            jComboBox95.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox95.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jComboBox96.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox96.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IT Manager", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox96.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox96PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel49.add(jComboBox96, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 371, -1));
        jComboBox96.addItem("--");

        jTextField75.setEditable(false);
        jTextField75.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField75.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField75, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 371, -1));

        jTextField76.setEditable(false);
        jTextField76.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField76.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField76, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 371, -1));

        jTextField77.setEditable(false);
        jTextField77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField77.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField77, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 371, -1));

        jTextField78.setEditable(false);
        jTextField78.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField78.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField78, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, 371, -1));

        jTextField79.setEditable(false);
        jTextField79.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField79.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField79, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 371, -1));

        jTextField80.setEditable(false);
        jTextField80.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField80.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "End Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jTextField80, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, 371, -1));

        jComboBox97.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox97.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox97.setEnabled(false);
        jPanel49.add(jComboBox97, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 371, -1));
        try{
            jComboBox97.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox97.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jPasswordField2.setEditable(false);
        jPasswordField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel49.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 371, -1));

        jButton46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton46.setText("Modify");
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel49.add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, -1, -1));

        jTabbedPane4.addTab("IT Manager", jPanel49);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("Modify Data", jPanel3);

        jTabbedPane3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DELETE BRANCH");

        jComboBox28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton20.setText("Delete");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(439, 439, 439))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jButton20)
                        .addGap(503, 503, 503))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel17)
                .addGap(75, 75, 75)
                .addComponent(jComboBox28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton20)
                .addContainerGap(410, Short.MAX_VALUE))
        );

        try{
            jComboBox28.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox28.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane3.addTab("Branch", jPanel5);

        jLabel100.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("DELETE PHONE NUMBER");

        jComboBox29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox29.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox29PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Phone Number", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton21.setText("Delete");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(299, 299, 299))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton21)
                        .addGap(502, 502, 502))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(405, 405, 405))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel100)
                .addGap(75, 75, 75)
                .addComponent(jComboBox29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jComboBox30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jButton21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox29.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox29.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox30.addItem("--");

        jTabbedPane3.addTab("Phone Number", jPanel24);

        jLabel103.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("DELETE DRIVER");

        jComboBox31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox31.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox31PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Driver", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton22.setText("Delete");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jButton22)
                        .addGap(517, 517, 517))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel103)
                .addGap(66, 66, 66)
                .addComponent(jComboBox31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jComboBox32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox31.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox31.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox32.addItem("--");

        jTabbedPane3.addTab("Driver", jPanel25);

        jLabel106.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("DELETE GUIDE");

        jComboBox33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox33.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox33PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox34.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton23.setText("Delete");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap(461, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(326, 326, 326))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jButton23)
                        .addGap(517, 517, 517))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel106)
                .addGap(62, 62, 62)
                .addComponent(jComboBox33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jComboBox34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox33.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox33.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox34.addItem("--");

        jTabbedPane3.addTab("Guide", jPanel26);
        jPanel26.getAccessibleContext().setAccessibleName("");

        jLabel109.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("DELETE LANGUAGE");

        jComboBox35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox35.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Guide", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox35.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox35PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox36.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Language", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton24.setText("Delete");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(316, 316, 316)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(414, 414, 414))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                        .addComponent(jButton24)
                        .addGap(511, 511, 511))))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel109)
                .addGap(57, 57, 57)
                .addComponent(jComboBox35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(jComboBox36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox35.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN guide ON worker.wrk_AT = guide.gui_AT ORDER BY wrk_name ASC;");
            while(rs.next())
            jComboBox35.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
        }catch(Exception e){}
        jComboBox36.addItem("--");

        jTabbedPane3.addTab("Language", jPanel27);

        jLabel112.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("DELETE ADMIN");

        jComboBox37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox37.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox37.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox37PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox38.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton25.setText("Delete");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap(454, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(317, 317, 317))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(422, 422, 422))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                        .addComponent(jButton25)
                        .addGap(517, 517, 517))))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel112)
                .addGap(65, 65, 65)
                .addComponent(jComboBox37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jComboBox38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jButton25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox37.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox37.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox38.addItem("--");

        jTabbedPane3.addTab("Admin", jPanel28);

        jLabel115.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("DELETE DESTINATION");

        jComboBox39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox39.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton26.setText("Delete");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                        .addComponent(jButton26)
                        .addGap(509, 509, 509))))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel115)
                .addGap(81, 81, 81)
                .addComponent(jComboBox39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(jButton26)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox39.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM destination;");
            while(rs.next())
            jComboBox39.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
        }catch(Exception e){}

        jTabbedPane3.addTab("Destination", jPanel29);

        jLabel117.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("DELETE TRIP");

        jComboBox40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox40.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox40PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton27.setText("Delete");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap(470, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel30Layout.createSequentialGroup()
                            .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(jButton27)
                        .addGap(506, 506, 506))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409))))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel117)
                .addGap(70, 70, 70)
                .addComponent(jComboBox40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jComboBox41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox40.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox40.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox41.addItem("--");

        jTabbedPane3.addTab("Trip", jPanel30);

        jLabel120.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("DELETE RESERVATION");

        jComboBox42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox42.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox42.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox42PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox43.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox43.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox43PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox44.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton28.setText("Delete");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel31Layout.createSequentialGroup()
                            .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(307, 307, 307)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jButton28)
                        .addGap(506, 506, 506))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(413, 413, 413))))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel120)
                .addGap(70, 70, 70)
                .addComponent(jComboBox42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jComboBox43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jComboBox44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButton28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try{
            jComboBox42.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox42.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox43.addItem("--");
        jComboBox44.addItem("--");

        jTabbedPane3.addTab("Reservation", jPanel31);

        jLabel124.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("DELETE EVENT");

        jComboBox45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox45.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox45.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox45PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox46.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox46.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox46PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox47.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Event Start Date - Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox47.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox47PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton29.setText("Delete");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jScrollPane10.setViewportView(jTextArea5);

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel32Layout.createSequentialGroup()
                            .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(285, 285, 285)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addComponent(jButton29)
                        .addGap(501, 501, 501))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(401, 401, 401))))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel124)
                .addGap(55, 55, 55)
                .addComponent(jComboBox45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jComboBox46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jComboBox47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(jButton29)
                .addGap(97, 97, 97))
        );

        try{
            jComboBox45.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox45.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox46.addItem("--");
        jComboBox47.addItem("--");

        jTabbedPane3.addTab("Event", jPanel32);

        jLabel129.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("DELETE DESTINATION FROM TRIP");

        jComboBox48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox48.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox48.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox48PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox49.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Trip", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox49.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox49PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox50.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton30.setText("Delete");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(344, 344, 344))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jButton30)
                        .addGap(527, 527, 527))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(389, 389, 389))))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel129)
                .addGap(54, 54, 54)
                .addComponent(jComboBox48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jComboBox49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jComboBox50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton30)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        try{
            jComboBox48.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox48.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}
        jComboBox49.addItem("--");
        jComboBox50.addItem("--");

        jTabbedPane3.addTab("Destination From Trip", jPanel33);

        jLabel133.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("DELETE OFFER");

        jComboBox51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox51.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton31.setText("Delete");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap(457, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                        .addComponent(jButton31)
                        .addGap(518, 518, 518))))
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel133)
                .addGap(79, 79, 79)
                .addComponent(jComboBox51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(jButton31)
                .addContainerGap(416, Short.MAX_VALUE))
        );

        try{
            jComboBox51.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers WHERE NOW() <= offer_end_date;");
            while(rs.next())
            jComboBox51.addItem("Offer id: " + rs.getString(1));
        }catch(Exception e){}

        jTabbedPane3.addTab("Offer", jPanel34);

        jLabel135.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("DELETE RESERVATION OF AN OFFER");

        jComboBox52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox52.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Offer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N
        jComboBox52.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox52PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jComboBox53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox53.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Client Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton32.setText("Delete");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addComponent(jButton32)
                        .addGap(500, 500, 500))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(362, 362, 362))))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel135)
                .addGap(70, 70, 70)
                .addComponent(jComboBox52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(jComboBox53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton32)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        try{
            jComboBox52.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers WHERE NOW() <= offer_end_date;");
            while(rs.next())
            jComboBox52.addItem("Offer id: " + rs.getString(1));
        }catch(Exception e){}
        jComboBox53.addItem("--");

        jTabbedPane3.addTab("Reservation For Offer", jPanel35);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane3.getAccessibleContext().setAccessibleName("Delete Data");

        jTabbedPane1.addTab("Delete Data", jPanel4);

        jLabel91.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel91.setText("Display information for all the trips of a branch between start date and end date:");

        jComboBox26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Start Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jTextField40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField40.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "End Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton15.setText("Display");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Trip Id", "Trip Cost", "Max Seats", "Reservations", "Free Seats", "Departure Date", "Return Date", "Driver", "Guide"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable1);
        jTable1.setVisible(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(285, 285, 285))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButton15)
                        .addGap(525, 525, 525))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel91)
                .addGap(30, 30, 30)
                .addComponent(jComboBox26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        try{
            jComboBox26.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox26.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane1.addTab("Trips Information", jPanel6);

        jLabel97.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel97.setText("Fill in the following field to display all the reservations of offers with this last name:");

        jTextField41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField41.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton19.setText("Display");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jTable5.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Offer id", "Number Of Clients With This Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(jTable5);

        jLabel99.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel99.setText("If the last field is empty it means that there is only one client with this name");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(379, 379, 379)
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel97)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addGap(578, 578, 578))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel97)
                .addGap(40, 40, 40)
                .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton19)
                .addGap(27, 27, 27)
                .addComponent(jLabel99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search Clients in Offers", jPanel7);

        jTable2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Adress", "Manager", "Reservations", "Total Income"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable2);

        jButton16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton16.setText("Refresh Table");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(507, 507, 507))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane1.addTab("Branch Information", jPanel8);

        jLabel95.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel95.setText("Select a branch to display its employees' information:");

        jComboBox27.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Branch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 2, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        jButton17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton17.setText("Display");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jTable3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "AT", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(371, 371, 371))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jButton17)
                        .addGap(547, 547, 547))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel95)
                .addGap(36, 36, 36)
                .addComponent(jComboBox27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton17)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        try{
            jComboBox27.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT br_code,br_street,br_num,br_city FROM branch;");
            while(rs.next())
            jComboBox27.addItem(rs.getString(2) + " " + rs.getString(3) + ", " + rs.getString(4) + " (code: " + rs.getString(1) + ")");
        }catch(Exception e){}

        jTabbedPane1.addTab("Employees Information", jPanel9);

        jButton18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton18.setText("Refresh Table");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jTable4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table", "Action", "Date - Time", "IT Manager"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addGap(500, 500, 500))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jButton18)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Actions Performed", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().equals("") || (Integer)jSpinner1.getValue() == 0 || jTextField2.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String query = "INSERT INTO branch VALUES(NULL, ?, ?, ?);";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField1.getText());
                db.ps.setInt(2, (Integer)jSpinner1.getValue());
                db.ps.setString(3, jTextField2.getText());
                db.ps.executeUpdate();
                
                ResultSet rs = db.st.executeQuery("SELECT br_code FROM branch ORDER BY br_code DESC LIMIT 1");
                rs.next();
                int branch_code = rs.getInt("br_code");
                addBranchComboBoxes(jTextField1.getText() + " " + (Integer)jSpinner1.getValue() + ", " + jTextField2.getText() + " (code: " + branch_code + ")");
                
                JOptionPane.showMessageDialog(null, "The branch was inserted successfully", "Successful Insertion", 1);
                jTextField1.setText("");
                jTextField2.setText("");
                jSpinner1.setValue(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextField3.getText().equals("") || jComboBox1.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox1.getSelectedItem().toString().substring(jComboBox1.getSelectedItem().toString().indexOf(':') + 2, jComboBox1.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO phones VALUES(?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, branch_code);
                db.ps.setString(2, jTextField3.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The phone number was inserted successfully", "Successful Insertion", 1);
                
                jTextField3.setText("");
                jComboBox1.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        if(jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jComboBox2.getSelectedItem().toString().equals("--") || jComboBox3.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String procedure = "{CALL insertDriver(?, ?, ?, ?, ?, ?, ?)}";
                db.cs = db.conn.prepareCall(procedure);
                db.cs.setString(1, jTextField7.getText());
                db.cs.setString(2, jTextField4.getText());
                db.cs.setString(3, jTextField5.getText());
                db.cs.setFloat(4, Float.parseFloat(jTextField6.getText()));
                db.cs.setString(5, jComboBox2.getSelectedItem().toString());
                db.cs.setString(6, jComboBox3.getSelectedItem().toString());
                db.cs.setFloat(7, (Integer)jSpinner2.getValue());
                db.cs.execute();
                
                JOptionPane.showMessageDialog(null, "The driver was inserted successfully", "Successful Insertion", 1);
                
                jTextField4.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jComboBox2.setSelectedIndex(0);
                jComboBox3.setSelectedIndex(0);
                jSpinner2.setValue(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        if(jTextField8.getText().equals("") || jTextField9.getText().equals("") || jTextField10.getText().equals("") || jTextField11.getText().equals("") || jTextArea1.getText().equals("") || jComboBox5.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox5.getSelectedItem().toString().substring(jComboBox5.getSelectedItem().toString().indexOf(':') + 2, jComboBox5.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO worker VALUES(?, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField10.getText());
                db.ps.setString(2, jTextField8.getText());
                db.ps.setString(3, jTextField9.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField11.getText()));
                db.ps.setInt(5, branch_code);
                db.ps.executeUpdate();
                
                query = "INSERT INTO guide VALUES(?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField10.getText());
                db.ps.setString(2, jTextArea1.getText());
                db.ps.executeUpdate();
                
                addGuideComboBoxes(jTextField8.getText().toString() + " " + jTextField9.getText().toString() + "(AT: " + jTextField10.getText().toString() + ")");
                
                JOptionPane.showMessageDialog(null, "The guide was inserted successfully", "Successful Insertion", 1);
                
                jTextField8.setText("");
                jTextField9.setText("");
                jTextField10.setText("");
                jTextField11.setText("");
                jTextArea1.setText("");
                jComboBox5.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if(jTextField12.getText().equals("") || jComboBox6.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String AT = jComboBox6.getSelectedItem().toString().substring(jComboBox6.getSelectedItem().toString().indexOf(':') + 2, jComboBox6.getSelectedItem().toString().indexOf(')'));
                
                String query = "INSERT INTO languages VALUES(?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, AT);
                db.ps.setString(2, jTextField12.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The language for the guide was inserted successfully", "Successful Insertion", 1);
                
                jTextField12.setText("");
                jComboBox6.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jTextField14.getText().equals("") || jTextField15.getText().equals("") || jTextField16.getText().equals("") || jTextField17.getText().equals("") || jTextArea2.getText().equals("") || jComboBox7.getSelectedItem().toString().equals("--") || jComboBox8.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox8.getSelectedItem().toString().substring(jComboBox8.getSelectedItem().toString().indexOf(':') + 2, jComboBox8.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO worker VALUES(?, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField16.getText());
                db.ps.setString(2, jTextField14.getText());
                db.ps.setString(3, jTextField15.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField17.getText()));
                db.ps.setInt(5, branch_code);
                db.ps.executeUpdate();
                
                query = "INSERT INTO admin VALUES(?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField16.getText());
                db.ps.setString(2, jComboBox7.getSelectedItem().toString());
                db.ps.setString(3, jTextArea2.getText());
                db.ps.executeUpdate();
                
                query = "INSERT INTO manages VALUES(?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField16.getText());
                db.ps.setInt(2, branch_code);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The admin was inserted successfully", "Successful Insertion", 1);
                
                jTextField14.setText("");
                jTextField15.setText("");
                jTextField16.setText("");
                jTextField17.setText("");
                jTextArea2.setText("");
                jComboBox7.setSelectedIndex(0);
                jComboBox8.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
                                              

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        if(jTextField18.getText().equals("") || jTextField19.getText().equals("") || jTextArea3.getText().equals("") || jComboBox9.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                
                int location_id = 0;
                if(!jComboBox10.getSelectedItem().toString().equals("--"))
                    location_id = Integer.parseInt(jComboBox10.getSelectedItem().toString().substring(jComboBox10.getSelectedItem().toString().indexOf(':') + 2, jComboBox10.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO destination VALUES(?, ?, ?, ?, ?, ?)";
                
                db.ps = db.conn.prepareStatement(query);
                db.ps.setNull(1, Types.INTEGER);
                db.ps.setString(2, jTextField18.getText());
                db.ps.setString(3, jTextArea3.getText());
                db.ps.setString(4, jComboBox9.getSelectedItem().toString());
                db.ps.setString(5, jTextField19.getText());
                
                if(jComboBox10.getSelectedItem().toString().equals("--"))
                    db.ps.setNull(6, Types.INTEGER);
                else
                    db.ps.setInt(6, location_id);
                
                db.ps.executeUpdate();
                
                ResultSet rs = db.st.executeQuery("SELECT dst_id FROM destination ORDER BY dst_id DESC LIMIT 1");
                rs.next();
                int destination_id = rs.getInt("dst_id");
                addDestinationComboBoxes(jTextField18.getText() + "(id: " + destination_id + ")");
                
                JOptionPane.showMessageDialog(null, "The destination was inserted successfully", "Successful Insertion", 1);
                jTextField18.setText("");
                jTextField19.setText("");
                jTextArea3.setText("");
                jComboBox9.setSelectedIndex(0);
                jComboBox10.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jComboBox14PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox14PopupMenuWillBecomeInvisible
        
        if(!jComboBox14.getSelectedItem().toString().equals("--")){
            jComboBox15.removeAllItems();
            try{
                int branch_code = Integer.parseInt(jComboBox14.getSelectedItem().toString().substring(jComboBox14.getSelectedItem().toString().indexOf(':') + 2, jComboBox14.getSelectedItem().toString().indexOf(')')));
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code + ";");
                jComboBox15.removeAllItems();
                jComboBox15.addItem("--");
                while(rs.next())
                    jComboBox15.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox15.removeAllItems();
            jComboBox15.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox14PopupMenuWillBecomeInvisible

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       
        if(jTextField23.getText().equals("") || jTextField24.getText().equals("") || jComboBox14.getSelectedItem().toString().equals("--") || jComboBox15.getSelectedItem().toString().equals("--") || jComboBox16.getSelectedItem().toString().equals("--") || jComboBox17.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox15.getSelectedItem().toString().substring(jComboBox15.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "INSERT INTO reservation VALUES(?, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.setInt(2, Integer.parseInt(jComboBox17.getSelectedItem().toString()));
                db.ps.setString(3, jTextField23.getText());
                db.ps.setString(4, jTextField24.getText());
                db.ps.setString(5, jComboBox16.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation was inserted successfully", "Successful Insertion", 1);
                
                jTextField23.setText("");
                jTextField24.setText("");
                jComboBox14.setSelectedIndex(0);
                jComboBox15.removeAllItems();
                jComboBox15.addItem("--");
                jComboBox16.setSelectedIndex(0);
                jComboBox17.removeAllItems();
                jComboBox17.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox15PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox15PopupMenuWillBecomeInvisible
        
        if(!jComboBox15.getSelectedItem().toString().equals("--")){
            try{
                
                jComboBox17.removeAllItems();
                jComboBox17.addItem("--");
                int branch_code = Integer.parseInt(jComboBox14.getSelectedItem().toString().substring(jComboBox14.getSelectedItem().toString().indexOf(':') + 2, jComboBox14.getSelectedItem().toString().indexOf(')')));
                int trip_id = Integer.parseInt(jComboBox15.getSelectedItem().toString().substring(jComboBox15.getSelectedItem().toString().indexOf(':') + 2));
                ResultSet rs = db.st.executeQuery("SELECT res_seatnum "
                                                + "FROM branch "
                                                + "JOIN trip ON branch.br_code = trip.tr_br_code AND br_code = " + branch_code + " AND tr_id = " + trip_id + " "
                                                + "JOIN reservation ON trip.tr_id = reservation.res_tr_id;");

                ArrayList<Integer> closed_seats = new ArrayList<Integer>();
                while(rs.next())
                    closed_seats.add(Integer.parseInt(rs.getString(1)));

                rs = db.st.executeQuery("SELECT tr_maxseats FROM trip WHERE tr_id = " + trip_id + ";");
                rs.next();
                int maxseats = Integer.parseInt(rs.getString(1));
                for(int i = 1; i <= maxseats; i++){
                    if(closed_seats.contains(i) == false)
                        jComboBox17.addItem(String.valueOf(i));
                }

            }catch(Exception e){}
        }else{
            jComboBox17.removeAllItems();
            jComboBox17.addItem("--");
        }
    }//GEN-LAST:event_jComboBox15PopupMenuWillBecomeInvisible

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        if(jTextField25.getText().equals("") || jTextField26.getText().equals("") || jTextArea4.getText().equals("") || jComboBox18.getSelectedItem().toString().equals("--") || jComboBox19.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox19.getSelectedItem().toString().substring(jComboBox19.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "INSERT INTO event VALUES(?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.setString(2, jTextField25.getText());
                db.ps.setString(3, jTextField26.getText());
                db.ps.setString(4, jTextArea4.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The event was inserted successfully", "Successful Insertion", 1);
                
                jTextField25.setText("");
                jTextField26.setText("");
                jTextArea4.setText("");
                jComboBox18.setSelectedIndex(0);
                jComboBox19.removeAllItems();
                jComboBox19.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox18PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox18PopupMenuWillBecomeInvisible

        if(!jComboBox18.getSelectedItem().toString().equals("--")){
            jComboBox19.removeAllItems();
            try{
                jComboBox19.addItem("--");
                int branch_code = Integer.parseInt(jComboBox18.getSelectedItem().toString().substring(jComboBox18.getSelectedItem().toString().indexOf(':') + 2, jComboBox18.getSelectedItem().toString().indexOf(')')));
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox19.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox19.removeAllItems();
            jComboBox19.addItem("--");
        }
    }//GEN-LAST:event_jComboBox18PopupMenuWillBecomeInvisible

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
       
        if(jTextField29.getText().equals("") || jTextField30.getText().equals("") || jTextField31.getText().equals("") || jComboBox23.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int destination_id = Integer.parseInt(jComboBox23.getSelectedItem().toString().substring(jComboBox23.getSelectedItem().toString().indexOf(':') + 2, jComboBox23.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO offers VALUES(NULL, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField29.getText());
                db.ps.setString(2, jTextField30.getText());
                db.ps.setFloat(3, Float.parseFloat(jTextField31.getText()));
                db.ps.setInt(4, destination_id);
                db.ps.executeUpdate();
                
                ResultSet rs = db.st.executeQuery("SELECT offer_id FROM offers ORDER BY offer_id DESC LIMIT 1");
                rs.next();
                addOfferComboBoxes("Offer id: " + rs.getString(1));
                
                JOptionPane.showMessageDialog(null, "The offer was inserted successfully", "Successful Insertion", 1);
                
                jTextField29.setText("");
                jTextField30.setText("");
                jTextField31.setText("");
                jComboBox23.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        if(jTextField32.getText().equals("") || jTextField33.getText().equals("") || jTextField34.getText().equals("") || jComboBox24.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int offer_id = Integer.parseInt(jComboBox24.getSelectedItem().toString().substring(jComboBox24.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "INSERT INTO reservation_offers VALUES(NULL, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField32.getText());
                db.ps.setString(2, jTextField33.getText());
                db.ps.setInt(3, offer_id);
                db.ps.setFloat(4, Float.parseFloat(jTextField34.getText()));
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation for the offer was inserted successfully", "Successful Insertion", 1);
                
                jTextField32.setText("");
                jTextField33.setText("");
                jTextField34.setText("");
                jComboBox24.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        
        if(jTextField35.getText().equals("") || jTextField36.getText().equals("") || jTextField37.getText().equals("") || jTextField38.getText().equals("") || jTextField39.getText().equals("") || jComboBox25.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox25.getSelectedItem().toString().substring(jComboBox25.getSelectedItem().toString().indexOf(':') + 2, jComboBox25.getSelectedItem().toString().indexOf(')')));
                
                String query = "INSERT INTO worker VALUES(?, ?, ?, ?, ?)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField37.getText());
                db.ps.setString(2, jTextField35.getText());
                db.ps.setString(3, jTextField36.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField38.getText()));
                db.ps.setInt(5, branch_code);
                db.ps.executeUpdate();
                
                query = "INSERT INTO IT_manager VALUES(?, ?, ?, NULL)";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField37.getText());
                
                if(jPasswordField1.getText().equals(""))
                    db.ps.setString(2, "password");
                else
                    db.ps.setString(2, jPasswordField1.getText());
                    
                db.ps.setString(3, jTextField39.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation for the offer was inserted successfully", "Successful Insertion", 1);
                
                jTextField35.setText("");
                jTextField36.setText("");
                jTextField37.setText("");
                jTextField38.setText("");
                jTextField39.setText("");
                jPasswordField1.setText("");
                jComboBox25.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        if(jComboBox26.getSelectedItem().toString().equals("--") || jTextField13.getText().equals("") || jTextField40.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try{
                int branch_code = Integer.parseInt(jComboBox26.getSelectedItem().toString().substring(jComboBox26.getSelectedItem().toString().indexOf(':') + 2, jComboBox26.getSelectedItem().toString().indexOf(')')));

                String procedure = "{CALL tripsInfo(?, ?, ?)}";
                db.cs = db.conn.prepareCall(procedure);
                db.cs.setInt(1, branch_code);
                db.cs.setString(2, jTextField13.getText());
                db.cs.setString(3, jTextField40.getText());
                ResultSet rs = db.cs.executeQuery();

                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0);
                while(rs.next())
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8) + " " + rs.getString(9), rs.getString(10) + " " + rs.getString(11)});

                jTable1.setVisible(true);
            }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        
        try{
            ResultSet rs;
            String query = "SELECT br_code, CONCAT(br_street, ' ' ,br_num, ', ', br_city), CONCAT(wrk_name, ' ', wrk_lname), COUNT(res_tr_id), IF(COUNT(res_tr_id) = 0, 0, SUM(tr_cost)) "
                         + "FROM branch "
                         + "LEFT JOIN manages ON branch.br_code = manages.mng_br_code "
                         + "LEFT JOIN `admin` ON manages.mng_adm_at = `admin`.adm_AT AND `admin`.adm_type = 'MANAGER' "
                         + "LEFT JOIN worker ON `admin`.adm_AT = worker.wrk_AT "
                         + "LEFT JOIN trip ON branch.br_code = trip.tr_br_code "
                         + "LEFT JOIN reservation ON trip.tr_id = reservation.res_tr_id "
                         + "GROUP BY br_code;"; 
            
            rs = db.st.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            model.setRowCount(0);
            while(rs.next())
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        
        if(jComboBox27.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "You have to choose a branch", "Empty fields", 0);
        }else{
            try{
                int branch_code = Integer.parseInt(jComboBox27.getSelectedItem().toString().substring(jComboBox27.getSelectedItem().toString().indexOf(':') + 2, jComboBox27.getSelectedItem().toString().indexOf(')')));

                ResultSet rs;
                String query = "SELECT IF(wrk_AT IS NULL, NULL, CONCAT(wrk_name, ' ', wrk_lname)), wrk_AT, SUM(wrk_salary) "
                             + "FROM worker JOIN branch "
                             + "ON worker.wrk_br_code = branch.br_code "
                             + "WHERE wrk_br_code = " + branch_code + " "
                             + "GROUP BY wrk_AT WITH ROLLUP;";

                rs = db.st.executeQuery(query);

                DefaultTableModel model = (DefaultTableModel)jTable3.getModel();
                model.setRowCount(0);
                while(rs.next())
                    model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});

            }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        
        try{
            ResultSet rs;
            String query = "SELECT * FROM log ORDER BY log_date_time DESC";
            
            rs = db.st.executeQuery(query);
            
            DefaultTableModel model = (DefaultTableModel)jTable4.getModel();
            model.setRowCount(0);
            while(rs.next())
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            
        }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        
        if(jTextField41.getText().equals("")){
            JOptionPane.showMessageDialog(null, "You have to type in a name", "Empty fields", 0);
        }else{
            try{
                String procedure = "{CALL reservationOffersWithLastName(?)}";
                db.cs = db.conn.prepareCall(procedure);
                db.cs.setString(1, jTextField41.getText());
                ResultSet rs = db.cs.executeQuery();

                DefaultTableModel model = (DefaultTableModel)jTable5.getModel();
                model.setRowCount(0);
                while(rs.next())
                    model.addRow(new Object[]{rs.getString(1) + " " + rs.getString(2), rs.getString(3), rs.getString(4)});

                jTable5.setVisible(true);
            }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        
        if(jComboBox28.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "You have to choose a branch", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox28.getSelectedItem().toString().substring(jComboBox28.getSelectedItem().toString().indexOf(':') + 2, jComboBox28.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM branch WHERE br_code = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, branch_code);
                db.ps.executeUpdate();
                
                deleteBranchComboBoxes(jComboBox28.getSelectedIndex());
                
                JOptionPane.showMessageDialog(null, "The branch was deleted successfully", "Successful Deletion", 1);
                
                jComboBox28.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        
        if(jComboBox29.getSelectedItem().toString().equals("--") || jComboBox30.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox29.getSelectedItem().toString().substring(jComboBox29.getSelectedItem().toString().indexOf(':') + 2, jComboBox29.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM phones WHERE ph_br_code = ? AND ph_number = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, branch_code);
                db.ps.setString(2, jComboBox30.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The phone number was deleted successfully", "Successful Deletion", 1);
                
                jComboBox29.setSelectedIndex(0);
                jComboBox30.removeAllItems();
                jComboBox30.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jComboBox29PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox29PopupMenuWillBecomeInvisible
        
        if(!jComboBox29.getSelectedItem().toString().equals("--")){
            try{
                jComboBox30.removeAllItems();
                int branch_code = Integer.parseInt(jComboBox29.getSelectedItem().toString().substring(jComboBox29.getSelectedItem().toString().indexOf(':') + 2, jComboBox29.getSelectedItem().toString().indexOf(')')));
                jComboBox30.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT ph_number FROM phones WHERE ph_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox30.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox30.removeAllItems();
            jComboBox30.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox29PopupMenuWillBecomeInvisible

    private void jComboBox31PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox31PopupMenuWillBecomeInvisible
        
        if(!jComboBox31.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox31.getSelectedItem().toString().substring(jComboBox31.getSelectedItem().toString().indexOf(':') + 2, jComboBox31.getSelectedItem().toString().indexOf(')')));
                jComboBox32.removeAllItems();
                jComboBox32.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM driver JOIN worker ON driver.drv_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox32.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox32.removeAllItems();
            jComboBox32.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox31PopupMenuWillBecomeInvisible

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        
        if(jComboBox31.getSelectedItem().toString().equals("--") || jComboBox32.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String AT = jComboBox32.getSelectedItem().toString().substring(jComboBox32.getSelectedItem().toString().indexOf(':') + 2, jComboBox32.getSelectedItem().toString().indexOf(')'));
                
                String query = "DELETE FROM worker WHERE wrk_AT = ?;";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, AT);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The driver was deleted successfully", "Successful Deletion", 1);
                
                jComboBox31.setSelectedIndex(0);
                jComboBox32.removeAllItems();
                jComboBox32.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jComboBox33PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox33PopupMenuWillBecomeInvisible
        
        if(!jComboBox33.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox33.getSelectedItem().toString().substring(jComboBox33.getSelectedItem().toString().indexOf(':') + 2, jComboBox33.getSelectedItem().toString().indexOf(')')));
                jComboBox34.removeAllItems();
                jComboBox34.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM guide JOIN worker ON guide.gui_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox34.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox34.removeAllItems();
            jComboBox34.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox33PopupMenuWillBecomeInvisible

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        
        if(jComboBox33.getSelectedItem().toString().equals("--") || jComboBox34.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String AT = jComboBox34.getSelectedItem().toString().substring(jComboBox34.getSelectedItem().toString().indexOf(':') + 2, jComboBox34.getSelectedItem().toString().indexOf(')'));
                
                String query = "DELETE FROM worker WHERE wrk_AT = ?;";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, AT);
                db.ps.executeUpdate();
                
                deleteGuideComboBoxes(jComboBox34.getSelectedIndex());
                
                JOptionPane.showMessageDialog(null, "The guide was deleted successfully", "Successful Deletion", 1);
                
                jComboBox33.setSelectedIndex(0);
                jComboBox34.removeAllItems();
                jComboBox34.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        if(jComboBox35.getSelectedItem().toString().equals("--") || jComboBox36.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String AT = jComboBox35.getSelectedItem().toString().substring(jComboBox35.getSelectedItem().toString().indexOf(':') + 2, jComboBox35.getSelectedItem().toString().indexOf(')'));
                
                String query = "DELETE FROM languages WHERE lng_gui_AT = ? AND lng_language = ?;";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, AT);
                db.ps.setString(2, jComboBox36.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The language was deleted successfully", "Successful Deletion", 1);
                
                jComboBox35.setSelectedIndex(0);
                jComboBox36.removeAllItems();
                jComboBox36.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jComboBox35PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox35PopupMenuWillBecomeInvisible
        
        if(!jComboBox35.getSelectedItem().toString().equals("--")){
            try{
                String AT = jComboBox35.getSelectedItem().toString().substring(jComboBox35.getSelectedItem().toString().indexOf(':') + 2, jComboBox35.getSelectedItem().toString().indexOf(')'));
                jComboBox36.removeAllItems();
                jComboBox36.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT lng_language FROM languages WHERE lng_gui_AT = " + AT);
                while(rs.next())
                    jComboBox36.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox36.removeAllItems();
            jComboBox36.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox35PopupMenuWillBecomeInvisible

    private void jComboBox37PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox37PopupMenuWillBecomeInvisible
        
        if(!jComboBox37.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox37.getSelectedItem().toString().substring(jComboBox37.getSelectedItem().toString().indexOf(':') + 2, jComboBox37.getSelectedItem().toString().indexOf(')')));
                jComboBox38.removeAllItems();
                jComboBox38.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM admin JOIN worker ON admin.adm_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox38.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox38.removeAllItems();
            jComboBox38.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox37PopupMenuWillBecomeInvisible

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        
        if(jComboBox37.getSelectedItem().toString().equals("--") || jComboBox38.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int first_space_index = jComboBox38.getSelectedItem().toString().indexOf(' ');
                int first_bracket_index = jComboBox38.getSelectedItem().toString().indexOf('(');
                String first_name = jComboBox38.getSelectedItem().toString().substring(0, first_space_index);
                String last_name = jComboBox38.getSelectedItem().toString().substring(first_space_index + 1, first_bracket_index);
                
                String procedure = "{CALL removeAdmin(?, ?)}";
                db.cs = db.conn.prepareCall(procedure);
                db.cs.setString(1, first_name);
                db.cs.setString(2, last_name);
                db.cs.execute();
                
                JOptionPane.showMessageDialog(null, "The admin was deleted successfully", "Successful Deletion", 1);
                
                jComboBox37.setSelectedIndex(0);
                jComboBox38.removeAllItems();
                jComboBox38.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        
        if(jComboBox39.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "You have to choose a destination", "Empty fields", 0);
        }else{
            try {
                int destination_id = Integer.parseInt(jComboBox39.getSelectedItem().toString().substring(jComboBox39.getSelectedItem().toString().indexOf(':') + 2, jComboBox39.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM destination WHERE dst_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, destination_id);
                db.ps.executeUpdate();
                
                deleteDestinationComboBoxes(jComboBox39.getSelectedIndex());
                JOptionPane.showMessageDialog(null, "The destination was deleted successfully", "Successful Deletion", 1);
                
                jComboBox39.setSelectedIndex(0);
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jComboBox40PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox40PopupMenuWillBecomeInvisible
        
        if(!jComboBox40.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox40.getSelectedItem().toString().substring(jComboBox40.getSelectedItem().toString().indexOf(':') + 2, jComboBox40.getSelectedItem().toString().indexOf(')')));
                jComboBox41.removeAllItems();
                jComboBox41.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox41.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox41.removeAllItems();
            jComboBox41.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox40PopupMenuWillBecomeInvisible

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        
        if(jComboBox40.getSelectedItem().toString().equals("--") || jComboBox41.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox41.getSelectedItem().toString().substring(jComboBox41.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "DELETE FROM trip WHERE tr_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The trip was deleted successfully", "Successful Deletion", 1);
                
                jComboBox40.setSelectedIndex(0);
                jComboBox41.removeAllItems();
                jComboBox41.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jComboBox42PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox42PopupMenuWillBecomeInvisible
        
        if(!jComboBox42.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox42.getSelectedItem().toString().substring(jComboBox42.getSelectedItem().toString().indexOf(':') + 2, jComboBox42.getSelectedItem().toString().indexOf(')')));
                jComboBox43.removeAllItems();
                jComboBox43.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox43.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox43.removeAllItems();
            jComboBox43.addItem("--");
            jComboBox44.removeAllItems();
            jComboBox44.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox42PopupMenuWillBecomeInvisible

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        
        if(jComboBox42.getSelectedItem().toString().equals("--") || jComboBox43.getSelectedItem().toString().equals("--") || jComboBox43.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox43.getSelectedItem().toString().substring(jComboBox43.getSelectedItem().toString().indexOf(':') + 2));
                int seat_number = Integer.parseInt(jComboBox44.getSelectedItem().toString().substring(jComboBox44.getSelectedItem().toString().indexOf(':') + 2, jComboBox44.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM reservation WHERE res_tr_id = ? AND res_seatnum = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.setInt(2, seat_number);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation was deleted successfully", "Successful Deletion", 1);
                
                jComboBox42.setSelectedIndex(0);
                jComboBox43.removeAllItems();
                jComboBox43.addItem("--");
                jComboBox44.removeAllItems();
                jComboBox44.addItem("--");
            } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jComboBox43PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox43PopupMenuWillBecomeInvisible
        
        if(!jComboBox43.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox43.getSelectedItem().toString().substring(jComboBox43.getSelectedItem().toString().indexOf(':') + 2));
                jComboBox44.removeAllItems();
                jComboBox44.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT res_name,res_lname,res_seatnum FROM reservation WHERE res_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox44.addItem(rs.getString(1) + " " + rs.getString(2) + " (seat: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox44.removeAllItems();
            jComboBox44.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox43PopupMenuWillBecomeInvisible

    private void jComboBox45PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox45PopupMenuWillBecomeInvisible
        
        if(!jComboBox45.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox45.getSelectedItem().toString().substring(jComboBox45.getSelectedItem().toString().indexOf(':') + 2, jComboBox45.getSelectedItem().toString().indexOf(')')));
                
                jComboBox46.removeAllItems();
                jComboBox46.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox46.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox46.removeAllItems();
            jComboBox46.addItem("--");
            jComboBox47.removeAllItems();
            jComboBox47.addItem("--");
            jTextArea5.setText("");
        }
        
    }//GEN-LAST:event_jComboBox45PopupMenuWillBecomeInvisible

    private void jComboBox46PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox46PopupMenuWillBecomeInvisible
        
        if(!jComboBox46.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox46.getSelectedItem().toString().substring(jComboBox46.getSelectedItem().toString().indexOf(':') + 2));
                jComboBox47.removeAllItems();
                jComboBox47.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT ev_start FROM event WHERE ev_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox47.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox47.removeAllItems();
            jComboBox47.addItem("--");
            jTextArea5.setText("");
        }
        
    }//GEN-LAST:event_jComboBox46PopupMenuWillBecomeInvisible

    private void jComboBox47PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox47PopupMenuWillBecomeInvisible
        
        if(!jComboBox47.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox46.getSelectedItem().toString().substring(jComboBox46.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT ev_descr FROM event WHERE ev_tr_id = " + trip_id + " AND ev_start = '" + jComboBox47.getSelectedItem().toString() + "';");
                rs.next();
                jTextArea5.setText(rs.getString(1));
            }catch(Exception e){}
        }else{
            jTextArea5.setText("");
        }
        
    }//GEN-LAST:event_jComboBox47PopupMenuWillBecomeInvisible

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        
        if(jComboBox45.getSelectedItem().toString().equals("--") || jComboBox46.getSelectedItem().toString().equals("--") || jComboBox47.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox46.getSelectedItem().toString().substring(jComboBox46.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "DELETE FROM event WHERE ev_tr_id = ? AND ev_start = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.setString(2, jComboBox47.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The event was deleted successfully", "Successful Deletion", 1);
                
                jComboBox45.setSelectedIndex(0);
                jComboBox46.removeAllItems();
                jComboBox46.addItem("--");
                jComboBox47.removeAllItems();
                jComboBox47.addItem("--");
                jTextArea5.setText("");
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jComboBox48PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox48PopupMenuWillBecomeInvisible
        
        if(!jComboBox48.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox48.getSelectedItem().toString().substring(jComboBox48.getSelectedItem().toString().indexOf(':') + 2, jComboBox48.getSelectedItem().toString().indexOf(')')));
                
                jComboBox49.removeAllItems();
                jComboBox49.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox49.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox49.removeAllItems();
            jComboBox49.addItem("--");
            jComboBox50.removeAllItems();
            jComboBox50.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox48PopupMenuWillBecomeInvisible

    private void jComboBox49PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox49PopupMenuWillBecomeInvisible
        
        if(!jComboBox49.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox49.getSelectedItem().toString().substring(jComboBox49.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM travel_to JOIN destination ON travel_to.to_dst_id = destination.dst_id WHERE to_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox50.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
            }catch(Exception e){}
        }else{
            jComboBox50.removeAllItems();
            jComboBox50.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox49PopupMenuWillBecomeInvisible

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        
        if(jComboBox48.getSelectedItem().toString().equals("--") || jComboBox49.getSelectedItem().toString().equals("--") || jComboBox50.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox49.getSelectedItem().toString().substring(jComboBox49.getSelectedItem().toString().indexOf(':') + 2));
                int destination_id = Integer.parseInt(jComboBox50.getSelectedItem().toString().substring(jComboBox50.getSelectedItem().toString().indexOf(':') + 2, jComboBox50.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM travel_to WHERE to_tr_id = ? AND to_dst_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, trip_id);
                db.ps.setInt(2, destination_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The destination was removed from the trip successfully", "Successful Deletion", 1);
                
                jComboBox48.setSelectedIndex(0);
                jComboBox49.removeAllItems();
                jComboBox49.addItem("--");
                jComboBox50.removeAllItems();
                jComboBox50.addItem("--");
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed

        if(jComboBox51.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "You have to choose an offer", "Empty fields", 0);
        }else{
            try {
                int offer_id = Integer.parseInt(jComboBox51.getSelectedItem().toString().substring(jComboBox51.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "DELETE FROM offers WHERE offer_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, offer_id);
                db.ps.executeUpdate();
                
                deleteOfferComboBoxes(jComboBox51.getSelectedIndex());
                
                JOptionPane.showMessageDialog(null, "The offer was deleted successfully", "Successful Deletion", 1);
                
                jComboBox51.setSelectedIndex(0);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jComboBox52PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox52PopupMenuWillBecomeInvisible
        
        if(!jComboBox52.getSelectedItem().toString().equals("--")){
            try{
                int offer_id = Integer.parseInt(jComboBox52.getSelectedItem().toString().substring(jComboBox52.getSelectedItem().toString().indexOf(':') + 2));
                
                jComboBox53.removeAllItems();
                jComboBox53.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT res_name,res_lname,res_id FROM reservation_offers WHERE res_offer_id = " + offer_id);
                while(rs.next())
                    jComboBox53.addItem(rs.getString(1) + " " + rs.getString(2) + "(reservation id: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox53.removeAllItems();
            jComboBox53.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox52PopupMenuWillBecomeInvisible

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        
        if(jComboBox52.getSelectedItem().toString().equals("--") || jComboBox53.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int offer_id = Integer.parseInt(jComboBox52.getSelectedItem().toString().substring(jComboBox52.getSelectedItem().toString().indexOf(':') + 2));
                int reservation_id = Integer.parseInt(jComboBox53.getSelectedItem().toString().substring(jComboBox53.getSelectedItem().toString().indexOf(':') + 2, jComboBox53.getSelectedItem().toString().indexOf(')')));
                
                String query = "DELETE FROM reservation_offers WHERE res_id = ? AND res_offer_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, reservation_id);
                db.ps.setInt(2, offer_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation for the offer was deleted successfully", "Successful Deletion", 1);
                
                jComboBox52.setSelectedIndex(0);
                jComboBox53.removeAllItems();
                jComboBox53.addItem("--");
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jComboBox54PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox54PopupMenuWillBecomeInvisible
        
        if(!jComboBox54.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox54.getSelectedItem().toString().substring(jComboBox54.getSelectedItem().toString().indexOf(':') + 2, jComboBox54.getSelectedItem().toString().indexOf(')')));
                
                ResultSet rs = db.st.executeQuery("SELECT br_street,br_num,br_city FROM branch WHERE br_code = " + branch_code);
                
                rs.next();
                jTextField42.setText(rs.getString(1));
                jTextField42.setEditable(true);
                jSpinner4.setValue(rs.getInt("br_num"));
                jSpinner4.setEnabled(true);
                jTextField43.setText(rs.getString(3));
                jTextField43.setEditable(true);
            }catch(Exception e){}
        }else{
            jTextField42.setText("");
            jTextField42.setEditable(false);
            jTextField43.setText("");
            jTextField43.setEditable(false);
            jSpinner4.setValue(0);
            jSpinner4.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox54PopupMenuWillBecomeInvisible

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        
        if(jComboBox54.getSelectedItem().toString().equals("--") || jTextField42.getText().equals("") || jTextField43.getText().equals("") || (Integer)jSpinner4.getValue() == 0){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox54.getSelectedItem().toString().substring(jComboBox54.getSelectedItem().toString().indexOf(':') + 2, jComboBox54.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE branch SET br_street = ?, br_num = ?, br_city = ? WHERE br_code = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField42.getText());
                db.ps.setInt(2, (Integer)jSpinner4.getValue());
                db.ps.setString(3, jTextField43.getText());
                db.ps.setInt(4, branch_code);
                db.ps.executeUpdate();
                
                String content = jTextField42.getText() + " " + (Integer)jSpinner4.getValue() + ", " + jTextField43.getText() + " (code: " + branch_code + ")";
                modifyBranchComboBoxes(jComboBox54.getSelectedIndex(), content);
                
                JOptionPane.showMessageDialog(null, "The branch was updated successfully", "Successful Modification", 1);
                
                jComboBox54.setSelectedIndex(0);
                jTextField42.setText("");
                jTextField42.setEditable(false);
                jTextField43.setText("");
                jTextField43.setEditable(false);
                jSpinner4.setValue(0);
                jSpinner4.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jComboBox55PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox55PopupMenuWillBecomeInvisible
        
        if(!jComboBox55.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox55.getSelectedItem().toString().substring(jComboBox55.getSelectedItem().toString().indexOf(':') + 2, jComboBox55.getSelectedItem().toString().indexOf(')')));
                jComboBox56.removeAllItems();
                jComboBox56.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT ph_number FROM phones WHERE ph_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox56.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox56.removeAllItems();
            jComboBox56.addItem("--");
            jTextField44.setText("");
            jTextField44.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox55PopupMenuWillBecomeInvisible

    private void jComboBox56PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox56PopupMenuWillBecomeInvisible
        
        if(!jComboBox56.getSelectedItem().toString().equals("--"))
            jTextField44.setEditable(true);
        else
            jTextField44.setText("");
            jTextField44.setEditable(true);
            
        
    }//GEN-LAST:event_jComboBox56PopupMenuWillBecomeInvisible

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        
        if(jComboBox55.getSelectedItem().toString().equals("--") || jComboBox56.getSelectedItem().toString().equals("--") || jTextField44.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox55.getSelectedItem().toString().substring(jComboBox55.getSelectedItem().toString().indexOf(':') + 2, jComboBox55.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE phones SET ph_number = ? WHERE ph_br_code = ? AND ph_number = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField44.getText());
                db.ps.setInt(2, branch_code);
                db.ps.setString(3, jComboBox56.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The phone number was updated successfully", "Successful Modification", 1);
                
                jComboBox55.setSelectedIndex(0);
                jComboBox56.removeAllItems();
                jComboBox56.addItem("--");
                jTextField44.setText("");
                jTextField44.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jComboBox57PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox57PopupMenuWillBecomeInvisible
        
        if(!jComboBox57.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox57.getSelectedItem().toString().substring(jComboBox57.getSelectedItem().toString().indexOf(':') + 2, jComboBox57.getSelectedItem().toString().indexOf(')')));
                
                jComboBox58.removeAllItems();
                jComboBox58.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN driver ON worker.wrk_AT = driver.drv_AT WHERE wrk_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox58.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox58.removeAllItems();
            jComboBox58.addItem("--");
            jTextField45.setText("");
            jTextField45.setEditable(false);
            jTextField46.setText("");
            jTextField46.setEditable(false);
            jTextField47.setText("");
            jTextField47.setEditable(false);
            jTextField48.setText("");
            jTextField48.setEditable(false);
            jSpinner5.setValue(0);
            jSpinner5.setEnabled(false);
            jComboBox59.setSelectedIndex(0);
            jComboBox59.setEnabled(false);
            jComboBox60.setSelectedIndex(0);
            jComboBox60.setEnabled(false);
            jComboBox61.setSelectedIndex(0);
            jComboBox61.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox57PopupMenuWillBecomeInvisible

    private void jComboBox58PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox58PopupMenuWillBecomeInvisible
        
        if(!jComboBox58.getSelectedItem().toString().equals("--")){
            try{
                String AT = jComboBox58.getSelectedItem().toString().substring(jComboBox58.getSelectedItem().toString().indexOf(':') + 2, jComboBox58.getSelectedItem().toString().indexOf(')'));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM worker JOIN driver ON worker.wrk_AT = driver.drv_AT WHERE wrk_AT = '" + AT + "';");
                
                rs.next();
                jTextField45.setText(rs.getString("wrk_name"));
                jTextField45.setEditable(true);
                jTextField46.setText(rs.getString("wrk_lname"));
                jTextField46.setEditable(true);
                jTextField47.setText(rs.getString("wrk_AT"));
                jTextField47.setEditable(true);
                jComboBox59.setSelectedItem(rs.getString("drv_license"));
                jComboBox59.setEnabled(true);
                jComboBox60.setSelectedItem(rs.getString("drv_route"));
                jComboBox60.setEnabled(true);
                jSpinner5.setValue(rs.getInt("drv_experience"));
                jSpinner5.setEnabled(true);
                jTextField48.setText(rs.getString("wrk_salary"));
                jTextField48.setEditable(true);
                jComboBox61.setSelectedItem(jComboBox57.getSelectedItem());
                jComboBox61.setEnabled(true);
            }catch(Exception e){}
        }else{
            jTextField45.setText("");
            jTextField45.setEditable(false);
            jTextField46.setText("");
            jTextField46.setEditable(false);
            jTextField47.setText("");
            jTextField47.setEditable(false);
            jTextField48.setText("");
            jSpinner5.setValue(0);
            jSpinner5.setEnabled(false);
            jTextField48.setEditable(false);
            jComboBox59.setSelectedIndex(0);
            jComboBox59.setEnabled(false);
            jComboBox60.setSelectedIndex(0);
            jComboBox60.setEnabled(false);
            jComboBox61.setSelectedIndex(0);
            jComboBox61.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox58PopupMenuWillBecomeInvisible

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        
        if(jComboBox57.getSelectedItem().toString().equals("--") || jComboBox58.getSelectedItem().toString().equals("--") || jComboBox59.getSelectedItem().toString().equals("--") || jComboBox60.getSelectedItem().toString().equals("--") 
           || jComboBox61.getSelectedItem().toString().equals("--") || jTextField45.getText().equals("") || jTextField46.getText().equals("") || jTextField47.getText().equals("") || jTextField48.getText().equals("") || (Integer)jSpinner5.getValue() == 0){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String old_AT = jComboBox58.getSelectedItem().toString().substring(jComboBox58.getSelectedItem().toString().indexOf(':') + 2, jComboBox58.getSelectedItem().toString().indexOf(')'));
                int new_branch_code = Integer.parseInt(jComboBox61.getSelectedItem().toString().substring(jComboBox61.getSelectedItem().toString().indexOf(':') + 2, jComboBox61.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE worker SET wrk_AT = ?, wrk_name = ?, wrk_lname = ?, wrk_salary = ?, wrk_br_code = ? WHERE wrk_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField47.getText());
                db.ps.setString(2, jTextField45.getText());
                db.ps.setString(3, jTextField46.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField48.getText()));
                db.ps.setInt(5, new_branch_code);
                db.ps.setString(6, old_AT);
                db.ps.executeUpdate();
                
                query = "UPDATE driver SET drv_license = ?, drv_route = ?, drv_experience = ? WHERE drv_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jComboBox59.getSelectedItem().toString());
                db.ps.setString(2, jComboBox60.getSelectedItem().toString());
                db.ps.setInt(3, (Integer)jSpinner5.getValue());
                db.ps.setString(4, jTextField47.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The driver's data were updated successfully", "Successful Modification", 1);
                
                jComboBox57.setSelectedItem(jComboBox57.getItemAt(0));
                jComboBox58.removeAllItems();
                jComboBox58.addItem("--");
                jTextField45.setText("");
                jTextField45.setEditable(false);
                jTextField46.setText("");
                jTextField46.setEditable(false);
                jTextField47.setText("");
                jTextField47.setEditable(false);
                jTextField48.setText("");
                jTextField48.setEditable(false);
                jSpinner5.setValue(0);
                jSpinner5.setEnabled(false);
                jComboBox59.setSelectedIndex(0);
                jComboBox59.setEnabled(false);
                jComboBox60.setSelectedIndex(0);
                jComboBox60.setEnabled(false);
                jComboBox61.setSelectedIndex(0);
                jComboBox61.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jComboBox62PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox62PopupMenuWillBecomeInvisible
        
        if(!jComboBox62.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox62.getSelectedItem().toString().substring(jComboBox62.getSelectedItem().toString().indexOf(':') + 2, jComboBox62.getSelectedItem().toString().indexOf(')')));
                
                jComboBox63.removeAllItems();
                jComboBox63.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN guide ON worker.wrk_AT = guide.gui_AT WHERE wrk_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox63.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox63.removeAllItems();
            jComboBox63.addItem("--");
            jTextField49.setText("");
            jTextField49.setEditable(false);
            jTextField50.setText("");
            jTextField50.setEditable(false);
            jTextField51.setText("");
            jTextField51.setEditable(false);
            jTextField52.setText("");
            jTextField52.setEditable(false);
            jTextArea6.setText("");
            jTextArea6.setEditable(false);
            jComboBox64.setSelectedIndex(0);
            jComboBox64.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox62PopupMenuWillBecomeInvisible

    private void jComboBox63PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox63PopupMenuWillBecomeInvisible
        
        if(!jComboBox63.getSelectedItem().toString().equals("--")){
            try{
                String AT = jComboBox63.getSelectedItem().toString().substring(jComboBox63.getSelectedItem().toString().indexOf(':') + 2, jComboBox63.getSelectedItem().toString().indexOf(')'));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM worker JOIN guide ON worker.wrk_AT = guide.gui_AT WHERE wrk_AT = '" + AT + "';");
                
                rs.next();
                jTextField49.setText(rs.getString("wrk_name"));
                jTextField49.setEditable(true);
                jTextField50.setText(rs.getString("wrk_lname"));
                jTextField50.setEditable(true);
                jTextField51.setText(rs.getString("wrk_AT"));
                jTextField51.setEditable(true);
                jTextArea6.setText(rs.getString("gui_cv"));
                jTextArea6.setEditable(true);
                jTextField52.setText(rs.getString("wrk_salary"));
                jTextField52.setEditable(true);
                jComboBox64.setSelectedItem(jComboBox62.getSelectedItem());
                jComboBox64.setEnabled(true);
            }catch(Exception e){}
        }else{
            jTextField49.setText("");
            jTextField49.setEditable(false);
            jTextField50.setText("");
            jTextField50.setEditable(false);
            jTextField51.setText("");
            jTextField51.setEditable(false);
            jTextField52.setText("");
            jTextField52.setEditable(false);
            jTextArea6.setText("");
            jTextArea6.setEditable(false);
            jComboBox64.setSelectedIndex(0);
            jComboBox64.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox63PopupMenuWillBecomeInvisible

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        
        if(jComboBox62.getSelectedItem().toString().equals("--") || jComboBox63.getSelectedItem().toString().equals("--") || jComboBox64.getSelectedItem().toString().equals("--") 
           || jTextField49.getText().equals("") || jTextField50.getText().equals("") || jTextField51.getText().equals("") || jTextField52.getText().equals("") || jTextArea6.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String old_AT = jComboBox63.getSelectedItem().toString().substring(jComboBox63.getSelectedItem().toString().indexOf(':') + 2, jComboBox63.getSelectedItem().toString().indexOf(')'));
                int new_branch_code = Integer.parseInt(jComboBox64.getSelectedItem().toString().substring(jComboBox64.getSelectedItem().toString().indexOf(':') + 2, jComboBox64.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE worker SET wrk_AT = ?, wrk_name = ?, wrk_lname = ?, wrk_salary = ?, wrk_br_code = ? WHERE wrk_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField51.getText());
                db.ps.setString(2, jTextField49.getText());
                db.ps.setString(3, jTextField50.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField52.getText()));
                db.ps.setInt(5, new_branch_code);
                db.ps.setString(6, old_AT);
                db.ps.executeUpdate();
                
                query = "UPDATE guide SET gui_cv = ? WHERE gui_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextArea6.getText());
                db.ps.setString(2, jTextField51.getText());
                db.ps.executeUpdate();
                
                modifyGuideComboBoxes(jComboBox63.getSelectedIndex(), jTextField49.getText() + " " + jTextField50.getText() + "(AT: " + jTextField51.getText() + ")");
                
                JOptionPane.showMessageDialog(null, "The guide's data were updated successfully", "Successful Modification", 1);
                
                jComboBox62.setSelectedItem(jComboBox62.getItemAt(0));
                jComboBox63.removeAllItems();
                jComboBox63.addItem("--");
                jTextField49.setText("");
                jTextField49.setEditable(false);
                jTextField50.setText("");
                jTextField50.setEditable(false);
                jTextField51.setText("");
                jTextField51.setEditable(false);
                jTextField52.setText("");
                jTextField52.setEditable(false);
                jTextArea6.setText("");
                jTextArea6.setEditable(false);
                jComboBox64.setSelectedIndex(0);
                jComboBox64.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jComboBox65PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox65PopupMenuWillBecomeInvisible
        
        if(!jComboBox65.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox65.getSelectedItem().toString().substring(jComboBox65.getSelectedItem().toString().indexOf(':') + 2, jComboBox65.getSelectedItem().toString().indexOf(')')));
                
                jComboBox66.removeAllItems();
                jComboBox66.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN admin ON worker.wrk_AT = admin.adm_AT WHERE wrk_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox66.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox66.removeAllItems();
            jComboBox66.addItem("--");
            jTextField53.setText("");
            jTextField53.setEditable(false);
            jTextField54.setText("");
            jTextField54.setEditable(false);
            jTextField55.setText("");
            jTextField55.setEditable(false);
            jTextField56.setText("");
            jTextField56.setEditable(false);
            jTextArea7.setText("");
            jTextArea7.setEditable(false);
            jComboBox67.setSelectedIndex(0);
            jComboBox67.setEnabled(false);
            jComboBox68.setSelectedIndex(0);
            jComboBox68.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox65PopupMenuWillBecomeInvisible

    private void jComboBox66PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox66PopupMenuWillBecomeInvisible
        
        if(!jComboBox66.getSelectedItem().toString().equals("--")){
            try{
                String AT = jComboBox66.getSelectedItem().toString().substring(jComboBox66.getSelectedItem().toString().indexOf(':') + 2, jComboBox66.getSelectedItem().toString().indexOf(')'));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM worker JOIN admin ON worker.wrk_AT = admin.adm_AT WHERE wrk_AT = '" + AT + "';");
                
                rs.next();
                jTextField53.setText(rs.getString("wrk_name"));
                jTextField53.setEditable(true);
                jTextField54.setText(rs.getString("wrk_lname"));
                jTextField54.setEditable(true);
                jTextField55.setText(rs.getString("wrk_AT"));
                jTextField55.setEditable(true);
                jComboBox67.setSelectedItem(rs.getString("adm_type"));
                jComboBox67.setEnabled(true);
                jTextArea7.setText(rs.getString("adm_diploma"));
                jTextArea7.setEditable(true);
                jTextField56.setText(rs.getString("wrk_salary"));
                jTextField56.setEditable(true);
                jComboBox68.setSelectedItem(jComboBox65.getSelectedItem());
                jComboBox68.setEnabled(true);
            }catch(Exception e){}
        }else{
            jTextField53.setText("");
            jTextField53.setEditable(false);
            jTextField54.setText("");
            jTextField54.setEditable(false);
            jTextField55.setText("");
            jTextField55.setEditable(false);
            jTextField56.setText("");
            jTextField56.setEditable(false);
            jTextArea7.setText("");
            jTextArea7.setEditable(false);
            jComboBox67.setSelectedIndex(0);
            jComboBox67.setEnabled(false);
            jComboBox68.setSelectedIndex(0);
            jComboBox68.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox66PopupMenuWillBecomeInvisible

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        
        if(jComboBox65.getSelectedItem().toString().equals("--") || jComboBox66.getSelectedItem().toString().equals("--") || jComboBox67.getSelectedItem().toString().equals("--") || jComboBox68.getSelectedItem().toString().equals("--")
           || jTextField53.getText().equals("") || jTextField54.getText().equals("") || jTextField55.getText().equals("") || jTextField56.getText().equals("") || jTextArea7.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String old_AT = jComboBox66.getSelectedItem().toString().substring(jComboBox66.getSelectedItem().toString().indexOf(':') + 2, jComboBox66.getSelectedItem().toString().indexOf(')'));
                int new_branch_code = Integer.parseInt(jComboBox68.getSelectedItem().toString().substring(jComboBox68.getSelectedItem().toString().indexOf(':') + 2, jComboBox68.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE worker SET wrk_AT = ?, wrk_name = ?, wrk_lname = ?, wrk_salary = ?, wrk_br_code = ? WHERE wrk_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField55.getText());
                db.ps.setString(2, jTextField53.getText());
                db.ps.setString(3, jTextField54.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField56.getText()));
                db.ps.setInt(5, new_branch_code);
                db.ps.setString(6, old_AT);
                db.ps.executeUpdate();
                
                query = "UPDATE admin SET adm_type = ?, adm_diploma = ? WHERE adm_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jComboBox67.getSelectedItem().toString());
                db.ps.setString(2, jTextArea7.getText());
                db.ps.setString(3, jTextField55.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The admin's data were updated successfully", "Successful Modification", 1);
                
                jComboBox65.setSelectedItem(jComboBox65.getItemAt(0));
                jComboBox66.removeAllItems();
                jComboBox66.addItem("--");
                jTextField53.setText("");
                jTextField53.setEditable(false);
                jTextField54.setText("");
                jTextField54.setEditable(false);
                jTextField55.setText("");
                jTextField55.setEditable(false);
                jTextField56.setText("");
                jTextField56.setEditable(false);
                jTextArea7.setText("");
                jTextArea7.setEditable(false);
                jComboBox67.setSelectedIndex(0);
                jComboBox67.setEnabled(false);
                jComboBox68.setSelectedIndex(0);
                jComboBox68.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jComboBox69PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox69PopupMenuWillBecomeInvisible
        
        if(!jComboBox69.getSelectedItem().toString().equals("--")){
            try{
                String AT = jComboBox69.getSelectedItem().toString().substring(jComboBox69.getSelectedItem().toString().indexOf(':') + 2, jComboBox69.getSelectedItem().toString().indexOf(')'));
                
                jComboBox70.removeAllItems();
                jComboBox70.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT lng_language FROM languages WHERE lng_gui_AT = '" + AT + "';");
                while(rs.next())
                    jComboBox70.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox70.removeAllItems();
            jComboBox70.addItem("--");
            jTextField57.setText("");
            jTextField57.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox69PopupMenuWillBecomeInvisible

    private void jComboBox70PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox70PopupMenuWillBecomeInvisible
        
        if(!jComboBox70.getSelectedItem().toString().equals("--")){
            try{
                jTextField57.setEditable(true);
            }catch(Exception e){}
        }else{
            jTextField57.setText("");
            jTextField57.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox70PopupMenuWillBecomeInvisible

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        
        if(jComboBox69.getSelectedItem().toString().equals("--") || jComboBox70.getSelectedItem().toString().equals("--") || jTextField57.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                String AT = jComboBox69.getSelectedItem().toString().substring(jComboBox69.getSelectedItem().toString().indexOf(':') + 2, jComboBox69.getSelectedItem().toString().indexOf(')'));
                
                String query = "UPDATE languages SET lng_language = ? WHERE lng_gui_AT = ? AND lng_language = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField57.getText());
                db.ps.setString(2, AT);
                db.ps.setString(3, jComboBox70.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The guide's language was updated successfully", "Successful Modification", 1);
                
                jComboBox69.setSelectedIndex(0);
                jComboBox70.removeAllItems();
                jComboBox70.addItem("--");
                jTextField57.setText("");
                jTextField57.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jComboBox71PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox71PopupMenuWillBecomeInvisible
        
        if(!jComboBox71.getSelectedItem().toString().equals("--")){
            try{
                int destination_id = Integer.parseInt(jComboBox71.getSelectedItem().toString().substring(jComboBox71.getSelectedItem().toString().indexOf(':') + 2, jComboBox71.getSelectedItem().toString().indexOf(')')));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM destination WHERE dst_id = " + destination_id + ";");
                
                rs.next();
                jTextField58.setText(rs.getString("dst_name"));
                jTextField58.setEditable(true);
                jTextArea8.setText(rs.getString("dst_descr"));
                jTextArea8.setEditable(true);
                jComboBox72.setSelectedItem(rs.getString("dst_rtype"));
                jComboBox72.setEnabled(true);
                jTextField59.setText(rs.getString("dst_name"));
                jTextField59.setEditable(true);
                
                boolean found = false;
                String pattern = ".*id: " + rs.getInt("dst_location") + ".*";
                for(int i=0; i<jComboBox73.getItemCount(); i++){
                    if(jComboBox73.getItemAt(i).toString().matches(pattern)){
                        jComboBox73.setSelectedIndex(i);
                        found = true;
                        break;
                    }
                }
                
                if(!found)
                    jComboBox73.setSelectedIndex(0);
                
                jComboBox73.setEnabled(true);
            }catch(Exception e){}
        }else{
            jTextField58.setText("");
            jTextField58.setEditable(false);
            jTextArea8.setText("");
            jTextArea8.setEditable(false);
            jComboBox72.setSelectedIndex(0);
            jComboBox72.setEnabled(false);
            jTextField59.setText("");
            jTextField59.setEditable(false);
            jComboBox73.setSelectedIndex(0);
            jComboBox73.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox71PopupMenuWillBecomeInvisible

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        
        if(jComboBox71.getSelectedItem().toString().equals("--") || jComboBox72.getSelectedItem().toString().equals("--") || jTextField58.getText().equals("") || jTextField59.getText().equals("") || jTextArea8.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int destination_id = Integer.parseInt(jComboBox71.getSelectedItem().toString().substring(jComboBox71.getSelectedItem().toString().indexOf(':') + 2, jComboBox71.getSelectedItem().toString().indexOf(')')));
                int location_id = 0;
                
                if(!jComboBox73.getSelectedItem().toString().equals("--"))
                    location_id = Integer.parseInt(jComboBox73.getSelectedItem().toString().substring(jComboBox73.getSelectedItem().toString().indexOf(':') + 2, jComboBox73.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE destination SET dst_name = ?, dst_descr = ?, dst_rtype = ?, dst_language = ?, dst_location = ? WHERE dst_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField58.getText());
                db.ps.setString(2, jTextArea8.getText());
                db.ps.setString(3, jComboBox72.getSelectedItem().toString());
                db.ps.setString(4, jTextField59.getText());
                
                if(jComboBox73.getSelectedItem().toString().equals("--"))
                    db.ps.setNull(5, Types.INTEGER);
                else
                    db.ps.setInt(5, location_id);
                
                db.ps.setInt(6, destination_id);
                db.ps.executeUpdate();
                
                modifyDestinationComboBoxes(jComboBox71.getSelectedIndex(), jTextField58.getText() + "(id: " + destination_id + ")");
                
                JOptionPane.showMessageDialog(null, "The destination was updated successfully", "Successful Modification", 1);
                
                jComboBox71.setSelectedIndex(0);
                jTextField58.setText("");
                jTextField58.setEditable(false);
                jTextArea8.setText("");
                jTextArea8.setEditable(false);
                jComboBox72.setSelectedIndex(0);
                jComboBox72.setEnabled(false);
                jTextField59.setText("");
                jTextField59.setEditable(false);
                jComboBox73.setSelectedIndex(0);
                jComboBox73.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jComboBox75PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox75PopupMenuWillBecomeInvisible
        
        if(!jComboBox75.getSelectedItem().toString().equals("--")){
            try{
                jComboBox74.removeAllItems();
                jComboBox74.addItem("--");
                int branch_code = Integer.parseInt(jComboBox75.getSelectedItem().toString().substring(jComboBox75.getSelectedItem().toString().indexOf(':') + 2, jComboBox75.getSelectedItem().toString().indexOf(')')));
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox74.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox74.removeAllItems();
            jComboBox74.addItem("--");
            jTextField60.setText("");
            jTextField60.setEditable(false);
            jTextField61.setText("");
            jTextField61.setEditable(false);
            jSpinner6.setValue(0);
            jSpinner6.setEnabled(false);
            jTextField62.setText("");
            jTextField62.setEditable(false);
            jComboBox76.setSelectedIndex(0);
            jComboBox76.setEnabled(false);
            jComboBox77.removeAllItems();
            jComboBox77.addItem("--");
            jComboBox78.removeAllItems();
            jComboBox78.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox75PopupMenuWillBecomeInvisible

    private void jComboBox74PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox74PopupMenuWillBecomeInvisible
        
        if(!jComboBox74.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox74.getSelectedItem().toString().substring(jComboBox74.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM trip WHERE tr_id = " + trip_id + ";");
                
                rs.next();
                jTextField60.setText(rs.getString("tr_departure"));
                jTextField60.setEditable(true);
                jTextField61.setText(rs.getString("tr_return"));
                jTextField61.setEditable(true);
                jSpinner6.setValue(rs.getInt("tr_maxseats"));
                jSpinner6.setEnabled(true);
                jTextField62.setText(rs.getString("tr_cost"));
                jTextField62.setEditable(true);
                jComboBox76.setSelectedItem(jComboBox75.getSelectedItem());
                jComboBox76.setEnabled(true);
                
                int branch_code = Integer.parseInt(jComboBox76.getSelectedItem().toString().substring(jComboBox76.getSelectedItem().toString().indexOf(':') + 2, jComboBox76.getSelectedItem().toString().indexOf(')')));
                jComboBox77.removeAllItems();
                jComboBox77.addItem("--");
                rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM guide JOIN worker ON guide.gui_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox77.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
                
                jComboBox78.removeAllItems();
                jComboBox78.addItem("--");
                rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM driver JOIN worker ON driver.drv_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox78.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
                
                
                rs = db.st.executeQuery("SELECT tr_gui_AT, tr_drv_AT FROM trip WHERE tr_id = " + trip_id);
                rs.next();
                String pattern = ".*AT: " + rs.getString("tr_gui_AT") + ".*";
                for(int i=0; i<jComboBox77.getItemCount(); i++){
                    if(jComboBox77.getItemAt(i).toString().matches(pattern)){
                        jComboBox77.setSelectedIndex(i);
                        break;
                    }
                }
                jComboBox77.setEnabled(true);
                
                pattern = ".*AT: " + rs.getString("tr_drv_AT") + ".*";
                for(int i=0; i<jComboBox78.getItemCount(); i++){
                    if(jComboBox78.getItemAt(i).toString().matches(pattern)){
                        jComboBox78.setSelectedIndex(i);
                        break;
                    }
                }
                jComboBox78.setEnabled(true);
                
            }catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Empty fields", 0);}
        }else{
            jTextField60.setText("");
            jTextField60.setEditable(false);
            jTextField61.setText("");
            jTextField61.setEditable(false);
            jSpinner6.setValue(0);
            jSpinner6.setEnabled(false);
            jTextField62.setText("");
            jTextField62.setEditable(false);
            jComboBox76.setSelectedIndex(0);
            jComboBox76.setEnabled(false);
            jComboBox77.removeAllItems();
            jComboBox77.addItem("--");
            jComboBox78.removeAllItems();
            jComboBox78.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox74PopupMenuWillBecomeInvisible

    private void jComboBox76PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox76PopupMenuWillBecomeInvisible
        
        if(!jComboBox76.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox74.getSelectedItem().toString().substring(jComboBox74.getSelectedItem().toString().indexOf(':') + 2));
                int branch_code = Integer.parseInt(jComboBox76.getSelectedItem().toString().substring(jComboBox76.getSelectedItem().toString().indexOf(':') + 2, jComboBox76.getSelectedItem().toString().indexOf(')')));
                
                jComboBox77.removeAllItems();
                jComboBox77.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM guide JOIN worker ON guide.gui_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox77.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
                
                jComboBox78.removeAllItems();
                jComboBox78.addItem("--");
                rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM driver JOIN worker ON driver.drv_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
                while(rs.next())
                    jComboBox78.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
                
                
                rs = db.st.executeQuery("SELECT tr_gui_AT, tr_drv_AT FROM trip WHERE tr_id = " + trip_id);
                rs.next();
                String pattern = ".*AT: " + rs.getString("tr_gui_AT") + ".*";
                for(int i=0; i<jComboBox77.getItemCount(); i++){
                    if(jComboBox77.getItemAt(i).toString().matches(pattern)){
                        jComboBox77.setSelectedIndex(i);
                        break;
                    }
                }
                jComboBox77.setEnabled(true);
                
                pattern = ".*AT: " + rs.getString("tr_drv_AT") + ".*";
                for(int i=0; i<jComboBox78.getItemCount(); i++){
                    if(jComboBox78.getItemAt(i).toString().matches(pattern)){
                        jComboBox78.setSelectedIndex(i);
                        break;
                    }
                }
                jComboBox78.setEnabled(true);
                
            }catch(Exception e){}
        }else{
            jComboBox77.removeAllItems();
            jComboBox77.addItem("--");
            jComboBox78.removeAllItems();
            jComboBox78.addItem("--");
        }
        
    }//GEN-LAST:event_jComboBox76PopupMenuWillBecomeInvisible

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        
        if(jComboBox74.getSelectedItem().toString().equals("--") || jComboBox75.getSelectedItem().toString().equals("--") || jComboBox76.getSelectedItem().toString().equals("--") || jComboBox77.getSelectedItem().toString().equals("--") 
           || jTextField60.getText().equals("") || jTextField61.getText().equals("") || jTextField62.getText().equals("") || (Integer)jSpinner6.getValue() == 0){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox74.getSelectedItem().toString().substring(jComboBox74.getSelectedItem().toString().indexOf(':') + 2));
                int branch_code = Integer.parseInt(jComboBox76.getSelectedItem().toString().substring(jComboBox76.getSelectedItem().toString().indexOf(':') + 2, jComboBox76.getSelectedItem().toString().indexOf(')')));
                String guide_AT = jComboBox77.getSelectedItem().toString().substring(jComboBox77.getSelectedItem().toString().indexOf(':') + 2, jComboBox77.getSelectedItem().toString().indexOf(')'));
                String driver_AT = jComboBox78.getSelectedItem().toString().substring(jComboBox78.getSelectedItem().toString().indexOf(':') + 2, jComboBox78.getSelectedItem().toString().indexOf(')'));
                
                String query = "UPDATE trip SET tr_departure = ?, tr_return = ?, tr_maxseats = ?, tr_cost = ?, tr_br_code = ?, tr_gui_AT = ?, tr_drv_AT = ? WHERE tr_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField60.getText());
                db.ps.setString(2, jTextField61.getText());
                db.ps.setInt(3, (Integer)jSpinner6.getValue());
                db.ps.setFloat(4, Float.parseFloat(jTextField62.getText()));
                db.ps.setInt(5, branch_code);
                db.ps.setString(6, guide_AT);
                db.ps.setString(7, driver_AT);
                db.ps.setInt(8, trip_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The destination was updated successfully", "Successful Modification", 1);
                
                jComboBox74.removeAllItems();
                jComboBox74.addItem("--");
                jTextField60.setText("");
                jTextField60.setEditable(false);
                jTextField61.setText("");
                jTextField61.setEditable(false);
                jSpinner6.setValue(0);
                jSpinner6.setEnabled(false);
                jTextField62.setText("");
                jTextField62.setEditable(false);
                jComboBox76.setSelectedIndex(0);
                jComboBox76.setEnabled(false);
                jComboBox77.removeAllItems();
                jComboBox77.addItem("--");
                jComboBox78.removeAllItems();
                jComboBox78.addItem("--");
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jComboBox79PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox79PopupMenuWillBecomeInvisible
        
        if(!jComboBox79.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox79.getSelectedItem().toString().substring(jComboBox79.getSelectedItem().toString().indexOf(':') + 2, jComboBox79.getSelectedItem().toString().indexOf(')')));
                jComboBox80.removeAllItems();
                jComboBox80.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox80.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox80.removeAllItems();
            jComboBox80.addItem("--");
            jComboBox81.removeAllItems();
            jComboBox81.addItem("--");
            jTextField63.setText("");
            jTextField63.setEditable(false);
            jTextField64.setText("");
            jTextField64.setEditable(false);
            jComboBox82.setSelectedIndex(0);
            jComboBox82.setEnabled(false);
            jComboBox83.removeAllItems();
            jComboBox83.addItem("--");
            jComboBox83.setSelectedIndex(0);
            jComboBox83.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox79PopupMenuWillBecomeInvisible

    private void jComboBox80PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox80PopupMenuWillBecomeInvisible
        
        if(!jComboBox80.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox80.getSelectedItem().toString().substring(jComboBox80.getSelectedItem().toString().indexOf(':') + 2));
                jComboBox81.removeAllItems();
                jComboBox81.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT res_name,res_lname,res_seatnum FROM reservation WHERE res_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox81.addItem(rs.getString(1) + " " + rs.getString(2) + " (seat: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox81.removeAllItems();
            jComboBox81.addItem("--");
            jTextField63.setText("");
            jTextField63.setEditable(false);
            jTextField64.setText("");
            jTextField64.setEditable(false);
            jComboBox82.setSelectedIndex(0);
            jComboBox82.setEnabled(false);
            jComboBox83.removeAllItems();
            jComboBox83.addItem("--");
            jComboBox83.setSelectedIndex(0);
            jComboBox83.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox80PopupMenuWillBecomeInvisible

    private void jComboBox81PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox81PopupMenuWillBecomeInvisible
        
        if(!jComboBox81.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox80.getSelectedItem().toString().substring(jComboBox80.getSelectedItem().toString().indexOf(':') + 2));
                int seat_number = Integer.parseInt(jComboBox81.getSelectedItem().toString().substring(jComboBox81.getSelectedItem().toString().indexOf(':') + 2, jComboBox81.getSelectedItem().toString().indexOf(')')));
                int branch_code = Integer.parseInt(jComboBox79.getSelectedItem().toString().substring(jComboBox79.getSelectedItem().toString().indexOf(':') + 2, jComboBox79.getSelectedItem().toString().indexOf(')')));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM reservation WHERE res_tr_id = " + trip_id + " AND res_seatnum = " + seat_number);
                
                rs.next();
                jTextField63.setText(rs.getString("res_name"));
                jTextField63.setEnabled(true);
                jTextField64.setText(rs.getString("res_lname"));
                jTextField64.setEnabled(true);
                jComboBox82.setSelectedItem(rs.getString("res_isadult"));
                jComboBox82.setEnabled(true);
                
                jComboBox83.removeAllItems();
                jComboBox83.addItem("--");
                rs = db.st.executeQuery("SELECT res_seatnum "
                                      + "FROM branch "
                                      + "JOIN trip ON branch.br_code = trip.tr_br_code AND br_code = " + branch_code + " AND tr_id = " + trip_id + " "
                                      + "JOIN reservation ON trip.tr_id = reservation.res_tr_id;");

                ArrayList<Integer> closed_seats = new ArrayList<Integer>();
                while(rs.next())
                    if(rs.getInt("res_seatnum") != seat_number)
                        closed_seats.add(Integer.parseInt(rs.getString(1)));

                rs = db.st.executeQuery("SELECT tr_maxseats FROM trip WHERE tr_id = " + trip_id + ";");
                rs.next();
                int maxseats = Integer.parseInt(rs.getString(1));
                for(int i = 1; i <= maxseats; i++){
                    if(closed_seats.contains(i) == false)
                        jComboBox83.addItem(String.valueOf(i));
                }
                
                jComboBox83.setSelectedItem(String.valueOf(seat_number));
                jComboBox83.setEnabled(true);
                
            }catch(Exception e){}
        }else{
            jTextField63.setText("");
            jTextField63.setEditable(false);
            jTextField64.setText("");
            jTextField64.setEditable(false);
            jComboBox82.setSelectedIndex(0);
            jComboBox82.setEnabled(false);
            jComboBox83.setSelectedIndex(0);
            jComboBox83.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox81PopupMenuWillBecomeInvisible

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        
        if(jComboBox79.getSelectedItem().toString().equals("--") || jComboBox80.getSelectedItem().toString().equals("--") || jComboBox81.getSelectedItem().toString().equals("--") || jComboBox82.getSelectedItem().toString().equals("--") 
           || jComboBox83.getSelectedItem().toString().equals("--") || jTextField63.getText().equals("") || jTextField64.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox80.getSelectedItem().toString().substring(jComboBox80.getSelectedItem().toString().indexOf(':') + 2));
                int seat_number = Integer.parseInt(jComboBox81.getSelectedItem().toString().substring(jComboBox81.getSelectedItem().toString().indexOf(':') + 2, jComboBox81.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE reservation SET res_seatnum = ?, res_name = ?, res_lname = ?, res_isadult = ? WHERE res_tr_id = ? AND res_seatnum = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, Integer.parseInt(jComboBox83.getSelectedItem().toString()));
                db.ps.setString(2, jTextField63.getText());
                db.ps.setString(3, jTextField64.getText());
                db.ps.setString(4, jComboBox82.getSelectedItem().toString());
                db.ps.setInt(5, trip_id);
                db.ps.setInt(6, seat_number);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation was updated successfully", "Successful Modification", 1);
                
                jComboBox79.setSelectedIndex(0);
                jComboBox80.removeAllItems();
                jComboBox80.addItem("--");
                jComboBox81.removeAllItems();
                jComboBox81.addItem("--");
                jTextField63.setText("");
                jTextField63.setEditable(false);
                jTextField64.setText("");
                jTextField64.setEditable(false);
                jComboBox82.setSelectedIndex(0);
                jComboBox82.setEnabled(false);
                jComboBox83.removeAllItems();
                jComboBox83.addItem("--");
                jComboBox83.setSelectedIndex(0);
                jComboBox83.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jComboBox84PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox84PopupMenuWillBecomeInvisible
        
        if(!jComboBox84.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox84.getSelectedItem().toString().substring(jComboBox84.getSelectedItem().toString().indexOf(':') + 2, jComboBox84.getSelectedItem().toString().indexOf(')')));
                jComboBox85.removeAllItems();
                jComboBox85.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox85.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox85.removeAllItems();
            jComboBox85.addItem("--");
            jComboBox86.removeAllItems();
            jComboBox86.addItem("--");
            jTextField65.setText("");
            jTextField65.setEditable(false);
            jTextField66.setText("");
            jTextField66.setEditable(false);
            jTextArea9.setText("");
            jTextArea9.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox84PopupMenuWillBecomeInvisible

    private void jComboBox85PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox85PopupMenuWillBecomeInvisible
        
        if(!jComboBox85.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox85.getSelectedItem().toString().substring(jComboBox85.getSelectedItem().toString().indexOf(':') + 2));
                jComboBox86.removeAllItems();
                jComboBox86.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT ev_start FROM event WHERE ev_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox86.addItem(rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox86.removeAllItems();
            jComboBox86.addItem("--");
            jTextField65.setText("");
            jTextField65.setEditable(false);
            jTextField66.setText("");
            jTextField66.setEditable(false);
            jTextArea9.setText("");
            jTextArea9.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox85PopupMenuWillBecomeInvisible

    private void jComboBox86PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox86PopupMenuWillBecomeInvisible
        
        if(!jComboBox86.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox85.getSelectedItem().toString().substring(jComboBox85.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM event WHERE ev_tr_id = " + trip_id + " AND ev_start = '" + jComboBox86.getSelectedItem().toString() + "';");
                rs.next();
                jTextField65.setText(rs.getString("ev_start"));
                jTextField65.setEditable(true);
                jTextField66.setText(rs.getString("ev_end"));
                jTextField66.setEditable(true);
                jTextArea9.setText(rs.getString("ev_descr"));
                jTextArea9.setEditable(true);
                
            }catch(Exception e){}
        }else{
            jTextField65.setText("");
            jTextField65.setEditable(false);
            jTextField66.setText("");
            jTextField66.setEditable(false);
            jTextArea9.setText("");
            jTextArea9.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox86PopupMenuWillBecomeInvisible

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        
        if(jComboBox84.getSelectedItem().toString().equals("--") || jComboBox85.getSelectedItem().toString().equals("--") || jComboBox86.getSelectedItem().toString().equals("--") || jTextField65.getText().equals("") || jTextField66.getText().equals("") || jTextArea9.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox85.getSelectedItem().toString().substring(jComboBox85.getSelectedItem().toString().indexOf(':') + 2));
                
                String query = "UPDATE event SET ev_start = ?, ev_end = ?, ev_descr = ? WHERE ev_tr_id = ? AND ev_start = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField65.getText());
                db.ps.setString(2, jTextField66.getText());
                db.ps.setString(3, jTextArea9.getText());
                db.ps.setInt(4, trip_id);
                db.ps.setString(5, jComboBox86.getSelectedItem().toString());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The event was updated successfully", "Successful Modification", 1);
                
                jComboBox84.setSelectedIndex(0);
                jComboBox85.removeAllItems();
                jComboBox85.addItem("--");
                jComboBox86.removeAllItems();
                jComboBox86.addItem("--");
                jTextField65.setText("");
                jTextField65.setEditable(false);
                jTextField66.setText("");
                jTextField66.setEditable(false);
                jTextArea9.setText("");
                jTextArea9.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jComboBox87PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox87PopupMenuWillBecomeInvisible
        
        if(!jComboBox87.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox87.getSelectedItem().toString().substring(jComboBox87.getSelectedItem().toString().indexOf(':') + 2, jComboBox87.getSelectedItem().toString().indexOf(')')));
                jComboBox88.removeAllItems();
                jComboBox88.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code);
                while(rs.next())
                    jComboBox88.addItem("Trip id: " + rs.getString(1));
            }catch(Exception e){}
        }else{
            jComboBox88.removeAllItems();
            jComboBox88.addItem("--");
            jComboBox89.removeAllItems();
            jComboBox89.addItem("--");
            jComboBox90.setSelectedIndex(0);
            jComboBox90.setEnabled(false);
            jTextField67.setText("");
            jTextField67.setEditable(false);
            jTextField68.setText("");
            jTextField68.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox87PopupMenuWillBecomeInvisible

    private void jComboBox88PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox88PopupMenuWillBecomeInvisible
        
        if(!jComboBox88.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox88.getSelectedItem().toString().substring(jComboBox88.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT dst_name,dst_id FROM travel_to JOIN destination ON travel_to.to_dst_id = destination.dst_id WHERE to_tr_id = " + trip_id);
                while(rs.next())
                    jComboBox89.addItem(rs.getString(1) + "(id: " + rs.getString(2) + ")");
            }catch(Exception e){}
        }else{
            jComboBox89.removeAllItems();
            jComboBox89.addItem("--");
            jComboBox90.setSelectedIndex(0);
            jComboBox90.setEnabled(false);
            jTextField67.setText("");
            jTextField67.setEditable(false);
            jTextField68.setText("");
            jTextField68.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox88PopupMenuWillBecomeInvisible

    private void jComboBox89PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox89PopupMenuWillBecomeInvisible
        
        if(!jComboBox88.getSelectedItem().toString().equals("--")){
            try{
                int trip_id = Integer.parseInt(jComboBox88.getSelectedItem().toString().substring(jComboBox88.getSelectedItem().toString().indexOf(':') + 2));
                int destination_id = Integer.parseInt(jComboBox89.getSelectedItem().toString().substring(jComboBox89.getSelectedItem().toString().indexOf(':') + 2, jComboBox89.getSelectedItem().toString().indexOf(')')));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM travel_to WHERE to_tr_id = " + trip_id + " AND to_dst_id = " + destination_id);
                rs.next();
                jTextField67.setText(rs.getString("to_arrival"));
                jTextField67.setEditable(true);
                jTextField68.setText(rs.getString("to_departure"));
                jTextField68.setEditable(true);
                jComboBox90.setSelectedItem(jComboBox89.getSelectedItem());
                jComboBox90.setEnabled(true);
            
            }catch(Exception e){}
        }else{
            jComboBox90.setSelectedIndex(0);
            jComboBox90.setEnabled(false);
            jTextField67.setText("");
            jTextField67.setEditable(false);
            jTextField68.setText("");
            jTextField68.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox89PopupMenuWillBecomeInvisible

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        
        if(jComboBox87.getSelectedItem().toString().equals("--") || jComboBox88.getSelectedItem().toString().equals("--") || jComboBox89.getSelectedItem().toString().equals("--") || jTextField67.getText().equals("") || jTextField68.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox88.getSelectedItem().toString().substring(jComboBox88.getSelectedItem().toString().indexOf(':') + 2));
                int old_destination_id = Integer.parseInt(jComboBox89.getSelectedItem().toString().substring(jComboBox89.getSelectedItem().toString().indexOf(':') + 2, jComboBox89.getSelectedItem().toString().indexOf(')')));
                int new_destination_id = Integer.parseInt(jComboBox90.getSelectedItem().toString().substring(jComboBox90.getSelectedItem().toString().indexOf(':') + 2, jComboBox90.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE travel_to SET to_dst_id = ?, to_arrival = ?, to_departure = ? WHERE to_tr_id = ? AND to_dst_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setInt(1, new_destination_id);
                db.ps.setString(2, jTextField67.getText());
                db.ps.setString(3, jTextField68.getText());
                db.ps.setInt(4, trip_id);
                db.ps.setInt(5, old_destination_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The destination of the trip was updated successfully", "Successful Modification", 1);
                
                jComboBox87.setSelectedIndex(0);
                jComboBox88.removeAllItems();
                jComboBox88.addItem("--");
                jComboBox89.removeAllItems();
                jComboBox89.addItem("--");
                jComboBox90.setSelectedIndex(0);
                jComboBox90.setEnabled(false);
                jTextField67.setText("");
                jTextField67.setEditable(false);
                jTextField68.setText("");
                jTextField68.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jComboBox91PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox91PopupMenuWillBecomeInvisible
        
        if(!jComboBox91.getSelectedItem().toString().equals("--")){
            try{
                int offer_id = Integer.parseInt(jComboBox91.getSelectedItem().toString().substring(jComboBox91.getSelectedItem().toString().indexOf(':') + 2));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM offers WHERE offer_id = " + offer_id);
                rs.next();
                jTextField69.setText(rs.getString("offer_start_date"));
                jTextField69.setEditable(true);
                jTextField70.setText(rs.getString("offer_end_date"));
                jTextField70.setEditable(true);
                jTextField71.setText(rs.getString("offer_cost"));
                jTextField71.setEditable(true);
                
                String pattern = ".*id: " + rs.getInt("offer_destination") + ".*";
                for(int i=0; i<jComboBox92.getItemCount(); i++){
                    if(jComboBox92.getItemAt(i).toString().matches(pattern)){
                        jComboBox92.setSelectedIndex(i);
                        break;
                    }
                }
                jComboBox92.setEnabled(true);
            
            }catch(Exception e){}
        }else{
            jTextField69.setText("");
            jTextField69.setEditable(false);
            jTextField70.setText("");
            jTextField70.setEditable(false);
            jTextField71.setText("");
            jTextField71.setEditable(false);
            jComboBox92.setSelectedIndex(0);
            jComboBox92.setEnabled(false);
        }
        
    }//GEN-LAST:event_jComboBox91PopupMenuWillBecomeInvisible

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        
        if(jComboBox91.getSelectedItem().toString().equals("--") || jComboBox92.getSelectedItem().toString().equals("--") || jTextField69.getText().equals("") || jTextField70.getText().equals("") || jTextField71.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int offer_id = Integer.parseInt(jComboBox91.getSelectedItem().toString().substring(jComboBox91.getSelectedItem().toString().indexOf(':') + 2));
                int destination_id = Integer.parseInt(jComboBox92.getSelectedItem().toString().substring(jComboBox92.getSelectedItem().toString().indexOf(':') + 2, jComboBox92.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE offers SET offer_start_date = ?, offer_end_date = ?, offer_cost = ?, offer_destination = ? WHERE offer_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField69.getText());
                db.ps.setString(2, jTextField70.getText());
                db.ps.setFloat(3, Float.parseFloat(jTextField71.getText()));
                db.ps.setInt(4, destination_id);
                db.ps.setInt(5, offer_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The offer was updated successfully", "Successful Modification", 1);
                
                jComboBox91.setSelectedIndex(0);
                jTextField69.setText("");
                jTextField69.setEditable(false);
                jTextField70.setText("");
                jTextField70.setEditable(false);
                jTextField71.setText("");
                jTextField71.setEditable(false);
                jComboBox92.setSelectedIndex(0);
                jComboBox92.setEnabled(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jComboBox93PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox93PopupMenuWillBecomeInvisible
        
        if(!jComboBox93.getSelectedItem().toString().equals("--")){
            try{
                int offer_id = Integer.parseInt(jComboBox93.getSelectedItem().toString().substring(jComboBox93.getSelectedItem().toString().indexOf(':') + 2));
                
                jComboBox94.removeAllItems();
                jComboBox94.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT res_name,res_lname,res_id FROM reservation_offers WHERE res_offer_id = " + offer_id);
                while(rs.next())
                    jComboBox94.addItem(rs.getString(1) + " " + rs.getString(2) + "(reservation id: " + rs.getString(3) + ")");
            }catch(Exception e){}
        }else{
            jComboBox94.removeAllItems();
            jComboBox94.addItem("--");
            jTextField72.setText("");
            jTextField72.setEditable(false);
            jTextField73.setText("");
            jTextField73.setEditable(false);
            jTextField74.setText("");
            jTextField74.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox93PopupMenuWillBecomeInvisible

    private void jComboBox94PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox94PopupMenuWillBecomeInvisible
        
        if(!jComboBox93.getSelectedItem().toString().equals("--")){
            try{
                int reservation_id = Integer.parseInt(jComboBox94.getSelectedItem().toString().substring(jComboBox94.getSelectedItem().toString().indexOf(':') + 2, jComboBox94.getSelectedItem().toString().indexOf(')')));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM reservation_offers WHERE res_id = " + reservation_id);
                rs.next();
                jTextField72.setText(rs.getString("res_name"));
                jTextField72.setEditable(true);
                jTextField73.setText(rs.getString("res_lname"));
                jTextField73.setEditable(true);
                jTextField74.setText(rs.getString("payment_in_advance"));
                jTextField74.setEditable(true);
                
            }catch(Exception e){}
        }else{
            jTextField72.setText("");
            jTextField72.setEditable(false);
            jTextField73.setText("");
            jTextField73.setEditable(false);
            jTextField74.setText("");
            jTextField74.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox94PopupMenuWillBecomeInvisible

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        
        if(jComboBox93.getSelectedItem().toString().equals("--") || jComboBox94.getSelectedItem().toString().equals("--") || jTextField72.getText().equals("") || jTextField73.getText().equals("") || jTextField74.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int reservation_id = Integer.parseInt(jComboBox94.getSelectedItem().toString().substring(jComboBox94.getSelectedItem().toString().indexOf(':') + 2, jComboBox94.getSelectedItem().toString().indexOf(')')));
                
                String query = "UPDATE reservation_offers SET res_name = ?, res_lname = ?, payment_in_advance = ? WHERE res_id = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField72.getText());
                db.ps.setString(2, jTextField73.getText());
                db.ps.setFloat(3, Float.parseFloat(jTextField74.getText()));
                db.ps.setInt(4, reservation_id);
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The reservation of the offer was updated successfully", "Successful Modification", 1);
                
                jComboBox93.setSelectedIndex(0);
                jComboBox94.removeAllItems();
                jComboBox94.addItem("--");
                jTextField72.setText("");
                jTextField72.setEditable(false);
                jTextField73.setText("");
                jTextField73.setEditable(false);
                jTextField74.setText("");
                jTextField74.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jComboBox95PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox95PopupMenuWillBecomeInvisible
        
        if(!jComboBox95.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox95.getSelectedItem().toString().substring(jComboBox95.getSelectedItem().toString().indexOf(':') + 2, jComboBox95.getSelectedItem().toString().indexOf(')')));
                
                jComboBox96.removeAllItems();
                jComboBox96.addItem("--");
                ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM worker JOIN IT_manager ON worker.wrk_AT = IT_manager.IT_AT WHERE wrk_br_code = " + branch_code + ";");
                while(rs.next())
                    jComboBox96.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
                
            }catch(Exception e){}
        }else{
            jComboBox96.removeAllItems();
            jComboBox96.addItem("--");
            jTextField75.setText("");
            jTextField75.setEditable(false);
            jTextField76.setText("");
            jTextField76.setEditable(false);
            jTextField77.setText("");
            jTextField77.setEditable(false);
            jTextField78.setText("");
            jTextField78.setEditable(false);
            jComboBox97.setSelectedIndex(0);
            jComboBox97.setEnabled(false);
            jPasswordField2.setText("");
            jPasswordField2.setEditable(false);
            jTextField79.setText("");
            jTextField79.setEditable(false);
            jTextField80.setText("");
            jTextField80.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox95PopupMenuWillBecomeInvisible

    private void jComboBox96PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox96PopupMenuWillBecomeInvisible
        
        if(!jComboBox96.getSelectedItem().toString().equals("--")){
            try{
                int branch_code = Integer.parseInt(jComboBox95.getSelectedItem().toString().substring(jComboBox95.getSelectedItem().toString().indexOf(':') + 2, jComboBox95.getSelectedItem().toString().indexOf(')')));
                String AT = jComboBox96.getSelectedItem().toString().substring(jComboBox96.getSelectedItem().toString().indexOf(':') + 2, jComboBox96.getSelectedItem().toString().indexOf(')'));
                
                ResultSet rs = db.st.executeQuery("SELECT * FROM worker JOIN IT_manager ON worker.wrk_AT = IT_manager.IT_AT WHERE wrk_AT = '" + AT + "';");
                rs.next();
                jTextField75.setText(rs.getString("wrk_name"));
                jTextField75.setEditable(true);
                jTextField76.setText(rs.getString("wrk_lname"));
                jTextField76.setEditable(true);
                jTextField77.setText(rs.getString("wrk_AT"));
                jTextField77.setEditable(true);
                jTextField78.setText(rs.getString("wrk_salary"));
                jTextField78.setEditable(true);
                jComboBox97.setSelectedItem(jComboBox95.getSelectedItem());
                jComboBox97.setEnabled(true);
                jPasswordField2.setText(rs.getString("IT_password"));
                jPasswordField2.setEditable(true);
                jTextField79.setText(rs.getString("IT_start_date"));
                jTextField79.setEditable(true);
                jTextField80.setText(rs.getString("IT_end_date"));
                jTextField80.setEditable(true);
                
            }catch(Exception e){}
        }else{
            jTextField75.setText("");
            jTextField75.setEditable(false);
            jTextField76.setText("");
            jTextField76.setEditable(false);
            jTextField77.setText("");
            jTextField77.setEditable(false);
            jTextField78.setText("");
            jTextField78.setEditable(false);
            jComboBox97.setSelectedIndex(0);
            jComboBox97.setEnabled(false);
            jPasswordField2.setText("");
            jPasswordField2.setEditable(false);
            jTextField79.setText("");
            jTextField79.setEditable(false);
            jTextField80.setText("");
            jTextField80.setEditable(false);
        }
        
    }//GEN-LAST:event_jComboBox96PopupMenuWillBecomeInvisible

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        
        if(jComboBox95.getSelectedItem().toString().equals("--") || jComboBox96.getSelectedItem().toString().equals("--") || jComboBox97.getSelectedItem().toString().equals("--") 
            || jTextField75.getText().equals("") || jTextField76.getText().equals("") || jTextField77.getText().equals("") || jTextField78.getText().equals("") || jTextField79.getText().equals("")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox97.getSelectedItem().toString().substring(jComboBox97.getSelectedItem().toString().indexOf(':') + 2, jComboBox97.getSelectedItem().toString().indexOf(')')));
                String AT = jComboBox96.getSelectedItem().toString().substring(jComboBox96.getSelectedItem().toString().indexOf(':') + 2, jComboBox96.getSelectedItem().toString().indexOf(')'));
                
                String query = "UPDATE worker SET wrk_AT = ?, wrk_name = ?, wrk_lname = ?, wrk_salary = ?, wrk_br_code = ? WHERE wrk_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                db.ps.setString(1, jTextField77.getText());
                db.ps.setString(2, jTextField75.getText());
                db.ps.setString(3, jTextField76.getText());
                db.ps.setFloat(4, Float.parseFloat(jTextField78.getText()));
                db.ps.setInt(5, branch_code);
                db.ps.setString(6, AT);
                db.ps.executeUpdate();
                
                query = "UPDATE IT_manager SET IT_password = ?, IT_start_date = ?, IT_end_date = ? WHERE IT_AT = ?";
                db.ps = db.conn.prepareStatement(query);
                
                if(jPasswordField2.getText().equals(""))
                    db.ps.setString(1, "password");
                else
                    db.ps.setString(1, jPasswordField2.getText());
                
                db.ps.setString(2, jTextField79.getText());
                
                if(jTextField80.getText().equals(""))
                    db.ps.setNull(3, Types.DATE);
                else
                    db.ps.setString(3, jTextField80.getText());
                
                db.ps.setString(4, jTextField77.getText());
                db.ps.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "The IT manager's data were updated successfully", "Successful Modification", 1);
                
                jComboBox95.setSelectedIndex(0);
                jComboBox96.removeAllItems();
                jComboBox96.addItem("--");
                jTextField75.setText("");
                jTextField75.setEditable(false);
                jTextField76.setText("");
                jTextField76.setEditable(false);
                jTextField77.setText("");
                jTextField77.setEditable(false);
                jTextField78.setText("");
                jTextField78.setEditable(false);
                jComboBox97.setSelectedIndex(0);
                jComboBox97.setEnabled(false);
                jPasswordField2.setText("");
                jPasswordField2.setEditable(false);
                jTextField79.setText("");
                jTextField79.setEditable(false);
                jTextField80.setText("");
                jTextField80.setEditable(false);
            } catch (Exception e){JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }
        
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        if(jTextField20.getText().equals("") || jTextField21.getText().equals("") || jTextField22.getText().equals("") || (Integer)jSpinner3.getValue() == 0 || jComboBox11.getSelectedItem().toString().equals("--") || jComboBox12.getSelectedItem().toString().equals("--") || jComboBox13.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int branch_code = Integer.parseInt(jComboBox11.getSelectedItem().toString().substring(jComboBox11.getSelectedItem().toString().indexOf(':') + 2, jComboBox11.getSelectedItem().toString().indexOf(')')));
            String guide_AT = jComboBox12.getSelectedItem().toString().substring(jComboBox12.getSelectedItem().toString().indexOf(':') + 2, jComboBox12.getSelectedItem().toString().indexOf(')'));
        String driver_AT = jComboBox13.getSelectedItem().toString().substring(jComboBox13.getSelectedItem().toString().indexOf(':') + 2, jComboBox13.getSelectedItem().toString().indexOf(')'));

        String query = "INSERT INTO trip VALUES(NULL, ?, ?, ?, ?, ?, ?, ?)";
        db.ps = db.conn.prepareStatement(query);
        db.ps.setString(1, jTextField20.getText());
        db.ps.setString(2, jTextField21.getText());
        db.ps.setInt(3, (Integer)jSpinner3.getValue());
        db.ps.setFloat(4, Float.parseFloat(jTextField22.getText()));
        db.ps.setInt(5, branch_code);
        db.ps.setString(6, guide_AT);
        db.ps.setString(7, driver_AT);
        db.ps.executeUpdate();

        JOptionPane.showMessageDialog(null, "The trip was inserted successfully", "Successful Insertion", 1);

        jTextField20.setText("");
        jTextField21.setText("");
        jTextField22.setText("");
        jSpinner3.setValue(0);
        jComboBox11.setSelectedIndex(0);
        jComboBox12.removeAllItems();
        jComboBox12.addItem("--");
        jComboBox13.removeAllItems();
        jComboBox13.addItem("--");
        } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jComboBox11PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox11PopupMenuWillBecomeInvisible

        if(!jComboBox11.getSelectedItem().toString().equals("--")){
            int branch_code = Integer.parseInt(jComboBox11.getSelectedItem().toString().substring(jComboBox11.getSelectedItem().toString().indexOf(':') + 2, jComboBox11.getSelectedItem().toString().indexOf(')')));

        try{
            jComboBox12.removeAllItems();
            jComboBox12.addItem("--");
            ResultSet rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM guide JOIN worker ON guide.gui_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
            while(rs.next())
            jComboBox12.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");

            jComboBox13.removeAllItems();
            jComboBox13.addItem("--");
            rs = db.st.executeQuery("SELECT wrk_name,wrk_lname,wrk_AT FROM driver JOIN worker ON driver.drv_AT = worker.wrk_AT WHERE wrk_br_code = " + branch_code);
            while(rs.next())
            jComboBox13.addItem(rs.getString(1) + " " + rs.getString(2) + "(AT: " + rs.getString(3) + ")");
        }catch(Exception e){}
        }else{
            jComboBox12.removeAllItems();
            jComboBox12.addItem("--");
            jComboBox13.removeAllItems();
            jComboBox13.addItem("--");
        }
    }//GEN-LAST:event_jComboBox11PopupMenuWillBecomeInvisible

    private void jComboBox20PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox20PopupMenuWillBecomeInvisible

        if(!jComboBox20.getSelectedItem().toString().equals("--")){
            jComboBox21.removeAllItems();
            try{
                jComboBox21.addItem("--");
                int branch_code = Integer.parseInt(jComboBox20.getSelectedItem().toString().substring(jComboBox20.getSelectedItem().toString().indexOf(':') + 2, jComboBox20.getSelectedItem().toString().indexOf(')')));
            ResultSet rs = db.st.executeQuery("SELECT tr_id FROM trip WHERE tr_br_code = " + branch_code + ";");
            while(rs.next())
            jComboBox21.addItem("Trip id: " + rs.getString(1));
        }catch(Exception e){}
        }else{
            jComboBox21.removeAllItems();
            jComboBox21.addItem("--");
        }

    }//GEN-LAST:event_jComboBox20PopupMenuWillBecomeInvisible

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        if(jTextField27.getText().equals("") || jTextField28.getText().equals("") || jComboBox20.getSelectedItem().toString().equals("--") || jComboBox21.getSelectedItem().toString().equals("--") || jComboBox22.getSelectedItem().toString().equals("--")){
            JOptionPane.showMessageDialog(null, "All fields have to be filled in", "Empty fields", 0);
        }else{
            try {
                int trip_id = Integer.parseInt(jComboBox21.getSelectedItem().toString().substring(jComboBox21.getSelectedItem().toString().indexOf(':') + 2));
                int destination_id = Integer.parseInt(jComboBox22.getSelectedItem().toString().substring(jComboBox22.getSelectedItem().toString().indexOf(':') + 2, jComboBox22.getSelectedItem().toString().indexOf(')')));

            String query = "INSERT INTO travel_to VALUES(?, ?, ?, ?)";
            db.ps = db.conn.prepareStatement(query);
            db.ps.setInt(1, trip_id);
            db.ps.setInt(2, destination_id);
            db.ps.setString(3, jTextField27.getText());
            db.ps.setString(4, jTextField28.getText());
            db.ps.executeUpdate();

            JOptionPane.showMessageDialog(null, "The trip and destination were connected successfully", "Successful Insertion", 1);

            jTextField27.setText("");
            jTextField28.setText("");
            jComboBox20.setSelectedIndex(0);
            jComboBox21.removeAllItems();
            jComboBox21.addItem("--");
            jComboBox22.setSelectedIndex(0);
        } catch (Exception e) {JOptionPane.showMessageDialog(null, e.getMessage(), "Database Error", 0);}
        }

    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox10;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JComboBox<String> jComboBox12;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JComboBox<String> jComboBox15;
    private javax.swing.JComboBox<String> jComboBox16;
    private javax.swing.JComboBox<String> jComboBox17;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JComboBox<String> jComboBox19;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox20;
    private javax.swing.JComboBox<String> jComboBox21;
    private javax.swing.JComboBox<String> jComboBox22;
    private javax.swing.JComboBox<String> jComboBox23;
    private javax.swing.JComboBox<String> jComboBox24;
    private javax.swing.JComboBox<String> jComboBox25;
    private javax.swing.JComboBox<String> jComboBox26;
    private javax.swing.JComboBox<String> jComboBox27;
    private javax.swing.JComboBox<String> jComboBox28;
    private javax.swing.JComboBox<String> jComboBox29;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox30;
    private javax.swing.JComboBox<String> jComboBox31;
    private javax.swing.JComboBox<String> jComboBox32;
    private javax.swing.JComboBox<String> jComboBox33;
    private javax.swing.JComboBox<String> jComboBox34;
    private javax.swing.JComboBox<String> jComboBox35;
    private javax.swing.JComboBox<String> jComboBox36;
    private javax.swing.JComboBox<String> jComboBox37;
    private javax.swing.JComboBox<String> jComboBox38;
    private javax.swing.JComboBox<String> jComboBox39;
    private javax.swing.JComboBox<String> jComboBox40;
    private javax.swing.JComboBox<String> jComboBox41;
    private javax.swing.JComboBox<String> jComboBox42;
    private javax.swing.JComboBox<String> jComboBox43;
    private javax.swing.JComboBox<String> jComboBox44;
    private javax.swing.JComboBox<String> jComboBox45;
    private javax.swing.JComboBox<String> jComboBox46;
    private javax.swing.JComboBox<String> jComboBox47;
    private javax.swing.JComboBox<String> jComboBox48;
    private javax.swing.JComboBox<String> jComboBox49;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox50;
    private javax.swing.JComboBox<String> jComboBox51;
    private javax.swing.JComboBox<String> jComboBox52;
    private javax.swing.JComboBox<String> jComboBox53;
    private javax.swing.JComboBox<String> jComboBox54;
    private javax.swing.JComboBox<String> jComboBox55;
    private javax.swing.JComboBox<String> jComboBox56;
    private javax.swing.JComboBox<String> jComboBox57;
    private javax.swing.JComboBox<String> jComboBox58;
    private javax.swing.JComboBox<String> jComboBox59;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox60;
    private javax.swing.JComboBox<String> jComboBox61;
    private javax.swing.JComboBox<String> jComboBox62;
    private javax.swing.JComboBox<String> jComboBox63;
    private javax.swing.JComboBox<String> jComboBox64;
    private javax.swing.JComboBox<String> jComboBox65;
    private javax.swing.JComboBox<String> jComboBox66;
    private javax.swing.JComboBox<String> jComboBox67;
    private javax.swing.JComboBox<String> jComboBox68;
    private javax.swing.JComboBox<String> jComboBox69;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox70;
    private javax.swing.JComboBox<String> jComboBox71;
    private javax.swing.JComboBox<String> jComboBox72;
    private javax.swing.JComboBox<String> jComboBox73;
    private javax.swing.JComboBox<String> jComboBox74;
    private javax.swing.JComboBox<String> jComboBox75;
    private javax.swing.JComboBox<String> jComboBox76;
    private javax.swing.JComboBox<String> jComboBox77;
    private javax.swing.JComboBox<String> jComboBox78;
    private javax.swing.JComboBox<String> jComboBox79;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox80;
    private javax.swing.JComboBox<String> jComboBox81;
    private javax.swing.JComboBox<String> jComboBox82;
    private javax.swing.JComboBox<String> jComboBox83;
    private javax.swing.JComboBox<String> jComboBox84;
    private javax.swing.JComboBox<String> jComboBox85;
    private javax.swing.JComboBox<String> jComboBox86;
    private javax.swing.JComboBox<String> jComboBox87;
    private javax.swing.JComboBox<String> jComboBox88;
    private javax.swing.JComboBox<String> jComboBox89;
    private javax.swing.JComboBox<String> jComboBox9;
    private javax.swing.JComboBox<String> jComboBox90;
    private javax.swing.JComboBox<String> jComboBox91;
    private javax.swing.JComboBox<String> jComboBox92;
    private javax.swing.JComboBox<String> jComboBox93;
    private javax.swing.JComboBox<String> jComboBox94;
    private javax.swing.JComboBox<String> jComboBox95;
    private javax.swing.JComboBox<String> jComboBox96;
    private javax.swing.JComboBox<String> jComboBox97;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel226;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField65;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField67;
    private javax.swing.JTextField jTextField68;
    private javax.swing.JTextField jTextField69;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField70;
    private javax.swing.JTextField jTextField71;
    private javax.swing.JTextField jTextField72;
    private javax.swing.JTextField jTextField73;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextField79;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField80;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
