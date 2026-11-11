# Projeto-Final-Programa-o-Orientada-a-Objetos-POO-

# Controle de Gastos

Trabalho prático de Orientação a Objetos (FGA0158). É uma aplicação de console em Java para controle financeiro pessoal: registra receitas e despesas, classifica cada uma em uma categoria, mantém o saldo atualizado e mostra o extrato.

## O que cada pasta guarda

Cada pasta é um pacote Java, e o nome da pasta é igual à linha `package` no topo de cada arquivo (por exemplo, `package modelo;`).

**`modelo`**: guarda os dados do dinheiro, ou seja, o que é uma movimentação financeira. Aqui ficam a classe `Transacao` (o molde de toda movimentação), as classes `Receita` e `Despesa` (que herdam de `Transacao`) e `Categoria` (a lista de categorias, como Salários, Luz e Lazer). Essa pasta só descreve os dados e não tem regras de negócio.

**`excecoes`**: guarda os avisos de erro do sistema. Aqui ficam a `ControleGastosException`, que é a classe-mãe de todos os erros, e as quatro exceções filhas: `ValorInvalidoException`, `NomeInvalidoOuNuloException`, `CategoriaNaoDefinidaException` e `SaldoInsuficienteException`.

**`servico`**: guarda as regras do sistema, ou seja, o que se faz com os dados. Aqui ficam a interface `Registravel` (lista as operações de uma conta), a classe `Conta` (guarda o saldo e faz inserir, atualizar, remover, consultar saldo e emitir extrato) e a classe genérica `Repositorio`, que guarda as transações.

**`app`**: guarda a execução do programa. Aqui fica a classe `Main`, que roda o roteiro de demonstração. Ela só cria objetos e envia mensagens, sem regras de negócio.

**`docs`**: guarda a documentação da entrega: o diagrama de classes UML, o relatório em PDF e o roteiro de testes.

## Padrão de branches

Formato: `tipo/escopo-descricao-curta`

- **tipo:** `feat`, `fix`, `docs` ou `refactor`
- **escopo:** `modelo`, `excecoes`, `servico`, `app` ou `docs`

## Padrão de commits

A mensagem de cada commit segue o formato `tipo(escopo): descrição curta`.

- Os tipos e escopos são os mesmos das branches. Também existe o tipo `chore`, para tarefas de organização, como criar pastas.
- A descrição começa com um verbo (cria, adiciona, corrige), tem até 72 caracteres e não termina com ponto.
- Cada commit trata de um assunto só, e código que não compila não vai para a `main`.
