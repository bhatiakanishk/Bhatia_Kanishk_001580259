/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.regex.*;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import model.Person;
import model.PersonDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.VitalSigns;
/**
 *
 * @author kanis
 */
public class Main extends javax.swing.JFrame {
    
    
    ArrayList<Patient> patientDirectoryList;
    ArrayList<VitalSigns> vitalSignsList;
    ArrayList<Encounter> encounterList;
    ArrayList<EncounterHistory> encounterHistoryList;
    ArrayList<Person> personList;
    ArrayList<PersonDirectory> personDirectoryList;
    
    String header1[] = new String[] {"First Name","Last Name","Age","Contact Number","House Number","Community","City"};
    String header2[] = new String[] {"Date","Doctor","Issue","Temperature","Blood Pressure","Pulse","Weight"};
    DefaultTableModel dtm1;
    DefaultTableModel dtm2;
    int row;
    int col;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        addEncounterTable();
        addPatientTable();
        vitalSignsList = new ArrayList<>(); 
        encounterList = new ArrayList<>(); 
        encounterHistoryList = new ArrayList<>();  
        patientDirectoryList = new ArrayList<>();
        personList = new ArrayList<>();
        personDirectoryList = new ArrayList<>();
       
        
                
        PatientDirectory pd = new PatientDirectory();
        patientDirectoryList = pd.getPatient();
        //ENCOUNTER HISTORY plus vitals
        encounterList = patientDirectoryList.get(0).getEncounterData().getEncounterArrayList();
        this.setLocationRelativeTo(null);
    }
    //Table
    private void addEncounterTable(){
        PatientDirectory pd = new PatientDirectory();
        patientDirectoryList = pd.getPatient();
        encounterList = patientDirectoryList.get(0).getEncounterData().getEncounterArrayList();
        DefaultTableModel model1 = (DefaultTableModel)tblVitalSigns.getModel();
        Object encounterRow[] = new Object[7];
        for(int i=0;i<encounterList.size();i++){
            encounterRow[0] = encounterList.get(i).getEncounterDoc();
            encounterRow[1] = encounterList.get(i).getEncounterDate();
            encounterRow[2] = encounterList.get(i).getEncounterIssue();
            encounterRow[3] = encounterList.get(i).getTemperature();
            encounterRow[4] = encounterList.get(i).getBloodpressure();
            encounterRow[5] = encounterList.get(i).getPulse();
            encounterRow[6] = encounterList.get(i).getWeight();
            model1.addRow(encounterRow);
        }   
    }
    
    private void addPatientTable(){
        PatientDirectory pd = new PatientDirectory();
        patientDirectoryList = pd.getPatient();
        encounterList = patientDirectoryList.get(0).getEncounterData().getEncounterArrayList();
        DefaultTableModel model2 = (DefaultTableModel)tblPatient.getModel();
        Object patientRow[] = new Object[10];
        for(int i=0;i<encounterList.size();i++){
            patientRow[0] = patientDirectoryList.get(i).getFirstName();
            patientRow[1] = patientDirectoryList.get(i).getLastName();
            patientRow[2] = patientDirectoryList.get(i).getAge();
            patientRow[3] = patientDirectoryList.get(i).getContact();
            patientRow[4] = patientDirectoryList.get(i).getHouse();
            patientRow[5] = patientDirectoryList.get(i).getCommunity();
            patientRow[6] = patientDirectoryList.get(i).getCity();
            model2.addRow(patientRow);
        }   
    }
    
    private void clearField() {
        txtFirstName.requestFocus();
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        txtContactNumber.setText("");
        txtHouseNumber.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        txtDate.setText("");
        txtDoctor.setText("");
        txtIssue.setText("");
        txtTemperature.setText(""); 
        txtBloodPressure.setText("");
        txtPulse.setText("");
        txtWeight.setText(""); 
    }
    /*public void addRowToTable(){
        dtm2.setRowCount(0);
        for(int i=0; i<encounterHistoryList.size();i++){ //Print carlist on view table
                    Object[] objs = {encounterHistoryList.get(i).encounterDate, encounterHistoryList.get(i).encounterDoc, encounterHistoryList.get(i).age, encounterHistoryList.get(i).contact, encounterHistoryList.get(i).house, encounterHistoryList.get(i).community, encounterHistoryList.get(i).city};
                    dtm2.addRow(objs);
                }
    }*/
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDelete1 = new javax.swing.JButton();
        lblCityVal4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVitalSigns = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        lblHouseNumber = new javax.swing.JLabel();
        txtHouseNumber = new javax.swing.JTextField();
        lblCommunity = new javax.swing.JLabel();
        txtCommunity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        lblDate = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblDoctor = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        lblIssue = new javax.swing.JLabel();
        txtIssue = new javax.swing.JTextField();
        lblTemperature = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        lblFirstNameVal = new javax.swing.JLabel();
        lblLastNameVal = new javax.swing.JLabel();
        lblAgeVal = new javax.swing.JLabel();
        lblContactNumberVal = new javax.swing.JLabel();
        lblHouseNumberVal = new javax.swing.JLabel();
        lblCommunityVal = new javax.swing.JLabel();
        lblCityVal = new javax.swing.JLabel();
        lblDateVal = new javax.swing.JLabel();
        lblDoctorVal = new javax.swing.JLabel();
        lblIssueVal = new javax.swing.JLabel();
        lblWeightVal = new javax.swing.JLabel();
        lblPulseVal = new javax.swing.JLabel();
        lblBloodPressureVal = new javax.swing.JLabel();
        lblTemperatureVal = new javax.swing.JLabel();

        btnDelete1.setText("Delete");

        lblCityVal4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblCityVal4.setForeground(new java.awt.Color(255, 0, 51));
        lblCityVal4.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblVitalSigns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Doctor", "Issue", "Temperature", "Blood Pressure", "Pulse", "Weight"
            }
        ));
        jScrollPane2.setViewportView(tblVitalSigns);

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last Name", "Age", "Contact Number", "House Number", "Community", "City"
            }
        ));
        jScrollPane3.setViewportView(tblPatient);

        lblFirstName.setText("First Name:");

        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyReleased(evt);
            }
        });

        lblLastName.setText("Last Name:");

        txtLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLastNameKeyReleased(evt);
            }
        });

        lblAge.setText("Age:");

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        lblContactNumber.setText("Contact Number:");
        lblContactNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lblContactNumberKeyReleased(evt);
            }
        });

        lblHouseNumber.setText("House Number:");

        txtHouseNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHouseNumberKeyReleased(evt);
            }
        });

        lblCommunity.setText("Community:");

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        lblCity.setText("City:");

        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        txtTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTemperatureKeyReleased(evt);
            }
        });

        lblDate.setText("Date:");

        lblBloodPressure.setText("Blood Pressure:");

        txtBloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBloodPressureKeyReleased(evt);
            }
        });

        lblPulse.setText("Pulse:");

        txtPulse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPulseKeyReleased(evt);
            }
        });

        lblWeight.setText("Weight:");

        lblDoctor.setText("Doctor:");

        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWeightKeyReleased(evt);
            }
        });

        lblIssue.setText("Issue:");

        lblTemperature.setText("Temperature:");

        btnAdd.setText("Add");
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblFirstNameVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblFirstNameVal.setForeground(new java.awt.Color(255, 0, 51));

        lblLastNameVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblLastNameVal.setForeground(new java.awt.Color(255, 0, 51));

        lblAgeVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblAgeVal.setForeground(new java.awt.Color(255, 0, 51));

        lblContactNumberVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblContactNumberVal.setForeground(new java.awt.Color(255, 0, 51));

        lblHouseNumberVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblHouseNumberVal.setForeground(new java.awt.Color(255, 0, 51));

        lblCommunityVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblCommunityVal.setForeground(new java.awt.Color(255, 0, 51));

        lblCityVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblCityVal.setForeground(new java.awt.Color(255, 0, 51));

        lblDateVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblDateVal.setForeground(new java.awt.Color(255, 0, 51));

        lblDoctorVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblDoctorVal.setForeground(new java.awt.Color(255, 0, 51));

        lblIssueVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblIssueVal.setForeground(new java.awt.Color(255, 0, 51));

        lblWeightVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblWeightVal.setForeground(new java.awt.Color(255, 0, 51));

        lblPulseVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblPulseVal.setForeground(new java.awt.Color(255, 0, 51));

        lblBloodPressureVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblBloodPressureVal.setForeground(new java.awt.Color(255, 0, 51));

        lblTemperatureVal.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        lblTemperatureVal.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addGap(18, 18, 18)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblLastNameVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAge)
                                .addGap(18, 18, 18)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblAgeVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblContactNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblContactNumberVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHouseNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblHouseNumberVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunity)
                                .addGap(18, 18, 18)
                                .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCommunityVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addGap(18, 18, 18)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCityVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addGap(18, 18, 18)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFirstNameVal)))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBloodPressure)
                                .addGap(18, 18, 18)
                                .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblBloodPressureVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPulse)
                                .addGap(18, 18, 18)
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPulseVal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblWeight)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblWeightVal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDoctor)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDoctorVal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIssue)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblIssueVal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblTemperature)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblTemperatureVal))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDate)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblDateVal)))
                                .addGap(84, 84, 84)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSearch)
                                    .addComponent(btnDelete)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnAdd))))
                        .addGap(0, 448, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAge, lblCity, lblCommunity, lblContactNumber, lblFirstName, lblHouseNumber, lblLastName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodPressure, lblDate, lblDoctor, lblIssue, lblPulse, lblTemperature, lblWeight});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnSearch, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstNameVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastNameVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAgeVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNumber)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNumberVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHouseNumber)
                            .addComponent(txtHouseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHouseNumberVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunityVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCityVal)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(lblDateVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDoctor)
                            .addComponent(txtDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate)
                            .addComponent(lblDoctorVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIssue)
                            .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete)
                            .addComponent(lblIssueVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemperature)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(lblTemperatureVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressure)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBloodPressureVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPulse)
                            .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPulseVal))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWeight)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeightVal))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if(txtFirstName.getText().isEmpty()|| txtLastName.getText().isEmpty()|| txtAge.getText().isEmpty()|| txtContactNumber.getText().isEmpty()|| txtHouseNumber.getText().isEmpty()|| txtCommunity.getText().isEmpty() || txtCity.getText().isEmpty() || txtDate.getText().isEmpty() || txtDoctor.getText().isEmpty() || txtIssue.getText().isEmpty() || txtTemperature.getText().isEmpty() || txtBloodPressure.getText().isEmpty() || txtPulse.getText().isEmpty() || txtWeight.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Don't leave empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                int age = Integer.parseInt(txtAge.getText());
                String contactNumber = txtContactNumber.getText();
                String houseNumber = txtHouseNumber.getText();
                String community = txtCommunity.getText();
                String city = txtCity.getText();
                /*patientDirectoryList.add(new PatientDirectory(firstName,lastName,age,contactNumber,houseNumber,community,city));
                dtm1.setRowCount(0);
                for(int i=0; i<patientDirectoryList.size();i++){ 
                    Object[] objs = {patientDirectoryList.get(i).firstName, patientDirectoryList.get(i).lastName, patientDirectoryList.get(i).age, patientDirectoryList.get(i).contactNumber, patientDirectoryList.get(i).houseNumber, patientDirectoryList.get(i).community, patientDirectoryList.get(i).city};
                    dtm1.addRow(objs);
                }*/
                String date = txtDate.getText();
                String doctor = txtDoctor.getText();
                String issue = txtIssue.getText();
                String temperature = txtTemperature.getText();
                String bloodpressure = txtBloodPressure.getText();
                String pulse = txtPulse.getText();
                int weight = Integer.parseInt(txtWeight.getText());
                /*encounterHistoryList.add(new PatientDirectory(date,doctor,issue,temperature,bloodpressure,pulse,weight));
                dtm2.setRowCount(0);
                for(int i=0; i<encounterHistoryList.size();i++){ 
                    Object[] objs = {encounterHistoryList.get(i).date, encounterHistoryList.get(i).doctor, encounterHistoryList.get(i).issue, encounterHistoryList.get(i).temperature, encounterHistoryList.get(i).bloodpressure, encounterHistoryList.get(i).pulse, encounterHistoryList.get(i).weight};
                    dtm1.addRow(objs);
                }*/
                JOptionPane.showMessageDialog(this, "Information Added");
                clearField();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0){
            dtm1.removeRow(row);
            dtm2.removeRow(row);
            encounterHistoryList.remove(row);
            patientDirectoryList.remove(row);
            dtm1.setRowCount(0);
            dtm2.setRowCount(0);
            /*for(int i=0; i<encounterHistoryList.size();i++){ 
                    Object[] objs = {encounterHistoryList.get(i).date, encounterHistoryList.get(i).doctor, encounterHistoryList.get(i).issue, encounterHistoryList.get(i).temperature, encounterHistoryList.get(i).bloodpressure, encounterHistoryList.get(i).pulse, encounterHistoryList.get(i).weight};
                dtm2.addRow(objs);
            }
            
            for(int j=0; j<patientDirectoryList.size();j++){ 
                    Object[] objs = {patientDirectoryList.get(j).firstName, patientDirectoryList.get(j).lastName, patientDirectoryList.get(j).age, patientDirectoryList.get(j).contactNumber, patientDirectoryList.get(j).houseNumber, patientDirectoryList.get(j).community, patientDirectoryList.get(j).city};
            dtm1.addRow(objs);
            }*/
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String updatefirstName = txtFirstName.getText();
        String updatelastName = txtLastName.getText();
        int updateage = Integer.parseInt(txtAge.getText());
        String updatecontactNumber = txtContactNumber.getText();
        String updatehouseNumber = txtHouseNumber.getText();
        String updatecommunity = txtCommunity.getText();
        String updatecity = txtCity.getText();
        patientDirectoryList.get(row).firstName = updatefirstName;
        patientDirectoryList.get(row).lastName = updatelastName;
        patientDirectoryList.get(row).age = updateage;
        patientDirectoryList.get(row).contact = updatecontactNumber;
        patientDirectoryList.get(row).house = updatehouseNumber;
        patientDirectoryList.get(row).community = updatecommunity;
        patientDirectoryList.get(row).city = updatecity;
        dtm1.setRowCount(0);
        /*for(int j=0; j<patientDirectoryList.size();j++){ 
                    Object[] objs = {patientDirectoryList.get(j).firstName, patientDirectoryList.get(j).lastName, patientDirectoryList.get(j).age, patientDirectoryList.get(j).contactNumber, patientDirectoryList.get(j).houseNumber, patientDirectoryList.get(j).community, patientDirectoryList.get(j).city};
            dtm1.addRow(objs);
            }*/
        
        String updatedate = txtDate.getText();
        String updatedoctor = txtDoctor.getText();
        String updateissue = txtIssue.getText();
        String updatetemperature = txtTemperature.getText();
        String updatebloodpressure = txtBloodPressure.getText();
        String updatepulse = txtPulse.getText();
        int updateweight = Integer.parseInt(txtWeight.getText());
        //encounterHistoryList.get(row).date = updatedate;
        //encounterHistoryList.get(row).doctor = updatedoctor;
        //encounterHistoryList.get(row).issue = updateissue;
        //encounterHistoryList.get(row).temperature = updatetemperature;
        //encounterHistoryList.get(row).bloodpressure = updatebloodpressure;
        //encounterHistoryList.get(row).pulse = updatepulse;
        //encounterHistoryList.get(row).weight = updateweight;
        dtm2.setRowCount(0);
        /*for(int i=0; i<encounterHistoryList.size();i++){ 
                    Object[] objs = {encounterHistoryList.get(i).date, encounterHistoryList.get(i).doctor, encounterHistoryList.get(i).issue, encounterHistoryList.get(i).temperature, encounterHistoryList.get(i).bloodpressure, encounterHistoryList.get(i).pulse, encounterHistoryList.get(i).weight};
                dtm2.addRow(objs);
            }*/
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtFirstNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]\\w{5,29}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtFirstName.getText());
        if(!match.matches()){
            lblFirstNameVal.setText("Invalid Input");
        }
        else{
            lblFirstNameVal.setText(null);
        }
    }//GEN-LAST:event_txtFirstNameKeyReleased

    private void txtLastNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLastNameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]\\w{5,29}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtLastName.getText());
        if(!match.matches()){
            lblLastNameVal.setText("Invalid Input");
        }
        else{
            lblLastNameVal.setText(null);
        }
    }//GEN-LAST:event_txtLastNameKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[1-9][0-9]?$|^100$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtAge.getText());
        if(!match.matches()){
            lblAgeVal.setText("Invalid Input");
        }
        else{
            lblAgeVal.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void lblContactNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblContactNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "\\d{10}";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtContactNumber.getText());
        if(!match.matches()){
            lblContactNumberVal.setText("Invalid Input");
        }
        else{
            lblContactNumberVal.setText(null);
        }
        
    }//GEN-LAST:event_lblContactNumberKeyReleased

    private void txtHouseNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHouseNumberKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^\\d{1,9}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtHouseNumber.getText());
        if(!match.matches()){
            lblHouseNumberVal.setText("Invalid Input");
        }
        else{
            lblHouseNumberVal.setText(null);
        }
    }//GEN-LAST:event_txtHouseNumberKeyReleased

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]\\w{5, 29}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtCommunity.getText());
        if(!match.matches()){
            lblCommunityVal.setText("Invalid Input");
        }
        else{
            lblCommunityVal.setText(null);
        }
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Za-z]\\w{5, 29}$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtCity.getText());
        if(!match.matches()){
            lblCityVal.setText("Invalid Input");
        }
        else{
            lblCityVal.setText(null);
        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtTemperatureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[1-9][0-9][0-9]?$|^100$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtTemperature.getText());
        if(!match.matches()){
            lblTemperatureVal.setText("Invalid Input");
        }
        else{
            lblTemperatureVal.setText(null);
        }
    }//GEN-LAST:event_txtTemperatureKeyReleased

    private void txtBloodPressureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodPressureKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[1-9][0-9][0-9]?$|^100$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtBloodPressure.getText());
        if(!match.matches()){
            lblBloodPressureVal.setText("Invalid Input");
        }
        else{
            lblBloodPressureVal.setText(null);
        }
    }//GEN-LAST:event_txtBloodPressureKeyReleased

    private void txtPulseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[1-9][0-9][0-9]?$|^100$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtPulse.getText());
        if(!match.matches()){
            lblPulseVal.setText("Invalid Input");
        }
        else{
            lblPulseVal.setText(null);
        }
    }//GEN-LAST:event_txtPulseKeyReleased

    private void txtWeightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[1-9][0-9][0-9]?$|^100$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(txtWeight.getText());
        if(!match.matches()){
            lblWeightVal.setText("Invalid Input");
        }
        else{
            lblWeightVal.setText(null);
        }
    }//GEN-LAST:event_txtWeightKeyReleased

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        //Blood pressure
        //Age 20-35: 125 to 75
        //Age 36-50: 120 to 74
        //Age 51-65: 118 to 70
        //Age 66+: 119 to 72
        int totalAbnormalLongwood = 0;
        int totalAbnormalAllston  = 0;
        int totalBoston = 0;
        for(int i=0;i<encounterList.size();i++){
            
            if(patientDirectoryList.get(i).getCommunity().equalsIgnoreCase("Longwood")){
                if(patientDirectoryList.get(i).getContact() == encounterList.get(i).getContact()){
                    
                    if((patientDirectoryList.get(i).getAge()>20 && patientDirectoryList.get(i).getAge()<=35) && (encounterList.get(i).getBloodpressure()>=125 || encounterList.get(i).getBloodpressure()<75)){
                        totalAbnormalLongwood++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>36 && patientDirectoryList.get(i).getAge()<=50) && (encounterList.get(i).getBloodpressure()>=120 || encounterList.get(i).getBloodpressure()<74)){
                        totalAbnormalLongwood++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>51 && patientDirectoryList.get(i).getAge()<=65) && (encounterList.get(i).getBloodpressure()>=118 || encounterList.get(i).getBloodpressure()<70)){
                        totalAbnormalLongwood++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>=66) && (encounterList.get(i).getBloodpressure()>=119 || encounterList.get(i).getBloodpressure()<72)){
                        totalAbnormalLongwood++;
                    }
               }
            }
            else{
                if(patientDirectoryList.get(i).getContact().equals(encounterList.get(i).getContact())){
                    
                    if((patientDirectoryList.get(i).getAge()>20 && patientDirectoryList.get(i).getAge()<=35) && (encounterList.get(i).getBloodpressure()>=125 || encounterList.get(i).getBloodpressure()<75)){
                        
                        totalAbnormalAllston++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>36 && patientDirectoryList.get(i).getAge()<=50) && (encounterList.get(i).getBloodpressure()>=120 || encounterList.get(i).getBloodpressure()<74)){
                        
                        totalAbnormalAllston++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>51 && patientDirectoryList.get(i).getAge()<=65) && (encounterList.get(i).getBloodpressure()>=118 || encounterList.get(i).getBloodpressure()<70)){
                        
                        totalAbnormalAllston++;
                    }
                    else if((patientDirectoryList.get(i).getAge()>=66) && (encounterList.get(i).getBloodpressure()>=119 || encounterList.get(i).getBloodpressure()<72)){
                        
                        totalAbnormalAllston++;
                    }
                }
            }
        }
        totalBoston = totalAbnormalLongwood + totalAbnormalAllston; 
        JOptionPane.showMessageDialog(this, "Total abnormal people in Longwood: " + totalAbnormalLongwood);
        JOptionPane.showMessageDialog(this, "Total abnormal people in Allston: " + totalAbnormalAllston);
        JOptionPane.showMessageDialog(this, "Total abnormal people in Boston: " + totalBoston);
    }//GEN-LAST:event_btnSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAgeVal;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblBloodPressureVal;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCityVal;
    private javax.swing.JLabel lblCityVal4;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityVal;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblContactNumberVal;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateVal;
    private javax.swing.JLabel lblDoctor;
    private javax.swing.JLabel lblDoctorVal;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstNameVal;
    private javax.swing.JLabel lblHouseNumber;
    private javax.swing.JLabel lblHouseNumberVal;
    private javax.swing.JLabel lblIssue;
    private javax.swing.JLabel lblIssueVal;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLastNameVal;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblPulseVal;
    private javax.swing.JLabel lblTemperature;
    private javax.swing.JLabel lblTemperatureVal;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblWeightVal;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTable tblVitalSigns;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHouseNumber;
    private javax.swing.JTextField txtIssue;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
