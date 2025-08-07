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

   
