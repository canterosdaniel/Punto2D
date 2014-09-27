package punto2D;
public class Punto2D implements Punto{
	private double x;
	private double y;

	public Punto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public Punto2D() {
		this(0, 0);
	}

	public double distanciaEntreDosPuntos(Object a) {
		Punto2D punto2D = (Punto2D) a;
		return Math.sqrt(Math.pow(this.x - punto2D.x, 2)
				+ Math.pow(this.y - punto2D.y, 2));
	}
	
	public double distanciaEntreDosPuntos(double... values) {
		if(values.length != 2){
			return -1;
		
		}
		return Math.sqrt(Math.pow(this.x - values[0], 2)
				+ Math.pow(this.y - values[1], 2));
		
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double distanciaAlOrigen() {
		return distanciaEntreDosPuntos(new Punto2D());
	}
	public  void desplazamiento(double a, double b){
		this.x += a;
		this.y += b;
	}
	
	public  void desplazamiento(Punto2D miPunto2D){
		this.x += miPunto2D.x;
		this.y += miPunto2D.y;
	}

	public boolean equals(Object obj) {
		if (obj == null) { return false; }
		if (this == obj) { return true;  }
		if (this.getClass() != obj.getClass()) { return false; }
		
		Punto2D miPunto = (Punto2D) obj;
		if (this.x == miPunto.x && this.y == miPunto.y)
			return true;
		return false;
	}
	
	public String toString(){
		return "(" + x + " , " + y + ")";
	}
	
	public Object clone(){
			return new Punto2D(this.x , this.y);
	}
	
		
	public static void main(String[] args) {
		Punto2D miPunto1= new Punto2D(2,3);
		System.out.println("Punto Inicial: " + miPunto1);

		
		Punto2D miPunto2= new Punto2D(3,4);
		Punto2D miPunto3= new Punto2D(4,5);
		System.out.println("Los puntos: " + miPunto2 + " y " + miPunto3 + " ¿Son Iguales? " + miPunto2.equals(miPunto3));
		
//		Punto2D miPunto4= new Punto2D(6,7);
		Punto2D miPunto5= new Punto2D();
		System.out.println("Clonar Objeto" + miPunto1.clone());
		System.out.println("Constructor por defecto: " + miPunto5);
		
		System.out.println("Distancia Entre dos puntos: "+miPunto2.distanciaEntreDosPuntos(miPunto3));
		System.out.println("Distancia Entre dos puntos: "+miPunto2.distanciaEntreDosPuntos(4,5));
		
		
		
	}

	
//	public int compareTo(Punto2D punto2D) {
//		if(this.distanciaAlOrigen()>punto2D.distanciaAlOrigen() ){
//			
//		}
//		if(this.x>punto2D.x ){
//			
//		}
//		
//		
//		return 0;
//	}

	

	
}
