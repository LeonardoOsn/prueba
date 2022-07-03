package com.LeonardoLopez.Org.Service;

import java.util.List;

import com.LeonardoLopez.Org.Model.Vacante;

public interface IntVacantes {
	
	public List<Vacante> obtenerTodas();
	public void guardar(Vacante vaca);
	public void eliminar(Integer idVacante);
	public Vacante buscarPorId(Integer idVacante);
	public long numVacantes();
	void modificar(int posicion, Vacante v);
	int buscarPosicion(Vacante v);
}
