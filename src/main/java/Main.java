class Main {
  public static void main(String[] args) {
		Queue<Worker> q=new Queue<>();
		q.insert(new Worker("adam",1,2000));
		q.insert(new Worker("dan",1,2002));
		q.insert(new Worker("dana",1,2004));
		q.insert(new Worker("daniel",2,2007));
		q.insert(new Worker("dani",1,2014));
		Company intel=new Company(q);
		System.out.println(intel);
		intel.fired(1, 2);
		System.out.println(intel);
	}
}
