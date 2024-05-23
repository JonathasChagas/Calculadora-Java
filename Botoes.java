import javax.swing.*;
import java.awt.*;
import java.util.LinkedList;

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
    LinkedList<String> numerosDigitados = new LinkedList<>();
    int contagemNumeros = 0;

    public void clickBotoes(JTextPane campoDigito)
    {

        numerosDigitados.add("\n");
        numerosDigitados.add("\n");
        numerosDigitados.add("\n");
        numerosDigitados.add("\n");

        for (int i = 0; i < opSize; i++)
        {

            int j = i;

            botoes[i].addActionListener(e ->
            {
                opDigits[0] = "²";
                opDigits[1] = "√";

                textoBuilder = new StringBuilder();
                numerosDigitados = regrasBotoes(j, numerosDigitados);

                contagemNumeros++;

                if (contagemNumeros % 24 == 0)
                {
                    if (contagemNumeros < 88)
                        numerosDigitados.remove("\n");
                    numerosDigitados.add("\n");
                }

                texto = criaString();

                campoDigito.setText(texto);
            });

        }
    }

    public LinkedList<String> regrasBotoes(int i, LinkedList<String> list)
    {
            if (texto == null && i != 2)
                list.add(opDigits[i]);

            else if (i == 2 && !list.isEmpty())
            {
                list.clear();
                numerosDigitados.add("\n");
                numerosDigitados.add("\n");
                numerosDigitados.add("\n");
                numerosDigitados.add("\n");
            }

            else if (i == 3 && !list.isEmpty())
                list.removeLast();

            else if (i != 3)
            {
                list.add(opDigits[i]);
            }

        return list;
    }

    public String criaString()
    {
        for (String s : numerosDigitados)
        {
            textoBuilder.append(s);
        }

        texto = textoBuilder.toString();

        return texto;
    }
}
