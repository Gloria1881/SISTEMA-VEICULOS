# SISTEMA VEÍCULOS

Pequeno sistema de console em Java para cadastro e gerenciamento de veículos.

Este repositório contém três variações do mesmo projeto (implementações diferentes):

- `SISTEMA_VEICULO - versão 1/` - Versão inicial básica
- `SISTEMA_VEICULO - versão 2/` - Versão com classe base abstrata `CadastroBase.java`
- `SISTEMA_VEICULO (versão final)/` - Versão final com melhorias e classe utilitária `UtilitariosCadastro.java`

Componentes principais
- `Marca.java`, `Modelo.java`, `Veiculo.java`: entidades.
- `*Banco.java`: classes responsáveis pela persistência simples (persistência local/arquivo ou simulação de banco).
- `*Menu.java`: menus de console para interagir com o usuário (CRUD básico).
- `MenuPrincipal.java` / `sistemaveiculos.java`: pontos de entrada (classes que podem conter o método `main`).

Como compilar e executar (Git Bash)

1) Abra o Git Bash e entre na pasta desejada (ex.: versão 1). Em Git Bash as unidades Windows ficam montadas em `/d`, `/c`, etc. Exemplos:

```bash
cd "/d/SISTEMA-VEÍCULOS/SISTEMA_VEICULO - versão 1"
```

2) Compile todos os arquivos `.java`:

```bash
javac *.java
```

3) Execute a aplicação. Dependendo da versão, o nome do `main` pode ser `sistemaveiculos` ou `MenuPrincipal`. Exemplos:

```bash
java sistemaveiculos
# ou
java MenuPrincipal
```

Se receber erro `NoClassDefFoundError` ou `Could not find or load main class`, verifique o nome exato da classe que contém `public static void main(String[] args)` e use esse nome (sensível a maiúsculas/minúsculas em sistemas *nix).

Notas e recomendações
- Recomendado Java 8 ou superior.
- No Windows a execução costuma ser insensível a maiúsculas, mas em Linux/macOS o nome da classe/executável Java é case-sensitive.
- Se quiser compilar todas as pastas de uma vez, crie um script que rode `javac` em cada subdiretório.

Autor
- Arquivos originais do repositório (Glória Mariano).