package org.certificatic.Medicamento.Service;

import java.util.List;

import javax.jws.WebService;

import org.certificatic.Medicamento.Model.Medicamento;
import org.certificatic.Medicamento.Repository.MedicamentoRepository;
import org.certificatic.Medicamento.Repository.MedicamentoRepositoryImpl;

@WebService(endpointInterface = "org.certificatic.Medicamento.Service.MedicamentoService")
public class MedicamentoServiceImpl implements MedicamentoService {
	MedicamentoRepository medicamentoRepository= new MedicamentoRepositoryImpl();
	@Override
	public Medicamento crearMedicamento(Medicamento medicamento) {
		// TODO Auto-generated method stub
		return medicamentoRepository.crearMedicamento(medicamento);
	}

	@Override
	public List<Medicamento> obtenerTodos() {
		// TODO Auto-generated method stub
		return medicamentoRepository.obtenerTodos();
	}

	
	
}
