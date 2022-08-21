# Trabalho da disciplina GCC180-Computação em Nuvem

Este trabalho foi feito utilizando o framework spring boot e o banco de dados MongoDB. Para a disponibilização do sistema na internet é usado o Heroku para executar o servidor e o MongoDB Atlas para armazenar os dados.

Spring boot 2.7.2 <br>
Java 8 <br>

Base URL = https://gcc180-cloud-computing.herokuapp.com <br>

Este sistema é apenas um CRUD simples de tarefas. Para acessar as operações utilize a rota: `BASE_URL/tasks`

- Para fazer cadastro de novas tarefas utilize `BASE_URL/tasks` com o verbo POST passando um request body do tipo JSON com as seguintes informações:

```
BASE_URL/tasks
```

```
{
    "description": "Exemplo de descrição",
    "deadline": "12/09/2022", 
    "done": null
}
```

- Para fazer a busca por todos os itens cadastrados no banco, utilize a rota `BASE_URL/tasks` com o verbo GET.

- Para realizar a busca por um determinado item utilize a seguinte rota `BASE_URL/tasks/{id}` com o verbo GET onde o {id} é o id do elemento a ser buscado. Ex:

```
BASE_URL/tasks/62f96630e457e36f7d014aea
```

- Para fazer a remoção de um registro utilize a rota `BASE_URL/tasks/{id}` com o verbo DELETE onde o {id} é o id do elemento a ser removido. Ex:

```
BASE_URL/tasks/62f96630e457e36f7d014aea
```

- Para fazer a atualização de um registro utilize a rota `BASE_URL/tasks` com o verbo PUT passando um request body com o id do registro a ser alterado e todas as atualizações de TODOS os atributos.

```
BASE_URL/tasks
```

```
{
    "id": "62f96630e457e36f7d014aea",
    "description": "Exemplo de descrição",
    "deadline": "12/09/2022", 
    "done": null
}
```