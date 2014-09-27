package punto2D;

public interface Punto {
	public String toString();
	public Object clone();
	public boolean equals(Object obj);
	public double distanciaEntreDosPuntos(Object a);
	public double distanciaEntreDosPuntos(double...values);
	public double distanciaAlOrigen();
	

}
