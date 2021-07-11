/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdbank;

/**
 *
 * @author Casa
 */
public class Saldo {
    double valorSaldo;
    
    public void Saque(double valorSaque) {
        this.valorSaldo = valorSaldo - valorSaque;
    }
    
    public void Depositar(double valorDeposito){
        this.valorSaldo = valorDeposito + valorSaldo;
        
    }
    
}
