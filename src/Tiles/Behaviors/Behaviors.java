package Tiles.Behaviors;

public enum Behaviors {
    SOLID,        // tem colisão
    WALKABLE,     // jogador pode andar
    SWIMMABLE,    // jogador nada (água)
    CLIMBABLE,    // escada
    TELEPORT,     // teleporta o jogador
    DAMAGING,     // causa dano (lava, espinhos)
    INTERACTABLE, // pode ser interagido (baú, placa)
    ANIMATED,     // tem animação
    TRANSPARENT,  // não bloqueia visão/luz
    DESTRUCTIBLE; // pode ser destruído
}
