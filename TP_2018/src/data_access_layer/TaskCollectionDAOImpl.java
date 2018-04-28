package data_access_layer;

import java.util.ArrayList;
import java.util.List;

import bussines_layer.Task;

public class TaskCollectionDAOImpl implements DAOTask {
		
		List<Task>taskList = new ArrayList<Task>();
		
		public Synchronize current = new Synchronize();

		public void register(Task task) {
			
			
			if(exists(task)==false) {
				taskList.add(task);
				
			}
			else {
				System.out.println("esa tarea ya existe");
				
			}
			
		}
		
		public void saveAllTasks() {
			
		current.saveTasks(taskList);
		
		}
		
		public void recoverTasks() {
			current.readText();
		}
		
		public void synchronize() {
			 

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
		
