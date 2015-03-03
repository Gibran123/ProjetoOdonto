/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.shalom.filter;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author gibran
 */
public class SomenteNumeros extends PlainDocument {
    
    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
    }

    @Override
    public void replace(int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
        super.replace(offset, length, text.replaceAll("[^0-9]", ""), attrs); 
    }

    @Override
    public void remove(int offs, int len) throws BadLocationException {
        super.remove(offs, len);
    }
}
