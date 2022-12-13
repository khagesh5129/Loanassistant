import java.awt.*;
import javax.swing.JOptionPane;
import java.text.*;
import javax.swing.*;
import java.awt.event.*;
public class LoanAssistant extends javax.swing.JFrame {
    Color lightYellow = new Color(255, 255, 128);
    boolean computePayment; 
    public LoanAssistant() {
        initComponents();
        newLoanButton.setEnabled(false);
        
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        balanceTextField = new javax.swing.JTextField();
        interestTextField = new javax.swing.JTextField();
        monthsTextField = new javax.swing.JTextField();
        paymentTextField = new javax.swing.JTextField();
        analysisLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTextArea = new javax.swing.JTextArea();
        monthsButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        computeButton = new javax.swing.JButton();
        newLoanButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Loan Balance");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Interest Rate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Number Of Payments");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Monthly Payment");

        balanceTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        balanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balanceTextFieldActionPerformed(evt);
            }
        });

        interestTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        monthsTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        paymentTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        analysisLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        analysisLabel.setText("Loan Analysis");

        analysisTextArea.setColumns(20);
        analysisTextArea.setRows(5);
        jScrollPane1.setViewportView(analysisTextArea);

        monthsButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        monthsButton.setText("X");
        monthsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthsButtonActionPerformed(evt);
            }
        });

        paymentButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paymentButton.setText("X");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        computeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        computeButton.setText("Compute Monthly Payment");
        computeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeButtonActionPerformed(evt);
            }
        });

        newLoanButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newLoanButton.setText("New Loan Analysis");
        newLoanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newLoanButtonActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(250, 250, 250))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(paymentButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(computeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(newLoanButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(monthsButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(analysisLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(analysisLabel)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(balanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(interestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(monthsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(monthsButton)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(paymentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paymentButton))))
                        .addGap(40, 40, 40)
                        .addComponent(computeButton)
                        .addGap(27, 27, 27)
                        .addComponent(newLoanButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitButton)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void balanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balanceTextFieldActionPerformed

    private void monthsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthsButtonActionPerformed
        computePayment = false;
        paymentButton.setVisible(true);
monthsButton.setVisible(false);
monthsTextField.setText("");
monthsTextField.setEditable(false);
monthsTextField.setBackground(lightYellow);
monthsTextField.setFocusable(false);
paymentTextField.setEditable(true);
paymentTextField.setBackground(Color.WHITE);
paymentTextField.setFocusable(true);
computeButton.setText("Compute Number of Payments");
balanceTextField.requestFocus();
    }//GEN-LAST:event_monthsButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newLoanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newLoanButtonActionPerformed
        balanceTextField.setText("");
        interestTextField.setText("");
        monthsTextField.setText("");
        analysisTextArea.setText("");
        newLoanButton.setEnabled(false);
        computeButton.setEnabled(true);
    }//GEN-LAST:event_newLoanButtonActionPerformed

    private void computeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeButtonActionPerformed
        double balance, interest, payment;
int months;
double monthlyInterest, multiplier;
double loanBalance, finalPayment;
if (validateDecimalNumber(balanceTextField))
{
balance =
Double.valueOf(balanceTextField.getText()).doubleValue();
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Loan Balance entry.\nPlease correct.", "Balance Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
if (validateDecimalNumber(interestTextField))
{
interest =
Double.valueOf(interestTextField.getText()).doubleValue();
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Interest Rate entry.\nPlease correct.", "Interest Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
monthlyInterest = interest / 1200;
if (computePayment)
{
// Compute loan payment
if (validateDecimalNumber(monthsTextField))
{
months =
Integer.valueOf(monthsTextField.getText()).intValue();
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Number of Payments entry.\nPlease correct.", "Number of Payments Input Error",
JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
return;
}
if (interest == 0)
{
payment = balance / months;
}
else
{
multiplier = Math.pow(1 + monthlyInterest, months);
payment = balance * monthlyInterest * multiplier / (multiplier - 1);
}
paymentTextField.setText(new DecimalFormat("0.00").format(payment));
}
else
    {
// Compute number of payments
if (validateDecimalNumber(paymentTextField))
{
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
if (payment <= (balance * monthlyInterest + 1.0))
{
if (JOptionPane.showConfirmDialog(null, "Minimum payment must be $" +
new DecimalFormat("0.00").format((int)(balance * monthlyInterest + 1.0)) + "\n" + "Do you want to use the minimum payment?", "Input Error", JOptionPane.YES_NO_OPTION,
JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
{
paymentTextField.setText(new DecimalFormat("0.00").format((int)(balance *
monthlyInterest + 1.0)));
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
}
else
{
paymentTextField.requestFocus();
return;
}
}
}
else
{
JOptionPane.showConfirmDialog(null, "Invalid or empty Monthly Paymententry.\nPlease correct.", "Payment Input Error", JOptionPane.DEFAULT_OPTION,
JOptionPane.INFORMATION_MESSAGE);
return;
}
if (interest == 0)
{
months = (int)(balance / payment);
}
else
    {
months = (int)((Math.log(payment) - Math.log(payment - balance * monthlyInterest)) /
Math.log(1 + monthlyInterest));
}
monthsTextField.setText(String.valueOf(months));
}
// reset payment prior to analysis to fix at two decimals
payment =
Double.valueOf(paymentTextField.getText()).doubleValue();
// show analysis
analysisTextArea.setText("Loan Balance: $" + new
DecimalFormat("0.00").format(balance));
analysisTextArea.append("\n" + "Interest Rate: " + new
DecimalFormat("0.00").format(interest) + "%");
// process all but last payment
loanBalance = balance;
for (int paymentNumber = 1; paymentNumber <= months - 1; paymentNumber++)
{
loanBalance += loanBalance * monthlyInterest - payment;
}
// find final payment
finalPayment = loanBalance;
if (finalPayment > payment)
{
// apply one more payment
loanBalance += loanBalance * monthlyInterest - payment;
finalPayment = loanBalance;
months++;
monthsTextField.setText(String.valueOf(months));
}
analysisTextArea.append("\n\n" + String.valueOf(months - 1) + " Payments of $" + new
DecimalFormat("0.00").format(payment));
analysisTextArea.append("\n" + "Final Payment of: $" + new
DecimalFormat("0.00").format(finalPayment));
analysisTextArea.append("\n" + "Total Payments: $" + new
DecimalFormat("0.00").format((months - 1) * payment + finalPayment));
analysisTextArea.append("\n" + "Interest Paid $" + new
        DecimalFormat("0.00").format((months - 1) * payment + finalPayment - balance));
computeButton.setEnabled(false);
newLoanButton.setEnabled(true);
newLoanButton.requestFocus();

    }//GEN-LAST:event_computeButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
     computePayment = true;
     paymentButton.setVisible(false);
     monthsButton.setVisible(true);
     monthsTextField.setEditable(true);
     monthsTextField.setBackground(Color.WHITE);
     paymentTextField.setText("");
     paymentTextField.setEditable(false);
     paymentTextField.setBackground(lightYellow);
     computeButton.setText("Compute Monthly Payment");
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
    }
    
    
    private boolean validateDecimalNumber(JTextField tf)
{
// checks to see if text field contains
// valid decimal number with only digits and a single decimal point
String s = tf.getText().trim();
boolean hasDecimal = false;
boolean valid = true;
if (s.length() == 0)
{
valid = false;
}
else
{
for (int i = 0; i < s.length(); i++)
{
char c = s.charAt(i);
if (c >= '0' && c <= '9')
{
continue;
}
else if (c == '.' && !hasDecimal)
{
hasDecimal = true;
}
else
{
// invalid character found
    valid = false;
}
}
}
tf.setText(s);
if (!valid)
{
tf.requestFocus();
}
return (valid);
}


    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel analysisLabel;
    private javax.swing.JTextArea analysisTextArea;
    private javax.swing.JTextField balanceTextField;
    private javax.swing.JButton computeButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField interestTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton monthsButton;
    private javax.swing.JTextField monthsTextField;
    private javax.swing.JButton newLoanButton;
    private javax.swing.JButton paymentButton;
    private javax.swing.JTextField paymentTextField;
    // End of variables declaration//GEN-END:variables
}