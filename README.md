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

O desenvolvimento e implementação do sistema de Tiles, onde o mapa será modelado de forma dinâmica a partir da leitura de arquivos de texto e renderizado através de uma SpriteSheet. Essa etapa utilizará conceitos de POO avançada, como especialização de classes de blocos, polimorfismo para renderização em camadas e Design Patterns para otimização de memória.


# Objetivo Principal: 

Além de servir como um laboratório prático para treinar minhas habilidades como programador, dominar engenharia de software aplicada a jogos e compreender a matemática por trás da física e renderização 2D, o objetivo final é conceber um jogo bidimensional completo em perspectiva top-down, fortemente inspirado nos clássicos do século passado (como os primeiros The Legend of Zelda e Dragon Quest). 


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

# Estrutura:

src
|- Entities
|  |- Behaviors
|  |  |- Atingivel.java
|  |  |- Command.java
|  |  |- Direction.java
|  |  |- PlayerState.java
|  |- Info
|  |  |- Vazia*
|  |- Player
|  |  |- Commands
|  |  |  |- Vazia*
|  |  |
|  |  |- States
|  |  |  |- IdleState.java
|  |  |  |- States.java
|  |  |  |- WalkState.java
|  |  |- Player.java
|  |- Entity.java
|- Principal
|  |- Managers
|  |  |- AssetManager.java
|  |  |- EntityManager.java
|  |  |- PhysicManager.java
|  |  |- TileManager.java
|  |  |- WorldManager.java
|  |- Controller
|  |  |- Vazia*
|  |- Main.java
|  |- GameLoop.java
|  |- Config.java
|- Screen
|  |- Panel.java
|  |- Screen.java
|- Tiles
|  |- Behaviors
|  |  |- AnimatedRenderes.java
|  |  |- Behaviors.java
|  |  |- StaticRenderer.java
|  |  |- TileRenderer.java
|  |- Tile.java
|- Util
|  |- Input
|  |  |- AssetInput.java
|  |  |- KeyboardInput.java
|  |  |- MouseInput.java
|  |  |- WorldInput.java
|  | UtilityTools.java
  
res
|- Assets
|  |- EntitiesAssets
|  |  |- Player
|  |  |- Slime
|  |
|  |- TilesAssets
|  |  |- TileSet.png
|  |  |- TilesInfo.txt
| 
|- Worlds
|  |- Worldtest.txt


# Licença:

MIT License
