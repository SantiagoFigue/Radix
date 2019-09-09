package Componenetes;

import java.util.ArrayList;

public class Funcion {
	private ArrayList<Character> datos;
	private ArrayList<Character> resultado;
	private ArrayList<Character> pila;
	
	public Funcion() {
		datos= new ArrayList<Character>();
	}
	
	public void agregar(Character caracter) {
		this.datos.add(caracter);
	}
	
	public String convertir() {
		StringBuilder nuevo=new StringBuilder(this.datos.size());
		
		for (Character ch:this.datos) {
			nuevo.append(ch);
		}
		return nuevo.toString();
	}
	
	public void ac() {
		this.datos.clear();
	}
	
	public void a() {
		int borrar=datos.size()-1;
		if(borrar>=0) {
			this.datos.remove(borrar);
		}
		
	}
	
	
	
	
	public String resultado() {
		int a=0;
		resultado=new ArrayList<Character>();
		pila=new ArrayList<Character>();
		
		while(a<this.datos.size()) {
			if (this.datos.get(a)=='A'||this.datos.get(a)=='B'||this.datos.get(a)=='C'||this.datos.get(a)=='D'||this.datos.get(a)=='E'||this.datos.get(a)=='F') {
				resultado.add(this.datos.get(a));
			}
			else if (this.datos.get(a)=='^'||this.datos.get(a)=='(') {
				pila.add(this.datos.get(a));
			}
			else if (this.pila.size()>0&&(this.datos.get(a)=='*'||this.datos.get(a)=='/') && pila.get(pila.size()-1)=='^') {
				while(pila.get(pila.size()-1)=='^') {
					resultado.add(pila.get(pila.size()-1));
					pila.remove(pila.get(pila.size()-1));
				}
			}
			else if(this.datos.get(a)==')') {
				while(pila.get(pila.size()-1)!='(') {
					resultado.add(pila.get(pila.size()-1));
					pila.remove(pila.get(pila.size()-1));
				}
				pila.remove(pila.get(pila.size()-1));
			}
			else if(this.pila.size() > 0 &&(this.datos.get(a)=='-'||this.datos.get(a)=='+')&&(pila.get(pila.size()-1)=='*'||pila.get(pila.size()-1)=='/'||pila.get(pila.size()-1)=='^')) {
				while(this.pila.size()>0  &&  (pila.get(pila.size()-1)=='*'||pila.get(pila.size()-1)=='/'||pila.get(pila.size()-1)=='^')) {
					resultado.add(pila.get(pila.size()-1));
					pila.remove(pila.get(pila.size()-1));
				}
				pila.add(this.datos.get(a));
			}else {
				this.pila.add(this.datos.get(a));
			}
			a++;
		}
		while(pila.size()>0) {
			resultado.add(pila.get(pila.size()-1));
			pila.remove(pila.get(pila.size()-1));
		}
		StringBuilder nuevo=new StringBuilder(resultado.size());
		
		for (Character ch:resultado) {
			nuevo.append(ch);
		}
		return nuevo.toString();
	}
	
	
	public Boolean pares() {
		int a=0;
		int b=0;
		for (int i = 0; i < this.datos.size(); i++) {
			if(this.datos.get(i)=='(') {
				a++;
			}else {
				if (this.datos.get(i)==')') {
					b++;	
				}
			
			} 	
		}
		return a==b;
	}
	
}
