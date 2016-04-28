# Seja bem vindo ao projeto da Linguagem do Educodar

Vamos seguir os passos para mostrar como usar e logo em seguida vamos dar mais detalhes do que está acontecendo. Vamos nessa! \o/

O primeiro passo necessário é clonar o projeto do GitHub.

```
 git clone https://github.com/guilhermedias/educodar-spike.git
```

## Usando as imagens Docker

Garanta que o Docker e Docker Compose estão instalados na sua estação, seja com Docker Toolbox ou não.

Execute o seguinte comando na pasta onde baixou os arquivos do git:

```
docker-compose up
```

Agora basta conectar no IP do seu docker host e verá o resultado da aplicação. Caso esteja usando Docker Toolbox o ip normalmente é 192.168.99.100. Caso esteja usando GNU/Linux, basta acessar a 127.0.0.1 via navegador.

## Usando a partir dos fontes (Sem Docker) 

Agora que você já clonou o projeto pode entrar na pasta pois vamos criar o nosso compilador. Dentro da pasta
a gente pode executar o comando abaixo, que vai gerar o nosso compilador em um arquivo chamado educodar-all.java
dentro da pasta build/libs/.

```
./gradlew fatJar
```

*Pré requisito para que este passo funcione é você ter java na sua máquina*
Já temos nosso compilador, podemos compilar o programa com o comando a seguir, que vai gerar um arquivo
chamado compile.rb pronto para a gente executar o nosso programa:

```
java -jar build/libs/educodar-all.jar src/main/resources/examples/example.educodar

```

* Pré requisito para que o próximo passo funcione é você ter ruby e o sinatra instalados *

Com tudo isso feito é só a gente executar nosso programa com ruby, e ele está disponível no endereço
[http://localhost:4567](http://localhost:4567).

```
ruby compiled.rb
```

Pronto temos o nosso programa compilado e funcionando no nosso navegador.
