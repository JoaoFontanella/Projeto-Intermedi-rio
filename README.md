# Projeto-Intermediario
Repositório para avaliação 02 - projeto intermediário da disciplina de back-end.
#
Deve ser um projeto de web service que recebe e responde requisições HTTP no formato JSON; <br>
Deve ser executado, por padrão, na porta 8080; <br>
Deve conter pelo menos um controller e um service no código-fonte; <br>
Deve conter uma rota GET para consultas (apenas leitura) e uma rota POST que recebe dados pelo corpo da mensagem; <br>
Deve utilizar dados externos (API ou Arquivos) que serão processados pelo serviço para a geração das respostas HTTP; <br>
Todas as rotas devem realizar algum tipo de tratamento nos dados recebidos do cliente e do serviço externo; <br>
Devem possuir um Dockerfile e um docker-compose.yml que permita a execução do projeto em um container Docker autosuficiente. <br>
O corpo das mensagens HTTP deve manipular o formato JSON; <br>
O README.md deve conter instruções claras para a execução do projeto, além da descrição das rotas e exemplos de requisições e respostas; <br>
Deverá conter ainda uma denominada: /sobre, que deverá responder com conteúdo EXATAMENTE no seguinte formato:
