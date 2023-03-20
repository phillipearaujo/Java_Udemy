package oo.heranca.desafio;

public class Carro {
	
    final int VELOCIDADE_MAXIMA;
	public int velAtual;
    private int delta = 5;
    
    /*
     
    Carro(){
    	this(200);
    }
     
     *Neste desafio foi criado abaixo o construtor Carro o que eliminou o contrutor padrão
     *causando erro na herança das classes Civic e Ferrari. Podemos construir de forma 
     *explicita um construtor padrão(sem atributo) para chamar o contrutor Carro com 
     *atributo(int velocidadeMaxima) usando o this() para atribuir o valor experado como 
     *demonstrado logo acima.
     *Dessa forma tanto os objetos Civic e Ferrari teriam a mesma velocidade máxima(200).
     *
     *Optei por instanciar os objetos cada um em sua classe dando a eles valores distintos.
     *
     */
    
     public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = getDelta();
	}

	protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }
        
	public void acelerar() {
            if(velAtual + getDelta() > VELOCIDADE_MAXIMA){
                velAtual = VELOCIDADE_MAXIMA;
            }else {
                velAtual += getDelta();
            }
	}
	
	public void frear() {
		if (velAtual >= 5) {
			velAtual -= 5;
		}	
	}
	
}