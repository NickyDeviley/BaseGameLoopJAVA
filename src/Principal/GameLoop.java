package Principal;

import Principal.Managers.EntityManager;
import Screen.Panel;
import Screen.Screen;
import Util.Input.AssetInput;
import Util.Input.KeyboardInput;

public final class GameLoop implements Runnable {

// CONSTANTES
	private final byte FPS = 60;
	private final byte UPS = 120;
	private final double NANOSSEGUNDOS_EM_SEGUNDOS = 1000000000.0;

// OBJETOS
	private Thread gameThread;
	private AssetInput assetInput;
	private KeyboardInput keyboardI;
	
	// Screen
	private Screen gameJanela;
	private Panel gamePainel;
	
	// Managers
	private EntityManager entityM;

// VARIÁVEIS
	private boolean running = false;
	
	// Construtor
	public GameLoop() {

		// Instanciando Objetos
		this.keyboardI = new KeyboardInput();
		
		// Instanciando os objetos Managers
		assetInput = new AssetInput();
		entityM = new EntityManager(assetInput, keyboardI);
		
		// Criando os objetos janela
		this.gamePainel = new Panel(this.entityM);
		this.gameJanela = new Screen(Config.nomeJogo, this.gamePainel);
		

		this.startGameLoop();
		
	}

	// Método tudo declarado dentro deste método
	// roda na thread
	@Override
	public void run() {
		
		this.runningGameLoop();
		
	}
	
	// Método que inicia a thread
	private void startGameLoop() {
		
		this.gameThread = new Thread(this);	// Instanciando a thread
		this.running = true;				// Ativando variável que mantém o gameloop
		this.gameThread.start();			// Iniciando a thread
	}
	
	// Método que contém o GameLoop
	private void runningGameLoop() {
		
		double deltaTimeFPS = this.NANOSSEGUNDOS_EM_SEGUNDOS / this.FPS;
		double deltaTimeUPS = this.NANOSSEGUNDOS_EM_SEGUNDOS / this.UPS;

		long timePassedFrame = 0;
		long timePassedUpdate = 0;
		long actualTime = 0;
		long lastCheck = System.currentTimeMillis();
		long lastFrame = System.nanoTime();
		long lastUpdate = System.nanoTime();
		int qtdFrames = 0;
		int qtdUpdates = 0;
		
	
		while(this.running) {	// GAMELOOP
			
			actualTime = System.nanoTime();				// Tempo atual do sistema em nano segundos
			timePassedFrame = actualTime - lastFrame;	// Calcula o tempo que já passou desde que o último Frame foi desenhado
			timePassedUpdate = actualTime - lastUpdate;	// Calcula o tempo que já passou desde o último Update
			
			// Verifica se o jogo pode atualizar
			if (timePassedUpdate >= deltaTimeUPS) {
				//gamePainel.update();						// Chamando método que atualiza o jogo
				lastUpdate += deltaTimeUPS;				// Atualiza o tempo do último Update somando o delta
				qtdUpdates++;							// Soma 1 ao contador para verificar se ocorre 120 atualizações por segundo
			}
			
			// Verifica se o frame pode atualizar
			if (timePassedFrame >= deltaTimeFPS) {
				gamePainel.repaint();					// Método que atualiza o frame
				lastFrame += deltaTimeFPS;				// Atualiaz o tempo do último frame somando o delta
				qtdFrames++;							// Soma 1 ao contador para verificar se ocorre 60 atualizações por segundo
			}
			
			// Se o jogo não atualiza o FPS ou UPS
			// Calcula o tempo que falta para atualizar os dois
			
			/*
			long tempoRestanteFrame = (long) ((deltaTimeFPS - timePassedFrame) / 1000000);
			long tempoRestanteUpdate = (long) ((deltaTimeUPS - timePassedUpdate) / 1000000);
				
			// Encontra o menor valor entre os dois
			long tempoParaDormir = Math.min(tempoRestanteFrame, tempoRestanteUpdate);
			*/
			
			// Mudaça para o GameLoop, agora ele calcula qual o menor
			// tempo até a próxima atualização
			long nextEvent = (long) Math.min(lastUpdate + deltaTimeUPS, lastFrame + deltaTimeUPS);
			long timeRemaining = nextEvent - System.nanoTime();
			
			// Se o valor for maior que 2ms 
			// A thread "descansa" pelo tempo restante
			if (timeRemaining >= 2000000 /* tempoParaDormir > 0 */) {
				try {
					Thread.sleep(timeRemaining / 1000000 - 1);
				}
				catch (InterruptedException e) {
					
					System.out.println("A thread não conseguiu dormir!" + e.getMessage());
					e.printStackTrace();
				}
			}
			
			// Verifica se pode imprimir o FPS e o UPS do jogo em Milissegundos
			if (System.currentTimeMillis() - lastCheck >= 1000) {
				
				lastCheck = System.currentTimeMillis();			// Atualiza o momento do último print
				System.out.print("FPS: " + qtdFrames + " ");	// Imprimimos a quantidade de Frames em 1 segundo
				System.out.println("UPS: " + qtdUpdates);		// Imrpimimos a quantidade de Updates em 1 segundo
				qtdFrames = 0;									// Zera a contagem de FPS para contar novamente
				qtdUpdates = 0;									// Zera a contagem de UPS para contar novamente
				
			}
		} 
	}
}
