import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
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

    String texto = "";
    StringBuilder textoBuilder = new StringBuilder(texto);
    LinkedList<String> list = new LinkedList<>();

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
                        list.add(opDigits[j]);

                    else if (j == 2 && !list.isEmpty())
                        list.clear();

                    else if (j == 3 && !list.isEmpty())
                        list.remove(list.size() - 1);

                    else if (j != 3)
                    {
                        list.add(opDigits[j]);
                    }

                    textoBuilder = new StringBuilder();

                    for (String s : list)
                    {
                        textoBuilder.append(s);
                    }

                    texto = textoBuilder.toString();

                    campoDigito.setText(texto);

                }
            });
        }
    }
}
