# Simulador de Corridas de Fórmula 1

Um simulador simples de corridas de Fórmula 1 em Java que implementa programação paralela com threads.

## 📋 Descrição

O simulador reproduz uma disputa entre dois pilotos: **Hamilton** e **FernandoAlonso**. Cada piloto completa **5 voltas** de forma independente, com tempos aleatórios por volta. O vencedor é determinado pelo **menor tempo acumulado total**.

## 🏗️ Estrutura do Código

### Carro.java
Representa o carro de corrida com:
- Método `completarVolta()`: sincronizado, simula cada volta e acumula o tempo total
- Atributos: piloto, número de voltas, tempo total acumulado

### Piloto.java
Implementa `Runnable` para executar a corrida como thread:
- Cria e executa 5 voltas para o piloto
- Gera tempo aleatório entre 1000ms e 3000ms por volta

### Corrida.java
Classe principal que:
- Instancia os carros e pilotos
- Aguarda o término das duas threads
- Exibe tempos e declara o vencedor (quem tem menor tempo total)

## ▶️ Como Executar

```bash
javac simuladorCorrida/*.java
java simuladorCorrida.Corrida
