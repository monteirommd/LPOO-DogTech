# 🐾 Sistema de Clínica Veterinária - DogTech

Projeto desenvolvido para a disciplina **Linguagem de Programação Orientada a Objetos (LPOO)**.  
O objetivo é aplicar os conceitos de **Programação Orientada a Objetos (POO)** em Java, criando um sistema de gerenciamento aplicando os conceitos fundamentais de LPOO.

---

## 📚 Objetivos do Projeto

- O cadastro das entidades principais, por exemplo, produtos, clientes,
quartos, reservas, empréstimos, batalhas, locações, etc.

- Gerenciar os relacionamentos entre essas entidades, por exemplo,
vendas, reservas, empréstimos, batalhas, locações, etc.

- Consultar informações relevantes do sistema, como itens disponíveis,
histórico de operações, saldo, estatísticas, etc.

- Executar regras específicas que diferenciem os tipos de entidades, por
exemplo, limites, descontos, poderes, categorias, etc.

---

### Descrição dos pacotes:

- **model/** → Contém as classes do domínio (entidades).
- **service/** → Regras de negócio e manipulação de dados.
- **util/** → Classes auxiliares, como leitura de input do usuário.
- **Main.java** → Classe principal que inicia o programa e exibe o menu.

---

## ⚙️ Como Executar o Projeto

### Passos
1. Clone o repositório:
  git clone https://github.com/seu-usuario/nome-do-repositorio.git
2. Acesse a pasta do projeto:
  cd nome-do-repositorio
3. Compile o projeto:
  javac -d bin src/**/*.java
4. Execute o programa:
  java -cp bin Main
