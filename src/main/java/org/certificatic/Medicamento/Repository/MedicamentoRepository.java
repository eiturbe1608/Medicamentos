package org.certificatic.Medicamento.Repository;

import java.util.List;

import org.certificatic.Medicamento.Model.Medicamento;


public interface MedicamentoRepository {
	/**
	 * Metodo para registrar un medicamento.
	 * @param medicamento
	 * @return medicamento creado
	 */
	Medicamento crearMedicamento(Medicamento medicamento);
	
	/**
	 * Metodo para obtener todos los medicamentos
	 * @return 
	 */
	List<Medicamento> obtenerTodos();
}
