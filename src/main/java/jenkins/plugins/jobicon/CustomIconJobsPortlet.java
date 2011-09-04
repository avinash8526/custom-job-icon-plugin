/*
 *     Copyright 2011 Jean-Christophe Sirot <sirot@chelonix.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jenkins.plugins.jobicon;

import hudson.Extension;
import hudson.model.Descriptor;
import hudson.plugins.view.dashboard.DashboardPortlet;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * A Dashboard portlet which is similar to the standard dashboard plugin 
 * Jobs Grid but includes the custom icon when configured.
 * 
 * @author Jean-Christophe Sirot
 */
public class CustomIconJobsPortlet extends DashboardPortlet
{
	@DataBoundConstructor
	public CustomIconJobsPortlet(String name)
	{
		super(name);
	}

	@Extension
	public static class DescriptorImpl extends Descriptor<DashboardPortlet>
	{
		@Override
		public String getDisplayName()
		{
			return Messages.Dashboard_jobsGridWithIcons();
		}
	}
}