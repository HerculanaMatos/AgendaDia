import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class AgendaDia {
    //manipulando String e datas.
        public static void main(String[] args){

            String nome = "Herculana";

            LocalDate hoje = LocalDate.now();
            Locale brasil = new Locale("pt", "BR");//language e country nao fazem parte do codigo, a intelij q adiciona
            String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

            String saudacao;
            LocalDateTime agora = LocalDateTime.now();
            if (agora.getHour()>= 0 && agora.getHour()<12){
                saudacao = "bom dia";
            } else if (agora.getHour()>= 12 && agora.getHour()<18) {
                saudacao = "boa tarde";
            }else if (agora.getHour()>= 18 && agora.getHour()<24) {
                saudacao = "boa noite";
            }else{
                saudacao = "olá";
            }
            System.out.printf("Olá. %s. Hoje é %s,%s.%n", nome, diaSemana, saudacao.toUpperCase());//%s representa as strings %n quebra linha

        }
    }
//incrementar para sair data e hora;

//NOSSO OBJETIVO:[descobrir dia e hora da semana ]
//manipular string e datas ex: Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA.
//[colocar uma parte em maiuscula].// padrao mundial p/ dia e hora ->ISO 8601

//String nome = "Herculana";
//System.out.println(nome.toUpperCase());//converter maiuscula
//System.out.println(nome.toLowerCase());//converter minuscula
//System.out.println(nome.length());// tamanho da String
//String outroNome = "herculana";
//System.out.println(nome.equals(outroNome));//equalsIgnoreCase ignora a sensibilidade de maiusculo e minusculo



