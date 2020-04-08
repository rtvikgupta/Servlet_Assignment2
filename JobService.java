package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JobService {
	
	List<JobClass> jc = new ArrayList<JobClass>();
	public HashMap<JobClass, String> getData()
	{
		HashMap<JobClass, String> hm = new HashMap<JobClass, String>();
		JobClass job1 = new JobClass("Delhi","Java");
		JobClass job2 = new JobClass("Pune", "Java");
		JobClass job3 = new JobClass("Banglore","Angular");
		JobClass job4 = new JobClass("Banglore","Python");
		JobClass job5 = new JobClass("Gurugram","Oracle");
		JobClass job6 = new JobClass("Pune","Oracle");
		
		jc.add(job1);
		jc.add(job2);
		jc.add(job3);
		jc.add(job4);
		jc.add(job5);
		jc.add(job6);
		
		hm.put(job1,"JobA");
		hm.put(job2,"JobB");
		hm.put(job3, "JobC");
		hm.put(job4, "JobD");
		hm.put(job5, "JobE");
		hm.put(job6, "JobF");
		
		return hm;
	}
	
	public String getJob(String city, String tech)
	{
		HashMap<JobClass, String> hm = getData();
		String profile=null;
		for (JobClass jobClass : jc) {
			if(jobClass.getCity().equalsIgnoreCase(city) && jobClass.getTech().equalsIgnoreCase(tech))
			{
				profile = hm.get(jobClass);
			}
		}
		return profile;
	}
}
