package org.certificatic.Medicamento.Repository;
import java.util.ArrayList;
import java.util.List;

import org.certificatic.Medicamento.Model.Medicamento;

public class MedicamentoRepositoryImpl implements MedicamentoRepository{
	private static List<Medicamento> medicamentoOnline= new ArrayList<Medicamento>();
	@Override
	public Medicamento crearMedicamento(Medicamento medicamento) {
		System.out.println("Registrar Medicamento::::");
		medicamentoOnline.add(medicamento);
		return medicamento;
	}

	@Override
	public List<Medicamento> obtenerTodos() {
		// TODO Auto-generated method stub
		System.out.println("::::Obtener los medicamentos Registrados");
		return medicamentoOnline;
	}
	

}
