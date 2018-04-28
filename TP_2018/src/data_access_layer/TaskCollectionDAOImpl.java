package data_access_layer;

import java.util.ArrayList;
import java.util.List;

import bussines_layer.Task;

public class TaskCollectionDAOImpl implements DAOTask {
		
		List<Task>taskList = new ArrayList<Task>();

		public void register(Task task) {
			taskList.clear();
			
			if(exists(task)==false) {
				taskList.add(task);
				
			}
			else {
				System.out.println("esa tarea ya existe");
				
			}
			
		}
		
		public void synchronize() {
			Synchronize.saveTask(taskList);
		}
		public void imprimirTask() {
			try {
				Synchronize.printTask();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public void leerTexto() {
			Synchronize.leertext();

		}
		
		public void modify(Task task) {
			// TODO Auto-generated method stub
			
		}

		public void delete(Task task) {
			// TODO Auto-generated method stub
			
		}

		public Boolean exists(Task task) {
			
			if(taskList.contains(task)==true) {
				return true;
			}
			else {
				return false;
			}
			

		}

		public List<Task> list() {
			// TODO Auto-generated method stub
			return null;
		}
		
		
}
		
