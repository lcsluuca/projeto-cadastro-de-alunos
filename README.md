# projeto-cadastro-de-alunos

**Índice**


Introdução

Visão Geral do Sistema

Requisitos Funcionais

Requisitos Não Funcionais

Diagramas

Telas do Sistema

Tecnologias Utilizadas


**1. Introdução**
   
Este documento descreve tudo que o sistema Cadastro de Alunos precisa ter para funcionar corretamente. A ideia é organizar as funcionalidades, entender como ele deve ser, e garantir que quem for desenvolver, testar e usar saiba exatamente o que esperar.


**2. Visão Geral do Sistema**
   
O sistema será usado principalmente pela secretaria de uma escola ou instituição de ensino, com o objetivo de facilitar o cadastro e a gestão dos alunos.


**Funcionalidades:**

Cadastrar novos administradores, docentes e alunos.

Consultar informações dos alunos.

Atualizar dados cadastrais.

Adicionar cursos e registrar notas.

Gerar relatórios acadêmicos.

Acesso segmentado por níveis de autorização (Alunos, Docentes e Administradores).


**3. Requisitos Funcionais**
   
**[RF001] Cadastro de Alunos**

Descrição: Permitir cadastro, consulta, atualização e gestão dos alunos.

**Funcionalidades:** Registro de novos alunos, Edição de informações cadastrais (nome, CPF, data de nascimento, endereço, contato, etc.) e Gerenciamento de status do aluno (Ativo, Inativo, Transferido, Egresso).

Prioridade: Essencial

**[RF002] Gestão de Curso**

Descrição: Gerenciar cursos, seus responsáveis e turmas associadas.

**Funcionalidades:** Criar, editar e excluir cursos. Gerenciar turmas, horários e professores responsáveis. Controle de matrícula dos alunos nos cursos e turmas.

Prioridade: Essencial

**[RF003] Registro de Notas**

Descrição: Permitir que professores registrem avaliações, médias e resultados.

**Funcionalidades:** Inserção e atualização de notas, Cálculo automático de médias e Geração de boletins acadêmicos.

Prioridade: Essencial

**[RF004] Histórico Acadêmico**

Descrição: Manter registro da trajetória acadêmica dos alunos.

**Funcionalidades:** Armazenamento de disciplinas cursadas, notas e status. Emissão de certificados, declarações e diplomas. Exportação de histórico acadêmico (PDF, XML).

Prioridade: Essencial

**[RF005] Portal do Aluno**

Descrição: Ambiente online para alunos acompanharem sua vida acadêmica.

**Funcionalidades:** Acesso às notas, cursos matriculados e histórico. Comunicação com professores e secretaria. Acesso a calendário acadêmico, notificações e eventos.

Prioridade: Importante

**4. Requisitos Não Funcionais**

**[NF001] Segurança de Dados**

**Funcionalidades:** Controle de acesso com autenticação multifator, Criptografia de dados sensíveis e Backup e recuperação de informações.

Prioridade: Essencial

**[NF002] Desempenho**

**Funcionalidades:** Resposta rápida do sistema e Suporte a múltiplos acessos simultâneos.

Prioridade: Importante

**5. Diagramas**

**5.1 Diagrama de Casos de Uso**

Representação dos atores e casos de uso para melhor compreensão das funcionalidades.

![casos](https://github.com/user-attachments/assets/44f0e261-667e-4a27-be9b-28bb65289968)

**5.2 Diagrama de Classes**

Estrutura das classes do sistema, atributos, métodos e relações.

![Classes](https://github.com/user-attachments/assets/4b50a7fb-1f4d-45cb-a4eb-735bc29767b7)

**5.3 Diagrama de Sequência**

Fluxo de execução das funcionalidades mostrando a interação entre objetos.

![Aluno](https://github.com/user-attachments/assets/80b189ef-d51f-4738-9a05-35bcf30ec8d1)

![Prof](https://github.com/user-attachments/assets/70d96d0f-dc12-445b-b7fe-11d24f6cd905)

**5.4 Diagrama Lógico**

Modelo de dados: tabelas, chaves e relacionamentos para o banco de dados.

![logico](https://github.com/user-attachments/assets/9748ce1a-0bd0-4770-b0cf-4b6f82b5371f)

**6. Telas do Sistema**

Importância das Telas
As telas de um sistema são a interface entre o usuário e o sistema. Devem ser claras, simples e funcionais para proporcionar uma boa experiência.

![Image](https://github.com/user-attachments/assets/324ecae1-a571-427b-9807-a265e40577da)

![Image](https://github.com/user-attachments/assets/7618b12b-3047-4ac8-8a7e-a738a02adca7)

![Image](https://github.com/user-attachments/assets/65e80ccc-897e-44d7-8155-570f6662a9d1)

![Image](https://github.com/user-attachments/assets/62a75042-f324-4e5f-ab1a-9691d965c4b5)

![Image](https://github.com/user-attachments/assets/223d7c35-e646-4411-acb5-51500dcfdb6a)

**7. Tecnologias Utilizadas**

Frontend: Java

Backend: Java

Banco de Dados: MySQL

Controle de Versão: Git e GitHub

Diagramas: StarUML, DrawSQL, Lucidchart

Prototipação de Telas: Figma

