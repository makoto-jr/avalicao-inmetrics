# language: pt

Funcionalidade:
Como um usuário
Eu quero testar as funcionalidades do sistema
Para realizar um cadastro, login, inclusão, alteração e exclusão de funcionário.

Cenário: Deve cadastrar novo usuário com sucesso
Dado que estou acessando na tela inicial do site
Quando eu clicar no link cadastre-se
E digitar o nome de usuário "hugoCosta001"
E digitar a senha "123456"
E digitar a confirmação da senha "123456"
E clicar no botão cadastrar
Então o cadastro é realizado com sucesso

Cenário: Deve realizar login no sistema com sucesso
Dado que estou acessando a tela de login
Quando eu digitar o nome de usuário "JoaoSilva21"
E digitar a senha "123456"
E clicar no botão entre
Então o login é realizado com sucesso

Cenário: Deve cadastrar novo funcionário
Dado que estou na tela de login
Quando eu digitar o nome do usuário "JoaoSilva21"
E digitar a senha "123456"
E clicar no botão entre
E clicar no link novos funcionários
E digitar o nome do funcionário "Teste"
E digitar o cpf do funcionário "114.440.560-26"
E selecionar o sexo do funcionário "Masculino"
E digitar a data de admissão do funcionário "28/07/2020"
E digitar o cargo do funcionário "Analista de teste"
E digitar o valor do salário do funcionário "1.000,00"
E escolher a opção de contratação do funcionário "clt"
E clicar no botão enviar
Então é exibido a mensagem de cadastro com sucesso

Cenário: Deve alterar dados do funcionário
Dado que estou na tela de login
Quando eu digitar o nome do usuário "JoaoSilva21"
E digitar a senha "123456"
E clicar no botão entre
E clicar no botão alterar correspondente ao cpf "114.440.560-26"
E alterar o valor do salário "7.000,00"
E clicar no botão submeter
Então é exibido a mensagem de alteração com sucesso

Cenário: Deve excluir registro do funcionário
Dado que estou na tela de login
Quando eu digitar o nome do usuário "JoaoSilva21"
E digitar a senha "123456"
E clicar no botão entre
E clicar no botão excluir correspondente ao cpf "114.440.560-26"
Então é exibido a mensagem de exclusão com sucesso

