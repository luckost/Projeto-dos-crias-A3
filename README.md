## Requisitos Funcionais:

- Gestão de Ferramentas: Capacidade de adicionar, editar e excluir informações sobre ferramentas, como nome, marca e custo de aquisição.
- Registro de Contatos: Possibilidade de adicionar, editar e excluir informações sobre amigos, como nome e número de telefone.
- Controle de Empréstimos: Permitir registrar empréstimos de ferramentas para amigos, com registro das datas de empréstimo e devolução (quando aplicável).
- Relatórios: Geração de relatórios que incluam informações sobre ferramentas, como nome, marca e custo de aquisição das ferramentas cadastradas, juntamente com o gasto 
total.
- Produção de relatórios sobre empréstimos em andamento, destacando as ferramentas emprestadas e seus respectivos amigos.
- Elaboração de relatórios abrangentes sobre todos os empréstimos realizados, com detalhes sobre as ferramentas, os amigos envolvidos e as datas de empréstimo e devolução (se aplicável).
- Pesquisa avançada: Habilitar uma função de pesquisa avançada que permite ao usuário pesquisar ferramentas ou contatos usando filtros como categoria, preço ou nome do amigo.
- Histórico de alterações: Mostrar alterações feitas nas informações de ferramentas e contatos, incluindo data, horário e usuário responsável pela alteração.
- Prorrogação de empréstimo: Permitir ao usuário atualizar os empréstimos existentes e, se necessário, estender o prazo de devolução fazendo a atualização correspondente no registro.
- Sincronização de Dados: Fornecer a capacidade de sincronizar dados de software com outros dispositivos ou serviços (como armazenamento em nuvem) para garantir que os dados estejam sempre atualizados e acessíveis de qualquer lugar.
- Personalização de relatórios: Permitir ao usuário personalizar os relatórios de acordo com suas necessidades, escolher quais informações deseja incluir, organizá-las e aplicar filtros conforme necessário.
- Alertas Automáticos: Implementar um sistema de notificação automática que lembre o usuário de datas importantes, como datas de devoluções de empréstimos futuros ou inadimplentes.
- Integração de Calendário: Integrar o software com aplicativos de calendário, permitindo ao usuário visualizar as datas de empréstimo e devolução diretamente em seu calendário pessoal.
- Reserva de ferramentas: Adicionar um recurso de reserva de ferramentas que permite ao usuário reservar uma ferramenta de sua escolha para um empréstimo posterior.

## Requisitos Não Funcionais:
- Localização: O software deve ser executado no computador do usuário (tio-avô).
- Interface de usuário:A interface deve ser de fácil compreensão e utilização, especialmente para pessoas menos familiarizadas com tecnologia, com elementos de design intuitivos, instruções claras, opções para alterar o tamanho das letras e para facilitar a visualização.
- Desempenho Eficiente: Garantia de que o sistema seja rápido e responsivo, mesmo diante de grandes quantidades de dados, com tempos de carregamento rápidos e operações fluidas.
- Segurança dos Dados: Garantir a proteção dos dados armazenados, impedindo o acesso não autorizado por meio de medidas de segurança robustas, como criptografia de dados e autenticação de usuário.
- Compatibilidade: O software deve ser compatível com diferentes sistemas operacionais comuns, como Windows, macOS e Linux, garantindo que possa ser utilizado no computador do tio-avô, independentemente do sistema que ele utilize.
- Portabilidade: O software deve ser facilmente transferível entre diferentes computadores, permitindo que o tio-avô o utilize em outros dispositivos, se necessário, sem perder dados ou configurações.
- Backup Automático: Implementação de um sistema de backup automático para garantir a segurança dos dados, evitando a perda de informações importantes em caso de falha do sistema ou perda de dados.
- Manutenção Simples: O sistema deve ser fácil de manter e atualizar, com procedimentos simples para instalação de atualizações de software e correções de bugs, garantindo uma experiência contínua e livre de problemas para o usuário.
- Requisitos de Hardware: O software deve ser leve e ter requisitos mínimos de hardware, garantindo que possa ser executado em computadores mais antigos ou com recursos limitados.

## Regras de Negócio:
- Validação de Empréstimos: Verificação prévia para garantir que um amigo não possua empréstimos pendentes antes de registrar um novo empréstimo.
- Notificações de Empréstimos Pendentes: Alertas automáticos sobre empréstimos pendentes no momento de realizar um novo empréstimo.
- Registro de Devoluções: Manutenção de um registro atualizado das ferramentas emprestadas e suas datas de devolução para controle de disponibilidade.
- Identificação de Padrões: Identificação dos amigos que realizaram mais empréstimos e verificação de possíveis casos de amigos que nunca devolveram ferramentas.
- Limite de empréstimo para um amigo: Definir um número máximo de empréstimos que um amigo pode abrir ao mesmo tempo, evitando sobrecarga e garantindo uma gestão de empréstimos mais eficiente.
- Prazo máximo do empréstimo: Definir prazo máximo para devolução das ferramentas emprestadas, em que o sistema irá marcar automaticamente o empréstimo como vencido e enviará notificações ao usuário e ao amigo em questão.
- Restrição de acesso: Permitir que o administrador limite o acesso a determinadas funções ou dados com base nos níveis de acesso, garantindo a segurança e privacidade dos dados.
- Controle de acesso: Registrar todas as operações de acesso e modificação de dados no sistema para fornecer um histórico completo de auditoria para o monitoramento e a fiscalização.
- Política de Devolução:

## Banco de dados
Usuário: root
Senha:252426
