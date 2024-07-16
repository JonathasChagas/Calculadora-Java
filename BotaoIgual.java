import java.util.LinkedList;

public class BotaoIgual
{
    public static String botaoIgual(LinkedList<String> list)
    {

        Botoes botoes = new Botoes();
        StringBuilder numeros = new StringBuilder();
        numeros.append('1');
        StringBuilder numeros2 = new StringBuilder();
        numeros2.append('1');
        String operador = "+";
        boolean verdadeiro = true;
        boolean primeiraIteracao = true;

        for (String s : list)
        {
            if (s.equals("+") || s.equals("-") || s.equals("x") || s.equals("/") || s.equals("²") || s.equals("√")){
                operador = s;
                break;
            }
        }

        for (String s : list)
        {
            if (!s.equals(operador) && verdadeiro)
            {
                if (primeiraIteracao)
                {
                    numeros.deleteCharAt(0);
                    primeiraIteracao = false;
                }

                numeros.append(s);
                System.out.println();
            }

            else if (s.equals(operador) && verdadeiro)
                verdadeiro = false;

            else
            {
                if (s.matches("[0-9.]+"))
                {
                    numeros2.append(s);
                }

                else
                    break;
            }
        }

        numeros2.deleteCharAt(0);
        System.out.println(numeros);
        double numero = Double.parseDouble(numeros.toString());
        System.out.println(numero);
        double numero2 = Double.parseDouble(numeros2.toString());

        if (numero2 == 0 && operador.equals("/"))
        {
            return "Divisão por 0 é impossível";
        }


        return switch (operador)
        {
            case "+" -> "Resultado: " + (numero + numero2);
            case "-" -> "Resultado: " + (numero - numero2);
            case "x" -> "Resultado: " + (numero * numero2);
            case "/" -> "Resultado: " + (numero / numero2);
            case "²" -> "Resultado: " + (numero * numero);
            case "√" -> "Resultado: " + (Math.sqrt(numero2));
            default -> null;
        };

    }
}
