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

![Caso de Uso](https://drive.google.com/file/d/1cvUghls58Y7_8ie3QQuo-voDWbPDzHKx/view?usp=drive_link)

**5.2 Diagrama de Classes**

Estrutura das classes do sistema, atributos, métodos e relações.

**5.3 Diagrama de Sequência**

Fluxo de execução das funcionalidades mostrando a interação entre objetos.

**5.4 Diagrama Lógico**

Modelo de dados: tabelas, chaves e relacionamentos para o banco de dados.


**6. Telas do Sistema**

Importância das Telas
As telas de um sistema são a interface entre o usuário e o sistema. Devem ser claras, simples e funcionais para proporcionar uma boa experiência.


**7. Tecnologias Utilizadas**

Frontend: Java

Backend: Java

Banco de Dados: MySQL

Controle de Versão: Git e GitHub

Diagramas: StarUML, DrawSQL, Lucidchart

Prototipação de Telas: Figma

