# Relatório de Testes Unitários para o Sistema de Cashback

## 1.Introdução

a. Descrição da Atividade

Este relatório documenta os resultados dos testes unitários realizados para a funcionalidade de cálculo de cashback. O objetivo é verificar a precisão do cálculo de cashback de acordo com as faixas de valor e o grau de fidelidade do cliente.

b. Objetivo dos Testes

Os testes têm como objetivo garantir que a função calculaCashBack calcule o valor de cashback corretamente com base nas faixas de valor e no grau de fidelidade. A precisão é crucial para garantir a satisfação dos clientes e a integridade financeira do sistema.

c. Conceito de Análise de Valor Limite

Análise de valor limite é uma técnica de teste que foca em testar os limites das faixas de entrada. É importante porque frequentemente ocorrem erros nas bordas dos intervalos, e testar esses limites ajuda a garantir que o sistema lide corretamente com entradas nas fronteiras.

## 2. Análise de Valor Limite
a. Casos de Teste Projetados e Resultados Obtidos

### FAIXA BRONZE

#### Caso 1 - Cashback até R$ 100 com Faixa Bronze:

Entrada: valorTotal = 100, grauFidelidade = "Bronze"

Resultado Esperado: 5% de cashback

Resultado Obtido: 10% de cashback

Status: Falhou

#### Caso 2 - Cashback de R$ 100,01 a R$ 500 com Faixa Bronze:

Entrada: valorTotal = 200, grauFidelidade = "Bronze"

Resultado Esperado: 10% de cashback

Resultado Obtido: 10% de cashback

Status: Passou

#### Caso 3 - Cashback acima de R$ 500 com Faixa Bronze:

Entrada: valorTotal = 1000, grauFidelidade = "Bronze"

Resultado Esperado: 15% de cashback

Resultado Obtido: 15% de cashback

Status: Passou

### FAIXA PRATA

#### Caso 1 - Cashback até R$ 100 com Faixa Prata:

Entrada: valorTotal = 100, grauFidelidade = "Prata"

Resultado Esperado: 10% de cashback

Resultado Obtido: 15% de cashback

Status: Falhou

#### Caso 2 - Cashback de R$ 100,01 a R$ 500 com Faixa Prata:

Entrada: valorTotal = 200, grauFidelidade = "Prata"

Resultado Esperado: 15% de cashback

Resultado Obtido: 15% de cashback

Status: Passou

#### Caso 3 - Cashback acima de R$ 500 com Faixa Prata:

Entrada: valorTotal = 1000, grauFidelidade = "Prata"

Resultado Esperado: 20% de cashback

Resultado Obtido: 20% de cashback

Status: Passou

### FAIXA OURO

#### Caso 1 - Cashback até R$ 100 com Faixa Ouro:

Entrada: valorTotal = 100, grauFidelidade = "Ouro"

Resultado Esperado: 15% de cashback

Resultado Obtido: 20% de cashback

Status: Falhou

#### Caso 2 - Cashback de R$ 100,01 a R$ 500 com Faixa Ouro:

Entrada: valorTotal = 200, grauFidelidade = "Ouro"

Resultado Esperado: 20% de cashback

Resultado Obtido: 20% de cashback

Status: Passou

#### Caso 3 - Cashback acima de R$ 500 com Faixa Ouro:

Entrada: valorTotal = 1000, grauFidelidade = "Ouro"

Resultado Esperado: 25% de cashback

Resultado Obtido: 25% de cashback

Status: Passou

b. Aplicação do Critério de Valor Limite

Os testes foram projetados para cobrir os limites inferiores das faixas de cashback e os diferentes graus de fidelidade. Os valores testados foram escolhidos para verificar se o sistema calcula corretamente o cashback para valores nas faixas de cashback.

## 3. Execução dos Testes
a. Processo de Execução dos Testes

Os testes foram executados utilizando o JUnit. Cada método de teste foi chamado e o resultado obtido foi comparado com o valor esperado. Os testes foram realizados com base em entradas específicas para verificar a precisão dos cálculos.

b. Resultados dos Testes

Dos testes executados, alguns falharam:

Faixa Bronze: Cashback até R$ 100 e Faixa Prata: Cashback até R$ 100.
Faixa Ouro: Cashback até R$ 100.
c. Saídas de Execução dos Testes
Os resultados dos testes podem ser verificados nos logs do JUnit, onde as falhas foram documentadas.

d. Resultados dos Testes Projetados na Análise do Valor Limite

Os testes que passaram confirmam que o sistema calcula corretamente o cashback para as faixas superiores e os graus de fidelidade correspondentes. No entanto, as falhas nos limites inferiores indicam que o cálculo do cashback não está correto nesses casos.

e. Problemas Encontrados

Os problemas encontrados foram relacionados ao cálculo incorreto do cashback nas faixas inferiores. O sistema está aplicando uma porcentagem de cashback maior do que a esperada para as faixas "Bronze", "Prata" e "Ouro" com valor até R$ 100. A função calculaCashBack precisa ser corrigida para garantir que os valores de cashback estejam de acordo com as faixas definidas.

## 4. Conclusão

a. Descobertas

Os testes identificaram falhas no cálculo de cashback para valores até R$ 100 em todas as faixas de fidelidade. O sistema não está aplicando corretamente as porcentagens de cashback para esses limites.

b. Avaliação da Robustez da Aplicação

A aplicação demonstrou robustez em relação aos limites superiores das faixas e aos graus de fidelidade diferentes, mas apresentou problemas nos limites inferiores. A função de cálculo de cashback precisa ser ajustada para garantir precisão em todos os casos.
