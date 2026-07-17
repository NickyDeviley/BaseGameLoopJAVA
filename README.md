# BaseGameLoopJAVA - A estrutura base para um RPG 2D top-down utilizando apenas Java nativo.

# Descrição: 

Este projeto consiste no desenvolvimento da base de um jogo eletrônico escrito em Java puro, utilizando exclusivamente as bibliotecas nativas da linguagem (fornecidas pela Oracle). O propósito central deste trabalho é aprimorar habilidades avançadas em lógica de programação e arquitetura de software, aplicando rigorosamente os princípios do SOLID, Programação Orientada a Objetos avançada (como Polimorfismo, Interfaces, Classes Abstratas e Especialização) e Design Patterns para mitigar o uso de condicionais complexas e acoplamento excessivo.


# Game Design:

- High-Concept: 
Um RPG de ação focado em exploração de calabouços e combate tático minimalista, resgatando a essência dos consoles de 8 e 16 bits.

- Loop de Gameplay: 
Aceitar missões -> Explorar o mapa e resolver puzzles -> Derrotar criaturas e chefes -> Coletar recompensas e atualizar atributos.

- Foco do Jogo: 
Progressão contínua e desafio mecânico através de quebra-cabeças integrados ao ambiente.Público-Alvo: Entusiastas de jogos retrô clássicos e estudantes de desenvolvimento de jogos interessados em mecânicas low-level (baixo nível).


# Estado Atual: 

Atualmente o projeto está em fase de desenvolvimento, métodos e técnicas estão sendo testados e implementados para manter o projeto o mais compreensível e expandível possível. É entregue ao usuário uma experiência simples, uma janela é aberta na interface do usuário, o fundo é preto e há um retângulo Branco que pode ser movimentado utilizando inputs do teclado.


# Próximo Objetivo:

O desenvolvimento e implementação do sistema de Tiles, onde o mapa será modelado de forma dinâmica a partir da leitura de arquivos de texto e renderizado através de uma SpriteSheet. Essa etapa utilizará conceitos de POO avançada, como especialização de classes de blocos, polimorfismo para renderização em camadas e Design Patterns para otimização de memória. Também será atualizado o sistema de movimentação do jogador e de reconhecimento de inputs do teclado pois, atualmente, ele se encontra exclusivo da classe Player, os inputs serão movidos para a classe GameLoop para que possam interagir com todo o sistema do jogo, de forma que os comandos possam ser mais abrangentes além de permitir que o usuário modifique os botões futuramente.


# Objetivo Principal: 

Além de servir como um laboratório prático para treinar minhas habilidades como programador, dominar engenharia de software aplicada a jogos e compreender a matemática por trás da física e renderização 2D, o objetivo final é conceber um jogo bidimensional completo em perspectiva top-down, fortemente inspirado nos clássicos do século passado (como os primeiros The Legend of Zelda e Dragon Quest). 

# Trilha de objetivos:

✅ Game Loop (60 FPS, 120 UPS);

✅ Abrir uma janela;

✅ Renderizar um quadrado;

✅ Adicionar movimento ao quadrado via input;

✅ Sistema de Câmera

❌ Carregar configurações de tiles via TXT;

✅ Instanciar e renderizar blocos;

✅ Carregar mapa via txt (fly-weight pattern);

❌ Carregar Assets (PLACEHOLDER);

❌ Primeira versão "jogável";


# Diagrama de classe:

<img width="3071" height="2156" alt="GameInJavaClassDiagram" src="https://github.com/user-attachments/assets/695ed44c-032c-4a06-baa9-24852abc860e" />


# Pré-requisitos: 

- Linguagem: Java JDK (versão 8 ou superior, utilizando apenas bibliotecas nativas da Oracle como AWT e Swing).

- IDE: Eclipse IDE (ou qualquer ambiente de desenvolvimento de sua preferência compatível com Java).


# Instalação/Uso:

- Clone este repositório em sua máquina local;

- Abra o Eclipse IDE.Vá em File > Import > General > Existing Projects into Workspace e selecione a pasta do projeto clonado.

- Certifique-se de que o JDK do projeto está configurado corretamente nas propriedades de Build Path.

- Localize a classe principal que contém o método main e execute o projeto (Run As > Java Application).

# Comandos: 

Utilize as teclas W, A, S, D para movimentar o retângulo branco pela janela do jogo.

# Tecnologias:

- Java SE (Bibliotecas nativas/Oracle); 
- Eclipse IDE (Ambiente de desenvolvimento)


# Licença:

MIT License
