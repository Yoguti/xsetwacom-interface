/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.yoguti.xsetwacomre;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLaf;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author schneider
 */
public class XsetWacomRE extends javax.swing.JDialog {

    /**
     * Creates new form XsetWacomRE
     */
    public XsetWacomRE(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
             try {
            // Set the Cupertino Dark theme
            //changed install to setup
            FlatLaf.setup(new FlatDarkLaf());
        } catch (Exception e) {
            System.err.println("Failed to initialize LaF");
        }    
        initializeComboBoxes();

    }
        // Method to initialize combo boxes
    private void initializeComboBoxes() {
        ComboBox_listdevices.removeAllItems();
        availableOptionsCombo.removeAllItems();
        rotationBox.removeAllItems();
        fillcomboBox(rotationBox, rotationOptions); 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabbedPane = new javax.swing.JTabbedPane();
        DefaultPane = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SliderThresh = new javax.swing.JSlider();
        SliderSupress = new javax.swing.JSlider();
        ThresholdButton = new javax.swing.JButton();
        PressureButton = new javax.swing.JButton();
        SupressButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        textx1 = new javax.swing.JTextField();
        texty1 = new javax.swing.JTextField();
        textx2 = new javax.swing.JTextField();
        texty2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rotationBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        AreaButton = new javax.swing.JButton();
        Areax1 = new javax.swing.JTextField();
        Areay1 = new javax.swing.JTextField();
        Areax2 = new javax.swing.JTextField();
        Areay2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SpecificPane = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        availableOptionsCombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        specific_text_area = new javax.swing.JTextArea();
        jButton9 = new javax.swing.JButton();
        insertedText = new javax.swing.JTextField();
        SaveButton1 = new javax.swing.JButton();
        LoadButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        exit_Button = new javax.swing.JButton();
        Recognize_Panel = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        ComboBox_listdevices = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setPreferredSize(new java.awt.Dimension(610, 530));
        setResizable(false);

        SliderThresh.setMajorTickSpacing(9);
        SliderThresh.setMinorTickSpacing(3);
        SliderThresh.setPaintTicks(true);
        SliderThresh.setSnapToTicks(true);
        SliderThresh.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        SliderSupress.setMajorTickSpacing(9);
        SliderSupress.setMinorTickSpacing(3);
        SliderSupress.setPaintTicks(true);
        SliderSupress.setSnapToTicks(true);
        SliderSupress.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        ThresholdButton.setText("set");
        ThresholdButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ThresholdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThresholdButtonActionPerformed(evt);
            }
        });

        PressureButton.setText("set");
        PressureButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PressureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PressureButtonActionPerformed(evt);
            }
        });

        SupressButton.setText("set");
        SupressButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SupressButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupressButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Pen Pressure Curve");

        jLabel5.setText("Suppress Level");

        jLabel6.setText("Threshold Adjustment");

        textx1.setForeground(new java.awt.Color(153, 153, 153));
        textx1.setText("x1");
        textx1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textx1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textx1FocusLost(evt);
            }
        });
        textx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textx1ActionPerformed(evt);
            }
        });

        texty1.setForeground(new java.awt.Color(153, 153, 153));
        texty1.setText("y1");
        texty1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                texty1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                texty1FocusLost(evt);
            }
        });

        textx2.setForeground(new java.awt.Color(153, 153, 153));
        textx2.setText("x2");
        textx2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textx2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textx2FocusLost(evt);
            }
        });

        texty2.setForeground(new java.awt.Color(153, 153, 153));
        texty2.setText("y2");
        texty2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                texty2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                texty2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(textx1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(texty1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textx2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(texty2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ThresholdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SupressButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SliderThresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SliderSupress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PressureButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(SliderThresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(ThresholdButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SliderSupress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SupressButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PressureButton)
                    .addComponent(textx1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textx2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(texty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rotationBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rotationBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rotationBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rotationBoxItemStateChanged(evt);
            }
        });

        jLabel9.setText("Active tablet area");

        AreaButton.setText("set");
        AreaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AreaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaButtonActionPerformed(evt);
            }
        });

        Areax1.setForeground(new java.awt.Color(153, 153, 153));
        Areax1.setText("x1");
        Areax1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Areax1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Areax1FocusLost(evt);
            }
        });

        Areay1.setForeground(new java.awt.Color(153, 153, 153));
        Areay1.setText("y1");
        Areay1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Areay1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Areay1FocusLost(evt);
            }
        });

        Areax2.setForeground(new java.awt.Color(153, 153, 153));
        Areax2.setText("x2");
        Areax2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Areax2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Areax2FocusLost(evt);
            }
        });

        Areay2.setForeground(new java.awt.Color(153, 153, 153));
        Areay2.setText("y2");
        Areay2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Areay2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Areay2FocusLost(evt);
            }
        });
        Areay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Areay2ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rotate-right(1).png"))); // NOI18N
        jLabel7.setText("Rotation");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wacom_tablet.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotationBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Areax1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Areay1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Areax2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Areay2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AreaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(0, 0, 0)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rotationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Areay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Areax1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Areax2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Areay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout DefaultPaneLayout = new javax.swing.GroupLayout(DefaultPane);
        DefaultPane.setLayout(DefaultPaneLayout);
        DefaultPaneLayout.setHorizontalGroup(
            DefaultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        DefaultPaneLayout.setVerticalGroup(
            DefaultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DefaultPaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(DefaultPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Default", DefaultPane);

        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("The specific tab allows you to execute any xsetwacom command");

        availableOptionsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        availableOptionsCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        availableOptionsCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                availableOptionsComboItemStateChanged(evt);
            }
        });
        availableOptionsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableOptionsComboActionPerformed(evt);
            }
        });
        availableOptionsCombo.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                availableOptionsComboPropertyChange(evt);
            }
        });
        availableOptionsCombo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                availableOptionsComboKeyPressed(evt);
            }
        });

        jLabel15.setText("Available commands");
        jLabel15.setFocusable(false);

        specific_text_area.setEditable(false);
        specific_text_area.setColumns(20);
        specific_text_area.setRows(5);
        specific_text_area.setFocusable(false);
        jScrollPane2.setViewportView(specific_text_area);

        jButton9.setText("set");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        insertedText.setForeground(new java.awt.Color(128, 128, 128));
        insertedText.setText("New value to be assigned to selected option in the found device");
        insertedText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                insertedTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                insertedTextFocusLost(evt);
            }
        });
        insertedText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertedTextActionPerformed(evt);
            }
        });

        SaveButton1.setText("Save");
        SaveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButton1ActionPerformed(evt);
            }
        });

        LoadButton1.setText("Load");
        LoadButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButton1ActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/information(1).png"))); // NOI18N
        jLabel14.setToolTipText("You don't need to specify the option or device, only the value.");
        jLabel14.setIconTextGap(0);

        javax.swing.GroupLayout SpecificPaneLayout = new javax.swing.GroupLayout(SpecificPane);
        SpecificPane.setLayout(SpecificPaneLayout);
        SpecificPaneLayout.setHorizontalGroup(
            SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecificPaneLayout.createSequentialGroup()
                .addGroup(SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SpecificPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, SpecificPaneLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(availableOptionsCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SpecificPaneLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(LoadButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SaveButton1))
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(SpecificPaneLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertedText, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        SpecificPaneLayout.setVerticalGroup(
            SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpecificPaneLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addGap(3, 3, 3)
                .addComponent(availableOptionsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpecificPaneLayout.createSequentialGroup()
                        .addGroup(SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(insertedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(SpecificPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SaveButton1)
                            .addComponent(LoadButton1)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TabbedPane.addTab("Specific", SpecificPane);

        exit_Button.setText("Exit");
        exit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_ButtonActionPerformed(evt);
            }
        });

        Recognize_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jButton2.setText("Find devices");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ComboBox_listdevices.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBox_listdevices.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboBox_listdevices.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboBox_listdevicesItemStateChanged(evt);
            }
        });
        ComboBox_listdevices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_listdevicesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Recognize_PanelLayout = new javax.swing.GroupLayout(Recognize_Panel);
        Recognize_Panel.setLayout(Recognize_PanelLayout);
        Recognize_PanelLayout.setHorizontalGroup(
            Recognize_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Recognize_PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Recognize_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ComboBox_listdevices, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );
        Recognize_PanelLayout.setVerticalGroup(
            Recognize_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Recognize_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ComboBox_listdevices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Recognize_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TabbedPane)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(exit_Button)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Recognize_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(TabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 28, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_Button)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_ButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_ButtonActionPerformed

    private void ThresholdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThresholdButtonActionPerformed
        int slider = SliderThresh.getValue();
        if(slider == 0){
            slider += 1;
        }
        int proportionalValue = (int) ((slider / 100.0) * 2047);
        String value = String.valueOf(proportionalValue);
        String device = null;

        // Iterate through ComboBox items to find a matching device
        for (int i = 0; i < ComboBox_listdevices.getItemCount(); i++) {
            String testdevice = (String) ComboBox_listdevices.getItemAt(i);
            if (testdevice != null && testdevice.contains("Pen")) {
                device = testdevice; // Found a device containing "Pen"
                break; // Exit the loop once a match is found
            }
        }

        // If no pad device was found, use the selected item
        if (device == null) {
            device = (String) ComboBox_listdevices.getSelectedItem();
        }

        // Get the selected rotation value and call LuaBridge if both are valid

        if (device != null) {
            String parameter = "Threshold";
            LuaBridge.CallBash(device, parameter, value);
            CallData newCall = new CallData(device, parameter, value);
            callList.add(newCall);
        }
    }//GEN-LAST:event_ThresholdButtonActionPerformed

    private void PressureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PressureButtonActionPerformed
        String device = null;

        // Iterate through ComboBox items to find a matching device
        for (int i = 0; i < ComboBox_listdevices.getItemCount(); i++) {
            String testdevice = (String) ComboBox_listdevices.getItemAt(i);
            if (testdevice != null && testdevice.contains("Pen")) {
                device = testdevice; // Found a device containing "Pen"
                break; // Exit the loop once a match is found
            }
        }

        // If no pad device was found, use the selected item
        if (device == null) {
            device = (String) ComboBox_listdevices.getSelectedItem();
        }

        // Get the selected rotation value and call LuaBridge if both are valid
        String x1 = textx1.getText();
        String y1 = texty1.getText();
        String x2 = textx2.getText();
        String y2 = texty2.getText();
        String value = x1 + " " + y1 + " " + x2 + " " + y2;

        if (device != null && value != null) {
            String parameter = "PressureCurve";
            LuaBridge.CallBash(device, parameter, value);
            CallData newCall = new CallData(device, parameter, value);
            callList.add(newCall);
        }

    }//GEN-LAST:event_PressureButtonActionPerformed

    private void SupressButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupressButtonActionPerformed
        int slider = SliderSupress.getValue();
        if(slider == 0){
            slider += 1;
        }
        String value = String.valueOf(slider);
        String device = null;

        // Iterate through ComboBox items to find a matching device
        for (int i = 0; i < ComboBox_listdevices.getItemCount(); i++) {
            String testdevice = (String) ComboBox_listdevices.getItemAt(i);
            if (testdevice != null && testdevice.contains("Pen")) {
                device = testdevice; // Found a device containing "Pen"
                break; // Exit the loop once a match is found
            }
        }

        // If no pad device was found, use the selected item
        if (device == null) {
            device = (String) ComboBox_listdevices.getSelectedItem();
        }

        // Get the selected rotation value and call LuaBridge if both are valid

        if (device != null) {
            String parameter = "Suppress";
            LuaBridge.CallBash(device, parameter, value);
            CallData newCall = new CallData(device, parameter, value);
            callList.add(newCall);
        }
    }//GEN-LAST:event_SupressButtonActionPerformed

    private void rotationBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rotationBoxItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String device = null;

            // Iterate through ComboBox items to find a matching device
            for (int i = 0; i < ComboBox_listdevices.getItemCount(); i++) {
                String testdevice = (String) ComboBox_listdevices.getItemAt(i);
                if (testdevice != null && testdevice.contains("Pen")) {
                    device = testdevice; // Found a device containing "Pen"
                    break; // Exit the loop once a match is found
                }
            }

            // If no pad device was found, use the selected item
            if (device == null) {
                device = (String) ComboBox_listdevices.getSelectedItem();
            }

            // Get the selected rotation value and call LuaBridge if both are valid
            String value = (String) rotationBox.getSelectedItem();
            if (device != null && value != null) {
                String parameter = "Rotate";
                LuaBridge.CallBash(device, parameter, value);
            }
        }
    }//GEN-LAST:event_rotationBoxItemStateChanged

    private void AreaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaButtonActionPerformed
        String device = null;

        // Iterate through ComboBox items to find a matching device
        for (int i = 0; i < ComboBox_listdevices.getItemCount(); i++) {
            String testdevice = (String) ComboBox_listdevices.getItemAt(i);
            if (testdevice != null && testdevice.contains("Pen")) {
                device = testdevice; // Found a device containing "Pen"
                break; // Exit the loop once a match is found
            }
        }

        // If no pad device was found, use the selected item
        if (device == null) {
            device = (String) ComboBox_listdevices.getSelectedItem();
        }

        // Get the selected rotation value and call LuaBridge if both are valid
        String x1 = Areax1.getText();
        String y1 = Areay1.getText();
        String x2 = Areax2.getText();
        String y2 = Areay2.getText();
        String value = x1 + " " + y1 + " " + x2 + " " + y2;

        if (device != null && value != null) {
            String parameter = "Area";
            LuaBridge.CallBash(device, parameter, value);
            CallData newCall = new CallData(device, parameter, value);
            callList.add(newCall);
        }

    }//GEN-LAST:event_AreaButtonActionPerformed

    private void Areax1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areax1FocusGained
        if(Areax1.getText().equals("x1")) {
            Areax1.setText("");
            Areax1.setForeground(Color.WHITE);

        }
    }//GEN-LAST:event_Areax1FocusGained

    private void Areax1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areax1FocusLost
        if(Areax1.getText().equals("")) {
            Areax1.setText("x1");
            Areax1.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Areax1FocusLost

    private void Areay1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areay1FocusGained
        if(Areay1.getText().equals("y1")) {
            Areay1.setText("");
            Areay1.setForeground(Color.WHITE);

        }

    }//GEN-LAST:event_Areay1FocusGained

    private void Areay1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areay1FocusLost
        if(Areay1.getText().equals("")) {
            Areay1.setText("y1");
            Areay1.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Areay1FocusLost

    private void Areax2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areax2FocusGained
        if(Areax2.getText().equals("x2")) {
            Areax2.setText("");
            Areax2.setForeground(Color.WHITE);

        }
    }//GEN-LAST:event_Areax2FocusGained

    private void Areax2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areax2FocusLost
        if(Areax2.getText().equals("")) {
            Areax2.setText("x2");
            Areax2.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Areax2FocusLost

    private void Areay2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areay2FocusGained
        if(Areay2.getText().equals("y2")) {
            Areay2.setText("");
            Areay2.setForeground(Color.WHITE);

        }
    }//GEN-LAST:event_Areay2FocusGained

    private void Areay2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Areay2FocusLost
        if(Areay2.getText().equals("")) {
            Areay2.setText("y2");
            Areay2.setForeground(Color.GRAY);

        }
    }//GEN-LAST:event_Areay2FocusLost

    private void Areay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Areay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Areay2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Call the Lua function to get devices
        devices_list = LuaBridge.lua_GetDevices();
        // If the list has valid devices, populate the combo box
        // Error handling for specific conditions
        if (devices_list.get(0).equals("no devices connected")) {
            JOptionPane.showMessageDialog(this, "Couldn't find any connected devices", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit if no devices are connected
        }
        if (devices_list.get(0).equals("not a table")) {
            JOptionPane.showMessageDialog(this, "Something went wrong with the getDevices function call", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit if the Lua function call failed
        }
        if (!devices_list.isEmpty()) {
            fillcomboBox(ComboBox_listdevices, devices_list);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ComboBox_listdevicesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboBox_listdevicesItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedItem = (String) ComboBox_listdevices.getSelectedItem();

            if (selectedItem == null || devices_list.isEmpty()) {
                return;
            }

            String lowerItem = selectedItem.toLowerCase();

            // Check the string content and fill combo boxes accordingly
            if (lowerItem.contains("pad")) {
                fillcomboBox(availableOptionsCombo, padList);
            } else if (lowerItem.contains("stylus")) {
                fillcomboBox(availableOptionsCombo, stylusList);
            } else if (lowerItem.contains("eraser")) {
                fillcomboBox(availableOptionsCombo, eraserList);
            } else if (lowerItem.contains("touch")) {
                fillcomboBox(availableOptionsCombo, touchList);
            } else {
                available_options = LuaBridge.lua_getValidOptions(selectedItem);
                if (available_options.get(0).equals("no valid options found")) {
                    List<String> nomethods = new ArrayList<>();
                    nomethods.add("no options found for the selected device");
                    fillcomboBox(availableOptionsCombo, nomethods);
                    return;
                }
                // Populate the combo box with valid options (if any)
                fillcomboBox(availableOptionsCombo, available_options);
            }
        }
    }//GEN-LAST:event_ComboBox_listdevicesItemStateChanged

    private void ComboBox_listdevicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_listdevicesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_listdevicesActionPerformed

    private void availableOptionsComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_availableOptionsComboItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String selectedItem = (String) availableOptionsCombo.getSelectedItem();

            switch (selectedItem) {
                case "ZoomDistance":
                specific_text_area.setText(
                    "-- ZoomDistance command\n"
                    + "-- Range: Any valid zoom distance value\n"
                    + "-- Default: Depends on the system configuration\n"
                    + "-- Example: ZoomDistance('Wacom Intuos Pro', 'ZoomDistance', '5')"
                );
                break;
                case "Gesture":
                specific_text_area.setText(
                    "-- Gesture command\n"
                    + "-- Range: on, off\n"
                    + "-- Default: on\n"
                    + "-- Example: Gesture('Wacom Intuos Pro', 'Gesture', 'off')"
                );
                break;
                case "RawSample":
                specific_text_area.setText(
                    "-- RawSample command\n"
                    + "-- Range: 1 to 20\n"
                    + "-- Default: 2\n"
                    + "-- Example: RawSample('Wacom Intuos Pro', 'RawSample', 10)"
                );
                break;
                case "Button":
                specific_text_area.setText(
                    "-- Button command\n"
                    + "-- Range: 1 to 32\n"
                    + "-- Default: 1\n"
                    + "-- Example: Button('Wacom Intuos Pro', 'Button', 5')"
                );
                break;
                case "Keymap":
                specific_text_area.setText(
                    "-- Keymap command\n"
                    + "-- Range: Any valid keymap\n"
                    + "-- Default: Depends on the system configuration\n"
                    + "-- Example: Keymap('Wacom Intuos Pro', 'Keymap', 'some_keymap')"
                );
                break;
                case "PressureCurve":
                specific_text_area.setText(
                    "-- PressureCurve command\n"
                    + "-- Range: A valid curve string (e.g., '0 1 0 1')\n"
                    + "-- Default: Depends on the system configuration\n"
                    + "-- Example: PressureCurve('Wacom Intuos Pro', 'PressureCurve', '0 1 0 1')"
                );
                break;
                case "MapToScreen":
                specific_text_area.setText(
                    "-- MapToScreen command\n"
                    + "-- Range: on, off\n"
                    + "-- Default: on\n"
                    + "-- Example: MapToScreen('Wacom Intuos Pro', 'MapToScreen', 'off')"
                );
                break;
                case "MouseMode":
                specific_text_area.setText(
                    "-- MouseMode command\n"
                    + "-- Range: on, off\n"
                    + "-- Default: off\n"
                    + "-- Example: MouseMode('Wacom Intuos Pro', 'MouseMode', 'on')"
                );
                break;
                case "Speed":
                specific_text_area.setText(
                    "-- Speed command\n"
                    + "-- Range: 1 to 100\n"
                    + "-- Default: 10\n"
                    + "-- Example: Speed('Wacom Intuos Pro', 'Speed', 20')"
                );
                break;
                case "Hardness":
                specific_text_area.setText(
                    "-- Hardness command\n"
                    + "-- Range: 0 to 100\n"
                    + "-- Default: 50\n"
                    + "-- Example: Hardness('Wacom Intuos Pro', 'Hardness', 80)"
                );
                break;
                case "Acceleration":
                specific_text_area.setText(
                    "-- Acceleration command\n"
                    + "-- Range: 0 to 10\n"
                    + "-- Default: 1\n"
                    + "-- Example: Acceleration('Wacom Intuos Pro', 'Acceleration', 3')"
                );
                break;
                case "SpeedFactor":
                specific_text_area.setText(
                    "-- SpeedFactor command\n"
                    + "-- Range: 0.1 to 10\n"
                    + "-- Default: 1.0\n"
                    + "-- Example: SpeedFactor('Wacom Intuos Pro', 'SpeedFactor', 2.5)"
                );
                break;
                case "ClickDistance":
                specific_text_area.setText(
                    "-- ClickDistance command\n"
                    + "-- Range: 0 to 100\n"
                    + "-- Default: 10\n"
                    + "-- Example: ClickDistance('Wacom Intuos Pro', 'ClickDistance', 25)"
                );
                break;
                case "Mapping":
                specific_text_area.setText(
                    "-- Mapping command\n"
                    + "-- Range: x1, y1, x2, y2 >= 0; x1 < x2, y1 < y2\n"
                    + "-- Default: 0 0 10000 10000\n"
                    + "-- Example: Mapping('Wacom Intuos Pro', 'Mapping', 0, 0, 2000, 2000)"
                );
                break;
                case "Screen":
                specific_text_area.setText(
                    "-- Screen command\n"
                    + "-- Range: left, right, top, bottom\n"
                    + "-- Default: left\n"
                    + "-- Example: Screen('Wacom Intuos Pro', 'Screen', 'top')"
                );
                break;
                case "ButtonMap":
                specific_text_area.setText(
                    "-- ButtonMap command\n"
                    + "-- Range: Valid button mapping (e.g., '1', '2', '3')\n"
                    + "-- Default: Depends on the system configuration\n"
                    + "-- Example: ButtonMap('Wacom Intuos Pro', 'ButtonMap', '1')"
                );
                break;
                case "PenMode":
                specific_text_area.setText(
                    "-- PenMode command\n"
                    + "-- Range: normal, sensitive\n"
                    + "-- Default: normal\n"
                    + "-- Example: PenMode('Wacom Intuos Pro', 'PenMode', 'sensitive')"
                );
                break;
                case "ClickThreshold":
                specific_text_area.setText(
                    "-- ClickThreshold command\n"
                    + "-- Range: 0 to 100\n"
                    + "-- Default: 50\n"
                    + "-- Example: ClickThreshold('Wacom Intuos Pro', 'ClickThreshold', 30)"
                );
                break;
                case "DeviceName":
                specific_text_area.setText(
                    "-- DeviceName command\n"
                    + "-- Range: Any non-empty string\n"
                    + "-- Default: Varies\n"
                    + "-- Example: DeviceName('Wacom Intuos Pro', 'DeviceName', 'My Tablet')"
                );
                break;
                case "RotateAt":
                specific_text_area.setText(
                    "-- RotateAt command\n"
                    + "-- Range: 0 to 360\n"
                    + "-- Default: 0\n"
                    + "-- Example: RotateAt('Wacom Intuos Pro', 'RotateAt', 90)"
                );
                break;
                case "ScrollDistance":
                specific_text_area.setText(
                    "-- ScrollDistance command\n"
                    + "-- Range: 1 to 100\n"
                    + "-- Default: 20\n"
                    + "-- Example: ScrollDistance('Wacom Intuos Pro', 'ScrollDistance', '25')"
                );
                break;
                case "TapTime":
                specific_text_area.setText(
                    "-- TapTime command\n"
                    + "-- Range: 1 to 1000 (milliseconds)\n"
                    + "-- Default: 250\n"
                    + "-- Example: TapTime('Wacom Intuos Pro', 'TapTime', '300')"
                );
                break;
                case "TableTabletPCButton":
                specific_text_area.setText(
                    "-- TableTabletPCButton command\n"
                    + "-- Options: On, Off\n"
                    + "-- Default: On for Tablet PCs, Off for other models\n"
                    + "-- Example: TableTabletPCButton('Wacom Intuos Pro', 'TableTabletPCButton', 'On')\n"
                );
                break;

                case "Touch":
                specific_text_area.setText(
                    "-- Touch command\n"
                    + "-- Options: On, Off\n"
                    + "-- Default: On for devices with touch support, Off for others\n"
                    + "-- Example: Touch('Wacom Intuos Pro', 'Touch', 'On')\n"
                );
                break;

                case "HWTouchSwitchState":
                specific_text_area.setText(
                    "-- HWTouchSwitchState command\n"
                    + "-- Options: On, Off\n"
                    + "-- Default: On for devices with touch support, Off for others\n"
                    + "-- Example: HWTouchSwitchState('Wacom Intuos Pro', 'HWTouchSwitchState', 'On')\n"
                );
                break;

                case "CursorProximity":
                specific_text_area.setText(
                    "-- CursorProximity command\n"
                    + "-- Range: Distance from the tablet (number)\n"
                    + "-- Default: 10 for Intuos series, 42 for Graphire series\n"
                    + "-- Example: CursorProximity('Wacom Intuos Pro', 'CursorProximity', 10)\n"
                );
                break;

                case "RelWheelUp":
                specific_text_area.setText(
                    "-- RelWheelUp command\n"
                    + "-- Range: X11 events (value should be an X11 event)\n"
                    + "-- Default: None (manual mapping required)\n"
                    + "-- Example: RelWheelUp('Wacom Intuos Pro', 'RelWheelUp', 'button 4')\n"
                );
                break;

                case "RelWheelDown":
                specific_text_area.setText(
                    "-- RelWheelDown command\n"
                    + "-- Range: X11 events (value should be an X11 event)\n"
                    + "-- Default: None (manual mapping required)\n"
                    + "-- Example: RelWheelDown('Wacom Intuos Pro', 'RelWheelDown', 'button 5')\n"
                );
                break;

                case "AbsWheelUp":
                specific_text_area.setText(
                    "-- AbsWheelUp command\n"
                    + "-- Range: X11 events (value should be an X11 event)\n"
                    + "-- Default: None (manual mapping required)\n"
                    + "-- Example: AbsWheelUp('Wacom Intuos Pro', 'AbsWheelUp', 'button 4')\n"
                );
                break;

                case "AbsWheelDown":
                specific_text_area.setText(
                    "-- AbsWheelDown command\n"
                    + "-- Range: X11 events (value should be an X11 event)\n"
                    + "-- Default: None (manual mapping required)\n"
                    + "-- Example: AbsWheelDown('Wacom Intuos Pro', 'AbsWheelDown', 'button 5')\n"
                );
                break;

                case "ResetArea":
                specific_text_area.setText(
                    "-- ResetArea command\n"
                    + "-- Range: This function does not require a value\n"
                    + "-- Default: Resets to default values (0 0 x2 y2, where x2 and y2 are the width and height of the tablet)\n"
                    + "-- Example: ResetArea('Wacom Intuos Pro', 'ResetArea')\n"
                );
                break;

                case "ToolSerial":
                specific_text_area.setText(
                    "-- ToolSerial command\n"
                    + "-- Range: Serial number of the tool\n"
                    + "-- Default: None (returns the serial number of the tool in proximity)\n"
                    + "-- Example: ToolSerial('Wacom Intuos Pro', 'ToolSerial')\n"
                );
                break;

                case "ToolSerialPrevious":
                specific_text_area.setText(
                    "-- ToolSerialPrevious command\n"
                    + "-- Range: Serial number of the previous tool\n"
                    + "-- Default: None (read-only)\n"
                    + "-- Example: ToolSerialPrevious('Wacom Intuos Pro', 'ToolSerialPrevious')\n"
                );
                break;

                case "ToolSerials":
                specific_text_area.setText(
                    "-- ToolSerials command\n"
                    + "-- Range: List of serial numbers for hotplugging\n"
                    + "-- Default: None (set list as needed)\n"
                    + "-- Example: ToolSerials('Wacom Intuos Pro', 'ToolSerials', '12345 67890 11223')\n"
                );
                break;

                case "BindToSerial":
                specific_text_area.setText(
                    "-- Serial command\n"
                    + "-- Range: Serial number for the device\n"
                    + "-- Default: None (set to specific serial number)\n"
                    + "-- Example: BindToSerial('Wacom Intuos Pro', 'BindToSerial', '123456789')\n"
                );
                break;

                case "TabletDebugLevel":
                specific_text_area.setText(
                    "-- TabletDebugLevel command\n"
                    + "-- Range: 1 to 12 (levels of debugging for common code paths)\n"
                    + "-- Default: None (based on the specified level)\n"
                    + "-- Example: TabletDebugLevel('Wacom Intuos Pro', 'TabletDebugLevel', 5)\n"
                );
                break;

                case "CursorProx":
                specific_text_area.setText(
                    "-- CursorProx command\n"
                    + "-- Range: Distance from tablet (number)\n"
                    + "-- Default: 10 for Intuos series, 42 for Graphire series\n"
                    + "-- Example: CursorProx('Wacom Intuos Pro', 'CursorProx', 10)\n"
                );
                break;

                case "ToolDebugLevel":
                specific_text_area.setText(
                    "-- ToolDebugLevel command\n"
                    + "-- Range: 1 to 12 (levels of debugging)\n"
                    + "-- Default: None (based on the specified level)\n"
                    + "-- Example: ToolDebugLevel('Wacom Intuos Pro', 'ToolDebugLevel', 3)\n"
                );
                break;

                case "MapToOutput":
                specific_text_area.setText(
                    "-- MapToOutput command\n"
                    + "-- Options: Output names (e.g., VGA1) or geometry strings\n"
                    + "-- Default: None (needs specific output mapping)\n"
                    + "-- Example: MapToOutput('Wacom Intuos Pro', 'MapToOutput', 'VGA1')\n"
                );
                break;

                case "PanScrollThreshold":
                specific_text_area.setText(
                    "-- PanScrollThreshold command\n"
                    + "-- Range: Distance required for pan actions (number)\n"
                    + "-- Default: None (adjustable based on preference)\n"
                    + "-- Example: PanScrollThreshold('Wacom Intuos Pro', 'PanScrollThreshold', 15)\n"
                );
                break;

                case "PressureRecalibration":
                specific_text_area.setText(
                    "-- PressureRecalibration command\n"
                    + "-- Range: Options: On, Off\n"
                    + "-- Default: On\n"
                    + "-- Example: PressureRecalibration('Wacom Intuos Pro', 'PressureRecalibration', 'On')\n"
                );
                break;

                case "TabletID":
                specific_text_area.setText(
                    "-- TabletID command\n"
                    + "-- Range: Tablet ID\n"
                    + "-- Default: None (returns the tablet ID)\n"
                    + "-- Example: TabletID('Wacom Intuos Pro', 'TabletID')\n"
                );
                break;
                case "Area":
                specific_text_area.setText(
                    "-- Area command\n"
                    + "-- Range: X1 Y1 X2 Y2 (coordinates for the active area in tablet units)\n"
                    + "-- Default: 0 0 width height of the tablet\n"
                    + "-- Example: Area('Wacom Intuos Pro', 'Area', '0 0 10000 6250')\n"
                );
                break;

                case "Suppress":
                specific_text_area.setText(
                    "-- Suppress command\n"
                    + "-- Range: 0 to 100 (threshold for suppressing small movements)\n"
                    + "-- Default: 2 (appropriate for most users)\n"
                    + "-- Example: Suppress('Wacom Intuos Pro', 'Suppress', 4)\n"
                );
                break;

                case "PressCurve":
                specific_text_area.setText(
                    "-- PressCurve command\n"
                    + "-- Range: Four points (x1 y1 x2 y2) defining the pressure response curve\n"
                    + "-- Default: 0 0 100 100 (linear response)\n"
                    + "-- Example: PressCurve('Wacom Intuos Pro', 'PressCurve', '10 20 80 90')\n"
                );
                break;

                case "Mode":
                specific_text_area.setText(
                    "-- Mode command\n"
                    + "-- Options: Absolute or Relative\n"
                    + "-- Default: Absolute\n"
                    + "-- Example: Mode('Wacom Intuos Pro', 'Mode', 'Relative')\n"
                );
                break;

                case "TabletPCButton":
                specific_text_area.setText(
                    "-- TabletPCButton command\n"
                    + "-- Options: On, Off\n"
                    + "-- Default: On for Tablet PCs, Off for other models\n"
                    + "-- Example: TabletPCButton('Wacom Intuos Pro', 'TabletPCButton', 'Off')\n"
                );
                break;

                case "Rotate":
                specific_text_area.setText(
                    "-- Rotate command\n"
                    + "-- Options: None, Half, CW, CCW (counterclockwise)\n"
                    + "-- Default: None\n"
                    + "-- Example: Rotate('Wacom Intuos Pro', 'Rotate', 'CCW')\n"
                );
                break;

                case "Threshold":
                specific_text_area.setText(
                    "-- Threshold command\n"
                    + "-- Range: 0 to 2047 (the pressure threshold for button clicks)\n"
                    + "-- Default: 27\n"
                    + "-- Example: Threshold('Wacom Intuos Pro', 'Threshold', 50)\n"
                );
                break;

                default:
                specific_text_area.setText("Unknown command selected.");
                break;
            }
        }

    }//GEN-LAST:event_availableOptionsComboItemStateChanged

    private void availableOptionsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availableOptionsComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableOptionsComboActionPerformed

    private void availableOptionsComboPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_availableOptionsComboPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_availableOptionsComboPropertyChange

    private void availableOptionsComboKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_availableOptionsComboKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_availableOptionsComboKeyPressed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!insertedText.getText().equals("New value to be assigned to selected option in the found device")){
            String value = insertedText.getText();
            String device = (String) ComboBox_listdevices.getSelectedItem();
            String parameter = (String) availableOptionsCombo.getSelectedItem();
            LuaBridge.CallBash(device, parameter, value);

            // Remove any existing call with the same parameter
            callList.removeIf(call -> call.getParameter().equals(parameter));

            // Add the new call to the list
            CallData newCall = new CallData(device, parameter, value);
            callList.add(newCall);
            //I want to store every single call to the CallBash method, I want to store the values that were passe in (device, parameter, value) for every single call and put them on a list.
            //To be clear! before adding the call to the list check if there isnt already a call stored for that same parameter, if the new call parameter == old call parameter, remove the old call from the list and add the new one in.

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void insertedTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insertedTextFocusGained
        if(insertedText.getText().equals("New value to be assigned to selected option in the found device")) {
            insertedText.setText("");
            insertedText.setForeground(Color.WHITE);
        }

    }//GEN-LAST:event_insertedTextFocusGained

    private void insertedTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_insertedTextFocusLost
        if(insertedText.getText().equals("")) {
            insertedText.setText("New value to be assigned to selected option in the found device");
            insertedText.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_insertedTextFocusLost

    private void insertedTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertedTextActionPerformed

    }//GEN-LAST:event_insertedTextActionPerformed

    private void SaveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButton1ActionPerformed
        //okay here i want you to call a method. That method will be stored in the luabridge class and will do the following =
        //It will take that list of calls and put it in a file (you can call a JFileChooser here so the user can select where they want to store it.
            //that file will contain each of the calls in the list ( a call single call consists of device, parameter, value)
            //the file name will be somethingtheusedecides.wacom

            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save .wacom File");
            int userSelection = fileChooser.showSaveDialog(this);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File fileToSave = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileToSave.getAbsolutePath() + ".wacom"))) {
                    for (CallData call : callList) {
                        writer.write(call.getDevice() + "," + call.getParameter() + "," + call.getValue());
                        writer.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();  // Handle exceptions appropriately
                }
            }
    }//GEN-LAST:event_SaveButton1ActionPerformed

    private void LoadButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButton1ActionPerformed
        
    // Open a file chooser that only allows .wacom files to be selected
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Open .wacom File");
    fileChooser.setFileFilter(new FileNameExtensionFilter(".wacom files", "wacom"));
    int userSelection = fileChooser.showOpenDialog(this);  // Assuming 'this' refers to a JFrame or JPanel context

    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToLoad = fileChooser.getSelectedFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileToLoad))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                // Ensure exactly 3 parts (device, parameter, value)
                if (parts.length == 3) {
                    // Trim each part to remove unnecessary whitespace
                    String device = parts[0].trim();
                    String parameter = parts[1].trim();
                    String value = parts[2].trim();
                    
                    // Log the values to check if they are parsed correctly
                    System.out.println("Device: " + device + ", Parameter: " + parameter + ", Value: " + value);

                    // Call the LuaBridge with the parsed values
                    LuaBridge.CallBash(device, parameter, value);
                } else {
                    System.out.println("Invalid line format: " + line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_LoadButton1ActionPerformed

    private void textx1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textx1FocusGained
        if(textx1.getText().equals("x1")) {
            textx1.setText("");
            textx1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_textx1FocusGained

    private void texty1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texty1FocusGained
        if(texty1.getText().equals("y1")) {
            texty1.setText("");
            texty1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_texty1FocusGained

    private void textx2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textx2FocusGained
        if(textx2.getText().equals("x2")) {
            textx2.setText("");
            textx2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_textx2FocusGained

    private void texty2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texty2FocusGained
        if(texty2.getText().equals("y2")) {
            texty2.setText("");
            texty2.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_texty2FocusGained

    private void textx1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textx1FocusLost
        if(textx1.getText().equals("")) {
            textx1.setText("x1");
            textx1.setForeground(Color.GRAY);

        }
       
    }//GEN-LAST:event_textx1FocusLost

    private void textx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textx1ActionPerformed

    private void texty1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texty1FocusLost
        if(texty1.getText().equals("")) {
            texty1.setText("y1");
            texty1.setForeground(Color.GRAY);

        }
           }//GEN-LAST:event_texty1FocusLost

    private void textx2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textx2FocusLost
        if(textx2.getText().equals("")) {
            textx2.setText("x2");
            textx2.setForeground(Color.GRAY);

        }
           }//GEN-LAST:event_textx2FocusLost

    private void texty2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_texty2FocusLost
        if(texty2.getText().equals("")) {
            texty2.setText("y2");
            texty2.setForeground(Color.GRAY);

        }
           }//GEN-LAST:event_texty2FocusLost
    
    
    private void fillcomboBox(JComboBox n, List<String> e) {
        n.removeAllItems();
        for (int i = 0; i < e.size(); i++) {
            n.addItem(e.get(i).toString());
        }
    }

    List<String> devices_list;
    List<String> available_options;

    List<String> rotationOptions = new ArrayList<>(Arrays.asList(
            "none","half","cw","ccw"
    ));
    
    List<String> eraserList = new ArrayList<>(Arrays.asList(
            "Area",
            "ToolDebugLevel",
            "TabletDebugLevel",
            "Suppress",
            "RawSample",
            "PressCurve",
            "Mode",
            "Touch",
            "Gesture",
            "ZoomDistance",
            "ScrollDistance",
            "TapTime",
            "CursorProx",
            "Rotate",
            "Threshold",
            "BindToSerial",
            "PressureRecalibration",
            "PanScrollThreshold"
    ));

    List<String> touchList = new ArrayList<>(Arrays.asList(
            "Area",
            "ToolDebugLevel",
            "TabletDebugLevel",
            "Suppress",
            "RawSample",
            "PressCurve",
            "Mode",
            "Touch",
            "Gesture",
            "ZoomDistance",
            "ScrollDistance",
            "TapTime",
            "Rotate",
            "Threshold",
            "BindToSerial",
            "PanScrollThreshold"
    ));

    List<String> padList = new ArrayList<>(Arrays.asList(
            "ToolDebugLevel",
            "TabletDebugLevel",
            "Suppress",
            "RawSample",
            "Mode",
            "Touch",
            "Gesture",
            "ZoomDistance",
            "ScrollDistance",
            "TapTime",
            "Threshold",
            "BindToSerial",
            "PanScrollThreshold"
    ));

    List<String> stylusList = new ArrayList<>(Arrays.asList(
            "Area",
            "ToolDebugLevel",
            "TabletDebugLevel",
            "Suppress",
            "RawSample",
            "PressCurve",
            "Mode",
            "TabletPCButton",
            "Touch",
            "Gesture",
            "ZoomDistance",
            "ScrollDistance",
            "TapTime",
            "CursorProx",
            "Rotate",
            "Threshold",
            "BindToSerial",
            "PressureRecalibration",
            "PanScrollThreshold"
    ));
    private List<CallData> callList = new ArrayList<>();

    public static void main(String args[]) {
    try {
            // Apply FlatDarkLaf Look and Feel at startup
            FlatLaf.setup(new FlatDarkLaf());
        } catch (Exception e) {
            System.err.println("Failed to initialize FlatLaf");
        }

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                XsetWacomRE dialog = new XsetWacomRE(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setLocationRelativeTo(null); 
                dialog.setTitle("xsetwacom interface");
                dialog.setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AreaButton;
    private javax.swing.JTextField Areax1;
    private javax.swing.JTextField Areax2;
    private javax.swing.JTextField Areay1;
    private javax.swing.JTextField Areay2;
    private javax.swing.JComboBox<String> ComboBox_listdevices;
    private javax.swing.JPanel DefaultPane;
    private javax.swing.JButton LoadButton1;
    private javax.swing.JButton PressureButton;
    private javax.swing.JPanel Recognize_Panel;
    private javax.swing.JButton SaveButton1;
    private javax.swing.JSlider SliderSupress;
    private javax.swing.JSlider SliderThresh;
    private javax.swing.JPanel SpecificPane;
    private javax.swing.JButton SupressButton;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton ThresholdButton;
    private javax.swing.JComboBox<String> availableOptionsCombo;
    private javax.swing.JButton exit_Button;
    private javax.swing.JTextField insertedText;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JComboBox<String> rotationBox;
    private javax.swing.JTextArea specific_text_area;
    private javax.swing.JTextField textx1;
    private javax.swing.JTextField textx2;
    private javax.swing.JTextField texty1;
    private javax.swing.JTextField texty2;
    // End of variables declaration//GEN-END:variables
}
