import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class TelaDigito
{
    private JTextPane campoDigito = new JTextPane();

    public TelaDigito()
    {
        campoDigito.setBackground(Color.DARK_GRAY);
        campoDigito.setForeground(Color.WHITE);

        Font fontePersonalizada = new Font("Arial", Font.BOLD, 23);

        campoDigito.setFont(fontePersonalizada);
        campoDigito.setPreferredSize(new Dimension(300, 250));

        StyledDocument doc = campoDigito.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

    }

    public JTextPane getCampoDigito()
    {
        return campoDigito;
    }

}
