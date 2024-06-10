package Clases;


/**
 * @author Sebah
 * @version 1.0
 * @created 09-jun.-2024 11:58:19 p. m.
 */
public class Cuenta {

	private String alias;
	private String calle;
	private int colonia;
	private String cuenta;
	private boolean estado;
	private String localidad;
	private int numeroCalle;
	private int periodosAdeudados;
	private double saldo;
	public recibo m_recibo;
	public PagoGeneral m_PagoGeneral;

	public Cuenta(){

	}

	public void finalize() throws Throwable {

	}
	public String getalias(){
		return "";
	}

	public String getcalle(){
		return "";
	}

	public int getcolonia(){
		return 0;
	}

	public String getCuenta(){
		return "";
	}

	public String getLocalidad(){
		return "";
	}

	public int getNumeroCalle(){
		return 0;
	}

	public int getperiodosAdeudados(){
		return 0;
	}

	public double getSaldo(){
		return 0;
	}

	public boolean isestado(){
		return false;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setalias(String newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcalle(String newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcolonia(int newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCuenta(String newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setestado(boolean newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setLocalidad(String newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNumeroCalle(int newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setperiodosAdeudados(int newVal){

	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSaldo(double newVal){

	}
}//end Cuenta

/**
 * @author Sebah
 * @version 1.0
 * @updated 09-jun.-2024 11:58:55 p. m.
 */
public class DetallePuntoPago extends PagoGeneral {

	private jpg codigoQR;
	private String puntoPago;



	public void finalize() throws Throwable {
		super.finalize();
	}
	public void DetallePuntoPago(){

	}

	public jpg getCodigoQR(){
		return null;
	}

	public String getPuntoPago(){
		return "";
	}

	/**
	 * 
	 * @param qrCode
	 */
	public void setCodigoQR(jpg qrCode){

	}
}//end DetallePuntoPago