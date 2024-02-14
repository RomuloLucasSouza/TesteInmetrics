# Teste de Automação Inmetrics



### Tecnologia utilizada:

- Para realização da automação de teste web, utilizei Cucumber, com a sintaxe Gherkin e linguagem Java.

- Para realização da automação de teste de API, utilizei JUnit e RestAssured.

- IDE utilizada: Eclipse 2022



### Preparação do ambiente.

- Após fazer o pull do projeto, abra na sua IDE. Toda a configuração do projeto está pronta, apenas sendo necessário colocar na pasta "Drivers" o driver do seu navegador. A automação está preparada para executar através dos navegadores **"Chrome"** e **"Firefox"**. Por default está apontando para o navegador "Firefox", caso utilizar o **"Chrome"** é necessário alterar no arquivo **"./src/test/java/runner/Executa.java"** na linha 21 a variável com nome "navegador".

### Execução

- Para executar o teste web, abra o arquivo: *"./src/test/resource/feature/teste.feature"*, depois vá em "Run as" e selecione a opção "Cucumber". Na pasta "./evidencias/" estará o print da tela, com o último passo da execução.


- Para executar o teste de API, abra o arquivo: *"./src/test/java/testeapi/TesteAPI.java"*, depois vá em "Run as" e selecione a opção "JUnit test". No console será impresso o parâmetro desejado desse teste.
