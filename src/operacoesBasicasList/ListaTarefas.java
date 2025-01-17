package operacoesBasicasList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

	private List<Tarefa> tarefaList;

	public ListaTarefas() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefas(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for (Tarefa t : tarefaList) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}	
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return tarefaList.size();
	}
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	
	public static void main(String[] args) {
	
		ListaTarefas listaTarefas = new ListaTarefas();
		System.out.println("O número toral de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

		listaTarefas.adicionarTarefas("Tarefa 1");
		listaTarefas.adicionarTarefas("Tarefa 1");
		listaTarefas.adicionarTarefas("Tarefa 2");
		System.out.println("O número toral de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());
		
		//listaTarefas.removerTarefa("Tarefa 2");
		System.out.println("O número total de tarefas removidas é: " + listaTarefas.obterNumeroTotalTarefas());
		
		listaTarefas.obterDescricoesTarefas();
	}
	
}
