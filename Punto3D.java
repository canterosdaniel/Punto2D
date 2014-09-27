package punto2D;

public class Punto3D extends Punto2D{
	private double z;

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.setZ(z);
	}
	

	public Punto3D() {
		super(0,0);
		this.setZ(0);
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getZ() {
		return z;
	}
	
	public double distanciaEntreDosPuntos(Object a) {
		Punto3D punto3D = (Punto3D) a;
		return  Math.sqrt(Math.pow(getX() - punto3D.getX(), 2)
				+ Math.pow(getY() - punto3D.getY(), 2)+ Math.pow(this.z - punto3D.z, 2));
	}
	
	public double distanciaEntreDosPuntos(double... values) {
		if(values.length != 3){
			return -1;
		
		}
		return Math.sqrt(Math.pow(getX() - values[0], 2)
				+ Math.pow(getY() - values[1], 2)+ Math.pow(this.z - values[2], 2));
		
	}

	public double distanciaAlOrigen() {
		return distanciaEntreDosPuntos(new Punto3D());
	}
	public  void desplazamiento(double a, double b,double c){
		super.desplazamiento(a, b);
		this.z+=c;
	}
	
	public  void desplazamiento(Punto3D miPunto3D){
		super.desplazamiento(miPunto3D);
		this.z += miPunto3D.z;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}


	public String toString(){
		return "(" + getX() + " , " + getY() + " , "+z+")";
	}
	
	public Object clone(){
			return new Punto3D(getX() , getY(),z);
	}
	
	public static void main(String[] args) {
		Punto2D miPunto = new Punto2D(2,1);
		Punto3D miPunto1= new Punto3D(2,3,1);
		System.out.println("Punto Inicial: " + miPunto1);

		
		Punto3D miPunto2= new Punto3D(3,4,1);
		Punto3D miPunto3= new Punto3D(4,5,2);
		System.out.println("Los puntos: " + miPunto2 + " y " + miPunto3 + " ¿Son Iguales? " + miPunto2.equals(miPunto3));
		
//		Punto3D miPunto4= new Punto3D(6,7);
		Punto3D miPunto5= new Punto3D();
		System.out.println("Clonar Objeto" + miPunto1.clone());
		System.out.println("Constructor por defecto: " + miPunto5);
		
		System.out.println("Distancia Entre dos puntos: "+miPunto2.distanciaEntreDosPuntos(miPunto3));
		System.out.println("Distancia Entre dos puntos parametrizado: "+miPunto2.distanciaEntreDosPuntos(4,5,2));
		
		miPunto = miPunto1;
		System.out.println(miPunto.toString());
		
		Punto pv []= new Punto2D[10];
		for(int i=0;i<10;i++){
			pv[i]= new Punto2D(i,i+1);
			System.out.println(pv[i]);
		}
		
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		
		pv[3]= new Punto3D(4,5,7);
		
		for(int i=0;i<10;i++){
			System.out.println(pv[i]);
		}
		
		
		
	}
	

}
