package bussines_layer;

public class Task {
	
	private Integer idTask;  
	private Team team;		
	private String product; 
	private Location location; 
	private Boolean status;				
	private Employee assingnedWorker;
	
	public Task(Integer idTask, Team team, String product, Location location, Boolean status,
			Employee assingnedWorker) {
		super();
		this.idTask = idTask;
		this.team = team;
		this.product = product;
		this.location = location;
		this.status = status;
		this.assingnedWorker = assingnedWorker;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Employee getAssingnedWorker() {
		return assingnedWorker;
	}

	public void setAssingnedWorker(Employee assingnedWorker) {
		this.assingnedWorker = assingnedWorker;
	}

	public Integer getIdTask() {
		return idTask;
	}

	public void setIdTask(Integer idTask) {
		this.idTask = idTask;
	}
	
	
	
	

}

