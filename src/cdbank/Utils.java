/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdbank;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Casa
 */
public class Utils {
    public void insertImage(JFrame frm) {
        try {
            frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src/cdbank/moneydc.png"));
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}
