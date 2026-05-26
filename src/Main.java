//Um projeto simples em Java para colocar no Github - Thomas
//Eu fiz no VScode, mas eu uso geralmente o intelliJ para programar em java

public class Main{
    public static void main(String[] args) {
      
      /* criei uma classe para o Scanner, acho legal a ideia
      do Java nos permitir de deixarmos tudo organizado */
        
        System.out.println("Qual é seu nome? ");
        String nome = Leitura.lerTexto();
        System.out.println("Qual sua idade? ");
        int idade = Leitura.lerInteiro();
        System.out.println("""
            Olá %s, parabéns pelos seus %d anos
                
                """.formatted(nome,idade));

        Curriculo curriculo = new Curriculo();
        curriculo.setNome("Thomas");
        curriculo.setIdade(22);
        curriculo.objetivo = """
                Sou estudante de Ads pela Unisinos e estou
                fazendo o terceiro semestre.
                sou focado em backend e tenho conhecimento nas linguagens Java, MySql e python
                estou fazendo um curso da Alura para aprofundar e melhorar
                meu desenvolvimento em Java, e no momento, estou procurando
                uma oportunidade de estagio, para me desenvolver mais,
                adquirir mais conhecimento e me desenvolver na aréa 
                """;
        
        System.out.println("""
                eu me chamo %s, e tenho %d anos, e esse é o meu objetivo: %s 
                """.formatted(curriculo.getNome(), curriculo.getIdade(), curriculo.objetivo));
                
                /* tenho conhecimento basico em Java e estou me aprofundando todos os dias
                conheço linguagem de repetiçao while. for, if else e switch case. */

                int x = 10;
                int y = 5;

                
                if(x >= y){
                    System.out.println("o numero 10 é maior que 5");
                }
                for (int i = 0; i <= x; i++) {
                    System.out.println("");
                }
                
                int mes = 3;
                String nomeMes;

                switch(mes){
                    case 1:
                        nomeMes = "janeiro";
                        break;

                    case 2:
                        nomeMes ="fevereiro";
                        break;

                    case 3:
                        nomeMes = "março";
                        break;
                    
                    case 4:
                        nomeMes = "abril";
                        break;

                    default:
                        nomeMes = "outro";
                        break;

                }
                System.out.println(nomeMes);

                
                
                
                
                
                Leitura.fechar();
    }
    
}