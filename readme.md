\# 📦 Java Polymorphism - Price Tags Example



Este projeto é um exercício prático em Java que demonstra o uso de \*\*herança\*\*, \*\*polimorfismo\*\* e \*\*sobrescrita de métodos\*\* (`@Override`). O objetivo é criar um programa que:



\- Leia os dados de \*\*N produtos\*\* (informados pelo usuário).

\- Cada produto pode ser:

&nbsp; - \*\*Comum\*\*

&nbsp; - \*\*Usado\*\* (possui data de fabricação)

&nbsp; - \*\*Importado\*\* (possui taxa de alfândega)

\- Imprima a \*\*etiqueta de preço\*\* de cada produto, exibindo informações adicionais conforme o tipo:

&nbsp; - Produto comum: nome e preço.

&nbsp; - Produto usado: nome, preço e data de fabricação.

&nbsp; - Produto importado: nome, preço final (com taxa de alfândega) e o valor da taxa.



\## 🚀 O que é praticado neste projeto



\- \*\*Herança\*\*: `Product` é a classe base; `UsedProduct` e `ImportedProduct` estendem `Product`.

\- \*\*Polimorfismo\*\*: a lista armazena todos como `Product` mas executa o método sobrescrito `priceTag()` de cada subclasse.

\- \*\*Sobrescrita de método\*\*: `priceTag()` exibe etiquetas diferentes de acordo com o tipo do produto.

\- \*\*Coleções polimórficas\*\*: `List<Product>` manipula objetos de diferentes subclasses.



\## 📂 Estrutura



\- \*\*Product.java\*\*: classe base com nome, preço e método `priceTag()`.

\- \*\*UsedProduct.java\*\*: extende `Product` e adiciona data de fabricação.

\- \*\*ImportedProduct.java\*\*: extende `Product` e adiciona taxa de alfândega.

\- \*\*Program.java\*\*: classe principal (`main`) para entrada de dados, processamento e impressão.



\## ⚙️ Tecnologias



\- Java SE

\- `Scanner` para entrada de dados

\- `SimpleDateFormat` para tratar datas

\- `Locale` para formato decimal



\## ✅ Como executar



1\. Compile todas as classes (`Product`, `UsedProduct`, `ImportedProduct` e `Program`).

2\. Execute `Program.java`.

3\. Insira o número de produtos e seus dados conforme solicitado.

4\. O programa exibirá as etiquetas de preço de todos os produtos.



---



📌 \*\*Exercício baseado em aulas de Programação Orientada a Objetos (POO) em Java.\*\*



---



