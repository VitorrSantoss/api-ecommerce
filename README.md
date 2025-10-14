# E-commerce Básico

Sistema de e-commerce desenvolvido com Spring Boot para gerenciamento de produtos, categorias, carrinhos de compra e pedidos.

## 🚀 Tecnologias

- Java 17+
- Spring Boot
- Spring Data JPA
- Spring Security
- MySQL/PostgreSQL
- Maven

## 📋 Funcionalidades

- ✅ Cadastro e autenticação de usuários
- ✅ Gerenciamento de categorias de produtos
- ✅ Catálogo de produtos
- ✅ Carrinho de compras
- ✅ Gerenciamento de endereços
- ✅ Processamento de pedidos
- ✅ Controle de status de pedidos

## 🗂️ Estrutura do Banco de Dados

### **Usuários**
- Cadastro com nome, email e senha
- Informações pessoais (primeiro nome, último nome, telefone)
- Controle de timestamps (criação/atualização)

### **Endereços**
- Múltiplos endereços por usuário
- Informações completas: rua, cidade, estado, CEP, país
- Indicação de endereço padrão

### **Categorias**
- Organização hierárquica de produtos
- Nome e descrição
- URL de imagem

### **Produtos**
- Nome, descrição e preço
- Associação com categoria
- Quantidade disponível em estoque
- URL de imagem

### **Carrinhos**
- Carrinho único por usuário
- Itens do carrinho com produto e quantidade
- Cálculo de preço total

### **Pedidos**
- Histórico de compras do usuário
- Endereço de entrega associado
- Data do pedido e valor total
- Status do pedido: PENDENTE, PROCESSANDO, ENVIADO, ENTREGUE, CANCELADO
- Itens do pedido com quantidade e preço no momento da compra

## 🏗️ Estrutura do Projeto

```
src/main/java/com/ecommerce/
├── model/          # Entidades JPA
├── dto/            # Data Transfer Objects
├── service/        # Lógica de negócio
├── controller/     # Endpoints REST
├── repository/     # Acesso ao banco de dados
├── mapper/         # Conversão Entity ↔ DTO
├── security/       # Configurações de segurança
└── enum/           # Enumerações (StatusPedido)
```

#### Projeto em andamento...

<!--
## 🔧 Instalação

1. Clone o repositório
```bash
git clone https://github.com/seu-usuario/ecommerce.git
cd ecommerce
```

2. Configure o banco de dados em `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
```

3. Execute o projeto
```bash
mvn spring-boot:run
```

## 📡 Endpoints Principais

### Autenticação
- `POST /api/auth/register` - Cadastro de usuário
- `POST /api/auth/login` - Login

### Produtos
- `GET /api/produtos` - Listar produtos
- `GET /api/produtos/{id}` - Buscar produto
- `POST /api/produtos` - Criar produto (Admin)
- `PUT /api/produtos/{id}` - Atualizar produto (Admin)
- `DELETE /api/produtos/{id}` - Deletar produto (Admin)

### Categorias
- `GET /api/categorias` - Listar categorias
- `POST /api/categorias` - Criar categoria (Admin)

### Carrinho
- `GET /api/carrinho` - Ver carrinho
- `POST /api/carrinho/itens` - Adicionar item
- `PUT /api/carrinho/itens/{id}` - Atualizar quantidade
- `DELETE /api/carrinho/itens/{id}` - Remover item

### Pedidos
- `GET /api/pedidos` - Listar pedidos do usuário
- `GET /api/pedidos/{id}` - Detalhes do pedido
- `POST /api/pedidos` - Criar pedido
- `PUT /api/pedidos/{id}/status` - Atualizar status (Admin)

### Endereços
- `GET /api/enderecos` - Listar endereços
- `POST /api/enderecos` - Adicionar endereço
- `PUT /api/enderecos/{id}` - Atualizar endereço
- `DELETE /api/enderecos/{id}` - Deletar endereço
-->

## 👤 Autor

Vitor Santos - [GitHub](https://github.com/vitorrsantoss)