# 💡 Java Polymorphism - Price Tags Example

Este projeto é um exercício prático em Java que demonstra o uso de **herança**, **polimorfismo** e **sobrescrita de métodos** (`@Override`). O objetivo é criar um programa que:

- Leia os dados de **N produtos** (informados pelo usuário).
- Cada produto pode ser:
  - **Comum**
  - **Usado** (possui data de fabricação)
  - **Importado** (possui taxa de alfândega)
- Imprima a **etiqueta de preço** de cada produto, exibindo informações adicionais conforme o tipo:
  - Produto comum: nome e preço.
  - Produto usado: nome, preço e data de fabricação.
  - Produto importado: nome, preço final (com taxa de alfândega) e o valor da taxa.

## 🚀 O que é praticado neste projeto

- **Herança:** `Product` é a classe base; `UsedProduct` e `ImportedProduct` estendem `Product`.
- **Polimorfismo:** a lista armazena todos como `Product`, mas executa o método sobrescrito `priceTag()` de cada subclasse.
- **Sobrescrita de método:** `priceTag()` exibe etiquetas diferentes de acordo com o tipo do produto.
- **Coleções polimórficas:** `List<Product>` manipula objetos de diferentes subclasses.

## 📂 Estrutura

- **Product.java**: classe base com nome, preço e método `priceTag()`.
- **UsedProduct.java**: estende `Product` e adiciona data de fabricação.
- **ImportedProduct.java**: estende `Product` e adiciona taxa de alfândega.
- **Program.java**: executa o fluxo principal.
