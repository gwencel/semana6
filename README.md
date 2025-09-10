# Projeto POO — Gerenciamento de Funcionários

Este projeto foi desenvolvido como exercício de **Programação Orientada a Objetos (POO)** em Java.  
Objetivo: aplicar **abstração, herança, interfaces e polimorfismo** criando uma hierarquia de funcionários e calculando bônus.

---

## Estrutura do projeto
Coloque os arquivos na raiz do projeto (sem pacote) ou dentro da pasta `empresa/` (com pacote).

```
semana6/
 ├── funcionario.java
 ├── bonificavel.java
 ├── gerente.java
 ├── estagiario.java
 └── principal.java
```

---

## Como compilar e rodar

### Sem `package`
Abra o terminal na pasta `ProjetoPOO` e rode:
```bash
javac *.java
java Principal
```

> Observação: garanta que o `java` e `javac` estejam no PATH e que você esteja na pasta correta antes de executar os comandos.

---

## Exemplo de saída esperada
```
Gabriel está gerenciando a equipe.
Gerson está auxiliando nas tarefas.
Bônus da Maria: R$ 1600.0
Bônus do João: R$ 75.0
```

---

## Notas
- Versão do Java recomendada: Java 8 ou superior.
- Se você usar IDE (IntelliJ, Eclipse, VS Code), crie um projeto Java, adicione as classes e execute a classe `Principal`.
- Se receber erro `NoClassDefFoundError` ou `ClassNotFoundException`, verifique se você está executando o `java` a partir da pasta raiz do projeto e se compilou os `.java`.

---