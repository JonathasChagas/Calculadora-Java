import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Aplicacao extends JFrame
{
    public Aplicacao()
    {
        setTitle("Calculadora");
        setSize(320, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] operadores = {"7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "C", "0", "X", "="};
        JPanel painel = new JPanel();
        JButton [] botoes = new JButton[operadores.length];


        for (int i = 0; i < operadores.length; i++)
        {
            botoes[i] = new JButton(operadores[i]);
            botoes[i].setPreferredSize(new Dimension(70,40));
            botoes[i].setBackground(Color.DARK_GRAY);
            botoes[i].setForeground(Color.WHITE);
            painel.add(botoes[i]);
        }

        add(painel);
    }

}


