
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author lee
 */
public class SATM_GUI extends javax.swing.JFrame
{
    private static int state = 0;
    private final ArrayList<String> keynums = new ArrayList<>();
    private int pin = 0;
    private int cardPin = 0;
    private int cardPan = 0;
    private int pinAttempts = 0;
    private final int ATMBalance = 9000;
    private int USERBalance = 2000;
    private final boolean withdrawalChuteClear = true;
    private final boolean depositeSlotClear = true;

    int[][] cardDB = new int[][]{
            {123456, 1256}, // Card1 {PAN, PIN}
            {789012, 1337}, // Card2 {PAN, PIN}
    };


    /**
     * Creates new form SATM_GUI
     */
    public SATM_GUI()
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        output = new javax.swing.JTextField();
        balance = new javax.swing.JButton();
        withdrawal = new javax.swing.JButton();
        deposit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        keypad0 = new javax.swing.JButton();
        keypad1 = new javax.swing.JButton();
        keypad2 = new javax.swing.JButton();
        keypad3 = new javax.swing.JButton();
        keypad4 = new javax.swing.JButton();
        keypad5 = new javax.swing.JButton();
        keypad6 = new javax.swing.JButton();
        keypad7 = new javax.swing.JButton();
        keypad8 = new javax.swing.JButton();
        keypadYes = new javax.swing.JButton();
        keypad9 = new javax.swing.JButton();
        keypadNo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        card1 = new javax.swing.JButton();
        card2 = new javax.swing.JButton();
        card3 = new javax.swing.JButton();
        collectCard = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        output.setEditable(false);
        output.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        output.setText("Welcome please insert your ATM Card");
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.ipady = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        getContentPane().add(output, gridBagConstraints);

        balance.setText("Balance");
        balance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 168;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        getContentPane().add(balance, gridBagConstraints);

        withdrawal.setText("Withdrawal");
        withdrawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 146;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        getContentPane().add(withdrawal, gridBagConstraints);

        deposit.setText("Deposit");
        deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 166;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        getContentPane().add(deposit, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 258;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        getContentPane().add(jSeparator2, gridBagConstraints);

        keypad0.setText("0");
        keypad0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 40, 0, 0);
        getContentPane().add(keypad0, gridBagConstraints);

        keypad1.setText("1");
        keypad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(keypad1, gridBagConstraints);

        keypad2.setText("2");
        keypad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(keypad2, gridBagConstraints);

        keypad3.setText("3");
        keypad3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        getContentPane().add(keypad3, gridBagConstraints);

        keypad4.setText("4");
        keypad4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypad4, gridBagConstraints);

        keypad5.setText("5");
        keypad5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypad5, gridBagConstraints);

        keypad6.setText("6");
        keypad6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        getContentPane().add(keypad6, gridBagConstraints);

        keypad7.setText("7");
        keypad7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypad7, gridBagConstraints);

        keypad8.setText("8");
        keypad8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypad8, gridBagConstraints);

        keypadYes.setText("Yes");
        keypadYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadYesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 40, 0, 0);
        getContentPane().add(keypadYes, gridBagConstraints);

        keypad9.setText("9");
        keypad9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypad9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypad9, gridBagConstraints);

        keypadNo.setText("No");
        keypadNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keypadNoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(keypadNo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 255;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        card1.setText("Insert Card 1");
        card1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 0);
        getContentPane().add(card1, gridBagConstraints);

        card2.setText("Insert Card 2");
        card2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(card2, gridBagConstraints);

        card3.setText("Insert Card 3");
        card3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 6, 0);
        getContentPane().add(card3, gridBagConstraints);

        collectCard.setText("Collect Card");
        collectCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectCardActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 0);
        getContentPane().add(collectCard, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keypadEvent()
    {
        switch (state)
        {
            case 1:
                checkPIN();
                break;
            case 5:
                checkDeposit();
                break;
            case 6:
                checkWithdrawal();
                break;
        }
    }
    
    /**
     * Checks if PIN is valid.
     */
    private void checkPIN()
    {
        if (keynums.size() == 4)
        {
            String pinString = "";
            for (String s : keynums)
            {
                pinString += s;
            }
            pin = Integer.parseInt(pinString);
            keynums.clear();

            if (cardPin != pin)
            {
                if (pinAttempts > 2)
                {
                    pinAttempts = 0;
                    rejectCard();
                }
                else
                {
                    pinAttempts += 1;
                    output.setText("Your PIN is incorrect. Please try again. Attempt: " + pinAttempts);
                }
            }
            else
            {
                pinAttempts = 0;
                state = 2;
                output.setText("Select transaction: balance > deposit > withdrawal >");
            }
        }
    }
    
    

    /**
     * Checks if PAN is valid.
     */
    private void checkPAN()
    {
        boolean foundCard = false;
        for (int[] cardDB1 : cardDB)
        {
            if (cardDB1[0] == cardPan)
            {
                state = 1;
                output.setText("Please enter your PIN");
                
                foundCard = true;
                cardPin = cardDB1[1];
                break;
            }
        }

        if (foundCard == false)
        {
            rejectCard();
        }
    }
    
    private void rejectCard()
    {
        output.setText("Invalid ATM card. It will be retained.");

        ActionListener delayScreenWrite = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                state = 0;
                output.setText("Welcome please insert your ATM card");
            }
        };
        Timer timer = new Timer(3000, delayScreenWrite);
        timer.start();
    }
    
    
    /**
     * Transitions to the next state with time delay.
     * 
     * @param delay_state: The state of the next transition.
     * @param delay_message: The message of the next transition.
     * @param delay_time: The delay time of the next transition in milliseconds. 
     */
    private void delayed_state_transition(final int delay_state, final String delay_message, int delay_time) {
        ActionListener delayScreenWrite = new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae)
            {
                state = delay_state;
                output.setText(delay_message);
            }
        };
        
        Timer timer = new Timer(delay_time, delayScreenWrite);
        timer.start();
        timer.setRepeats(false);
    }
    
    /**
     * Checks if deposit amount is valid.
     */
    private void checkDeposit()
    {
        if (keynums.size() == 4)
        {
            String pinString = "";
            for (String s : keynums)
            {
                pinString += s;
            }
            int deposit_amount = Integer.parseInt(pinString);
            USERBalance += deposit_amount;
            keynums.clear();

            output.setText("Please insert deposit into deposit slot.");
            
            delayed_state_transition(3,"Your new balance is being printed. Another transaction?", 3000);    
        }
    }

    
    /**
     * Checks if withdrawal amount is valid.
     */
    private void checkWithdrawal()
    {
        if (keynums.size() == 4)
        {
            String pinString = "";
            for (String s : keynums)
            {
                pinString += s;
            }
            int withdrawal_amount = Integer.parseInt(pinString);
            keynums.clear();

            if ((withdrawal_amount % 10) != 0)
            {
                output.setText("Machine can only dispense $10 notes");

                delayed_state_transition(6,"Enter amount. Withdrawals must be multiples of $10", 3000);
            }
            else if (withdrawal_amount > ATMBalance)
            {
                output.setText("Insufficient ATM Funds! Please enter a new amount");
                delayed_state_transition(6,"Enter amount. Withdrawals must be multiples of $10", 3000);
            }
            else if (withdrawal_amount > USERBalance)
            {
                output.setText("Insufficient USER Funds! Please enter a new amount");
                delayed_state_transition(6,"Enter amount. Withdrawals must be multiples of $10", 3000);
            }
            else
            {
                USERBalance = USERBalance - withdrawal_amount;
                state = 3;
                output.setText("Your new balance is being printed. Another transaction?");
            }
        }
    }

 
    private void outputActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_outputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_outputActionPerformed

    private void balanceActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_balanceActionPerformed
        if (state == 2)
        {
            output.setText("Your new balance is being printed. Another transaction?");
            state = 3;
        }
    }//GEN-LAST:event_balanceActionPerformed

    private void withdrawalActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_withdrawalActionPerformed
        if (state == 2)
        {
            if (withdrawalChuteClear == false)
            {
                output.setText("Temporarily unable to process withdrawals. Another transaction?");
                state = 3;
            }
            else
            {
                output.setText("Enter amount. Withdrawals must be multiples of $10");
                state = 6;
            }
        }
    }//GEN-LAST:event_withdrawalActionPerformed

    private void depositActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_depositActionPerformed
        if (state == 2)
        {
            if (depositeSlotClear == false)
            {
                output.setText("Temporarily unable to process deposits. Another transaction?");
                state = 3;
            }
            else
            {
                output.setText("Enter amount. Withdrawals must be multiples of $10");
                state = 5;
            }
        }
    }//GEN-LAST:event_depositActionPerformed

    private void keypad0ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad0ActionPerformed
        keynums.add("0");
        keypadEvent();
    }//GEN-LAST:event_keypad0ActionPerformed


    private void keypad1ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad1ActionPerformed
        keynums.add("1");
        keypadEvent();
    }//GEN-LAST:event_keypad1ActionPerformed

    private void keypad3ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad3ActionPerformed
        keynums.add("3");
        keypadEvent();
    }//GEN-LAST:event_keypad3ActionPerformed

    private void keypad4ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad4ActionPerformed
        keynums.add("4");
        keypadEvent();
    }//GEN-LAST:event_keypad4ActionPerformed

    private void keypad2ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad2ActionPerformed
        keynums.add("2");
        keypadEvent();
    }//GEN-LAST:event_keypad2ActionPerformed

    private void keypad5ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad5ActionPerformed
        keynums.add("5");
        keypadEvent();
    }//GEN-LAST:event_keypad5ActionPerformed

    private void keypad6ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad6ActionPerformed
        keynums.add("6");
        keypadEvent();
    }//GEN-LAST:event_keypad6ActionPerformed

    private void keypad7ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad7ActionPerformed
        keynums.add("7");
        keypadEvent();
    }//GEN-LAST:event_keypad7ActionPerformed

    private void keypad8ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad8ActionPerformed
        keynums.add("8");
        keypadEvent();
    }//GEN-LAST:event_keypad8ActionPerformed

    private void keypad9ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypad9ActionPerformed
        keynums.add("9");
        keypadEvent();
    }//GEN-LAST:event_keypad9ActionPerformed

    private void keypadYesActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypadYesActionPerformed
        if (state == 3)
        {
            output.setText("Select transaction: balance > deposit > withdrawal >");
            state = 2;
        }
    }//GEN-LAST:event_keypadYesActionPerformed

    private void keypadNoActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_keypadNoActionPerformed
        if (state == 3)
        {
            output.setText("Please take your receipt and ATM card. Thank you.");
            state = 4;
        }
    }//GEN-LAST:event_keypadNoActionPerformed

    private void card1ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_card1ActionPerformed
        if (state == 0)
        {
            cardPan = 123456;
            checkPAN();
        }
    }//GEN-LAST:event_card1ActionPerformed

    private void card2ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_card2ActionPerformed
        if (state == 0)
        {
            cardPan = 789012;
            checkPAN();
        }
    }//GEN-LAST:event_card2ActionPerformed

    private void card3ActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_card3ActionPerformed
        if (state == 0)
        {
            cardPan = 467081;
            checkPAN();
        }
    }//GEN-LAST:event_card3ActionPerformed

    private void collectCardActionPerformed(java.awt.event.ActionEvent evt)
    {//GEN-FIRST:event_collectCardActionPerformed
        if (state == 4)
        {
            output.setText("Welcome please insert your ATM card");
            state = 0;
        }
    }//GEN-LAST:event_collectCardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(SATM_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(SATM_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(SATM_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(SATM_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new SATM_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton balance;
    private javax.swing.JButton card1;
    private javax.swing.JButton card2;
    private javax.swing.JButton card3;
    private javax.swing.JButton collectCard;
    private javax.swing.JButton deposit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton keypad0;
    private javax.swing.JButton keypad1;
    private javax.swing.JButton keypad2;
    private javax.swing.JButton keypad3;
    private javax.swing.JButton keypad4;
    private javax.swing.JButton keypad5;
    private javax.swing.JButton keypad6;
    private javax.swing.JButton keypad7;
    private javax.swing.JButton keypad8;
    private javax.swing.JButton keypad9;
    private javax.swing.JButton keypadNo;
    private javax.swing.JButton keypadYes;
    private javax.swing.JTextField output;
    private javax.swing.JButton withdrawal;
    // End of variables declaration//GEN-END:variables
}
