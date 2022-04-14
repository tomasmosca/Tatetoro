package tp1;

public class Logica {
	
	private int contadorX = 0;
	private int contadorO = 0;
	private boolean ganador = false;
	private boolean finRonda = false;
	private String turno = "X";
	private String jugadorGanador = "";
	private String boton1 = "";
	private String boton2 = "";
	private String boton3 = "";
	private String boton4 = "";
	private String boton5 = "";
	private String boton6 = "";
	private String boton7 = "";
	private String boton8 = "";
	private String boton9 = "";

	public String getTurno() {
		return turno;
	}
	
	public void elijeJugador() {
		if(turno.equalsIgnoreCase("X")) {
			turno="O";
		}else {
			turno="X";
		}
	}
	
	public void reiniciar() {
		setBoton1("");
		setBoton2("");
		setBoton3("");
		setBoton4("");
		setBoton5("");
		setBoton6("");
		setBoton7("");
		setBoton8("");
		setBoton9("");
		setGanador(false);
		setJugadorGanador("");
		setFinRonda(false);
	}
	
	public void nuevaPartida() {
		setBoton1("");
		setBoton2("");
		setBoton3("");
		setBoton4("");
		setBoton5("");
		setBoton6("");
		setBoton7("");
		setBoton8("");
		setBoton9("");
		setContadorO(0);
		setContadorX(0);
		setGanador(false);
		setJugadorGanador("");
		setFinRonda(false);
	}
	
	private boolean equals1(String a, String b, String c) {
		return (a == b && b == c && a != null && a != "");
	}
	
	public void comprobarGanador() {
		String[][] botones = {{boton1,boton2,boton3},{boton4,boton5,boton6},{boton7,boton8,boton9}};
		
		//horizontal
		for(int i = 0;i < 3;i++) {
			if(equals1(botones[i][0],botones[i][1],botones[i][2])) {
				contadorX = botones[i][0].equals("X") ? contadorX + 1 : contadorX + 0;
				contadorO = botones[i][0].equals("O") ? contadorO + 1 : contadorO + 0;
				ganador = true;
				setJugadorGanador(botones[i][0]);
			}
		}
		//vertical
		for(int i = 0;i < 3;i++) {
			if(equals1(botones[0][i],botones[1][i],botones[2][i])) {
				contadorX = botones[0][i].equals("X") ? contadorX + 1 : contadorX + 0;
				contadorO = botones[0][i].equals("O") ? contadorO + 1 : contadorO + 0;
				ganador = true;
				setJugadorGanador(botones[0][i]);
			}
		}
		//diagonal
		if(equals1(botones[0][0],botones[1][1],botones[2][2])) {
			contadorX = botones[0][0].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[0][0].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[0][0]);
		}
		if(equals1(botones[2][0],botones[1][1],botones[0][2])) {
			contadorX = botones[2][0].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[2][0].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[2][0]);
		}
		//toroidal
		if(equals1(botones[0][1],botones[1][0],botones[2][2])) {
			contadorX = botones[0][1].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[0][1].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[0][1]);
		}
		if(equals1(botones[0][1],botones[1][2],botones[2][0])) {
			contadorX = botones[0][1].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[0][1].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[0][1]);
		}
		if(equals1(botones[0][2],botones[1][0],botones[2][1])) {
			contadorX = botones[0][2].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[0][2].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[0][2]);
		}
		if(equals1(botones[0][0],botones[1][2],botones[2][1])) {
			contadorX = botones[0][0].equals("X") ? contadorX + 1 : contadorX + 0;
			contadorO = botones[0][0].equals("O") ? contadorO + 1 : contadorO + 0;
			ganador = true;
			setJugadorGanador(botones[0][0]);
		}
	}

	public int getContadorX() {
		return contadorX;
	}

	public void setContadorX(int contadorX) {
		this.contadorX = contadorX;
	}

	public int getContadorO() {
		return contadorO;
	}

	public void setContadorO(int contadorO) {
		this.contadorO = contadorO;
	
	}

	public boolean getGanador() {
		return ganador;
	}

	public void setGanador(boolean ganador) {
		this.ganador = ganador;
	}

	public String getBoton1() {
		return boton1;
	}

	public void setBoton1(String boton1) {
		this.boton1 = boton1;
	}

	public String getBoton2() {
		return boton2;
	}

	public void setBoton2(String boton2) {
		this.boton2 = boton2;
	}

	public String getBoton3() {
		return boton3;
	}

	public void setBoton3(String boton3) {
		this.boton3 = boton3;
	}

	public String getBoton4() {
		return boton4;
	}

	public void setBoton4(String boton4) {
		this.boton4 = boton4;
	}

	public String getBoton5() {
		return boton5;
	}

	public void setBoton5(String boton5) {
		this.boton5 = boton5;
	}

	public String getBoton6() {
		return boton6;
	}

	public void setBoton6(String boton6) {
		this.boton6 = boton6;
	}

	public String getBoton7() {
		return boton7;
	}

	public void setBoton7(String boton7) {
		this.boton7 = boton7;
	}

	public String getBoton8() {
		return boton8;
	}

	public void setBoton8(String boton8) {
		this.boton8 = boton8;
	}

	public String getBoton9() {
		return boton9;
	}

	public void setBoton9(String boton9) {
		this.boton9 = boton9;
	}

	public String getJugadorGanador() {
		return jugadorGanador;
	}

	public void setJugadorGanador(String jugadorGanador) {
		this.jugadorGanador = jugadorGanador;
	}

	public boolean getFinRonda() {
		return finRonda;
	}

	public void setFinRonda(boolean finRonda) {
		this.finRonda = finRonda;
	}
}
