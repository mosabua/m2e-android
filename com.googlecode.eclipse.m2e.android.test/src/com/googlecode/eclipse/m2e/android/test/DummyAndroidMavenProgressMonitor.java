package com.googlecode.eclipse.m2e.android.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EventObject;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.ProgressMonitorWrapper;

import com.googlecode.eclipse.m2e.android.IAndroidMavenProgressMonitor;

public class DummyAndroidMavenProgressMonitor extends ProgressMonitorWrapper implements IAndroidMavenProgressMonitor {

	List<EventObject> androidMavenBuildEvents = new ArrayList<EventObject>();

	protected DummyAndroidMavenProgressMonitor(IProgressMonitor monitor) {
		super(monitor);
	}

	public void onAndroidMavenBuild(EventObject event) {
		androidMavenBuildEvents.add(event);
	}

	public List<EventObject> getAndroidMavenBuildEvents() {
		return Collections.unmodifiableList(androidMavenBuildEvents);
	}

}
