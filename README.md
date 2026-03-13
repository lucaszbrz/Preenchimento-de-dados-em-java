📚 Sistema de Controle de Notas e Faltas de Alunos
Descrição do Projeto

Este projeto consiste em um sistema em Java para gerenciar informações acadêmicas de um aluno, incluindo matrícula, nome, número de faltas e notas. Ele permite que o usuário:

Cadastre um aluno com suas informações;

Visualize todos os dados do aluno;

Verifique se o aluno foi reprovado por faltas;

Calcule e mostre a média das notas do aluno;

Informe a situação final de aprovação ou reprovação do aluno.

⚠️ Observação: Este sistema foi desenvolvido como exercício prático do meu primeiro semestre de faculdade, para aplicar conceitos de POO (Programação Orientada a Objetos), laços de repetição, estruturas condicionais e manipulação de dados em Java.

Estrutura do Projeto

O projeto é composto por duas classes principais:

1. Pauta.java

Esta classe é responsável por representar o modelo do aluno, incluindo atributos e métodos relacionados.

Atributos:

matricula (int) – Número de matrícula do aluno.

nomeAluno (String) – Nome do aluno.

numFalta (int) – Quantidade de faltas.

nota1 (double) – Nota da primeira avaliação.

nota2 (double) – Nota da segunda avaliação.

Métodos principais:

verificarFaltas() – Retorna true se o aluno tiver mais de 25 faltas.

calcularMedia() – Calcula a média das duas notas.

verificarSituacao() – Retorna "aprovado" ou "reprovado" de acordo com média e faltas.

Getters e Setters – Permitem acessar e modificar os atributos de forma segura.

toString() – Retorna uma representação completa dos dados do aluno.

2. PautaMain.java

Classe principal responsável pela interação com o usuário através do menu interativo no console.

Funcionalidades do menu:

Cadastrar aluno;

Mostrar todos os dados do aluno;

Verificar se o aluno está reprovado por faltas;

Mostrar a média do aluno;

Mostrar situação de aprovação ou reprovação;

Finalizar operações.

Fluxo do programa:

O usuário escolhe uma opção do menu.

Dependendo da escolha, o sistema solicita os dados do aluno ou exibe informações calculadas.

O menu se repete até que o usuário escolha finalizar o programa.

Como Executar

Certifique-se de ter o Java JDK instalado no seu computador.

Crie um projeto Java e adicione os dois arquivos Pauta.java e PautaMain.java.

Compile as classes:

javac Pauta.java
javac PautaMain.java


Execute a classe principal:

java PautaMain


Siga as instruções do menu no console.

Tecnologias Utilizadas

Linguagem: Java

Paradigma: Orientação a Objetos

Ferramentas: Console, Scanner, Estruturas de Controle (if/else, switch, loops)

Observações Finais

Este projeto é interativo, sendo ideal para praticar entrada de dados, condicionais, loops e manipulação de objetos em Java.

Ele pode ser expandido para multialunos, adicionando listas ou arrays de objetos Pauta.

O projeto foi desenvolvido como desafio acadêmico do primeiro semestre e demonstra conhecimentos iniciais de programação orientada a objetos.

📌 Autor: Lucas de Souza Barboza
🎓 Semestre: 3º Semestre
💻 Curso: Analise e desenvolvimento de Sistemas
