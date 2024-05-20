import javax.swing.*;

public class Aplicacao extends JFrame
{
    public Aplicacao()
    {
        setTitle("Calculadora");
        setSize(320, 530);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        TelaDigito tela = new TelaDigito();
        JPanel painel = new JPanel();
        Botoes botoes = new Botoes();

        painel.add(tela.getCampoDigito());
        botoes.printBotoes(painel);
        add(painel);

        botoes.clickBotoes(tela.getCampoDigito());
    }
}


