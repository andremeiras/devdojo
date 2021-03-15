# Sobre as @Annotations

## @EnableAutoConfiguration
É a anotação que define as propriedades e classes de configuração na classe (main) que inicia o projeto.

## @RestController
<p>Responsável por definir que após iniciar a aplicação, será ela a responsável por "guiar" os endpoints da classe Controller que serão acessados através da URI. Os endpoints são definidos dentro da classe Controller utilizando a anotação <b>@GetMapping(path = "endpoint")</b>.
<p>O tipo de retorno do <b>@RestController</b> é um JSON que é do tipo texto (String).
<p>Esta anotação irá buscar algum endpoint.</p>

## @ComponentScan
<p>Responsável por fazer a busca do Controller.
<p>Caso a classe que inicia a aplicação estiver dentro de um pacote dentro da aplicação, é necessário informar o package:
<p>Exemplo: <i>@ComponentScan (basePackages = "academy.devdojo.springboot2")</i>

## @Autowired
<p>É responsável por fazer a autoinjeção de dependências, ou seja, ao invés de criar um objeto (<i>Classe classe = new Classe();</i>), é utilizado apenas da seguinte forma:
<p><code>@Autowired<br />
Classe classe;
</code>
<p>Para utilizar esta anotação, é necessário incluir as anotações <b>@Component</b>, ou <b>@Service</b>, ou <b>@Repository</b> na classe que está sendo chamada (objeto que está sendo criado), que serão as responsáveis por transformar uma classe em um Spring Bean.
<p>Porém, esta não é uma boa prática, e sim, o correto é criando um construtor na classe.
<p>Uma outra forma é utilizar o Lombok através da anotação @AllArgsConstructor.

### @Component
Informa que a classe é apenas um componente do Spring.

### @Service
Também é um <b>@Component</b> e tem a mesma função, porém servirá apenas para diferenciar se a classe é apenas um componente ou apenas um serviço.

### @Repository
Irá trabalhar com algumas exceções no Spring Data. Fará o mapeamento das exceções.

### @SpringBootApplication
Faz toda a configuração do projeto sem a necessidade das anotações anteriores (@ComponentScan, @EnableAutoConfiguration, etc).