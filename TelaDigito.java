import javax.swing.*;
import java.awt.*;

public class TelaDigito
{
    private JTextField campoDigito = new JTextField();

    public TelaDigito()
    {
        campoDigito.setBackground(Color.DARK_GRAY);
        campoDigito.setForeground(Color.WHITE);

        Font fontePersonalizada = new Font("Arial", Font.BOLD, 24);

        campoDigito.setFont(fontePersonalizada);
        campoDigito.setPreferredSize(new Dimension(300, 250));

        campoDigito.setDocument(new JTextFieldLimit(22));
    }

    public JTextField getCampoDigito()
    {
        return campoDigito;
    }

}
