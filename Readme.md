# Anotações leitura Clean Code

# Capítulo 10 - Classes

## Classes devem ser pequenas
O nome de uma classe deve descerver quais reponsabilidades ela faz. Selecionar um nome é a primeira forma de ajudar a determinar o tamanho da classe. Quando mais ambíguo for o nome da classe, maiores são as chances de dela ficar com muitos responsabilidades. Por exemplo, nomes de classes que possuem palavras de vários sentidos, como <i>Processor</i> ou <i>Manager</i> ou <i>Super</i>, geralmente indicam um acúmulo lastimável de responsabilidades.</br>
<i>Devemos também poder escrever com cerca de 25 palavras uma breve descrição da classe, sem usar as palavras "se", "e", "ou" ou "mas".</i> (P.138)

## O príncipio da responsabilidade única
O principio da responsabilidade única (SRP) afirma que uma classe ou módulo deve ter um, e apenas um, motivo para mudar. (P.138)</br>
O problema é que muitos de nós achamos que terminamos se o programa funciona. Esquecendo-nos da outra questão de organização e clareza. Seguindo para o próximo problema em vez de voltar e dividir as classes muito cheias em outras com responsabilidades únicas.(P.139)<br>
Ao mesmo tempo muitos desenvolvedores temem que um grande número de classes pequenas e de propósito único dificulte mais o entendimento geral do código. Há também bastante o que se aprender num sistema com poucas classes grandes. Portanto a questão é: <i> você quer suas ferramentas organizadas em caixas de ferramentas com muitas gavetas pequenas, cada um com objetos bem classificados e rotulados ? Ou poucas gavetas nas quais você coloca tudo ?</i>(P.139)

## Coesão
As classes devem ter um pequeno número de variáveis de instâncias. Uma classe na qual cada variável é utilizada é totalmente coesa.(P.140)

## Manutenção de resultados coesos em muitas classes pequenas
Se há poucas funções que desejam comparilhar certas variáveis, é indício de falta de coesão, Quando as classes perdem coesão, divida-as.</br>
Portanto, separar uma função grande em muitas pequenas geralmente nos perfmite dividir em várias classes também. Isso dá ao nosso programa uma melhor organização e uma estrutura mais transparente

# Capítulo 11 - Sistemas

## Injeção de dependência
A IoC (inversão de controle) move as responsabilidades secundárias de um objeto para outros dedicado ao propósito que se deseja, desta forma suportando o Princípio da Responsabilidade Única. Em vez disse ela deve passar esta responsabilidade para outro mecanismo "dominante", com isso invertendo o controle. Como esta configuração é uma preocupação global, este mancanismo dominante geralmente será ou uma rotina "principal" ou um container de tarefas especificas.
 A Injeção de Dependência verdadeira vai mais além. A classe não determina diretamente suas dependências, ela fica completamente passiva e oferece métodos de escritas <i>(setters)</i> ou parâmetros de construturos (ou ambos) que serão utilizados para injetar dependências.(P.157)</br>
 Fazendo analogia a uma cidade, no começo não há serviços, como abastecimento de energia, água, esgoto e Internet. E só serão adicionados quando aumentar a densidade da população e edificações ([KISS](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_KISS)).(P.157) </br>
 Mas esse desenvolvimento não esta livre de problemas. Quantas vezes, devido a um projeto de "melhoria" das avenidas você dirigiu por engarrafamentos e se perguntou: "Por que não construíram as ruas largas o bastante desde o ínicio?".(P.157)</br>
 Mas não podia ter sido de outro forma. Como justificar o custo de construções de uma via expressa de seis faixas passando no meio de uma cidade pequena já antecipando seu desenvolvimento?.(P.157)</br>
 É mito dizer que podemos conseguir um sistema "correto de primeira". Em vez disso, devemos implementar apenas os fatos de hoje e, então refatorar e expandir o sistema, implementando novos fatos amanhã. Essa é a essência das agilidades iterativas e incremental.(P.158)


## Use padrões sabiamente quanto eles adicionares um valor demonstrativo
Os padrões facilitam a reutilização de ideias e componentes, recrutam pessoas com experiência considerável, encapsulam boas ideias e conectam os componentes. Entretanto, o processo de criação de padrões pode, às vezes, ser muito longo para que o mercado fique à espera deles, e alguns padrões acabam se desviando das necessidades reais das pessoas a quem eles pretendem servir.(P.168)

## Sistemas precisam de linguagens específicas a um domínio
Linguagens Específicas de Domínio (DSLs), permitem todos os níveis de abastração e todos os domínios na aplicação serem expressas como [POJO](https://pt.wikipedia.org/wiki/Plain_Old_Java_Objects), de um nível mais alto de regra e detalhes de um nível mais baixo.(P.169)


# Capítulo 12 - Emergência
## Obtendo clareza através de um processo de emergência
Quatro regras do Projeto Simples de Kent Beck, são de ajuda considerável na criação de software bem projetado.(P.162)

Artigo de Martin Fowler [BeckDesignRules](https://martinfowler.com/bliki/BeckDesignRules.html).

1. Passes the tests (Efetuar todos os testes)
2. Reveals intention (Expressar o propósito do programador)
3. No duplication (Sem duplicação de código)
4. Fewest elements (Minimizar o número de classes e métodos)

## Regra 1 de Projeto Simples: Efetue todos os teses
Os sistemas que não podem ser testados não podem ser verificados. Logo, pode-se dizer que um sistema que não pode ser verificado, jamais deveria ser implementado.(P.162)
Felizmente, tonar nossos sistemas passíveis de teste nos direciona a um projeto no qual nossas classes sejam pequenas e de proósito único. Simplesmente é mais fácil testar classes que sigam [SRP](#o-príncipio-da-responsabilidade-única).(P.162)

Felizmente, tornar nossos sistemas passíveis de testes nos direciona a um projeto no qual nossas classes sejam pequenas e de propósito único. Simplemente é mais facil testar classes que siam SRP.(P.162)
O alto acoplamento dificulta a criação de testes. Quanto mais testes criamos, usaremos mais princípios como o DIP e ferramentas como a injeção de dependência, interfaces e abstração de modo a minimizar o acoplamento. Assim, nossos projeto se tornan ainda melhores.(P.162)
O fato de termos estes testes elimina o receio de que, ao limparmos o código, podemos danificá-los.(P.162)

## Regras de 2 a 4 de Projeto Simples: Refatoração
### Sem repetições
A duplicação se apresenta de várias formas. Linhas de código que parecem identicas são claro, duplicações. Linhas de códigos semelhantes geralmente podem ser modificadas de modo que fiquem mais parecidas ainda para serem refatoradas mais facilmente.(P.173)</br> Ex.:</br>
```
    int size() {}
    bollean isEmpty() {}
```
Poderíamos ter implementações separadas para cada método. O ```isEmpty``` poderia usar um boolea, enquanto size poderia usar um contador. Ou poderíamos eliminar essa duplicação colocando ```isEmpty``` na declaração do ```size```.(P.173)
```
    boolean isEmpty() {
        return o == size();
    }
```
[mais um exemplo]()

## Expressividade
Escerver código que nós entendamos é fácil, pois quando o fazemos, possuímos um conhecimento profundo do problema que desejamos resolver. Mas outras pessoas que pegarem esse mesmo código não terão esse mesmo grau de conhecimento.(P.175)</br>
A maioria dos custos de um projeto de software está na manutenção em longo prazo. Conforme sistemas se tornam mais complexos, um desenvolvedor leva cada vez mais tempo para compreendê-lo, e sempre há chance ainda maior de mal entendidos. Portanto, o codigo deve expressar claramente o propósito do seu autor. Isso reduz defeito e custo de manutenção.(P.175)</br>
Você pode expressar atráves de bons nomes, mantendo classes pequenas que costumam ser mais fáceis de nomear, criar e entender.(P.175)</br>
Os padrões de projetos, por exemplo, são amplamente modos de comunicação e expressividade. Ao usar nomes de padrões como [COMMAND]() ou [VISITOR](), no nome das classes que implementam tais padrões, você pode descrever de forma sucinta o seu projeto para outros desenvolvedores.(P.175)</br>
Testes de unidade bem escritos também são expressivos.(P.175)</br>
Portanto, tenha um pouco de orgulho em seu trabalho. Gaste tempo em cada uma das suas funções e classes. Escolha nomes melhores, divida funções grandes em menores e, de forma geral, cuide do que você mesmo criou.(P.176)

## Poucas classes e métodos
Muitas classes e métodos, às vezes, são o resultado de um dogmatismo exagerado. Conside, por exemplo, um padrão de programação que insiste em criar interface para cada classe. Ou desenvolvedores que teimam em sempre <i>separar campos e comportamentos em classes de dados e classes de comportamentos</i>. Deve-se evitar tal dogmatismo e adotar uma abordagem mais pragmática.</br>
Lembre-se, contudo, de que essa regra é a de menor prioridade das quatro de <i>Projeto Simples</i>. Portanto, embora seja importante manter baixa a quantidade de classes e funções, é mais importante testes, eliminar duplicações e se expressar.
