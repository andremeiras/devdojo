# Sobre as @Annotations

## @EnableAutoConfiguration
É a anotação que define as propriedades e classes de configuração na classe (main) que inicia o projeto.

## @RestController
<p>Responsável por definir que após iniciar a aplicação, será ela a responsável por "guiar" os endpoints da classe Controller que serão acessados através da URI. Os endpoints são definidos dentro da classe Controller utilizando a anotação <b>@GetMapping(path = "endpoint")</b>.
<p>O tipo de retorno do <b>@RestController</b> é um JSON que é do tipo texto (String).
<p>Esta anotação irá buscar algum endpoint.</p>

## @ComponentScan
<p>Responsável por forçar a busca do pacote onde se encontra o Controller.</p>