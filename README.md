# Bootcamp Management System

Este projeto é uma simulação de um sistema de gerenciamento de Bootcamps. Ele permite a criação e gerenciamento de Bootcamps, incluindo o registro de desenvolvedores e a adição de conteúdos educacionais como cursos e mentorias.

## Estrutura do Projeto

O projeto é composto por seis classes principais:

### 1. `Bootcamp`
Representa um Bootcamp, contendo as seguintes propriedades:
- `nome`: O nome do Bootcamp.
- `descricao`: Uma breve descrição do Bootcamp.
- `dataInicial`: A data de início do Bootcamp.
- `dataFinal`: A data de término do Bootcamp, que é 30 dias após a data de início.
- `devsInscritos`: Um conjunto de desenvolvedores inscritos no Bootcamp.
- `conteudos`: Um conjunto de conteúdos (cursos e mentorias) disponíveis no Bootcamp.

### 2. `Conteudo`
Uma classe abstrata que representa um conteúdo educacional, como cursos e mentorias. Contém as propriedades:
- `titulo`: O título do conteúdo.
- `descricao`: A descrição do conteúdo.
- `XP_PADRAO`: Uma constante representando o valor padrão de XP (experiência) que um conteúdo pode fornecer.

A classe `Conteudo` possui um método abstrato:
- `calcularXp()`: Calcula o XP obtido pelo conteúdo.

### 3. `Curso`
Uma classe que herda de `Conteudo`, representando um curso. Contém as seguintes propriedades adicionais:
- `cargaHoraria`: A carga horária do curso.

Métodos:
- `calcularXp()`: Calcula o XP baseado na carga horária do curso.
- `setCargaHoraria(int cargaHoraria)`: Define a carga horária do curso, com validação para garantir que seja positiva.

### 4. `Mentoria`
Uma classe que herda de `Conteudo`, representando uma mentoria. Contém as seguintes propriedades adicionais:
- `data`: A data em que a mentoria será realizada.

Métodos:
- `calcularXp()`: Calcula o XP padrão mais um valor adicional para a mentoria.
- `getData()`: Retorna a data da mentoria.
- `setData(LocalDate data)`: Define a data da mentoria.

### 5. `Dev`
Representa um desenvolvedor que se inscreve em um Bootcamp e participa dos conteúdos oferecidos. Contém as seguintes propriedades:
- `nome`: O nome do desenvolvedor.
- `conteudosInscritos`: Um conjunto de conteúdos nos quais o desenvolvedor está inscrito.
- `conteudosConcluidos`: Um conjunto de conteúdos que o desenvolvedor concluiu.

Métodos:
- `inscreverBootcamp(Bootcamp bootcamp)`: Inscreve o desenvolvedor em um Bootcamp, adicionando todos os conteúdos do Bootcamp aos seus conteúdos inscritos.
- `progredir()`: Marca o primeiro conteúdo da lista de inscritos como concluído.
- `calcularTotalXp()`: Calcula o XP total obtido pelo desenvolvedor com base nos conteúdos concluídos.

### 6. `Main`
A classe principal que contém o método `main`, responsável por executar o programa. Nesta classe, são criados exemplos de cursos, mentorias, e desenvolvedores que se inscrevem e progridem em um Bootcamp.

## Como Executar

### Pré-requisitos
- **Java 17+**: Certifique-se de ter o JDK instalado em sua máquina.