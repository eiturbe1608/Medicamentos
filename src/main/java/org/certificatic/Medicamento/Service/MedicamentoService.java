package org.certificatic.Medicamento.Service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.Medicamento.Model.Medicamento;

@WebService
public interface MedicamentoService {
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
