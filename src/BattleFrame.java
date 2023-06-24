
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rkaune
 */
public class BattleFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public BattleFrame() {
        initComponents();
        UIManager.InitilizePosition(position1, arrow1, 0);
        UIManager.InitilizePosition(position2, arrow2, 1);
        UIManager.InitilizePosition(position3, arrow3, 2);
        UIManager.InitilizePosition(position4, arrow4, 3);
        UIManager.InitilizePosition(position5, arrow5, 4);
        UIManager.InitilizePosition(position6, arrow6, 5);
        UIManager.InitilizePosition(position7, arrow7, 6);
        UIManager.InitilizePosition(position8, arrow8, 7);
        OrderModule.AddUnit(new Unit(0), 0);
        OrderModule.AddUnit(new Unit(1), 1);
        OrderModule.AddUnit(new Unit(2),2);
        OrderModule.AddUnit(new Unit(3), 3);
        OrderModule.AddUnit(new Unit(4), 4);
        OrderModule.AddUnit(new Unit(5), 5);
        OrderModule.AddUnit(new Unit(6), 6);
        OrderModule.AddUnit(new Unit(7), 7);
        UIManager.InitilizeMainArrows(redArrow, blueArrow);
        UIManager.InitilizeGUI(healthLabel, defenceLabel, speedLabel);
        UIManager.InitilizeHitButton(select1, 0);
        UIManager.InitilizeHitButton(select2, 1);
        UIManager.InitilizeHitButton(select3, 2);
        UIManager.InitilizeHitButton(select4, 3);
        UIManager.InitilizeHitButton(select5, 4);
        UIManager.InitilizeHitButton(select6, 5);
        UIManager.InitilizeHitButton(select6, 6);
        UIManager.InitilizeHitButton(select7, 7);
        UIManager.InitilizeMoveButton(move1);
        UIManager.InitilizeMoveButton(move2);
        UIManager.InitilizeMoveButton(move3);
        UIManager.InitilizeMoveButton(move4);
        UIManager.InitilizeMoveInfo(movesetInfo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        positionPanel = new javax.swing.JPanel();
        position1 = new javax.swing.JLabel();
        position3 = new javax.swing.JLabel();
        position5 = new javax.swing.JLabel();
        position2 = new javax.swing.JLabel();
        position4 = new javax.swing.JLabel();
        position6 = new javax.swing.JLabel();
        position7 = new javax.swing.JLabel();
        position8 = new javax.swing.JLabel();
        sortPanel = new javax.swing.JPanel();
        arrow1 = new javax.swing.JLabel();
        arrow2 = new javax.swing.JLabel();
        arrow3 = new javax.swing.JLabel();
        arrow4 = new javax.swing.JLabel();
        arrow5 = new javax.swing.JLabel();
        arrow6 = new javax.swing.JLabel();
        arrow7 = new javax.swing.JLabel();
        arrow8 = new javax.swing.JLabel();
        redArrow = new javax.swing.JLabel();
        blueArrow = new javax.swing.JLabel();
        sortSlot1 = new javax.swing.JButton();
        selectionPanel = new javax.swing.JPanel();
        select1 = new javax.swing.JButton();
        select2 = new javax.swing.JButton();
        select3 = new javax.swing.JButton();
        select4 = new javax.swing.JButton();
        select5 = new javax.swing.JButton();
        select6 = new javax.swing.JButton();
        select7 = new javax.swing.JButton();
        select8 = new javax.swing.JButton();
        moveSetPanel = new javax.swing.JPanel();
        move1 = new javax.swing.JButton();
        move2 = new javax.swing.JButton();
        move3 = new javax.swing.JButton();
        move4 = new javax.swing.JButton();
        move5 = new javax.swing.JButton();
        infoPanel = new javax.swing.JPanel();
        healthLabel = new javax.swing.JLabel();
        defenceLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        movesetInfo = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1782, 972));
        setMinimumSize(new java.awt.Dimension(1782, 972));
        setPreferredSize(new java.awt.Dimension(1782, 972));
        setResizable(false);

        main.setBackground(new java.awt.Color(60, 63, 64));
        main.setMaximumSize(new java.awt.Dimension(1782, 972));
        main.setMinimumSize(new java.awt.Dimension(1782, 972));
        main.setPreferredSize(new java.awt.Dimension(1782, 972));

        positionPanel.setBackground(new java.awt.Color(153, 153, 153));

        position1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Crusader.png"))); // NOI18N
        position1.setText("position1");
        position1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position1MouseEntered(evt);
            }
        });

        position3.setText("position1");
        position3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position3MouseEntered(evt);
            }
        });

        position5.setText("position1");
        position5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position5MouseEntered(evt);
            }
        });

        position2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Crusader.png"))); // NOI18N
        position2.setText("position1");
        position2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position2MouseEntered(evt);
            }
        });

        position4.setText("position1");
        position4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position4MouseEntered(evt);
            }
        });

        position6.setText("position1");
        position6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position6MouseEntered(evt);
            }
        });

        position7.setText("position1");
        position7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position7MouseEntered(evt);
            }
        });

        position8.setText("position1");
        position8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                position8MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout positionPanelLayout = new javax.swing.GroupLayout(positionPanel);
        positionPanel.setLayout(positionPanelLayout);
        positionPanelLayout.setHorizontalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(position1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(position8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        positionPanelLayout.setVerticalGroup(
            positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(positionPanelLayout.createSequentialGroup()
                .addGroup(positionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position1)
                    .addComponent(position3)
                    .addComponent(position5)
                    .addComponent(position2)
                    .addComponent(position4)
                    .addComponent(position6)
                    .addComponent(position7)
                    .addComponent(position8))
                .addGap(1, 1, 1))
        );

        sortPanel.setBackground(new java.awt.Color(51, 51, 51));
        sortPanel.setOpaque(false);

        arrow1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        arrow8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        redArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/redArrow2.png"))); // NOI18N

        blueArrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blueArrow.png"))); // NOI18N

        sortSlot1.setBackground(new java.awt.Color(102, 153, 255));
        sortSlot1.setFont(new java.awt.Font("Eras Medium ITC", 0, 24)); // NOI18N
        sortSlot1.setText("jButton1");

        javax.swing.GroupLayout sortPanelLayout = new javax.swing.GroupLayout(sortPanel);
        sortPanel.setLayout(sortPanelLayout);
        sortPanelLayout.setHorizontalGroup(
            sortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(redArrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sortPanelLayout.createSequentialGroup()
                        .addComponent(blueArrow)
                        .addGap(725, 725, 725)
                        .addComponent(sortSlot1))
                    .addGroup(sortPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(arrow1)
                        .addGap(168, 168, 168)
                        .addComponent(arrow2)
                        .addGap(162, 162, 162)
                        .addComponent(arrow3)
                        .addGap(168, 168, 168)
                        .addComponent(arrow4)
                        .addGap(168, 168, 168)
                        .addComponent(arrow5)
                        .addGap(168, 168, 168)
                        .addComponent(arrow6)
                        .addGap(168, 168, 168)
                        .addComponent(arrow7)
                        .addGap(168, 168, 168)
                        .addComponent(arrow8)))
                .addContainerGap())
        );
        sortPanelLayout.setVerticalGroup(
            sortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sortPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(sortSlot1)
                .addGap(5, 5, 5)
                .addGroup(sortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrow8)
                    .addComponent(arrow7)
                    .addComponent(arrow6)
                    .addComponent(arrow5)
                    .addComponent(arrow4)
                    .addComponent(arrow3)
                    .addComponent(arrow2)
                    .addComponent(arrow1)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sortPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sortPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(redArrow)
                    .addComponent(blueArrow))
                .addContainerGap())
        );

        selectionPanel.setBackground(new java.awt.Color(153, 153, 153));

        select1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        select2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        select3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select3ActionPerformed(evt);
            }
        });

        select4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select4ActionPerformed(evt);
            }
        });

        select5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select5ActionPerformed(evt);
            }
        });

        select6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select6ActionPerformed(evt);
            }
        });

        select7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select7ActionPerformed(evt);
            }
        });

        select8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/selector.png"))); // NOI18N
        select8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectionPanelLayout = new javax.swing.GroupLayout(selectionPanel);
        selectionPanel.setLayout(selectionPanelLayout);
        selectionPanelLayout.setHorizontalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(select1)
                .addGap(93, 93, 93)
                .addComponent(select2)
                .addGap(93, 93, 93)
                .addComponent(select3)
                .addGap(93, 93, 93)
                .addComponent(select4)
                .addGap(93, 93, 93)
                .addComponent(select5)
                .addGap(93, 93, 93)
                .addComponent(select6)
                .addGap(93, 93, 93)
                .addComponent(select7)
                .addGap(93, 93, 93)
                .addComponent(select8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        selectionPanelLayout.setVerticalGroup(
            selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectionPanelLayout.createSequentialGroup()
                .addGroup(selectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(select1)
                    .addComponent(select2)
                    .addComponent(select3)
                    .addComponent(select4)
                    .addComponent(select5)
                    .addComponent(select6)
                    .addComponent(select7)
                    .addComponent(select8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        moveSetPanel.setBackground(new java.awt.Color(102, 102, 102));
        moveSetPanel.setEnabled(false);

        move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                move1ActionPerformed(evt);
            }
        });

        move2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                move2ActionPerformed(evt);
            }
        });

        move3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                move3ActionPerformed(evt);
            }
        });

        move4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                move4ActionPerformed(evt);
            }
        });

        move5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                move5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout moveSetPanelLayout = new javax.swing.GroupLayout(moveSetPanel);
        moveSetPanel.setLayout(moveSetPanelLayout);
        moveSetPanelLayout.setHorizontalGroup(
            moveSetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveSetPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(moveSetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(move1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(move2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(move3, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(move4, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(move5, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        moveSetPanelLayout.setVerticalGroup(
            moveSetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(moveSetPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(move1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(move5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        infoPanel.setBackground(new java.awt.Color(102, 102, 102));
        infoPanel.setEnabled(false);

        healthLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        healthLabel.setForeground(new java.awt.Color(255, 153, 153));
        healthLabel.setText("Health:");

        defenceLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        defenceLabel.setForeground(new java.awt.Color(51, 255, 255));
        defenceLabel.setText("Defence:");

        speedLabel.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        speedLabel.setForeground(new java.awt.Color(102, 255, 102));
        speedLabel.setText("Speed:");

        movesetInfo.setColumns(20);
        movesetInfo.setFont(new java.awt.Font("Lucida Calligraphy", 1, 14)); // NOI18N
        movesetInfo.setRows(5);
        movesetInfo.setText("info about move");
        jScrollPane1.setViewportView(movesetInfo);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 899, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addComponent(healthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(defenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(healthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defenceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(speedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(positionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sortPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(selectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(moveSetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(sortPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(positionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(moveSetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select2ActionPerformed

    private void select3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select3ActionPerformed

    private void select4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select4ActionPerformed

    private void select5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select5ActionPerformed

    private void select6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select6ActionPerformed

    private void select7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select7ActionPerformed

    private void select8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_select8ActionPerformed

    private void move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_move1ActionPerformed
        // TODO add your handling code here:
        UIManager.UpdateHitButtons(MovesetModule.GetMoveHitLocations(OrderModule.GetUnitAtIndex(5), OrderModule.GetUnitAtIndex(0).moveset.get(0)), true);
        UIManager.MovePosition(2, 5, 250);
    }//GEN-LAST:event_move1ActionPerformed

    private void move2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_move2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_move2ActionPerformed

    private void move3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_move3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_move3ActionPerformed

    private void move4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_move4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_move4ActionPerformed

    private void move5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_move5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_move5ActionPerformed
    
                                                                            //Selecting Units by Hovering Mouse Over Them
    
    private Unit selectedUnit = new Unit();
    
    private void position1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position1MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(0);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position1MouseEntered

    private void position2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position2MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(1);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position2MouseEntered

    private void position3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position3MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(2);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position3MouseEntered

    private void position4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position4MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(3);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position4MouseEntered

    private void position5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position5MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(4);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position5MouseEntered

    private void position6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position6MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(5);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position6MouseEntered

    private void position7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position7MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(6);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position7MouseEntered

    private void position8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_position8MouseEntered
        selectedUnit = OrderModule.GetUnitByValue(7);
        UIManager.UpdateUnitInfo(selectedUnit);
        UIManager.UpdateMoveButtons(selectedUnit);
    }//GEN-LAST:event_position8MouseEntered

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
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BattleFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BattleFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrow1;
    private javax.swing.JLabel arrow2;
    private javax.swing.JLabel arrow3;
    private javax.swing.JLabel arrow4;
    private javax.swing.JLabel arrow5;
    private javax.swing.JLabel arrow6;
    private javax.swing.JLabel arrow7;
    private javax.swing.JLabel arrow8;
    private javax.swing.JLabel blueArrow;
    private javax.swing.JLabel defenceLabel;
    private javax.swing.JLabel healthLabel;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel main;
    private javax.swing.JButton move1;
    private javax.swing.JButton move2;
    private javax.swing.JButton move3;
    private javax.swing.JButton move4;
    private javax.swing.JButton move5;
    private javax.swing.JPanel moveSetPanel;
    private javax.swing.JTextArea movesetInfo;
    private javax.swing.JLabel position1;
    private javax.swing.JLabel position2;
    private javax.swing.JLabel position3;
    private javax.swing.JLabel position4;
    private javax.swing.JLabel position5;
    private javax.swing.JLabel position6;
    private javax.swing.JLabel position7;
    private javax.swing.JLabel position8;
    private javax.swing.JPanel positionPanel;
    private javax.swing.JLabel redArrow;
    private javax.swing.JButton select1;
    private javax.swing.JButton select2;
    private javax.swing.JButton select3;
    private javax.swing.JButton select4;
    private javax.swing.JButton select5;
    private javax.swing.JButton select6;
    private javax.swing.JButton select7;
    private javax.swing.JButton select8;
    private javax.swing.JPanel selectionPanel;
    private javax.swing.JPanel sortPanel;
    private javax.swing.JButton sortSlot1;
    private javax.swing.JLabel speedLabel;
    // End of variables declaration//GEN-END:variables
}
