import java.util.LinkedList;

public class BotaoIgual
{
    public static String botaoIgual(LinkedList<String> list)
    {

        Botoes botoes = new Botoes();
        StringBuilder numeros = new StringBuilder();
        StringBuilder numeros2 = new StringBuilder();
        boolean verdadeiro = true;

        for (String s : list)
        {
            if (!s.equals("+") && verdadeiro)
                numeros.append(s);

            else if (s.equals("+") && verdadeiro)
                verdadeiro = false;

            else
                numeros2.append(s);
        }

        int numero = Integer.parseInt(numeros.toString());
        int numero2 = Integer.parseInt(numeros2.toString());

        return "Resultado: " + (numero + numero2);

    }
}
