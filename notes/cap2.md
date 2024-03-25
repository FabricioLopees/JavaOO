# Capitúlo 2

### Máquina Virtual

A JVM em uma simples explicação, atua como um "tradutor" entre duas partes. Ele interpreta o que um está dizendo (bytecode) e traduz para a outra parte na sua respectiva língua (sistema operacional). Um pouco além...

É como se eu escrevesse um código que rode na JVM, que simula um computador (máquina virtual), ou seja, é como se ao invés de escrever um código voltado para o sistema operacional a ou b, eu escrevo somente para um sistema operacional, a JVM, e depois disso, é ela quem faz a comunicação com o real sistema operacional.

#### HOTSPOT E JIT

**Hotspot**: tecnologia que identifica pontos que exijam um pouco mais de processamento, como em loops, que repete o mesmo código, e então compila esta parte do código em tempo real para a linguagem nativa da plataforma.

**JIT (Just In Time)**: O compilador utilizado pelo java.