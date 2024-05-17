import javax.swing.*;
import javax.swing.text.AbstractDocument;
import java.awt.*;


public class Aplicacao extends JFrame
{
    public Aplicacao()
    {
        setTitle("Calculadora");
        setSize(320, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] operadores = {"n²", "√n", "C", "X", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "%", "0", ",", "="};
        JPanel painel = new JPanel();
        JTextField campoDigito = new JTextField();

        campoDigito.setBackground(Color.DARK_GRAY);
        campoDigito.setForeground(Color.WHITE);

        Font fontePersonalizada = new Font("Arial", Font.BOLD, 24);

        campoDigito.setFont(fontePersonalizada);
        campoDigito.setPreferredSize(new Dimension(300, 250));

        JButton [] botoes = new JButton[operadores.length];

        campoDigito.setDocument(new JTextFieldLimit(22));
        painel.add(campoDigito);

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


