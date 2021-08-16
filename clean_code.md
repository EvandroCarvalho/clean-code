# Anotações leitura Clean Code

# Capítulo 10 - Classes

## Classes devem ser pequenas
<p>O nome de uma classe deve descerver quais reponsabilidades ela faz. Selecionar um nome é a primeira forma de ajudar a determinar o tamanho da classe. Quando mais ambíguo for o nome da classe, maiores são as chances de dela ficar com muitos responsabilidades. Por exemplo, nomes de classes que possuem palavras de vários sentidos, como <i>Processor</i> ou <i>Manager</i> ou <i>Super</i>, geralmente indicam um acúmulo lastimável de responsabilidades.</br>
<i>Devemos também poder escrever com cerca de 25 palavras uma breve descrição da classe, sem usar as palavras "se", "e", "ou" ou "mas".</i> (P.138)</p>

## O príncipio da responsabilidade única
<p>O principio da responsabilidade única (SRP) afirma que uma classe ou módulo deve ter um, e apenas um, motivo para mudar. (P.138)</br>
O problema é que muitos de nós achamos que terminamos se o programa funciona. Esquecendo-nos da outra questão de organização e clareza. Seguindo para o próximo problema em vez de voltar e dividir as classes muito cheias em outras com responsabilidades únicas.(P.139)<br>
Ao mesmo tempo muitos desenvolvedores temem que um grande número de classes pequenas e de propósito único dificulte mais o entendimento geral do código. Há também bastante o que se aprender num sistema com poucas classes grandes. Portanto a questão é: <i> você quer suas ferramentas organizadas em caixas de ferramentas com muitas gavetas pequenas, cada um com objetos bem classificados e rotulados ? Ou poucas gavetas nas quais você coloca tudo ?</i>(P.139)</p>

## Coesão
<p>As classes devem ter um pequeno número de variáveis de instâncias. Uma classe na qual cada variável é utilizada é totalmente coesa.(P.140)</p>

## Manutenção de resultados coesos em muitas classes pequenas
<p>Se há poucas funções que desejam comparilhar certas variáveis, é indício de falta de coesão, Quando as classes perdem coesão, divida-as.</br>
Portanto, separar uma função grande em muitas pequenas geralmente nos perfmite dividir em várias classes também. Isso dá ao nosso programa uma melhor organização e uma estrutura mais transparente</p>

# Capítulo 11 - Sistemas

## Injeção de dependência
<p>A IoC (inversão de controle) move as responsabilidades secundárias de um objeto para outros dedicado ao propósito que se deseja, desta forma suportando o Princípio da Responsabilidade Única. Em vez disse ela deve passar esta responsabilidade para outro mecanismo "dominante", com isso invertendo o controle. Como esta configuração é uma preocupação global, este mancanismo dominante geralmente será ou uma rotina "principal" ou um container de tarefas especificas.</p>
 A Injeção de Dependência verdadeira vai mais além. A classe não determina diretamente suas dependências, ela fica completamente passiva e oferece métodos de escritas <i>(setters)</i> ou parâmetros de construturos (ou ambos) que serão utilizados para injetar dependências.(P.157)</br>
 Fazendo analogia a uma cidade, no começo não há serviços, como abastecimento de energia, água, esgoto e Internet. E só serão adicionados quando aumentar a densidade da população e edificações.(P.157)</br>
 Mas esse desenvolvimento não esta livre de problemas. Quantas vezes, devido a um projeto de "melhoria" das avenidas você dirigiu por engarrafamentos e se perguntou: "Por que não construíram as ruas largas o bastante desde o ínicio?".(P.157)</br>
 Mas não podia ter sido de outro forma. Como justificar o custo de construções de uma via expressa de seis faixas passando no meio de uma cidade pequena já antecipando seu desenvolvimento?(P.157)</br>
 É mito dizer que podemos conseguir um sistema "correto de primeira". Em vez disso, devemos implementar apenas os fatos de hoje e, então refatorar e expandir o sistema, implementando novos fatos amanhã. Essa é a essência das agilidades iterativas e incremental.(P.158)</p>

Mais em [KISS](https://pt.wikipedia.org/wiki/Princ%C3%ADpio_KISS)

## Use padrões sabiamente quanto eles adicionares um valor demonstrativo
<p>Os padrões facilitam a reutilização de ideias e componentes, recrutam pessoas com experiência considerável, encapsulam boas ideias e conectam os componentes. Entretanto, o processo de criação de padrões pode, às vezes, ser muito longo para que o mercado fique à espera deles, e alguns padrões acabam se desviando das necessidades reais das pessoas a quem eles pretendem servir.(P.168)</p>

## Sistemas precisam de linguagens específicas a um domínio
<p>Linguagens Específicas de Domínio (DSLs), permitem todos os níveis de abastração e todos os domínios na aplicação serem expressas como POJOs, de um nível mais alto de regra e detalhes de um nível mais baixo.(P.169)</p>

# Capítulo 12 - Emergência
## Obtendo clareza através de um processo de emergência
<p>Quatro regras do Projeto Simples de Kent Beck, são de ajuda considerável na criação de software bem projetado.</p>

Mais em [BeckDesignRules](https://martinfowler.com/bliki/BeckDesignRules.html)

1. Passes the tests (Efetuar todos os testes)
2. Reveals intention (Expressar o propósito do programador)
3. No duplication (Sem duplicação de código)
4. Fewest elements (Minimizar o número de classes e métodos)

## Regra 1 de Projeto Simples: Efetue todos os teses
<p>Os sistemas que não podem ser testados não podem ser verificados. Logo, pode-se dizer que um sistema que não pode ser verificado, jamais deveria ser implementado.</p>
<p>Felizmente, tonar nossos sistemas passíveis de teste nos direciona a um projeto no qual nossas classes sejam pequenas e de proósito único. Simplesmente é mais fácil testar classes que sigam [SRP](#o-príncipio-da-responsabilidade-única).</p>

