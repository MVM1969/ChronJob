package com.mvm.ticktock;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class TestJob implements Job {

	public void execute(final JobExecutionContext ctx)
			throws JobExecutionException {
		System.out.println("Do something here");
	}

}
