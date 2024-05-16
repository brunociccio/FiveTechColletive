# 5Tech Collective

API do Projeto 5Tech Colletive 

## Integrantes 

BRUNO MATHEWS DE CICICO OLIVEIRA - RM 99097 - Java Advanced e Devops

ISABELLE CORSI - RM 97751 - Mastering Relational and Non-Relationl Database

JOSÉ LUIZ FERREIRA DUARTE - RM 99488 - Mobile Application Development

MARINA DE SOUZA CUCCO - RM 551569 - Complice, Quality Assurance and Tests e Disruptive Architectures

THALITA FACHINETE DE ALENCAR - RM 99292 - Advanced Business Development With .NET e Disruptive Architectures

## Objetivo do Projeto

Desenvolver uma ferramenta capaz de analisar o comportamento de LEADS no setor de varejo, com estudos feitos em datasets tratados no setor financeiro (em porcentagem assertiva) para transformar um interesse em negócios concretos.

## Detalhamento do Objetivo

No cenário altamente competitivo do setor de varejo, a conversão de leads em negócios concretos é crucial para o sucesso das empresas. No entanto, essa transição muitas vezes enfrenta desafios, como a falta de compreensão do comportamento dos leads e a dificuldade em identificar oportunidades promissoras. Para abordar essa questão, desenvolvemos uma ferramenta inovadora que utiliza análises avançadas de dados, com base em estudos do setor financeiro, para compreender e prever o comportamento dos leads com uma precisão notável. Ao aplicar modelos preditivos em datasets tratados do setor financeiro, nossa ferramenta oferece insights valiosos, transformando o interesse inicial em oportunidades de negócio tangíveis. Este projeto visa proporcionar às empresas do setor de varejo uma vantagem competitiva significativa, ao capacitar decisões estratégicas fundamentadas em dados e impulsionar a eficiência na conversão de leads.

## Java Advanced - Aplicação Java e Spring Boot

- Produzir pelo menos um dos domínios da solução tecnologógica utilizando Java e Spring [ok]
- Conter código que respeite a coesão e desacoplamento [ok]
- Respeitar os padrões DTO e utilizar Beans Validation [ok]
- Respeitar os conceitos fundamentais de REST [ok]
- API contendo um modelo com nível de maturidade 1 [ok]: feito com base em tudo o que aplicamos na matéria até o momento
- Utilizamos o Repository [ok]
- Utilizamos o JPA Query Methods [ok]
- O repositório está publicado no GitHub com domínio público[ok]

## Entrega

- Apresentar o cronograma de desenvolvimento e respeitar os prazos {esse item constá nessa documentação do arquivo README} - 5 pts [ok]
- Diagrama de Entidade de Relacionamento (DER) e Diagrama de Classes das Entidades constam em uma pasta nesse projeto chamada "Diagramas" - 10 pts [ok]
- Implementação das classes de Entidade necessárias para solução, atenção devida ao encapsulamento, tipagem dos atributos e ao mapeamento  objeto relacional com JPA - Consta no cronograma - primeiro Diagrama de Classe já implementado no projeto com as classes relacionadas ao Cadastro de usuários em nossa aplicação - 40 pts [ok]
- A aplicação respeita os conceitos fundamentais do REST e de acordo com a maturidade de nível 1 - 15 pts [ok]
- A gestão de configuração dos artefatos de software, o repositório está publicado devidamente no GitHub - 10 pts [ok]
- Link do GitHub - 10 pts [ok]: https://github.com/brunociccio/FiveTechColletive
- Link do Pitch no YouTube [versão 1 do Pitch, iremos produzir uma outra]: https://youtu.be/jTpoI_ScsZ8

## Cronograma e Implementações

- [ ] CRUD da classe Cadastro (implementado - sprint 1)
- [ ] CRUD das outras classes: CadastrarCnpj, Contato, Documentos e Endereço (implementado - sprint 2, na sprint 3 será implementada uma API no frontend para a busca do endereço através do CEP)
- [ ] CRUD de Login (será implementado até a sprint 3, utilizará uma API de autenticação)
- [ ] Dashboard (será implementado conforme a evoluação das telas entregues pelo responsavel de Mobile App - sprints 3 e 4)
- [ ] IA (será implementando conforme o desenvolvimento dos datasets que será tratados com base em IA Generativa junto a nossa aplicação - sprints 3 e 4)
- [ ] Banco de Dados (implementado parcialmente, evoluirá conforme o decorrer do projeto e a implementação das outras classes - sprint 3 e 4)
- [ ] Diagrama de Classes 1 - Login e Cadastrar (implementado no sprint 1 e 2)
- [ ] Diagrama de Classes 2 - Funcionalidades da Aplicação (será implementado junto a evoluação das matérias no decorrer da entraga das sprints 3 e 4)
- [ ] Documentação de todos os endpoints e funcionalidades do projeto foram implementados com swagger (implementado na sprint 2)
- [ ] Aplicação do admin criado em outro projeto Java / Spring (implementado na sprint 2)

# Documentação da API

A aplicação roda no http://localhost:8080/home

A documentação roda:
springdoc.swagger-ui.path=/docs
http://localhost:8080/swagger-ui/index.html#/

O console de adm está no repositório do GitHub:
https://github.com/brunociccio/ADM-Java-Spring.git
spring.boot.admin.client.url=http://localhost:9090
