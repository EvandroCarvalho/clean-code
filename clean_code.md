# Anotações leitura Clean Code

## Capítulo 10 - Classes

* **Classes devem ser pequenas**
<p>O nome de uma classe deve descerver quais reponsabilidades ela faz. Selecionar um nome é a primeira forma de ajudar a determinar o tamanho da classe. Quando mais ambíguo for o nome da classe, maiores são as chances de dela ficar com muitos responsabilidades. Por exemplo, nomes de classes que possuem palavras de vários sentidos, como <i>Processor</i> ou <i>Manager</i> ou <i>Super</i>, geralmente indicam um acúmulo lastimável de responsabilidades.</br>
<i>Devemos também poder escrever com cerca de 25 palavras uma breve descrição da classe, sem usar as palavras "se", "e", "ou" ou "mas".</i> (P.138)</p>

* **O príncipio da responsabilidade única**
<p>O principio da responsabilidade única (SRP) afirma que uma classe ou módulo deve ter um, e apenas um, motivo para mudar. (P.138)</br>
O problema é que muitos de nós achamos que terminamos se o programa funciona. Esquecendo-nos da outra questão de organização e clareza. Seguindo para o próximo problema em vez de voltar e dividir as classes muito cheias em outras com responsabilidades únicas.(P.139)<br>
Ao mesmo tempo muitos desenvolvedores temem que um grande número de classes pequenas e de propósito único dificulte mais o entendimento geral do código. Há também bastante o que se aprender num sistema com poucas classes grandes. Portanto a questão é: <i> você quer suas ferramentas organizadas em caixas de ferramentas com muitas gavetas pequenas, cada um com objetos bem classificados e rotulados ? Ou poucas gavetas nas quais você coloca tudo ?</i>(P.139)</p>

* **Coesão**
<p>As classes devem ter um pequeno número de variáveis de instâncias. Uma classe na qual cada variável é utilizada é totalmente coesa.(P.140)</p>

* **Manutenção de resultados coesos em muitas classes pequenas**
<p>Se há poucas funções que desejam comparilhar certas variáveis, é indício de falta de coesão, Quando as classes perdem coesão, divida-as.</br>
Portanto, separar uma função grande em muitas pequenas geralmente nos perfmite dividir em várias classes também. Isso dá ao nosso programa uma melhor organização e uma estrutura mais transparente</p>

## Capítulo 11 - Sistemas

* **Como você constroi uma cidade**
<p>