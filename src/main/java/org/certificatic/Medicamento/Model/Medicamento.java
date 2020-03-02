package org.certificatic.Medicamento.Model;

public class Medicamento {
	
	private String NombreMedicina;
	private String SustanciaActiva;
	private String FechaCaducidad;
	private Double PrecioVenta;
	private int CantidadInventario;
	private TipoEnum tipo;
	public String getNombreMedicina() {
		return NombreMedicina;
	}
	public void setNombreMedicina(String nombreMedicina) {
		NombreMedicina = nombreMedicina;
	}
	public String getSustanciaActiva() {
		return SustanciaActiva;
	}
	public void setSustanciaActiva(String sustanciaActiva) {
		SustanciaActiva = sustanciaActiva;
	}
	public String getFechaCaducidad() {
		return FechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}
	public Double getPrecioVenta() {
		return PrecioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		PrecioVenta = precioVenta;
	}
	public int getPrivaeCantidadInventario() {
		return CantidadInventario;
	}
	public void setPrivaeCantidadInventario(int privaeCantidadInventario) {
		this.CantidadInventario = privaeCantidadInventario;
	}
	public TipoEnum getTipo() {
		return tipo;
	}
	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}
	
	


}
