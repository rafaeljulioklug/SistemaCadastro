Estive estudando validações em um projeto de Sistema de Cadastro e Login em java.

No meio do caminho, decidi que seria mais interessante estudar e criar uma interface básica.

Alguns pontos importantes:

1. Não há um banco de dados SQL ou qualquer coisa do tipo. Armazeno os usuários em um HashMap.
2. Como tanto email, quanto senha precisam ser validados, criei uma classe sozinha para cada e validei as Strings lá.
3. A parte de login não está satisfatória, por algum sentido, ele não está informando se o usuário conseguiu ou não se logar.
4. Acredito que seja porque devo ter implementado a validação e busca no mapa errado.


Confesso que não fui muito eficiente na questão de lógica do projeto. Acredito que ficou confuso as validações e como cada classe puxa de outra classe.
Por exemplo, uma classe tem o método de validação que na verdade só puxa a informação de outra classe, que puxa a informação de outra classe que valida.

Estarei tentando aprimorar o projeto nos próximos dias.
Pretendo integrar um pequeno banco de dados junto para exercitar.

Atualização 1.0:

Decidi mudar as classes e ter uma classe de validação de email e senha, ao invés de uma classe email e classe senha, o que pode confundir com o objetivo da classe.

Criei uma classe SistemaLogin que gerencia os cadastros e logins do sistema.

Refiz boa parte do código e validações para melhorar a interpretatividade do código.

Observação: Pedi ao copilot para me indicar em que pontos o meu código estava pecando, e ele apontou legibilidade. Após mudar parte do código, pedi para ele revisar.

   
