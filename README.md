# Atividade SOLID 

Este trabalho foi desenvolvido por Julia de França Macena Silva e Lavínia Domingos, no dia 25/08/2025 na Unidade Curricular de Arquitetura de Sistemas pelo professor Matheus Quost.

# Índice
- [O que é SOLID? ](#OqueéSOLID?)
- [Diagnóstico](#Diagnóstico)
- [Refatoração do Código](#RefarotacaoDoCodigo)

---

# O que é SOLID?

Na programação orientada a objetos o termo SOLID é um acrônimo para 5 princípios que facilitam o desenvolvimento de software, tornando-os fáceis de manter e estender.

###  1️⃣ | Single Responsibility Principle (Princípio da responsabilidade única) 
Este princípio diz que “Cada classe deve ter um, e somente um, motivo para mudar”. Isto significa que se uma classe tem várias responsabilidades, mudar um requisito do projeto pode trazer várias razões para modificar a classe.

###  2️⃣ |  Open-Closed Principle (Princípio Aberto-Fechado)
Define-se como “Entidades de software (como classes e métodos) devem estar abertas para extensão, mas fechadas para modificação”. O ideal é adaptar o código não para alterar a classe, mas para estendê-la.

###  3️⃣ |  Liskov Substitution Principle (Princípio da substituição de Liskov)
“Classes derivadas (ou classes-filhas) devem ser capazes de substituir suas classes-base (ou classes-mães), ou seja uma classe-filha deve ser capaz de executar tudo que sua classe-mãe faz. Esse princípio se conecta com o polimorfismo e reforça esses pilares da POO. 

###  4️⃣ | Interface Segregation Principle (Princípio da Segregação da Interface)
O princípio da segregação da interface diz: “Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados”. Devemos criar interfaces específicas ao invés de termos uma única interface genérica. 

###  5️⃣ |  Dependency Inversion Principle (Princípio da inversão da dependência)
“Dependa de abstrações e não de implementações concretas". É recomendado que os módulos de alto nível não dependam diretamente dos detalhes de implementação de módulos de baixo nível.
Em vez disso, eles devem depender de abstrações ou interfaces que definem contratos de funcionamento. Isso promove maior flexibilidade e facilita a manutenção do sistema.

---

# Diagnóstico

- SRP: uma classe faz cálculo, log, pagamento, salvar no banco e notificação.

- OCP: usa if/else para escolher pagamento, não aceita novos métodos sem mudar a classe.

- LSP: não dá pra trocar uma forma de pagamento por outra sem risco de erro.

- ISP: mistura persistência e notificação na mesma classe.

- DIP: depende de classes concretas (Database, EmailSender) em vez de abstrações.
Separar em serviços (cálculo, pagamento, persistência, notificação), cada um com sua interface.

---

# Refatoração do Código

- SRP: Criar PricingService só para calcular preços e descontos.

- OCP: Strategy → Criar interface PaymentMethod e implementar PixPayment, CreditCardPayment. Checkout não usa mais if/else.

- DIP: Injetar dependências (PaymentMethod, OrderRepository, Notifier) via interfaces.

- ISP: Salvar de Notifier (avisar).

- LSP: Todos os PaymentMethod funcionam do mesmo jeito sem quebrar contratos.


