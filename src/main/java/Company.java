public class Company {
	private Queue<Worker> workers;

	public Company(Queue<Worker> workers) {
		super();
		this.workers = workers;
	}

	public Queue<Worker> getWorkers() {
		return workers;
	}
	
	
	@Override
	public String toString() {
		return "Company [workers=" + workers + "]";
	}

	public int amountInDepart(int depart) {
		workers.insert(null);
		int count=0;
		while(workers.head()!=null) {
			if(workers.head().getDepart()==depart)
				count++;
			workers.insert(workers.remove());
		}
		workers.remove();
		return count;
	}
	public void fired(int depart,int num) {
		int countF=amountInDepart(depart)-num;
		int count=0;
		workers.insert(null);
		while(workers.head()!=null) {
			if(workers.head().getDepart()==depart) {
				if(count<countF)
					count++;
				else 
					workers.remove();
			}
			if(workers.head()!=null)
				workers.insert(workers.remove());
		}
		workers.remove();
	}
}
