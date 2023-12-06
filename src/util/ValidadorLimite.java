package util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class ValidadorLimite extends PlainDocument {

    private final int limite;

    public ValidadorLimite(int limite) {
        super();
        this.limite = limite;
    }

    @Override
    public void insertString(int ofs, String str, AttributeSet a) throws BadLocationException {

        if ((getLength() + str.length()) <= limite) {
            super.insertString(ofs, str, a);

        }

    }

}
