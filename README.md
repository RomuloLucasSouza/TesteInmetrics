# Teste de Automa��o Inmetrics



### Tecnologia utilizada:

- Para realiza��o da automa��o de teste web, utilizei Cucumber, com a sintaxe Gherkin e linguagem Java.

- Para realiza��o da automa��o de teste de API, utilizei JUnit e RestAssured.

- IDE utilizada: Eclipse 2022



### Prepara��o do ambiente.

- Ap�s fazer o pull do projeto, abra na sua IDE. Toda a configura��o do projeto est� pronta, apenas sendo necess�rio colocar na pasta "Drivers" o driver do seu navegador. A automa��o est� preparada para executar atrav�s dos navegadores **"Chrome"** e **"Firefox"**. Por default est� apontando para o navegador "Firefox", caso utilizar o **"Chrome"** � necess�rio alterar no arquivo **"./src/test/java/runner/Executa.java"** na linha 21 a vari�vel com nome "navegador".

### Execu��o

- Para executar o teste web, abra o arquivo: *"./src/test/resource/feature/teste.feature"*, depois v� em "Run as" e selecione a op��o "Cucumber". Na pasta "./evidencias/" estar� o print da tela, com o �ltimo passo da execu��o.


- Para executar o teste de API, abra o arquivo: *"./src/test/java/testeapi/TesteAPI.java"*, depois v� em "Run as" e selecione a op��o "JUnit test". No console ser� impresso o par�metro desejado desse teste.
