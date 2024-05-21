# Exchange_Criptomoedas
• O projeto consiste na criação da sua
propria Exchange de Criptomoedas.
• Exchanges de Criptomoedas são
plataformas onde é possível comprar e
vender criptomoedas
• Uma criptomoeda é um tipo de
dinheiro – como outras moedas com as
quais convivemos cotidianamente –
com a diferença de ser totalmente
digital. Além disso, ela não emitida por
nenhum governo (como é o caso do
real ou do dólar, por exemplo)
---------------------------------------------------
A Exchange de Criptomoedas contém essas tres moedas com essas tres taxas:
❑ Bitcoin:
○ Cobra uma taxa de 2% na compra de bitcoin
○ Cobra uma taxa de 3% na venda de bitcoin
❑ Ethereum:
○ Cobra uma taxa de 1% na compra de ethereum
○ Cobra uma taxa de 2% na venda de ethereum
❑ Ripple:
○ Cobra uma taxa de 1% na compra de ripple
○ Cobra uma taxa de 1% na venda de ripple
---------------------------------------------------

Funções contidas no projeto Usuarios(Investidor):
▪ Efetuar login
▪ Consultar saldo (reais, bitcoin, ethereum e ripple) da carteira de
investimentos
▪ Consultar extrato de operações da carteira de investimentos
▪ Depositar reais na carteira de investimento
▪ Sacar reais da carteira de investimento
▪ Comprar criptomoedas (bitcoin, ethereum ou ripple)
▪ Vender criptomoedas (bitcoin, ethereum e ripple)
▪ Atualizar cotação das criptomoedas (bitcoin, ethereum e ripple)

(Detalhando cada função do Investidor):
● Efetuar login
● Usuário deve informar:
○ CPF sem pontos e sem traços
○ Senha numérica com 6 dígitos
● Se os dados estiverem corretos, fornecer acesso ao
menu completo
---------------------------------------------------
● Consultar saldo (reais, bitcoin, ethereum e ripple) da carteira
de investimentos
● Usuário deve informar:
○ Senha numérica com 6 dígitos
● Se a senha estiver correta, mostrar as informações
atualizadas:
---------------------------------------------------
● Consultar extrato de operações da carteira de investimentos
● Usuário deve informar:
○ Senha numérica com 6 dígitos
● Se a senha estiver correta, mostrar as informações
atualizadas:
---------------------------------------------------
● Depositar reais na carteira de investimento
● Usuário deve informar:
○ O valor do depósito
● Mostrar os saldos atualizados após o depósito
---------------------------------------------------
● Sacar reais na carteira de investimento
● Usuário deve informar:
○ O valor do saque (o saldo não pode ficar negativo)
● Mostrar os saldos atualizados após o saque
---------------------------------------------------
● Comprar criptomoedas (bitcoin, ethereum ou ripple)
● Usuário deve informar:
○ Senha numérica com 6 dígitos
● Se a senha estiver correta, mostrar as cotações das
criptomoedas e permitir que ele escolha quanto e qual
deseja comprar (o saldo não pode ficar negativo)
● Aplicar a taxa de compra 
---------------------------------------------------
● Vender criptomoedas (bitcoin, ethereum ou ripple)
● Usuário deve informar:
○ Senha numérica com 6 dígitos
● Se a senha estiver correta, mostrar as cotações das
criptomoedas e permitir que ele escolha quanto e qual
deseja vender (o saldo não pode ficar negativo)
● Aplicar a taxa de venda
---------------------------------------------------
● Atualizar a cotação das criptomoedas (bitcoin, ethereum ou
ripple)
● Usar a geração de números aleatórios para variar a
cotação de todas as criptomoedas
● Observação: as variações precisam ser de no máximo
+5% do valor anterior e no mínimo -5% do valor anterior
---------------------------------------------------
---------------------------------------------------
---------------------------------------------------
Funções contidas no projeto Administrador:
▪ Efetuar login
▪ Cadastrar novos investidores
▪ Excluir investidores
▪ Cadastrar novas criptomoedas
▪ Excluir criptomoedas
▪ Consultar saldo de um investidor
▪ Consultar extrato de um investidor
▪ Atualizar cotação das criptomoedas

(Detalhando cada função do administrador):
● Efetuar login
● Usuário deve informar:
○ CPF sem pontos e sem traços
○ Senha numérica com 6 dígitos
● Se os dados estiverem corretos, fornecer acesso ao
menu completo
---------------------------------------------------
● Cadastrar novo investidor
● Usuário deve informar:
○ Nome, CPF e senha
● Observação: o CPF não pode conter pontos e traços
---------------------------------------------------
● Excluir investidor
● Usuário deve informar:
○ CPF do investidor a ser excluído
● Se o CPF existir, mostre os dados e pergunte se
realmente deseja excluir antes de fazer a exclusão
definitiva
---------------------------------------------------
● Cadastrar nova criptomoeda
● Usuário deve informar:
○ Nome, cotação, taxa de compra e taxa de venda
---------------------------------------------------
● Excluir criptomoeda
● Usuário deve informar:
○ Nome da criptomoeda que deseja excluir
● Se o nome existir, mostre os dados e pergunte se
realmente deseja excluir antes de fazer a exclusão
definitiva
---------------------------------------------------
● Consultar saldo (reais, bitcoin, ethereum e ripple) de um
investidor
● Usuário deve informar:
○ CPF do investidor
● Se o CPF existir, mostrar as informações atualizadas:
---------------------------------------------------
● Consultar extrato de operações de um investidor
● Usuário deve informar:
○ CPF do investidor
● Se o CPF existir, mostrar as informações atualizadas:
---------------------------------------------------
● Atualizar a cotação das criptomoedas (bitcoin, ethereum ou
ripple)
● Usar a geração de números aleatórios para variar a
cotação de todas as criptomoedas
● Observação: as variações precisam ser de no máximo
+5% do valor anterior e no mínimo -5% do valor anterior
---------------------------------------------------
---------------------------------------------------
---------------------------------------------------
Esse projeto foi desenvolvido utilizando a linguagem java e Banco de Dados PostgreSQL , para que
as informações criadas no programa não fossem perdidas ao fechar o programa.
