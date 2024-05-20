import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Botoes
{
    Operadores operadores = new Operadores();

    int opSize = operadores.getOperadoresSize();
    String[] opDigits = operadores.getOperadores();

    JButton [] botoes = new JButton[opSize];

    public void printBotoes(JPanel painel)
    {
        for (int i = 0; i < opSize; i++)
        {
            botoes[i] = new JButton(opDigits[i]);
            botoes[i].setPreferredSize(new Dimension(70,40));
            botoes[i].setBackground(Color.DARK_GRAY);
            botoes[i].setForeground(Color.WHITE);
            painel.add(botoes[i]);
        }
    }

    String texto = null;

    public void clickBotoes(JTextField campoDigito)
    {
        for (int i = 0; i < opSize; i++)
        {
            int j = i;

            botoes[i].addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    opDigits[0] = "²";
                    opDigits[1] = "√";

                    if (texto == null && j != 2)
                        texto = opDigits[j];

                    else if (j == 2)
                        texto = null;

                    else
                        texto += opDigits[j];
                    campoDigito.setText(texto);
                }
            });
        }
    }
}
