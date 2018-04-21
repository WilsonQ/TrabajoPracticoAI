package data_access_layer;

import java.util.List;

import bussines_layer.Task;

public interface DAOTask {
	
	public void register(Task task);
	public void modify(Task task);
	public void delete(Task task);
	public Boolean exists(Task task);
	public List<Task>list();

}
